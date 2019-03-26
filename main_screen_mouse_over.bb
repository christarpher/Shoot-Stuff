Include "variables.bb"

Function main_screen_mouse_over()
		main_mouse_over = False 
		clicked = False 
		load_counter_error = load_counter_error + 1
		load_counter_success = load_counter_success + 1
		save_counter_success = save_counter_success + 1
		unlock_hardcore_counter = unlock_hardcore_counter + 1
		
		
		
		
		
		If debug = True
			Color 255,255,255
			If MouseX() > 920 And MouseX() < 1000 And MouseY() > 20 And MouseY() < 50  
				Color 0,255,0
				If main_screen_roll_over_repeat = 0
						If sounds = True 
							PlaySound button_roll_over 
						EndIf 
						main_screen_roll_over_repeat = 1
					EndIf 
				main_mouse_over = True 
				If MouseHit(1)
					mode = 200
					If sounds = True 
						PlaySound button_click
					EndIf 
				EndIf 
			EndIf 
			Rect 920,20,80,30,False 
			Text 960,35,"DEBUG",True,True 
		EndIf 
		
		
		
		
		
		
		
		If dumb_mode = True
			Color 255,255,255
			
			Text 512,105,"Click if you're bad and need more free tokens to test shiz (cheater noob)",True,True
			If MouseX() > 212 And MouseX() < 812 And MouseY() > 90 And MouseY() < 120  ;talent mouse over 
				Color 0,255,0
				If main_screen_roll_over_repeat = 0
						If sounds = True 
							PlaySound button_roll_over 
						EndIf 
						main_screen_roll_over_repeat = 1
					EndIf 
				main_mouse_over = True 
				If MouseHit(1)
					tokens = tokens + 20
					If sounds = True 
						PlaySound button_click
					EndIf 
				EndIf 
				;Color 255,0,0
			EndIf 
			Rect 212,90,600,30,False ; talent box
		EndIf 	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		If unlock_hardcore = False And unlock_hardcore_counter < 200
			Text 512,120,"You must complete all of the available levels before unlocking hardcore mode!",True,True 
		EndIf 
		;If MouseX() > 412 And MouseX() < 612 And MouseY() > 385 And MouseY() < 415
		;	Color 255,0,0
		;	main_mouse_over = True 
		;	If MouseHit(1)
		;		mode = 4
		;	EndIf 
		;EndIf 
		;Rect 412,385,200,30,False
;		Color 255,255,255
;		If MouseX() > 412 And MouseX() < 612 And MouseY() > 425 And MouseY() < 455  ;talent mouse over 
;			Color 255,0,0
;			If main_screen_roll_over_repeat = 0
;					If sounds = True 
;						PlaySound button_roll_over 
;					EndIf 
;					main_screen_roll_over_repeat = 1
;				EndIf 
;			main_mouse_over = True 
;			If MouseHit(1)
;				mode = 2
;				If sounds = True 
;					PlaySound button_click
;				EndIf 
;			EndIf 
;		EndIf 
;		Rect 412,425,200,30,False ; talent box
;		Rect 625,425,30,30,False ; talent available box
		
		If paused = True 
			Color 122,122,122
		EndIf 
		If paused = False 
			Color 255,255,255
			If talents_available > 0 Then
				Color 255,color_changer,color_changer
				
				If color_changer <= 0 Then 
					color_changer_switcher = False
				EndIf
				If color_changer >= 255 Then
					color_changer_switcher = True
				EndIf 
				
				If color_changer_switcher = True Then
					color_changer = color_changer - 5
				EndIf 
				If color_changer_switcher = False Then
					color_changer = color_changer + 5
				EndIf 
			EndIf
			If MouseX() > 412 And MouseX() < 612 And MouseY() > 465 And MouseY() < 495  ;ship config
				Color 0,255,0
				If main_screen_roll_over_repeat = 0
						If sounds = True 
							PlaySound button_roll_over 
						EndIf 
						main_screen_roll_over_repeat = 1
					EndIf 
				main_mouse_over = True 
				If MouseHit(1)
					mode = 94
					If sounds = True 
						PlaySound button_click
					EndIf 
				EndIf 
			EndIf 
		EndIf 
		Rect 412,465,200,30,False 
		
		
		Color 255,255,255
			If MouseX() > 715 And MouseX() < 915 And MouseY() > 505 And MouseY() < 535  ;achievement mouse over 
				Color 0,255,0
				If main_screen_roll_over_repeat = 0
					If sounds = True 
						PlaySound button_roll_over 
					EndIf 
					main_screen_roll_over_repeat = 1
				EndIf 
				main_mouse_over = True 
				If MouseHit(1)
					mode = 95
					If sounds = True 
						PlaySound button_click
					EndIf 
					;start_music()
				EndIf 
			EndIf 
		Rect 715,505,200,30,False ; achievement box
		
		;Text 512,300,save_slot_number,True,True
		Color 255,255,255
		Text 765,440,"1",True,True
		Text 815,440,"2",True,True
		Text 865,440,"3",True,True
		Text 815,410,"Game Slot:",True,True
		
		
		Color 255,255,255
		mouse_over_1 = False 
			If MouseX() > 750 And MouseX() < 780 And MouseY() > 425 And MouseY() < 455  ;1 mouse over
				mouse_over_1 = True 
				Color 0,255,0
				If main_screen_roll_over_repeat = 0
					If sounds = True 
						PlaySound button_roll_over 
					EndIf 
					main_screen_roll_over_repeat = 1
				EndIf 
				main_mouse_over = True 
				If MouseHit(1)
					If sounds = True 
						PlaySound button_click
					EndIf 
					save_slot_number = 1
					load_file$ = "save/save1.dat"
				EndIf 
			EndIf 
		If save_slot_number = 1 And mouse_over_1 = False Then Color 255,0,0
		Rect 750,425,30,30,False ;1 box

		
		
		Color 255,255,255
		mouse_over_2 = False 
			If MouseX() > 800 And MouseX() < 830 And MouseY() > 425 And MouseY() < 455  ;2 mouse over
				mouse_over_2 = True 
				Color 0,255,0
				If main_screen_roll_over_repeat = 0
					If sounds = True 
						PlaySound button_roll_over 
					EndIf 
					main_screen_roll_over_repeat = 1
				EndIf 
				main_mouse_over = True 
				If MouseHit(1)
					If sounds = True 
						PlaySound button_click
					EndIf 
					save_slot_number = 2
					load_file$ = "save/save2.dat"
				EndIf 
			EndIf 
		If save_slot_number = 2 And mouse_over_2 = False Then Color 255,0,0
		Rect 800,425,30,30,False ; 2 box

		
		
		Color 255,255,255
		mouse_over_3 = False 
			If MouseX() > 850 And MouseX() < 880 And MouseY() > 425 And MouseY() < 455  ;3 mouse over
				mouse_over_3 = True 
				Color 0,255,0
				If main_screen_roll_over_repeat = 0
					If sounds = True 
						PlaySound button_roll_over 
					EndIf 
					main_screen_roll_over_repeat = 1
				EndIf 
				main_mouse_over = True 
				If MouseHit(1)
					If sounds = True 
						PlaySound button_click
					EndIf 
					save_slot_number = 3
					load_file$ = "save/save3.dat"
				EndIf 
			EndIf 
		If save_slot_number = 3 And mouse_over_3 = False Then Color 255,0,0
		Rect 850,425,30,30,False ; 3 box
				
		
		
		Color 255,255,255
		If paused = True Then Color 125,125,125
		Text 760,480,"Save Game",True,True
		If paused = False 
			If MouseX() > 710 And MouseX() < 810 And MouseY() > 465 And MouseY() < 495  
				Color 0,255,0
				If main_screen_roll_over_repeat = 0
					If sounds = True 
						PlaySound button_roll_over 
					EndIf 
					main_screen_roll_over_repeat = 1
				EndIf 
				main_mouse_over = True 
				If MouseHit(1)
					If sounds = True 
						PlaySound button_click
					EndIf 
					save_game(save_slot_number)
					save_counter_success = 0
				EndIf 
			EndIf 
		EndIf 
		Rect 710,465,100,30,False ; save box
		
		
		
		Color 255,255,255
		If paused = True Then Color 125,125,125
		Text 870,480,"Load Game",True,True
		If paused = False 
			If MouseX() > 820 And MouseX() < 920 And MouseY() > 465 And MouseY() < 495
				Color 0,255,0
				If main_screen_roll_over_repeat = 0
					If sounds = True 
						PlaySound button_roll_over
					EndIf  
					main_screen_roll_over_repeat = 1
				EndIf 
				main_mouse_over = True 
				If MouseHit(1)
					If sounds = True 
						PlaySound button_click
					EndIf 
					If FileType(load_file$) = 0
						load_counter_error = 0
					Else 
						load_game(save_slot_number)
						load_counter_success = 0
					EndIf 
				EndIf 
			EndIf 
		EndIf 
		Rect 820,465,100,30,False ; load box
		
		
		Color 255,255,255
		If paused = True Or unlock_hardcore = False Then Color 125,125,125
		If paused = False 
			If MouseX() > 150 And MouseX() < 180 And MouseY() > 425 And MouseY() < 455  ;Hardcore mouse over
				If unlock_hardcore = True 
					Color 0,255,0
					If main_screen_roll_over_repeat = 0
						If sounds = True 
							PlaySound button_roll_over 
						EndIf 
						main_screen_roll_over_repeat = 1
					EndIf 
					main_mouse_over = True 
					If MouseHit(1)
						If sounds = True 
							PlaySound button_click
						EndIf 
						If hardcore = False
							hardcore = True 
							clicked = True 
							total_enemies = 2300
						EndIf 
						If hardcore = True And clicked = False 
							hardcore  = False
							total_enemies = 2300 
						EndIf
					EndIf 
				EndIf 
				If unlock_hardcore = False
					If MouseHit(1) 
						unlock_hardcore_counter = 0
					EndIf 
				EndIf 
			EndIf 
		EndIf 
		Rect 150,425,30,30,False ; hardcore box
		If hardcore = True
			Line 150,425,179,454
			Line 179,425,150,454
		EndIf 
		
		
		
		
		
;		Color 255,255,255
;			If MouseX() > 150 And MouseX() < 180 And MouseY() > 465 And MouseY() < 495  ;sounds mouse over
;				Color 255,0,0
;				If main_screen_roll_over_repeat = 0
;					If sounds = True 
;						PlaySound button_roll_over 
;					EndIf 
;					main_screen_roll_over_repeat = 1
;				EndIf 
;				main_mouse_over = True 
;				If MouseHit(1)
;					If sounds = True 
;						PlaySound button_click
;					EndIf 
;					If sounds = False
;						sounds = True 
;						clicked = True 
;					EndIf 
;					If sounds = True And clicked = False 
;						sounds = False
;						;free_music()
;					EndIf
;				EndIf 
;			EndIf 
;		Rect 150,465,30,30,False ; sounds box
;		If sounds = True
;			Line 150,465,179,494
;			Line 179,465,150,494
;		EndIf 

		
		Color 255,255,255
			Rect box_x#,box_y,15,20,False
			Line 200,515,314,515
			Color 0,0,0
			Rect box_x#+1,box_y+1,13,18,True 
			Color 255,255,255
			Text 255,535,"Music Volume: "+(100-(300-box_x#))+"%",True,True
			;Text 512,300,music_vol#,True,True 

			If MouseX() >= 180 And MouseX() <= 340 And MouseY() >= box_y And MouseY() <= (box_y+20)  ;sounds mouse over
				If MouseDown(1)
					If sounds = True And MouseHit(1)
						PlaySound button_click
					EndIf 
					box_x# = (MouseX()-7)
					If music_vol# < 0 Then music_vol# = 0
					If music_vol# > 1 Then music_vol# = 1
					
					If random_music_selection = 1
						ChannelVolume level_1_channel,music_vol#
					EndIf 
					If random_music_selection = 2
						ChannelVolume level_2_channel,music_vol#
					EndIf 
					If random_music_selection = 3
						ChannelVolume level_3_channel,music_vol#
					EndIf 
					If random_music_selection = 4
						ChannelVolume level_4_channel,music_vol#
					EndIf 
					If random_music_selection = 5
						ChannelVolume level_5_channel,music_vol#
					EndIf 
					If random_music_selection = 6
						ChannelVolume level_6_channel,music_vol#
					EndIf 
					If random_music_selection = 7
						ChannelVolume level_7_channel,music_vol#
					EndIf 
					If random_music_selection = 8
						ChannelVolume level_8_channel,music_vol#
					EndIf 
					If random_music_selection = 9
						ChannelVolume level_9_channel,music_vol#
					EndIf 
					If random_music_selection = 10
						ChannelVolume level_10_channel,music_vol#
					EndIf 
					If random_music_selection = 11
						ChannelVolume level_11_channel,music_vol#
					EndIf 
				EndIf 				
			EndIf 
			music_vol# = ((100-(300-box_x#))/100)
			out_of_game_volume# = music_vol#
 
			If box_x# < 200 Then box_x# = 200
			If box_x# > 300 Then box_x# = 300
			
			
			
			
			
			
			
			
			
			
			
			
			
			Color 255,255,255
			Rect sound_box_x#,sound_box_y,15,20,False
			Line 200,470,314,470
			Color 0,0,0
			Rect sound_box_x#+1,sound_box_y+1,13,18,True 
			Color 255,255,255
			Text 255,490,"Sound Effects Volume: "+(100-(300-sound_box_x#))+"%",True,True
			;Text 512,300,music_vol#,True,True 

			If MouseX() >= 180 And MouseX() <= 340 And MouseY() >= sound_box_y And MouseY() <= (sound_box_y+20)  ;sounds mouse over
				If MouseDown(1)
					If sounds = True And MouseHit(1)
						PlaySound button_click
					EndIf 
					sound_box_x# = (MouseX()-7)

						
					
					If sound_effects_vol# < 0 Then sound_effects_vol# = 0
					If sound_effects_vol# > 1 Then sound_effects_vol# = 1
					If sound_effects_vol# = 0 Then sounds = False 
					If sound_effects_vol# > 0 Then sounds = True 
				EndIf 				
			EndIf 
						SoundVolume explode_sound, sound_effects_vol#
						SoundVolume death_sound, sound_effects_vol#
						SoundVolume armor_gone, sound_effects_vol#
						SoundVolume coin_pickup_sound, sound_effects_vol#
						SoundVolume buttom_click, sound_effects_vol#
						SoundVolume buttom_roll_over, sound_effects_vol#
						SoundVolume laser_pulse_sound, (.7 * sound_effects_vol#)
						SoundVolume standard_laser_sound, (.6 * sound_effects_vol#)
						SoundVolume shield_pulse_sound, (.6 * sound_effects_vol#)
						SoundVolume boulder_impact_sound,(.5 * sound_effects_vol#)
						SoundVolume boulder_impact_sound_2,(.5 * sound_effects_vol#)
						SoundVolume boulder_impact_sound_3,(.5 * sound_effects_vol#)
						SoundVolume boulder_impact_sound_4,(.5 * sound_effects_vol#)
						SoundVolume gib_sound, (.12 * sound_effects_vol#)
						SoundVolume gib_sound_2, (.12 * sound_effects_vol#)
						
			sound_effects_vol# = ((100-(300-sound_box_x#))/100)
			;out_of_game_volume# = music_vol#
 
			If sound_box_x# < 200 Then sound_box_x# = 200
			If sound_box_x# > 300 Then sound_box_x# = 300
			
			;Text 512,150,"sound_box_x#: "+sound_box_x#,True,True 
			;Text 512,170,"sound_box_y#: "+sound_box_y,True,True 
			;Text 512,190,"sound_effects_vol#: "+sound_effects_vol#,True,True 
			;Text 512,150,"sound_box_x#: "+sound_box_x#,True,True 
				
			
			
		;************************************************************



		Color 255,255,255
		If paused = True Then Color 125,125,125
		If paused = False 
			If MouseX() > 412 And MouseX() < 612 And MouseY() > 505 And MouseY() < 535  ; level select mouse over 
				Color 0,255,0
				If main_screen_roll_over_repeat = 0
					If sounds = True 	
						PlaySound button_roll_over 
					EndIf
					main_screen_roll_over_repeat = 1
				EndIf 
				main_mouse_over = True
				If MouseHit(1)
					If sounds = True 
						PlaySound button_click
					EndIf 
					If talent_15_spent = 3 Then armor#=2000
					If talent_15_spent = 2 Then armor#=1660
					If talent_15_spent = 1 Then armor#=1330
					If talent_15_spent = 0 Then armor#=1000 ; IF THE LAST TALENT IS NOT UNLOCKED
					mode = 3
				EndIf 
			EndIf 
		EndIf 
		Rect 412,505,200,30,False ; level select box
		If paused = True 
			Color 255,255,255
			If MouseX() > 412 And MouseX() < 612 And MouseY() > 385 And MouseY() < 415 ; resume mission mouse over 
				Color 0,255,0
				If main_screen_roll_over_repeat = 0
					If sounds = True 
						PlaySound button_roll_over 
					EndIf 
					main_screen_roll_over_repeat = 1
				EndIf 
				main_mouse_over = True
				If MouseHit(1)
					If sounds = True 
						PlaySound button_click
					EndIf 
					paused = False 
					mode = current_mode
					resume_current_music()
				EndIf 
			EndIf
			Rect 412,385,200,30,False ; resume mission box
			Color 255,255,255
				If MouseX() > 412 And MouseX() < 612 And MouseY() > 565 And MouseY() < 595  ; quit mission mouse over 
					Color 0,255,0
					If main_screen_roll_over_repeat = 0
						If sounds = True 
							PlaySound button_roll_over
						EndIf  
						main_screen_roll_over_repeat = 1
					EndIf 
					main_mouse_over = True
					If MouseHit(1)
						If sounds = True 
							PlaySound button_click
						EndIf 
						paused = False 
						current_mode = 1
						clear_levels()
						free_music()
					EndIf 
				EndIf 
			
			Rect 412,565,200,30,False; quit mission box
			Color 255,255,255
			
			Text 512,400,"Resume Mission", True, True 
			Text 512,580,"Quit Mission", True, True
			
			
		EndIf 
		
		Color 255,255,255
		;Text 512,400,"Play game", True, True
		;Text 512,440,"Talents and Abilities", True, True
		;Text 190,480,"Sound Effects",False,True 
		;Text 640,440,talents_available,True,True
		Text 815,520,"View Achievements", True, True
		If paused = True Then Color 125,125,125 
		Text 512,520,"Level Select", True, True
		Text 512,480,"Ship Configuration",True,True 
		If unlock_hardcore = False Then Color 125,125,125
		Text 190,440,"Hardcore Mode",False,True 
		
		;end displaying options to choose from
		Color 255,255,255
		If load_counter_error < 200
			Text 512,90,"There is no save file to load.",True,True 
			load_counter_success = 200
			save_counter_success = 200
		EndIf 
		If load_counter_success < 200
			Color 0,0,0
			Rect 300,75,500,30,True
			Color 255,255,255
			Text 512,90,"Load Successful!",True,True 
			load_counter_error = 200
			save_counter_success = 200
		EndIf 
		If save_counter_success < 200
			Color 0,0,0
			Rect 300,75,500,30,True
			Color 255,255,255
			Text 512,90,"Save Successful!",True,True 
			load_counter_success = 200
			load_counter_error = 200
		EndIf 
		

		
		
		
		If main_mouse_over = False
			FlushMouse
			FlushKeys
			main_screen_roll_over_repeat = 0
		EndIf 
End Function