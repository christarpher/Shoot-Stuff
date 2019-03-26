Include "functions.bb"

Function update_all()

	;Text 512,300,chance_to_crit#,True,True
	;Text 512,320,phase_inverter_time_added,True,True
	;Text 512,340,100/(1200+phase_inverter_time_added#)*phase_inverter_capacity#,True,True
	;modify speed of ship based on health, disregard armor.
		speedmod# = health# / 125
		If speedmod# < speedmod_min Then speedmod# = speedmod_min
		If speedmod# > speedmod_max# Then speedmod# = speedmod_max#
		
	;calculate crit chance
	chance_to_crit# = capacitor_crit_add# + laser_crit_talent#

	;for the protection increasing talent
	protection_percentage# = (100/(20+extra_protection_ships#))*protection_charge#
	
	; stuff for talent 7 to increase laser as you shoot
	If shield_regen_increaser >= 240
		shield = shield + 5
		shield_regen_increaser = 0
	EndIf 
	
	;crit chance after doing a megashot talent
	time_after_megashot# = time_after_megashot# - 1
	If time_after_megashot# > 0
		chance_to_crit# = capacitor_crit_add# + laser_crit_talent# + crit_after_megashot_addition#
	EndIf
	If time_after_megashot# <= 0 
		time_after_megashot# = 0
		chance_to_crit# = capacitor_crit_add# + laser_crit_talent#
	EndIf 
	
	;checking for the megashot talent for running out of phaser
	If laser# >= 500
		check_megashot_talent_phasers = True
	EndIf 
	
	
	;checking for the no armor making protection talent
	If armor# <= 0 Then
		If create_protection_no_armor = True
			For no_armor = 0 To (create_protection_no_armor_counter-1)
				create_no_armor_protection()
			Next
			create_protection_no_armor = False 
		EndIf 
	EndIf 
	If armor# > 0 Then create_protection_no_armor = True 
	
	;checking for the phasing talent for running out of shields
	If shield# >= 500
		check_phase_talent_shields = True 
	EndIf 
	If phase_talent = True 
		phase_time_talent# = phase_time_talent# - 1
		If phase_time_talent# <= 0 
			phase_time_talent# = 0
			phase_inverter_trigger = False
			player_image = CopyImage(player_image_temp)
			ship_rotated = CopyImage(ship_rotated_temp)
		EndIf 
		If phase_time_talent# > 0
			phase_inverter_trigger = True 
			player_image = CopyImage(player_image_phased)
			ship_rotated = CopyImage(ship_rotated_phased)
		EndIf 
	EndIf
	
	; manage changing back to unphased state
	If phase_inverter_trigger = True
		If phase_talent = False ;only do this stuff if you triggered phasing manually.
			phase_inverter_capacity = phase_inverter_capacity - 1
			If phase_inverter_capacity < 0 Then 
				phase_inverter_trigger = False
				player_image = CopyImage(player_image_temp)
				ship_rotated = CopyImage(ship_rotated_temp)
			EndIf 
		EndIf 
		laser# = laser# + phaser_increaser#
	EndIf
	
	 

	
	;talent 4 makes regular laser shoot faster
	If wideshot_charge > 0 Then
		actual_wideshot_speed_increase# = 1
		wideshot_speed_increase_counter = 0
	EndIf 
	If wideshot_charge <= 0 And wideshot_speed_increase_counter < (wideshot_duration_time*60) Then
		wideshot_speed_increase_counter = wideshot_speed_increase_counter + 1
		actual_wideshot_speed_increase# = wideshot_speed_increase#
	EndIf 
	If wideshot_speed_increase_counter >= (wideshot_duration_time*60)
		actual_wideshot_speed_increase# = 1
	EndIf 
		
	
	
	If mode < 99 Or mode > 100 ;so it doesnt keep counting down if you lose or status screen
		; ALL THIS CRAP IS TO MAKE SURE 2 TALENTS WORK AND DONT INTERFERE WITH GAMEPLAY AND CRAP
				
		
		;//////////// ACCESSORY GENERATOR STUFF
		generator_counter = generator_counter + 1
		
		shield_addition# = shield_addition# - 1
		
		If protective_backup = True
			If shield_addition# > 0 Then
				draw_shield()
			EndIf
			If shield_addition# <= 0 Then
				total_protection_shield_time# = 0
			EndIf 
		EndIf 
		
		If life_support_generator = True
			If life_support_generator_unlocked = True And life_support_generator_2_unlocked = False And life_support_generator_3_unlocked = False
				If generator_counter >= 180
					health# = health# + 20
					generator_counter = 0
				EndIf 
			EndIf 
			If life_support_generator_2_unlocked = True And life_support_generator_3_unlocked = False 
				If generator_counter >= 120
					health# = health# + 20
					generator_counter = 0
				EndIf 
			EndIf 
			If life_support_generator_3_unlocked = True 
				If generator_counter >= 60
					health# = health# + 20
					generator_counter = 0
				EndIf 
			EndIf 
		EndIf 
		If hull_generator = True
			If hull_generator_unlocked = True And hull_generator_2_unlocked = False And hull_generator_3_unlocked = False 
				If generator_counter >= 180
					armor# = armor# + 10
					generator_counter = 0
				EndIf 
			EndIf 
			If hull_generator_2_unlocked = True And hull_generator_3_unlocked = False
				If generator_counter >= 120
					armor# = armor# + 10
					generator_counter = 0
				EndIf 
			EndIf 
			If hull_generator_3_unlocked = True 
				If generator_counter >= 60
					armor# = armor# + 10
					generator_counter = 0
				EndIf 
			EndIf 
		EndIf 
		If laser_generator = True
			If laser_generator_unlocked = True And laser_generator_2_unlocked = False And laser_generator_3_unlocked = False
				If generator_counter >= 180
					laser# = laser# + 10
					generator_counter = 0
				EndIf 
			EndIf 
			If laser_generator_2_unlocked = True And laser_generator_3_unlocked = False
				If generator_counter >= 120
					laser# = laser# + 10
					generator_counter = 0
				EndIf 
			EndIf 
			If laser_generator_3_unlocked = True 
				If generator_counter >= 60
					laser# = laser# + 10
					generator_counter = 0
				EndIf 
			EndIf 
		EndIf 
		If shield_generator = True
			If shield_generator_unlocked = True And shield_generator_2_unlocked = False And shield_generator_3_unlocked = False
				If generator_counter >= 180
					shield# = shield# + 10
					generator_counter = 0
				EndIf 
			EndIf 
			If shield_generator_2_unlocked = True And shield_generator_3_unlocked = False 
				If generator_counter >= 120
					shield# = shield# + 10
					generator_counter = 0
				EndIf 
			EndIf 
			If shield_generator_3_unlocked = True 
				If generator_counter >= 60
					shield# = shield# + 10
					generator_counter = 0
				EndIf 
			EndIf 
		EndIf 
			
	EndIf 
	

	
					
			;set limits on everything, don't want bars to go out of limits
			If health#<0 Then health#=0
			If armor#<0 Then armor#=0
			If laser#<0 Then laser#=0
			If wideshot_charge < 0 Then wideshot_charge = 0
			If shield#<0 Then shield#=0
			If allied_rep < 0 Then allied_rep = 0
			If protector_rep < 0 Then protector_rep = 0
			If tokens < 0 Then tokens = 0
			If megashot_charge < 0 Then megashot_charge = 0
			If shield_addition < 0 Then shield_addition = 0
			If phase_inverter_capacity < 0 Then phase_inverter_capacity = 0

			
			If health>1000 Then health=1000
			If armor# > (1000 + hull_integrity_increase#) Then armor# = (1000 + hull_integrity_increase#)
			If laser#>1000 Then laser#=1000
			If shield#>1000 Then shield#=1000
			If wideshot_charge > 100 Then wideshot_charge = 100
			If megashot_charge > 10 Then megashot_charge = 10
			
			;when you die this happens.
			If health <= 0
				If do_once_death = 0
					For particle_death = 0 To 140
						create_particle(p_x,p_y)
					Next
					If hardcore = True
						tokens = tokens - 15
					EndIf 
					If level > tokens
						If hardcore = False 
							tokens = tokens - 5
						EndIf 
					EndIf 
					do_once_death = 1
				EndIf
				If death_sound_count = 0
					died_at_mode = mode
					If sounds = True 
						PlaySound death_sound 
					EndIf 
					death_sound_count = 90
				EndIf 
				p_x = 3000 
				p_y = 3000
				mode = 99
				
			EndIf 
			
	If armor <= 0 And armor_gone_counter = 0
		If sounds = True 
			PlaySound armor_gone
		EndIf 
		armor_gone_counter = 1
	EndIf 
	
	If armor >= 200
		armor_gone_counter = 0
	EndIf 
	
	
	;buff system used for certain bosses
	If pink_buff = True 
		DrawImage pink_shield_reduced,p_x,p_y
	EndIf 
	
	If green_buff = True 
		DrawImage green_shield_reduced,p_x,p_y
	EndIf 
	
	;update everything.
 	update_space_dust()
	draw_bullet()
	draw_laser()
	draw_megashot()
	draw_littleshot()
	draw_enemy_ship_phaser()
	draw_enemy_ship_bomb()
	draw_enemy_ship_rotator()
	draw_enemy_ship()
	draw_friendly_allied()
	draw_friendly_protector()
	draw_protection()
	draw_no_armor_protection()
	draw_bomb()
	draw_vector_bomb()
	draw_spin_zapper()
	draw_enemy_bullet()
	draw_enemy_ball()
	draw_heat_seeking()
	draw_green_laser()
	draw_pink_laser()
	draw_side_pink_laser()
	draw_side_green_laser()
	draw_asteroid()
	draw_asteroid_chunk()
	draw_health_resource()
	draw_phaser_resource()
	draw_shield_resource()
	draw_wideshot_resource()
	draw_protection_resource()
	draw_inverter_resource()
	draw_megashot_resource()
	draw_particles()
	update_nuke()
	draw_coin()
End Function