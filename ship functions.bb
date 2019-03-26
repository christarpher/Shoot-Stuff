Include "variables.bb"
Include "functions.bb"


Function fire_wide_shot()
	If bullet_counter >= (20*(1-laser_mod#))*actual_wideshot_speed_increase#		
		If mode < 100 Or mode = 200
			If phase_inverter_trigger = True And partial_phase = True Or phase_inverter_trigger = False
				If sounds = True 
					PlaySound standard_laser_sound
				EndIf 
				wideshot_shooting = True 
					If player_rotated = False;make sure bullets are oriented correctly
							create_bullet(p_x,p_y,8,True) ;regular shot if using button and no charges left
						If wideshot_charge > 0
							create_bullet(p_x-25,p_y,8,True)
							create_bullet(p_x+25,p_y,8,True)
							If energy_split = True
								create_littleshot(p_x+25,p_y,300,littleshot_damage*energy_ball_damage_increase#,False,False,8)
								create_littleshot(p_x-25,p_y,240,littleshot_damage*energy_ball_damage_increase#,False,False,8)
							EndIf
							wideshot_charge = wideshot_charge - 1
	 					EndIf 
						bullet_counter = 0
					EndIf 
					
					If player_rotated = True
						;If wideshot_activate = False 
							create_bullet(p_x,p_y-50,-8,True);regular shot if using button and no charges left
						If wideshot_charge > 0
							create_bullet(p_x-25,p_y-50,-8,True)
							create_bullet(p_x+25,p_y-50,-8,True)
							If energy_split = True
								create_littleshot(p_x+25,p_y,60,littleshot_damage*energy_ball_damage_increase#,False,False,8)
								create_littleshot(p_x-25,p_y,120,littleshot_damage*energy_ball_damage_increase#,False,False,8)
							EndIf
							wideshot_charge = wideshot_charge - 1
						EndIf
						bullet_counter = 0
					EndIf 	
				EndIf 
			EndIf
		EndIf 
End Function


Function fire_standard_laser()
	If bullet_counter >= (20*(1-laser_mod#))*actual_wideshot_speed_increase#
		; so bullets can only be created every 1/3 second (modified by
		; a talent that you can get called "talent_standard_laser_mod" and another talent at end of offensive
		If mode < 100 Or mode = 200
			If phase_inverter_trigger = True And partial_phase = True Or phase_inverter_trigger = False
				If sounds = True 
					PlaySound standard_laser_sound
				EndIf 
				
				;for regenerating phaser when firing laser
				laser# = laser# + laser_and_phaser_talent#
				
				If player_rotated = False;make sure bullets are oriented correctly
					;If wideshot_activate = False 
						create_bullet(p_x,p_y,8,True)
					;EndIf 
					If wideshot_forced = True 
						create_bullet(p_x-25,p_y,8,False)
						create_bullet(p_x+25,p_y,8,False)
						If energy_split = True
							create_littleshot(p_x+25,p_y,300,littleshot_damage*energy_ball_damage_increase#,False,False,8)
							create_littleshot(p_x-25,p_y,240,littleshot_damage*energy_ball_damage_increase#,False,False,8)
						EndIf
						wideshot_forced = False 
					EndIf 
					bullet_counter = 0
				EndIf 
				
				If player_rotated = True
					;If wideshot_activate = False 
						create_bullet(p_x,p_y-50,-8,True)
					;EndIf 
					If wideshot_forced = True 
						create_bullet(p_x-25,p_y-50,-8,False)
						create_bullet(p_x+25,p_y-50,-8,False)
						If energy_split = True
							create_littleshot(p_x+25,p_y,60,littleshot_damage*energy_ball_damage_increase#,False,False,8)
							create_littleshot(p_x-25,p_y,120,littleshot_damage*energy_ball_damage_increase#,False,False,8)
						EndIf
						wideshot_forced = False 
					EndIf 
					bullet_counter = 0
				EndIf 		
			EndIf	
		EndIf 
	EndIf 


End Function


Function fire_laser()
	If mode < 100 Or mode = 200
		If phase_inverter_trigger = True And partial_phase = True Or phase_inverter_trigger = False
			If laser > 0 And laser_spent > 0; a
				If laser_pulse_count >= 7
					If sounds = True 
						PlaySound laser_pulse_sound 
					EndIf 
					laser_pulse_count = 0
				EndIf 
				If player_rotated = False
					create_laser(p_x,p_y+25,8)
				EndIf 
				If player_rotated = True
					create_laser(p_x,p_y+25,-8)
				EndIf 
				laser# = laser# - (2*laser_drain#)
				
				If laser# <= 0 And check_megashot_talent_phasers = True
					check_megashot_talent_phasers = False
					megashot_charge# = megashot_charge# + phaser_talent_megashot_addition
				EndIf 
			EndIf
		EndIf 
	EndIf 
End Function


Function use_shield()
	If mode < 100 Or mode = 200
		If phase_inverter_trigger = True And partial_phase = True Or phase_inverter_trigger = False
			If shield# > 0 And shield_spent > 0; s
				If shield_pulse_count >= 24
					If sounds = True 
						PlaySound shield_pulse_sound
					EndIf 
					shield_pulse_count = 0
				EndIf 
				draw_shield()
				shield# = shield# - (2*shield_mod#)
				armor# = armor# + (shield_armor_increaser#/12)
			EndIf
			;only able to trigger it once if it runs out of shields. Doesn't trigger again until
			;shields reach 10% again (this part is in the draw.bb file near the talent
			If shield# <= 0 And check_phase_talent_shields = True 
				phase_time_talent# = phase_time_talent_unchanged#
				check_phase_talent_shields = False 
				phase_talent = True 
			EndIf 
		EndIf 
	EndIf 
End Function


Function use_megashot()
	If mode < 100 Or mode = 200
		If phase_inverter_trigger = True And partial_phase = True Or phase_inverter_trigger = False
			If megashot_charge > 0 And megashot_spent > 0
				If player_rotated = False
					create_megashot(p_x,p_y,megashot_damage*megashot_damage_increase#,False)
				EndIf
				If player_rotated = True
					create_megashot(p_x,p_y,megashot_damage*megashot_damage_increase#,True)
				EndIf
				megashot_charge = megashot_charge - 1
				time_after_megashot# = 600
			EndIf 
		EndIf
	EndIf 
End Function



Function use_protection()
	If mode < 100 Or mode = 200
		If phase_inverter_trigger = True And partial_phase = True Or phase_inverter_trigger = False
			If protection_charge# > 0 And protection_spent > 0
				create_protection()
				protection_charge# = protection_charge# - 1
				shield# = shield# + additional_supplies_shield_increaser#
			EndIf 
		EndIf 
	EndIf 
End Function



Function use_phase_inverter()
	If mode < 100 Or mode = 200
		If phase_inverter_capacity >= 0 And phase_inverter_spent > 0 Then
			If phase_talent = True
				phase_talent = False
			EndIf 
			phase_inverter_trigger = True 
			player_image = CopyImage(player_image_phased)
			ship_rotated = CopyImage(ship_rotated_phased)
		EndIf  
	EndIf
End Function