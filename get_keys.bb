Include "functions.bb"
Include "variables.bb"
Include "ship functions.bb"

Function get_keys()
	bullet_counter = bullet_counter + 1
	laser_pulse_count = laser_pulse_count + 1
	shield_pulse_count = shield_pulse_count + 1
	wideshot_shooting = False
	
	
			
			;pause the game if they hit backspace 
			If  KeyHit (14) Or KeyHit(1);backspace
				If tutorial_status = False ;not allowed to go in to pause screen during tutorial
					current_mode = mode
					mode = 1
					paused = True 
						PauseChannel level_1_channel
						PauseChannel level_2_channel
						PauseChannel level_3_channel
						PauseChannel level_4_channel
						PauseChannel level_5_channel
						PauseChannel level_6_channel
						PauseChannel level_7_channel
						PauseChannel level_8_channel
						PauseChannel level_9_channel
						PauseChannel level_10_channel
						PauseChannel level_11_channel
				EndIf 
			EndIf
			
			;limit movement boundaries
			If p_y# < 100 Then p_y# = 100
			If p_y# > 570 Then p_y# = 570
			If p_x# < 20 Then p_x# = 20
			If p_x# > 1004 Then p_x# = 1004
			
			
			up_key = False
			down_key = False
			right_key = False
			left_key = False 
			
	If health > 0		
			If  KeyDown (200);up key
				;p_y=p_y-speedmod
				inertia_up# = inertia_up# + inertia_sensitivity#
				up_key = True
			EndIf
			
			If  KeyDown (208);down key
				;p_y=p_y+speedmod
				inertia_down# = inertia_down# + inertia_sensitivity#
				down_key = True
			EndIf
			
			If  KeyDown (203);left key
				;p_x=p_x-speedmod
				inertia_left# = inertia_left# + inertia_sensitivity#
				Left_key = True
			EndIf
			
			If  KeyDown (205);right key
				;p_x=p_x+speedmod
				inertia_right# = inertia_right# + inertia_sensitivity#
				right_key = True  
			EndIf
			
			;Text 512,300,speedmod#,True,True 
			
			check_for_shield_regen = False 
			If right_key = False And left_key = True
				check_for_shield_regen = True 
			EndIf 
			If right_key = True And left_key = False 
				check_for_shield_regen = True 
			EndIf 
			If up_key = False And down_key = True
				check_for_shield_regen = True 
			EndIf 
			If up_key = True And down_key = False 
				check_for_shield_regen = True 
			EndIf 
			
			If check_for_shield_regen = True 
				If talent_7_spent = 0
					shield_regen_increaser = shield_regen_increaser + 0
				EndIf 
				If talent_7_spent = 1
					shield_regen_increaser = shield_regen_increaser + 5
				EndIf 
				If talent_7_spent = 2
					shield_regen_increaser = shield_regen_increaser + 10
				EndIf 
			EndIf 
			;limit inertia
			If inertia_down# < 0 Then inertia_down# = 0
			If inertia_up# < 0 Then inertia_up# = 0
			If inertia_right# < 0 Then inertia_right# = 0
			If inertia_left# < 0 Then inertia_left# = 0
			
			If speedmod# > speedmod_max# Then speedmod# = speedmod_max#
						
			;so inertia never exceedes the speed of the ship (prevent speed stutters)
			If inertia_down# > speedmod# Then inertia_down# = speedmod#
			If inertia_up# > speedmod# Then inertia_up# = speedmod#
			If inertia_right# > speedmod# Then inertia_right# = speedmod#
			If inertia_left# > speedmod# Then inertia_left# = speedmod#
						
			
			If Right_key = False
				inertia_right# = inertia_right# - inertia_sensitivity#
			EndIf 
			If left_key = False 
				inertia_left# = inertia_left# - inertia_sensitivity#
			EndIf 
			If down_key = False 
				inertia_down# = inertia_down# - inertia_sensitivity#
			EndIf 
			If up_key = False 
				inertia_up# = inertia_up# - inertia_sensitivity#
			EndIf 
			
			p_x# = p_x# + inertia_right#
			p_x# = p_x# - inertia_left#
			p_y# = p_y# + inertia_down#
			p_y# = p_y# - inertia_up#
			
			

			
			If  KeyDown (57); space bar
				;If spacebar_standard = True 
					fire_standard_laser()
				;EndIf 
			EndIf
			
			;only let key hits for protection, instead of keydown
				If a_protection = True 
					If KeyHit (30)
						use_protection()
					EndIf
				EndIf
				If s_protection = True 
					If KeyHit (31)
						use_protection()
					EndIf 
				EndIf
				If d_protection = True 
					If  KeyHit (32)
						use_protection()
					EndIf
				EndIf
				
				If a_megashot = True 
					If  KeyHit (30)
						use_megashot()
					EndIf
				EndIf 
				If s_megashot = True 
					If  KeyHit (31)
						use_megashot()
					EndIf
				EndIf
				If d_megashot = True 
					If  KeyHit (32)
						use_megashot()
					EndIf
				EndIf
				
				If a_phase_inverter = True 
					If  KeyHit (30)
						use_phase_inverter()
					EndIf
				EndIf 
				If s_phase_inverter = True 
					If  KeyHit (31)
						use_phase_inverter()
					EndIf
				EndIf
				If d_phase_inverter = True 
					If  KeyHit (32)
						use_phase_inverter()
					EndIf
				EndIf
				
				
			;if keys is held down instead of pushed	
			If  KeyDown (30) 
				If a_laser = True 
					fire_laser()
				EndIf 
				If a_shield = True 
					use_shield()
				EndIf 
				If a_wideshot = True 
					fire_wide_shot()
				EndIf 
			EndIf
			
			If  KeyDown (31) 
				If s_laser = True 
					fire_laser()
				EndIf 
				If s_shield = True 
					use_shield()
				EndIf 
				If s_wideshot = True 
					fire_wide_shot()
				EndIf 
			EndIf
			
			If  KeyDown (32) 
				If d_laser = True 
					fire_laser()
				EndIf 
				If d_shield = True 
					use_shield()
				EndIf 
				If d_wideshot = True 
					fire_wide_shot()
				EndIf 
			EndIf
			
			If autoshoot = True And wideshot_shooting = False 
				fire_standard_laser()
			EndIf 
			
			
	EndIf 
End Function