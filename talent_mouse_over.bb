Include "variables.bb"


Function talent_mouse_over() 




		If MouseX() > 890 And MouseX() < 990 And MouseY() > 545 And MouseY() < 575;reset talents
			talents_mouse_over = True
			mouse_over = True 
			talent_name$ = "Reset Talents"
			talent_line1$ = "Resets all of your talents."
			talent_line2$ = "This cannot be undone!"
			talent_line3$ = ""
			talent_line4$ = ""
			If MouseHit(1)
				If sounds = True 
					PlaySound button_click
				EndIf 
				;If talents_available = level_completed * 5 Then already_full_counter = 0
				;If talents_available < level_completed * 5
				;	talents_available = (level_completed * 5) + extra_talents
					talents_available = total_talents_spent + talents_available
					reset_talents(); in reset_talents.bb you can find out what this function does
				;EndIf 
			EndIf 
		EndIf 





		
		;TALENT 1 MOUSE OVER
		If MouseX() > 250 And MouseX() < 300 And MouseY() > 300 And MouseY() < 350
			talent_name$ = "A Change of Base"
						
						
			talent_line1$ = "Increases the firing rate of your"
			talent_line2$ = "laser by "+variable_percentage+"%"
			talent_line3$ = "Next rank: "+(variable_percentage+7)+"%"
			talent_line4$ = "Requires "+talent_1_req+" Offensive Talents"
			mouse_over = True

			If talent_1_spent = 0; 0 points spent in to the talent
				variable_percentage = 0;variables to change
				laser_mod# = 0
			EndIf
			If talent_1_spent = 1
				variable_percentage = 7
				laser_mod# = .07
			EndIf
			If talent_1_spent = 2
				variable_percentage = 14					
				laser_mod# = .14		
			EndIf 
			If talent_1_spent = 3
				variable_percentage = 21
				laser_mod# = .21
			EndIf
			If talent_1_spent = 4
				variable_percentage = 28
				laser_mod# = .28
			EndIf
			If talent_1_spent = 5
				variable_percentage = 35					
				laser_mod# = .35	
				talent_line3$ = ""	
			EndIf 

			
			If talents_available > 0
				If talent_1_avail > talent_1_spent
					If MouseHit(1)
						talent_1_spent = talent_1_spent + 1
						side_a_talents_spent = side_a_talents_spent + 1
						talents_available = talents_available - 1
					EndIf 
				EndIf 
			EndIf
		EndIf 
		
		;TALENT 2 MOUSE OVER
		If MouseX() > 350 And MouseX() < 400 And MouseY() > 300 And MouseY() < 350
			talent_name$ = "Emission Metamorphosis (DEPRECATED)"
			talent_line1$ = "Regenerates phaser as you"
			talent_line2$ = "shoot with your laser."
			talent_line3$ = "Next Rank: Faster Regeneration"
			talent_line4$ = "Requires "+talent_2_req+" Offensive Talents"
			mouse_over = True
			; variable calculations in get_keys.bb, under standard laser shot keyhit()
			; rate of regeneration in draw.bb
			If talent_2_spent = 5
				talent_line3$ = ""
			EndIf 
			If talents_available > 0
				If talent_2_avail > talent_2_spent
					If MouseHit(1)
						talent_2_spent = talent_2_spent + 1
						side_a_talents_spent = side_a_talents_spent + 1
						talents_available = talents_available - 1
					EndIf 
				EndIf
			EndIf
		EndIf 
		
		;TALENT 3 MOUSE OVER
		If MouseX() > 450 And MouseX() < 500 And MouseY() > 300 And MouseY() < 350
			talent_name$ = "Basic Destruction"
			talent_line1$ = "Increases damage done by "
			talent_line2$ = "laser by: "+(standard_shot_damage_increaser#*100)+"%"
			talent_line3$ = "Next Rank: "+((standard_shot_damage_increaser#+.05)*100)+"%"
			talent_line4$ = "Requires "+talent_3_req+" Offensive Talents"
			mouse_over = True
			If talent_3_spent = 0
				standard_shot_damage_increaser# = 0
			EndIf
			If talent_3_spent = 1
				standard_shot_damage_increaser# = .05
			EndIf
			If talent_3_spent = 2
				standard_shot_damage_increaser# = .10
			EndIf 
			If talent_3_spent = 3
				standard_shot_damage_increaser# = .15
			EndIf
			If talent_3_spent = 4
				standard_shot_damage_increaser# = .20
			EndIf
			If talent_3_spent = 5
				standard_shot_damage_increaser# = .25
				talent_line3$ = ""	
			EndIf 
			If talents_available > 0
				If talent_3_avail > talent_3_spent
					If MouseHit(1)
						talent_3_spent = talent_3_spent + 1
						side_a_talents_spent = side_a_talents_spent + 1
						talents_available = talents_available - 1
					EndIf 
				EndIf
			EndIf
		EndIf 
		
		;TALENT 4 MOUSE OVER
		If MouseX() > 250 And MouseX() < 300 And MouseY() > 400 And MouseY() < 450
			talent_name$ = "Enraged Regeneration (DEPRECATED"
			talent_line1$ = "Regenerates Wideshot at a rate"
			talent_line2$ = "of 1 second every "+regenerate_wideshot_seconds+" Seconds"
			talent_line3$ = "Next Rank: "+(regenerate_wideshot_seconds-1)+" Seconds"
			talent_line4$ = "Requires "+talent_4_req+" Offensive Talents"
			mouse_over = True
			If talent_4_spent = 0
				talent_line2$ = "of 1 second every infinity seconds"
				talent_line3$ = "Next Rank: 9 Seconds"	
			EndIf
			If talent_4_spent = 1
				regenerate_wideshot_seconds = 9
				regenerate_wideshot_seconds_addition# = .111
			EndIf
			If talent_4_spent = 2
				regenerate_wideshot_seconds = 8	
				regenerate_wideshot_seconds_addition# = .125
			EndIf 
			If talent_4_spent = 3
				regenerate_wideshot_seconds = 7
				regenerate_wideshot_seconds_addition# = .143
			EndIf
			If talent_4_spent = 4
				regenerate_wideshot_seconds = 6
				regenerate_wideshot_seconds_addition# = .166
			EndIf
			If talent_4_spent = 5
				regenerate_wideshot_seconds = 5
				regenerate_wideshot_seconds_addition# = .2
				talent_line3$ = ""	
			EndIf 
			If talents_available > 0
				If side_a_talents_spent >= talent_4_req
					If talent_4_avail > talent_4_spent
						If MouseHit(1)
							talent_4_spent = talent_4_spent + 1
							side_a_talents_spent = side_a_talents_spent + 1
							talents_available = talents_available - 1
						EndIf 
					EndIf
				EndIf 
			EndIf
		EndIf 
		
		;TALENT 5 MOUSE OVER
		If MouseX() > 350 And MouseX() < 400 And MouseY() > 400 And MouseY() < 450
			talent_name$ = "Upgraded Capacitors"
			talent_line1$ = "Increase the duration of your"
			talent_line2$ = "phaser by "+(laser_drain#*50)+"%"
			talent_line3$ = "Next Rank: "+((laser_drain#*50)+5)+"%"
			talent_line4$ = "Requires "+talent_5_req+" Offensive Talents"
			mouse_over = True
			If talent_5_spent = 0
				laser_drain# = 0
			EndIf
			If talent_5_spent = 1
				laser_drain# = .1
			EndIf
			If talent_5_spent = 2
				laser_drain# = .2
			EndIf 
			If talent_5_spent = 3
				laser_drain# = .3
			EndIf
			If talent_5_spent = 4
				laser_drain# = .4
			EndIf
			If talent_5_spent = 5
				laser_drain# = .5
				talent_line3$ = ""	
			EndIf 
			If talents_available > 0
				If side_a_talents_spent >= talent_5_req
					If talent_5_avail > talent_5_spent
						If MouseHit(1)
							talent_5_spent = talent_5_spent + 1
							side_a_talents_spent = side_a_talents_spent + 1
							talents_available = talents_available - 1
						EndIf 
					EndIf 
				EndIf 
			EndIf
		EndIf 
		
		;TALENT 6 MOUSE OVER
		If MouseX() > 450 And MouseX() < 500 And MouseY() > 400 And MouseY() < 450
			talent_name$ = "Power Overwhelming"
			talent_line1$ = "Increases chance to crit with"
			talent_line2$ = "laser by "+laser_crit_talent#+"%"
			talent_line3$ = "Next Rank: "+(laser_crit_talent#+7)+"%"
			talent_line4$ = "Requires "+talent_6_req+" Offensive Talents"
			mouse_over = True
			If talent_6_spent = 0
				laser_crit_talent# = 0
				chance_to_crit# = capacitor_crit_add# + laser_crit_talent#
			EndIf
			If talent_6_spent = 1
				laser_crit_talent# = 7
				chance_to_crit# = capacitor_crit_add# + laser_crit_talent#
			EndIf
			If talent_6_spent = 2
				laser_crit_talent# = 14
				chance_to_crit# = capacitor_crit_add# + laser_crit_talent#
			EndIf 
			If talent_6_spent = 3
				laser_crit_talent# = 21
				chance_to_crit# = capacitor_crit_add# + laser_crit_talent#
			EndIf
			If talent_6_spent = 4
				laser_crit_talent# = 28
				chance_to_crit# = capacitor_crit_add# + laser_crit_talent#
			EndIf
			If talent_6_spent = 5
				laser_crit_talent# = 35
				chance_to_crit# = capacitor_crit_add# + laser_crit_talent#
				talent_line3$ = ""	
			EndIf 

			If talents_available > 0
				If side_a_talents_spent >= talent_6_req
					If talent_6_avail > talent_6_spent
						If MouseHit(1)
							talent_6_spent = talent_6_spent + 1
							side_a_talents_spent = side_a_talents_spent + 1
							talents_available = talents_available - 1
						EndIf 
					EndIf
				EndIf 
			EndIf
		EndIf
		
		;TALENT 7 MOUSE OVER
		If MouseX() > 300 And MouseX() < 350 And MouseY() > 500 And MouseY() < 550
			talent_name$ = "Laser Array"
			talent_line1$ = wideshot_force_chance# + "% chance to make next"
			talent_line2$ = "shot a wide shot after a crit"
			talent_line3$ = "Next Rank: "+(wideshot_force_chance#+33)+"% Chance"
			talent_line4$ = "Requires "+talent_7_req+" Offensive Talents"
			mouse_over = True
			 
			If talent_7_spent = 0
				wideshot_force_chance# = 0
			EndIf
			If talent_7_spent = 1
				wideshot_force_chance# = 33
			EndIf
			If talent_7_spent = 2
				wideshot_force_chance# = 66	
				talent_line3$ = "Next Rank: 100% Chance"	
			EndIf
			If talent_7_spent = 3
				wideshot_force_chance# = 100
				talent_line3$ = ""				
			EndIf

			If talents_available > 0
				If side_a_talents_spent >= talent_7_req
					If talent_7_avail > talent_7_spent
						If MouseHit(1)
							talent_7_spent = talent_7_spent + 1
							side_a_talents_spent = side_a_talents_spent + 1
							talents_available = talents_available - 1
						EndIf 
					EndIf 
				EndIf 
			EndIf
		EndIf 
		
		;TALENT 8 MOUSE OVER
		If MouseX() > 400 And MouseX() < 450 And MouseY() > 500 And MouseY() < 550
			talent_name$ = "Nuclear Frenzy (DEPRECATED)"
			talent_line1$ = "After a nuke, you get 200%"
			talent_line2$ = "firing speed for 0 seconds"
			talent_line3$ = "Next Rank: 5 seconds."
			talent_line4$ = "Requires "+talent_8_req+" Offensive Talents"
			mouse_over = True
			If talent_8_spent = 0
				talent_line2$ = "firing speed for 0 seconds"
				talent_line3$ = "Next Rank: 3 seconds"
			EndIf
			If talent_8_spent = 1
				talent_line2$ = "firing speed for 3 seconds"
				talent_line3$ = "Next Rank: 6 seconds"
			EndIf 
			If talent_8_spent = 2
				talent_line2$ = "firing speed for 6 seconds"
				talent_line3$ = "Next Rank: 9 seconds"
			EndIf 
			If talent_8_spent = 3
				talent_line2$ = "firing speed for 9 seconds"
				talent_line3$ = ""
			EndIf 
			
			; the variable modifying is in the function.bb in update nuke function.
			; the actual computations are in draw.bb towards the top 			
			If talents_available > 0
				If side_a_talents_spent >= talent_8_req
					If talent_8_avail > talent_8_spent
						If MouseHit(1)
							talent_8_spent = talent_8_spent + 1
							side_a_talents_spent = side_a_talents_spent + 1
							talents_available = talents_available - 1
						EndIf 
					EndIf 
				EndIf 
			EndIf
		EndIf 
		
		
		
		
		;SET TWO AS FOLLOWS
		
		
		
		
		;TALENT 9 MOUSE OVER
		If MouseX() > 600 And MouseX() < 650 And MouseY() > 300 And MouseY() < 350
			talent_name$ = "Bulwark Continuity"
			talent_line1$ = "Increases the duration of your"
			talent_line2$ = "Shield by "+variable_percentage+" %"
			talent_line3$ = "Next Rank: "+(variable_percentage+7)+" %"
			talent_line4$ = "Requires "+talent_9_req+" Defensive Talents"
			mouse_over = True
			
			If talent_9_spent = 0
				variable_percentage = 0
				shield_mod# = 0
			EndIf
			If talent_9_spent = 1
				variable_percentage = 7
				shield_mod# = .0856
			EndIf
			If talent_9_spent = 2
				variable_percentage = 14					
				shield_mod# = .1712		
			EndIf 
			If talent_9_spent = 3
				variable_percentage = 21
				shield_mod# = .2568
			EndIf
			If talent_9_spent = 4
				variable_percentage = 28
				shield_mod# = .3424
			EndIf
			If talent_9_spent = 5
				variable_percentage = 35					
				shield_mod# = .428
				talent_line3$ = ""	
			EndIf 
			If talents_available > 0
				If talent_9_avail > talent_9_spent
					If MouseHit(1)
						talent_9_spent = talent_9_spent + 1
						side_b_talents_spent = side_b_talents_spent + 1
						talents_available = talents_available - 1
					EndIf 
				EndIf
			EndIf
		EndIf 
		
		;TALENT 10 MOUSE OVER
		If MouseX() > 700 And MouseX() < 750 And MouseY() > 300 And MouseY() < 350
			talent_name$ = "Stay On the Move"
			talent_line1$ = "Regenerates shield as you move"
			talent_line2$ = ""
			talent_line3$ = "Next Rank: Faster Regeneration"
			talent_line4$ = "Requires "+talent_10_req+" Defensive Talents"
			mouse_over = True
			; variable calculations in get_keys.bb, under movement commands
			; rate of regeneration in draw.bb
			If talent_10_spent = 5
				talent_line3$ = ""
			EndIf 
			If talents_available > 0
				If talent_10_avail > talent_10_spent
					If MouseHit(1)
						talent_10_spent = talent_10_spent + 1
						side_b_talents_spent = side_b_talents_spent + 1
						talents_available = talents_available - 1
					EndIf 
				EndIf
			EndIf
		EndIf 
		
		;TALENT 11 MOUSE OVER
		If MouseX() > 800 And MouseX() < 850 And MouseY() > 300 And MouseY() < 350
			talent_name$ = "We're gonna need a bit more help (DEPRECATED)"
			talent_line1$ = "Increases the amount of ships"
			talent_line2$ = "that protect you by: "+(protection_to_make - 2)
			talent_line3$ = "Next Rank: "+((protection_to_make - 2) + 1)
			talent_line4$ = "Requires "+talent_13_req+" Defensive Talents"
			mouse_over = True
			If talent_11_spent = 0
				protection_to_make = 2
			EndIf
			If talent_11_spent = 1
				protection_to_make = 3
			EndIf
			If talent_11_spent = 2
				protection_to_make = 4
			EndIf 
			If talent_11_spent = 3
				protection_to_make = 5
			EndIf
			If talent_11_spent = 4
				protection_to_make = 6
			EndIf
			If talent_11_spent = 5
				protection_to_make = 7
				talent_line3$ = ""
			EndIf 

			If talents_available > 0
				If talent_11_avail > talent_11_spent
					If MouseHit(1)
						talent_11_spent = talent_11_spent + 1
						side_b_talents_spent = side_b_talents_spent + 1
						talents_available = talents_available - 1
					EndIf 
				EndIf
			EndIf
		EndIf 
		
		;TALENT 12 MOUSE OVER
		If MouseX() > 600 And MouseX() < 650 And MouseY() > 400 And MouseY() < 450
			talent_name$ = "Aegis Regeneration (DEPRECATED)"
			talent_line1$ = "Regenerates Protection at a rate"
			talent_line2$ = "of 1 second every "+regenerate_protection_seconds+" Seconds"
			talent_line3$ = "Next Rank: "+(regenerate_protection_seconds-1)+" Seconds"
			talent_line4$ = "Requires "+talent_12_req+" Defensive Talents"
			mouse_over = True
			If talent_12_spent = 0
				talent_line2$ = "of 1 second every infinity seconds"
				talent_line3$ = "Next Rank: 9 Seconds"	
			EndIf
			If talent_12_spent = 1
				regenerate_protection_seconds = 9
				regenerate_protection_seconds_addition# = .111
			EndIf
			If talent_12_spent = 2
				regenerate_protection_seconds = 8	
				regenerate_protection_seconds_addition# = .125
			EndIf 
			If talent_12_spent = 3
				regenerate_protection_seconds = 7
				regenerate_protection_seconds_addition# = .143
			EndIf
			If talent_12_spent = 4
				regenerate_protection_seconds = 6
				regenerate_protection_seconds_addition# = .166
			EndIf
			If talent_12_spent = 5
				regenerate_protection_seconds = 5
				regenerate_protection_seconds_addition# = .2
				talent_line3$ = ""	
			EndIf 
			If talents_available > 0
				If side_b_talents_spent >= talent_12_req
					If talent_12_avail > talent_12_spent
						If MouseHit(1)
							talent_12_spent = talent_12_spent + 1
							side_b_talents_spent = side_b_talents_spent + 1
							talents_available = talents_available - 1
						EndIf 
					EndIf
				EndIf
			EndIf
		EndIf 
		
		;TALENT 13 MOUSE OVER
		If MouseX() > 700 And MouseX() < 750 And MouseY() > 400 And MouseY() < 450
			talent_name$ = "Titanium Plating"
			talent_line1$ = "Reduces all damage taken"
			talent_line2$ = "by: "+(damage_reduction#*100)+"%"
			talent_line3$ = "Next Rank: "+((damage_reduction#+.07)*100)+"%"
			talent_line4$ = "Requires "+talent_13_req+" Defensive Talents"
			mouse_over = True
			If talent_13_spent = 0
				damage_reduction# = 0
			EndIf
			If talent_13_spent = 1
				damage_reduction# = .07
			EndIf
			If talent_13_spent = 2
				damage_reduction# = .14
			EndIf 
			If talent_13_spent = 3
				damage_reduction# = .21
			EndIf
			If talent_13_spent = 4
				damage_reduction# = .28
			EndIf
			If talent_13_spent = 5
				damage_reduction# = .35
				talent_line3$ = ""
			EndIf 
			If talents_available > 0
				If side_b_talents_spent >= talent_13_req
					If talent_13_avail > talent_13_spent
						If MouseHit(1)
							talent_13_spent = talent_13_spent + 1
							side_b_talents_spent = side_b_talents_spent + 1
							talents_available = talents_available - 1
						EndIf 
					EndIf
				EndIf 
			EndIf
		EndIf 
		
		;TALENT 14 MOUSE OVER
		If MouseX() > 800 And MouseX() < 850 And MouseY() > 400 And MouseY() < 450
			talent_name$ = "Repair While you can"
			talent_line1$ = "While shield active: Hull integrity"
			talent_line2$ = "regenerates at "+shield_armor_percent#+"% Per second"
			talent_line3$ = "Next Rank: "+(shield_armor_percent#+.5)+"% Per second"
			talent_line4$ = "Requires "+talent_14_req+" Defensive Talents"
			mouse_over = True
			If talent_14_spent = 0
				shield_armor_increaser = 0	
				shield_armor_percent# = 0
			EndIf
			If talent_14_spent = 1
				shield_armor_percent# = 1
				shield_armor_increaser = 2
			EndIf
			If talent_14_spent = 2
				shield_armor_percent# = 1.5
				shield_armor_increaser = 3
			EndIf 
			If talent_14_spent = 3
				shield_armor_percent# = 2
				shield_armor_increaser = 4
			EndIf
			If talent_14_spent = 4
				shield_armor_percent# = 2.5
				shield_armor_increaser = 5
			EndIf
			If talent_14_spent = 5
				shield_armor_percent# = 3
				shield_armor_increaser = 6
				talent_line3$ = ""	
			EndIf
			If talents_available > 0
				If side_b_talents_spent >= talent_14_req
					If talent_14_avail > talent_14_spent
						If MouseHit(1)
							talent_14_spent = talent_14_spent + 1
							side_b_talents_spent = side_b_talents_spent + 1
							talents_available = talents_available - 1
						EndIf 
					EndIf
				EndIf
			EndIf
		EndIf
		
		;TALENT 15 MOUSE OVER
		If MouseX() > 650 And MouseX() < 700 And MouseY() > 500 And MouseY() < 550
			talent_name$ = "Diamond Coating"
			talent_line1$ = "Increases total Hull "
			talent_line2$ = "Integrity by "+rect_talent_15_percentage+"%"
			talent_line3$ = "Next Rank: "+(rect_talent_15_percentage+33)+"%"
			talent_line4$ = "Requires "+talent_15_req+" Defensive Talents"
			mouse_over = True
			If talent_15_spent = 0
				rect_talent_15_percentage = 0
			EndIf
			If talent_15_spent = 1
				rect_talent_15_percentage = 33
			EndIf
			If talent_15_spent = 2
				rect_talent_15_percentage = 66		
				talent_line3$ = "Next Rank: 100%"		
			EndIf
			If talent_15_spent = 3
				rect_talent_15_percentage = 100
				talent_line3$ = ""		
				;armor = 2000			
			EndIf
			If talents_available > 0
				If side_b_talents_spent >= talent_15_req
					If talent_15_avail > talent_15_spent
						If MouseHit(1)
							talent_15_spent = talent_15_spent + 1
							side_b_talents_spent = side_b_talents_spent + 1
							talents_available = talents_available - 1
						EndIf 
					EndIf
				EndIf
			EndIf
		EndIf 
		
		;TALENT 16 MOUSE OVER
		If MouseX() > 750 And MouseX() < 800 And MouseY() > 500 And MouseY() < 550
			talent_name$ = "Everlasting Fortification (DEPRECATED)"
			talent_line1$ = "Protection also creates a shield"
			talent_line2$ = "for "+(talent_16_frame_shield/60)+" seconds when active"
			talent_line3$ = "Next Rank: "+((talent_16_frame_shield+240)/60)+" Seconds"
			talent_line4$ = "Requires "+talent_16_req+" Defensive Talents"
			mouse_over = True
			If talent_16_spent = 0
				talent_16_frame_shield = 0
			EndIf
			If talent_16_spent = 1
				talent_16_frame_shield = 240
			EndIf
			If talent_16_spent = 2
				talent_16_frame_shield = 480			
			EndIf
			If talent_16_spent = 3
				talent_16_frame_shield = 720
				talent_line3$ = ""				
			EndIf
			If talents_available > 0
				If side_b_talents_spent >= talent_16_req
					If talent_16_avail > talent_16_spent
						If MouseHit(1)
							talent_16_spent = talent_16_spent + 1
							side_b_talents_spent = side_b_talents_spent + 1
							talents_available = talents_available - 1
						EndIf 
					EndIf
				EndIf 
			EndIf 
		EndIf
		
		
		
		
		
		
		
		
		
		;SPECIAL ABILITIES
		
		;LASER ABILITY MOUSE OVER
		If MouseX() > 250 And MouseX() < 300 And MouseY() > 150 And MouseY() < 200
			talent_name$ = "Phaser Ability"
			talent_line1$ = "A constant Stream of energy."
			talent_line2$ = "This does less damage but"
			talent_line3$ = "has no cooldown to fire again."
			talent_line4$ = "Requires 7 Offensive Talents"
			mouse_over = True
			no_green = True 
			If talents_available > 0
				If side_a_talents_spent >= 7
					If laser_avail > laser_spent
						If MouseHit(1)
							laser_spent = laser_spent + 1
							talents_available = talents_available - 1
							ability_talents_spent = ability_talents_spent + 1
						EndIf 
					EndIf
				EndIf 
			EndIf 
		EndIf 
		
		;SHIELD ABILITY MOUSE OVER
		If MouseX() > 433 And MouseX() < 483 And MouseY() > 150 And MouseY() < 200
			talent_name$ = "Shield Ability"
			talent_line1$ = "A shield that absorbs a lot of"
			talent_line2$ = "damage, not effective against"
			talent_line3$ = "certain attacks."
			talent_line4$ = "Requires 7 Defensive Talents"
			mouse_over = True
			no_green = True 
			If talents_available > 0
				If side_b_talents_spent >= 7
					If shield_avail > shield_spent
						If MouseHit(1)
							shield_spent = shield_spent + 1
							talents_available = talents_available - 1
							ability_talents_spent = ability_talents_spent + 1
						EndIf 
					EndIf
				EndIf 
			EndIf
		EndIf 
		
		;PROTECTION ABILITY MOUSE OVER
		If MouseX() > 616 And MouseX() < 666 And MouseY() > 150 And MouseY() < 200
			talent_name$ = "Protection Ability"
			talent_line1$ = "Summons two ships by your"
			talent_line2$ = "side to aid you. "
			talent_line3$ = "Duration: 20 seconds"
			talent_line4$ = "Requires 14 Defensive Talents"
			mouse_over = True
			no_green = True 
			If talents_available > 0
				If side_b_talents_spent >= 14
					If protection_avail > protection_spent
						If MouseHit(1)
							protection_spent = protection_spent + 1
							talents_available = talents_available - 1
							ability_talents_spent = ability_talents_spent + 1
						EndIf 
					EndIf
				EndIf 
			EndIf
		EndIf
		
		;NUKE ABILITY MOUSE OVER
		If MouseX() > 800 And MouseX() < 850 And MouseY() > 150 And MouseY() < 200
			talent_name$ = "Mega Shot"
			talent_line1$ = "A shot that splits into multiple"
			talent_line2$ = "shots"
			talent_line3$ = ""
			talent_line4$ = "Requires 14 Offensive Talents"
			mouse_over = True
			no_green = True 
			If talents_available > 0
				If side_a_talents_spent >= 14
					If megashot_avail > megashot_spent
						If MouseHit(1)
							megashot_spent = megashot_spent + 1
							talents_available = talents_available - 1
							ability_talents_spent = ability_talents_spent + 1
						EndIf 
					EndIf
				EndIf
			EndIf 
		EndIf
		
		talent_done = False 
		If MouseX() > 20 And MouseX() < 95 And MouseY() > 560 And MouseY() < 580
			talent_done = True 
			If MouseHit(1)
				If sounds = True 
					PlaySound button_click
				EndIf 
				mode = 94
			EndIf 
		EndIf
		
		
		
		
		If mouse_over = False
			FlushMouse
			talent_name$ = ""
			talent_line1$ = ""
			talent_line2$ = ""
			talent_line3$ = ""
			talent_line4$ = ""
			no_green = False 
			talents_mouse_over = False 
		EndIf
		total_talents_spent = side_a_talents_spent + side_b_talents_spent + +ability_talents_spent
End Function