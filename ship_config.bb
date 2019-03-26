Include "variables.bb"

Function ship_configuration()

	Line 0,50,1024,50
	Line 350,50,350,600
	Line 0,100,350,100
	;Line 350,330,1024,330
	;Line 350,380,1024,380
	
	;Line 350,550,1024,550
	;Line 518,380,518,600
	;Line 687,380,687,600
	;Line 856,380,856,600
	
	Line 700,50,700,600
	Line 700,100,1024,100
	
	chance_to_crit# = capacitor_crit_add# + laser_crit_talent#
	DrawImage bullet_shot_image,35,150
	Text 70,120,"Laser Damage: "+((30)*(1+standard_shot_damage_increaser#))
	Text 70,135,"Firing Speed: "+(((20*(1-laser_mod#)))/60)+" Seconds"
	Text 70,150,"Damage Per Second: "+(1/(((20*(1-laser_mod#)))/60))*((30)*(1+standard_shot_damage_increaser#))+" (No crits)"
	Text 70,165,"Chance to Crit for 2x Damage: "+chance_to_crit#+"%"

	DrawImage laser_shot_image,35,205
	DrawImage laser_shot_image,35,207
	DrawImage laser_shot_image,35,209
	Text 70,190,"Phaser Damage: "+(10)
	Text 70,205,"Firing Speed: 0.0166 Seconds"
	Text 70,220,"Damage Per Second: "+(1/0.01666)*10
	
	Text 175,495,"Maximum Warp: "+(speedmod_max#*60)+" Pixels per second",True,True
	
	Text 175,510,"Phaser Sustainability: "+(1000/((2*(laser_drain#))*60))+" Seconds",True,True
	
	Text 175,525,"Shield Sustainability: "+(1000/((2*shield_mod#)*60))+" Seconds",True,True
	
	Text 175,540,"Damage Reduced by: "+((damage_reduction#+damage_reduction_armor_upgrade#)*100)+"%",True,True
	
	
	
	DrawImage ball_image,35,272
	Text 70,250,"Mega Shot Damage: "+megashot_damage*megashot_damage_increase#
	Text 70,265,"On Hit: Splits into 2 plasma bursts"
	Text 70,280,"(Does not split when it hits a boss)"
	
	DrawImage ball_image_small,35,318
	Text 70,310,"Plasma Burst Damage: "+littleshot_damage*energy_ball_damage_increase#
	
	DrawImage allied_rotated,35,355
	Text 70,340,"Protection Damage: "+((30)*(1+standard_shot_damage_increaser#))
	Text 70,355,"Firing speed: 0.333 - 0.5 Seconds"
	
	;Text 175,315,"Nuke Radius: 650 Pixels",True,True
	
	;Text 175,330,"Backup Ships: "+protection_to_make,True,True
	
	If phase_inverter_spent < 1 Then Color 122,122,122
		Text 400,325,"Inverter",False,True
		Text 520,325,"Inverter",False,True
		Text 641,325,"Inverter",False,True
	Color 255,255,255
	If megashot_spent < 1 Then Color 122,122,122
		Text 400,365,"Mega shot",False,True 
		Text 520,365,"Mega shot",False,True
		Text 641,365,"Mega shot",False,True
	Color 255,255,255
	If protection_spent < 1 Then Color 122,122,122
		Text 400,405,"Protection",False,True 
		Text 520,405,"Protection",False,True 
		Text 641,405,"Protection",False,True
	Color 255,255,255
	If laser_spent < 1 Then Color 122,122,122
		Text 400,445,"Phaser",False,True 
		Text 520,445,"Phaser",False,True 
		Text 641,445,"Phaser",False,True 
	Color 255,255,255
	If shield_spent < 1 Then Color 122,122,122
		Text 400,485,"Shield",False,True 
		Text 520,485,"Shield",False,True 
		Text 641,485,"Shield",False,True
	Color 255,255,255
		
		Text 400,525,"Wideshot",False,True 
		Text 520,525,"Wideshot",False,True  
		Text 641,525,"Wideshot",False,True 
	
	SetFont font2
	Text 500,200,"Talents and Abilities",True,True
	Text 635,200,talents_available,True,True
	SetFont font3
	
	must_buy_accessory_first_counter = must_buy_accessory_first_counter - 1
	If must_buy_accessory_first_counter > 0
		Text 512,250,"You must buy that accessory first!",True,True
		Rect 415,240,195,20,False
	EndIf 
	If must_buy_accessory_first_counter <= 0 Then
		must_buy_accessory_first_counter = 0
	EndIf 
	
	
	must_unlock_first_counter = must_unlock_first_counter - 1
	If must_unlock_first_counter > 0
		Text 512,280,"You must unlock that ability first!",True,True
		Rect 415,270,195,20,False
	EndIf 
	If must_unlock_first_counter <= 0 Then
		must_unlock_first_counter = 0
	EndIf 
	
	config_mouse_over = False
	
		
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
		
		If MouseX() > 400 And MouseX() < 601 And MouseY() > 185 And MouseY() < 215 ;talent mouse over 
			Color 255,0,0
			config_mouse_over = True 
			If MouseHit(1)
				mode = 2
				If sounds = True 
					PlaySound button_click 
				EndIf 
			EndIf 
			Color 0,255,0
		EndIf 
		
		
		Rect 400,185,200,30,False ; talent box
		Rect 620,185,30,30,False ; talent available box
		Color 255,255,255

	
		
		
		
	;&&&&&&&&&&&&&&&&&&& A STUFF BELOW
	
	
	If MouseX() > 360 And MouseX() < 391 And MouseY() > 310 And MouseY() < 340
		If MouseHit(1)
			If phase_inverter_spent < 1 Then
				must_unlock_first_counter = 120
			EndIf 
			If phase_inverter_spent >= 1 Then
				a_protection = False
				a_laser = False
				a_shield = False
				a_wideshot = False 
				a_megashot = False
				a_phase_inverter = True
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf 
		EndIf 
		Color 0,255,0
		config_mouse_over = True 
	EndIf 
		If phase_inverter_spent < 1 Then Color 122,122,122
		Rect 360,310,31,30,False 
		Color 255,255,255
	
	If MouseX() > 360 And MouseX() < 391 And MouseY() > 350 And MouseY() < 380
		If MouseHit(1)
			If megashot_spent < 1 Then
				must_unlock_first_counter = 120
			EndIf 
			If megashot_spent >= 1 Then
				a_protection = False
				a_laser = False
				a_shield = False
				a_wideshot = False 
				a_megashot = True
				a_phase_inverter = False
				If sounds = True 
					PlaySound button_click
				EndIf  
			EndIf 
		EndIf 
		Color 0,255,0
		config_mouse_over = True 
	EndIf 
		If megashot_spent < 1 Then Color 122,122,122
		Rect 360,350,31,30,False 
		Color 255,255,255
	
	If MouseX() > 360 And MouseX() < 391 And MouseY() > 390 And MouseY() < 420
		If MouseHit(1)
			If protection_spent < 1 Then
				must_unlock_first_counter = 120
			EndIf 
			If protection_spent >= 1 Then
				a_protection = True 
				a_laser = False
				a_shield = False
				a_wideshot = False 
				a_megashot = False
				a_phase_inverter = False 
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf 
		EndIf 
		Color 0,255,0
		config_mouse_over = True 
	EndIf 
		If protection_spent < 1 Then Color 122,122,122
		Rect 360,390,31,30,False 
		Color 255,255,255
	 
	If MouseX() > 360 And MouseX() < 391 And MouseY() > 430 And MouseY() < 460
		If MouseHit(1)
			If laser_spent < 1 Then
				must_unlock_first_counter = 120
			EndIf 
			If laser_spent >= 1 Then
				a_protection = False
				a_laser = True
				a_shield = False
				a_wideshot = False 
				a_megashot = False
				a_phase_inverter = False 
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf 
		EndIf 
		Color 0,255,0
		config_mouse_over = True 
	EndIf 
		If laser_spent < 1 Then Color 122,122,122
		Rect 360,430,31,30,False 
		Color 255,255,255
	
	If MouseX() > 360 And MouseX() < 391 And MouseY() > 470 And MouseY() < 500
		If MouseHit(1)
			If shield_spent < 1 Then
				must_unlock_first_counter = 120
			EndIf 
			If shield_spent >= 1 Then
				a_protection = False 
				a_laser = False
				a_shield = True
				a_wideshot = False 
				a_megashot = False
				a_phase_inverter = False 
				If sounds = True 
					PlaySound button_click
				EndIf 	
			EndIf 
		EndIf 
		Color 0,255,0
		config_mouse_over = True 
	EndIf 
		If shield_spent < 1 Then Color 122,122,122
		Rect 360,470,31,30,False 
		Color 255,255,255
	
	If MouseX() > 360 And MouseX() < 391 And MouseY() > 510 And MouseY() < 540
		If MouseHit(1)
			a_protection = False 
			a_laser = False
			a_shield = False
			a_wideshot = True
			a_megashot = False
			a_phase_inverter = False 
			If sounds = True 
				PlaySound button_click
			EndIf 
		EndIf 
		Color 0,255,0
		config_mouse_over = True 
	EndIf 
		Rect 360,510,31,30,False 
		Color 255,255,255
	
	;&&&&&&&&&&&&&&&&&&& S STUFF BELOW
	
	
	If MouseX() > 480 And MouseX() < 511 And MouseY() > 310 And MouseY() < 340
		If MouseHit(1)
			If phase_inverter_spent < 1 Then
				must_unlock_first_counter = 120
			EndIf 
			If phase_inverter_spent >= 1 Then
				s_protection = False
				s_laser = False
				s_shield = False
				s_wideshot = False 
				s_megashot = False
				s_phase_inverter = True
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf 
		EndIf 
		Color 0,255,0
		config_mouse_over = True 
	EndIf 
		If phase_inverter_spent < 1 Then Color 122,122,122
		Rect 480,310,31,30,False
		Color 255,255,255
	
	
	
	If MouseX() > 480 And MouseX() < 511 And MouseY() > 350 And MouseY() < 380
		If MouseHit(1)
			If megashot_spent < 1 Then
				must_unlock_first_counter = 120
			EndIf 
			If megashot_spent >= 1 Then
				s_protection = False
				s_laser = False
				s_shield = False
				s_wideshot = False 
				s_megashot = True
				s_phase_inverter = False 
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf 
		EndIf 
		Color 0,255,0
		config_mouse_over = True 
	EndIf 
		If megashot_spent < 1 Then Color 122,122,122
		Rect 480,350,31,30,False
		Color 255,255,255
	
	If MouseX() > 480 And MouseX() < 511 And MouseY() > 390 And MouseY() < 420
		If MouseHit(1)
			If protection_spent < 1 Then
				must_unlock_first_counter = 120
			EndIf 
			If protection_spent >= 1 Then
				s_protection = True 
				s_laser = False
				s_shield = False
				s_wideshot = False 
				s_megashot = False
				s_phase_inverter = False
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf 
		EndIf 
		Color 0,255,0
		config_mouse_over = True 
	EndIf 
		If protection_spent < 1 Then Color 122,122,122
		Rect 480,390,31,30,False
		Color 255,255,255
	 
	If MouseX() > 480 And MouseX() < 511 And MouseY() > 430 And MouseY() < 460
		If MouseHit(1)
			If laser_spent < 1 Then
				must_unlock_first_counter = 120
			EndIf 
			If laser_spent >= 1 Then
				s_protection = False
				s_laser = True
				s_shield = False
				s_wideshot = False 
				s_megashot = False
				s_phase_inverter = False
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf
		EndIf 
		Color 0,255,0
		config_mouse_over = True 
	EndIf 
		If laser_spent < 1 Then Color 122,122,122
		Rect 480,430,31,30,False 
		Color 255,255,255
	
	If MouseX() > 480 And MouseX() < 511 And MouseY() > 470 And MouseY() < 500
		If MouseHit(1)
			If shield_spent < 1 Then
				must_unlock_first_counter = 120
			EndIf 
			If shield_spent >= 1 Then
				s_protection = False 
				s_laser = False
				s_shield = True
				s_wideshot = False 
				s_megashot = False
				s_phase_inverter = False
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf
		EndIf 
		Color 0,255,0
		config_mouse_over = True 
	EndIf 
		If shield_spent < 1 Then Color 122,122,122	
		Rect 480,470,31,30,False
		Color 255,255,255
	
	If MouseX() > 480 And MouseX() < 511 And MouseY() > 510 And MouseY() < 540
		If MouseHit(1)
			s_protection = False 
			s_laser = False
			s_shield = False
			s_wideshot = True
			s_megashot = False
			s_phase_inverter = False
			If sounds = True 
				PlaySound button_click
			EndIf 
		EndIf 
		Color 0,255,0
		config_mouse_over = True 
	EndIf 
		Rect 480,510,31,30,False
		Color 255,255,255
	
	;&&&&&&&&&&&&&&&&&&& D STUFF BELOW
	
	If MouseX() > 600 And MouseX() < 631 And MouseY() > 310 And MouseY() < 340
		If MouseHit(1)
			If phase_inverter_spent < 1 Then
				must_unlock_first_counter = 120
			EndIf 
			If phase_inverter_spent >= 1 Then
				d_protection = False
				d_laser = False
				d_shield = False
				d_wideshot = False 
				d_megashot = False
				d_phase_inverter = True
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf
		EndIf 
		Color 0,255,0
		config_mouse_over = True 
	EndIf 
		If phase_inverter_spent < 1 Then Color 122,122,122
		Rect 600,310,31,30,False 
		Color 255,255,255
	
	
	
	If MouseX() > 600 And MouseX() < 631 And MouseY() > 350 And MouseY() < 380
		If MouseHit(1)
			If megashot_spent < 1 Then
				must_unlock_first_counter = 120
			EndIf 
			If megashot_spent >= 1 Then
				d_protection = False
				d_laser = False
				d_shield = False
				d_wideshot = False 
				d_megashot = True
				d_phase_inverter = False
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf
		EndIf 
		Color 0,255,0
		config_mouse_over = True 
	EndIf 
		If megashot_spent < 1 Then Color 122,122,122
		Rect 600,350,31,30,False 
		Color 255,255,255
	
	
	If MouseX() > 600 And MouseX() < 631 And MouseY() > 390 And MouseY() < 420
		If MouseHit(1)
			If protection_spent < 1 Then
				must_unlock_first_counter = 120
			EndIf 
			If protection_spent >= 1 Then
				d_protection = True 
				d_laser = False
				d_shield = False
				d_wideshot = False 
				d_megashot = False
				d_phase_inverter = False
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf
		EndIf 
		Color 0,255,0
		config_mouse_over = True 
	EndIf 
		If protection_spent < 1 Then Color 122,122,122
		Rect 600,390,31,30,False 
		Color 255,255,255
	 
	If MouseX() > 600 And MouseX() < 631 And MouseY() > 430 And MouseY() < 460
		If MouseHit(1)
			If laser_spent < 1 Then
				must_unlock_first_counter = 120
			EndIf 
			If laser_spent >= 1 Then
				d_protection = False
				d_laser = True
				d_shield = False
				d_wideshot = False 
				d_megashot = False
				d_phase_inverter = False
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf
		EndIf 
		Color 0,255,0
		config_mouse_over = True 
	EndIf 
		If laser_spent < 1 Then Color 122,122,122
		Rect 600,430,31,30,False 
		Color 255,255,255
	
	If MouseX() > 600 And MouseX() < 631 And MouseY() > 470 And MouseY() < 500
		If MouseHit(1)
			If shield_spent < 1 Then
				must_unlock_first_counter = 120
			EndIf 
			If shield_spent >= 1 Then
				d_protection = False 
				d_laser = False
				d_shield = True
				d_wideshot = False 
				d_megashot = False
				d_phase_inverter = False
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf
		EndIf 
		Color 0,255,0
		config_mouse_over = True 
	EndIf 
		If shield_spent < 1 Then Color 122,122,122
		Rect 600,470,31,30,False
		Color 255,255,255
	
	If MouseX() > 600 And MouseX() < 631 And MouseY() > 510 And MouseY() < 540
		If MouseHit(1)
			d_protection = False 
			d_laser = False
			d_shield = False
			d_wideshot = True
			d_megashot = False
			d_phase_inverter = False
			If sounds = True 
				PlaySound button_click
			EndIf 
		EndIf 
		Color 0,255,0
		config_mouse_over = True 
	EndIf 
		Rect 600,510,31,30,False
		Color 255,255,255

	


	;If spacebar_standard = True Then place_x(375,405)
	;If spacebar_laser = True Then place_x(375,445)
	;If spacebar_shield = True Then place_x(375,485)
	;If spacebar_nuke = True Then place_x(375,525)
	
	If a_phase_inverter = True Then place_x(375,325)
	If a_megashot = True Then place_x(375,365)
	If a_protection = True Then place_x(375,405)
	If a_laser = True Then place_x(375,445)
	If a_shield = True Then place_x(375,485)
	If a_wideshot = True Then place_x(375,525)
	
	If s_phase_inverter = True Then place_x(495,325)
	If s_megashot = True Then place_x(495,365)
	If s_protection = True Then place_x(495,405)
	If s_laser = True Then place_x(495,445)
	If s_shield = True Then place_x(495,485)
	If s_wideshot = True Then place_x(495,525)
	
	If d_phase_inverter = True Then place_x(615,325)
	If d_megashot = True Then place_x(615,365)
	If d_protection = True Then place_x(615,405)
	If d_laser = True Then place_x(615,445)
	If d_shield = True Then place_x(615,485)
	If d_wideshot = True Then place_x(615,525)
	
	;******************************* THIS IS FOR THE SENSITIVITY SLIDER


		Color 255,255,255
		;Text 512,300,inertia_sensitivity#,True,True 
			Rect inertia_box_x#,inertia_box_y,15,20,False
			Line 400,80,500,80
			Color 0,0,0
			Rect inertia_box_x#+1,inertia_box_y+1,13,18,True 
			Color 255,255,255
			Text 450,100,"Ship Acceleration: "+(inertia_box_x#-345)+"%",True,True
			;Text 512,300,music_vol#,True,True 

			If MouseX() >= 380 And MouseX() <= 520 And MouseY() >= inertia_box_y And MouseY() <= (inertia_box_y+20)  ;sounds mouse over
				If MouseDown(1)
					If sounds = True And MouseHit(1)
						PlaySound button_click
					EndIf 
					inertia_box_x# = (MouseX()-7)
					If inertia_sensitivity# < .5 Then inertia_sensitivity# = .5
					If inertia_sensitivity# > 2 Then inertia_sensitivity# = 2
					
				EndIf 
				config_mouse_over = True 				
			EndIf 
 			inertia_sensitivity# = ((inertia_box_x#-345)/100)*1.25
			;Text 512,300,inertia_sensitivity#
			If inertia_box_x# < 395 Then inertia_box_x# = 395
			If inertia_box_x# > 495 Then inertia_box_x# = 495






	;******************************* THIS IS FOR THE SHIP SPEED SLIDER
		

		Color 255,255,255
			;Text 512,300,speedmod_max#,True,True 
			Rect speed_box_x#,speed_box_y,15,20,False
			Line 550,80,650,80
			Color 0,0,0
			Rect speed_box_x#+1,speed_box_y+1,13,18,True 
			Color 255,255,255
			Text 600,100,"Warp Limiter: "+((speed_box_x*0.75)-383.75)+"%",True,True
			;Text 512,300,music_vol#,True,True 

			If MouseX() >= 530 And MouseX() <= 680 And MouseY() >= speed_box_y And MouseY() <= (speed_box_y+20)  ;sounds mouse over
				If MouseDown(1)
					If sounds = True And MouseHit(1)
						PlaySound button_click
					EndIf 
					speed_box_x# = (MouseX()-7)
					If speedmod_max# < 2 Then speedmod_max# = 2
					If speedmod_max# > 8 Then speedmod_max# = 8
					
				EndIf 
				config_mouse_over = True 			
			EndIf 
			
			;Text 512,300,speedmod_max#
 			speedmod_max# = 8*(((speed_box_x*0.75)-383.75)/100)
			If speed_box_x# < 545 Then speed_box_x# = 545
			If speed_box_x# > 645 Then speed_box_x# = 645
			

	
	
	ticked = False 
	If MouseX() >= 440 And MouseX() <= 471 And MouseY() >= 135 And MouseY() <= 165
		If MouseHit(1)
			If sounds = True
				PlaySound button_click
			EndIf 
			If autoshoot = False
				autoshoot = True
				ticked = True
			EndIf 
			If autoshoot = True And ticked = False 
				autoshoot = False
			EndIf 
		EndIf
		Color 0,255,0
	EndIf 
	Rect 440,135,31,30,False 
	If autoshoot = True 
		place_x(455,150)
	EndIf
	Color 255,255,255
	Text 485,150, "Automatically shoot",False,True 
	
	
	
	;&&&&&&&&&&&&&&&&&&& GENERATOR STUFF BELOW
	
	If life_support_generator_unlocked = False
		Color 122,122,122
		life_support_generator = False 
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 110 And MouseY() < 140
			Text 865,580,"Regenerates 2% Life Support every 3 seconds.",True,True
			If MouseHit(1)
				must_buy_accessory_first_counter = 120
			EndIf
		EndIf
	EndIf
	If life_support_generator_unlocked = True 
		Color 255,255,255
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 110 And MouseY() < 140
			If MouseHit(1)
				life_support_generator = True
				hull_generator = False
				laser_generator = False
				shield_generator = False
				laser_capacitor = False
				wideshot_generator = False
				nuclear_fission = False
				reactive_shielding = False
				protective_backup = False
				energy_split = False
				partial_phase = False
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf 
			Color 0,255,0
			config_mouse_over = True 
			If life_support_generator_unlocked = True And life_support_generator_2_unlocked = False And life_support_generator_3_unlocked = False
				Text 865,580,"Regenerates 2% Life Support every 3 seconds.",True,True
			EndIf 
			If life_support_generator_2_unlocked = True And life_support_generator_3_unlocked = False 
				Text 865,580,"Regenerates 2% Life Support every 2 seconds.",True,True
			EndIf 
			If life_support_generator_3_unlocked = True
				Text 865,580,"Regenerates 2% Life Support every second.",True,True
			EndIf 
		EndIf
		If life_support_generator = True
			place_x(725,125)
		EndIf 
	EndIf 
			Rect 710,110,31,30,False 
			Color 255,255,255
			If life_support_generator_unlocked = False Then Color 122,122,122
			If life_support_generator_unlocked = False And life_support_generator_2_unlocked = False And life_support_generator_3_unlocked = False
				Text 750,125,"Emergency Life Support Generator I",False,True 
			EndIf 
			If life_support_generator_unlocked = True And life_support_generator_2_unlocked = False And life_support_generator_3_unlocked = False
				Text 750,125,"Emergency Life Support Generator I",False,True 
			EndIf 
			If life_support_generator_2_unlocked = True And life_support_generator_3_unlocked = False 
				Text 750,125,"Emergency Life Support Generator II",False,True 
			EndIf 
			If life_support_generator_3_unlocked = True
				Text 750,125,"Emergency Life Support Generator III",False,True 
			EndIf 
			
	
	 
	If hull_generator_unlocked = False
		Color 122,122,122
		hull_generator = False 
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 150 And MouseY() < 180
			Text 865,580,"Regenerates 1% Hull Integrity every 3 seconds.",True,True
			If MouseHit(1)
				must_buy_accessory_first_counter = 120
			EndIf
		EndIf
	EndIf 
	If hull_generator_unlocked = True 
		Color 255,255,255
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 150 And MouseY() < 180
			If MouseHit(1)
				life_support_generator = False
				hull_generator = True
				laser_generator = False
				shield_generator = False
				laser_capacitor = False
				wideshot_generator = False
				nuclear_fission = False
				reactive_shielding = False
				protective_backup = False
				energy_split = False
				partial_phase = False
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf 
			Color 0,255,0
			config_mouse_over = True 
			If hull_generator_unlocked = True And hull_generator_2_unlocked = False And hull_generator_3_unlocked = False 
				Text 865,580,"Regenerates 1% Hull Integrity every 3 seconds.",True,True
			EndIf 
			If hull_generator_2_unlocked = True And hull_generator_3_unlocked = False 
				Text 865,580,"Regenerates 1% Hull Integrity every 2 seconds.",True,True
			EndIf 
			If hull_generator_3_unlocked = True 
				Text 865,580,"Regenerates 1% Hull Integrity every second.",True,True
			EndIf 
		EndIf
		If hull_generator = True
			place_x(725,165)	
		EndIf  
	EndIf
			Rect 710,150,31,30,False
			Color 255,255,255
			If hull_generator_unlocked = False Then Color 122,122,122
			If hull_generator_unlocked = False And hull_generator_2_unlocked = False And hull_generator_3_unlocked = False 
				Text 750,165,"Hull Integrity Field Generator I",False,True 
			EndIf 
			If hull_generator_unlocked = True And hull_generator_2_unlocked = False And hull_generator_3_unlocked = False 
				Text 750,165,"Hull Integrity Field Generator I",False,True 
			EndIf 
			If hull_generator_2_unlocked = True And hull_generator_3_unlocked = False 
				Text 750,165,"Hull Integrity Field Generator II",False,True 
			EndIf 
			If hull_generator_3_unlocked = True 
				Text 750,165,"Hull Integrity Field Generator III",False,True 
			EndIf 
			
	 
	
	If laser_generator_unlocked = False
		Color 122,122,122
		laser_generator = False 
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 190 And MouseY() < 220
			Text 865,580,"Re-charges 1% of your phaser battery every 3 seconds.",True,True
			If MouseHit(1)
				must_buy_accessory_first_counter = 120
			EndIf
		EndIf
	EndIf 
	If laser_generator_unlocked = True 
		Color 255,255,255
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 190 And MouseY() < 220
			If MouseHit(1)
				life_support_generator = False
				hull_generator = False
				laser_generator = True
				shield_generator = False
				laser_capacitor = False
				wideshot_generator = False
				nuclear_fission = False
				reactive_shielding = False
				protective_backup = False
				energy_split = False
				partial_phase = False
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf 
			Color 0,255,0
			config_mouse_over = True 
			If laser_generator_unlocked = True And laser_generator_2_unlocked = False And laser_generator_3_unlocked = False
				Text 865,580,"Re-charges 1% of your phaser battery every 3 seconds.",True,True
			EndIf 
			If laser_generator_2_unlocked = True And laser_generator_3_unlocked = False
				Text 865,580,"Re-charges 1% of your phaser battery every 2 seconds.",True,True
			EndIf 
			If laser_generator_3_unlocked = True 
				Text 865,580,"Re-charges 1% of your phaser battery every second.",True,True
			EndIf 
		EndIf
		If laser_generator = True
			place_x(725,205)	
		EndIf 
	EndIf
			Rect 710,190,31,30,False 
			Color 255,255,255
			If laser_generator_unlocked = False Then Color 122,122,122
			If laser_generator_unlocked = False And laser_generator_2_unlocked = False And laser_generator_3_unlocked = False
				Text 750,205,"Phaser Battery Generator I",False,True
			EndIf 
			If laser_generator_unlocked = True And laser_generator_2_unlocked = False And laser_generator_3_unlocked = False
				Text 750,205,"Phaser Battery Generator I",False,True
			EndIf 
			If laser_generator_2_unlocked = True And laser_generator_3_unlocked = False
				Text 750,205,"Phaser Battery Generator II",False,True
			EndIf 
			If laser_generator_3_unlocked = True 
				Text 750,205,"Phaser Battery Generator III",False,True
			EndIf 
			
	 
	
	If shield_generator_unlocked = False
		Color 122,122,122
		shield_generator = False 
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 230 And MouseY() < 260
			Text 865,580,"Re-charges 1% of your Shield Capacitors every 3 seconds.",True,True
			If MouseHit(1)
				must_buy_accessory_first_counter = 120
			EndIf
		EndIf
	EndIf 
	If shield_generator_unlocked = True 
		Color 255,255,255	
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 230 And MouseY() < 260
			If MouseHit(1)
				life_support_generator = False
				hull_generator = False
				laser_generator = False
				shield_generator = True
				laser_capacitor = False
				wideshot_generator = False
				nuclear_fission = False
				reactive_shielding = False
				protective_backup = False
				energy_split = False
				partial_phase = False
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf 
			Color 0,255,0
			config_mouse_over = True 
			If shield_generator_unlocked = True And shield_generator_2_unlocked = False And shield_generator_3_unlocked = False
				Text 865,580,"Re-charges 1% of your Shield Capacitors every 3 seconds.",True,True
			EndIf 
			If shield_generator_2_unlocked = True And shield_generator_3_unlocked = False
				Text 865,580,"Re-charges 1% of your Shield Capacitors every 2 seconds.",True,True
			EndIf 
			If shield_generator_3_unlocked = True 
				Text 865,580,"Re-charges 1% of your Shield Capacitors every second.",True,True
			EndIf 
		EndIf
		If shield_generator = True
			place_x(725,245)	
		EndIf
	EndIf  
			Rect 710,230,31,30,False 
			Color 255,255,255
			If shield_generator_unlocked = False Then Color 122,122,122
			If shield_generator_unlocked = False And shield_generator_2_unlocked = False And shield_generator_3_unlocked = False
				Text 750,245,"Emergency Forcefield Generator I",False,True
			EndIf
			If shield_generator_unlocked = True And shield_generator_2_unlocked = False And shield_generator_3_unlocked = False
				Text 750,245,"Emergency Forcefield Generator I",False,True
			EndIf 
			If shield_generator_2_unlocked = True And shield_generator_3_unlocked = False
				Text 750,245,"Emergency Forcefield Generator II",False,True
			EndIf 
			If shield_generator_3_unlocked = True 
				Text 750,245,"Emergency Forcefield Generator III",False,True
			EndIf 
			
			
	
	
	If laser_capacitor_unlocked = False
		Color 122,122,122
		laser_capacitor = False 
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 270 And MouseY() < 300
			Text 865,580,"Gives an extra 10% chance to crit with the laser.",True,True
			If MouseHit(1)
				must_buy_accessory_first_counter = 120
			EndIf
		EndIf
	EndIf 
	If laser_capacitor_unlocked = True 	
		Color 255,255,255
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 270 And MouseY() < 300
			If MouseHit(1)
				life_support_generator = False
				hull_generator = False
				laser_generator = False
				shield_generator = False
				laser_capacitor = True
				wideshot_generator = False
				nuclear_fission = False
				reactive_shielding = False
				protective_backup = False
				energy_split = False
				partial_phase = False
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf 
			Color 0,255,0
			config_mouse_over = True 
			If laser_capacitor_unlocked = True And laser_capacitor_2_unlocked = False And laser_capacitor_3_unlocked = False 
				Text 865,580,"Gives an extra 10% chance to crit with the laser.",True,True
			EndIf 
			If laser_capacitor_2_unlocked = True And laser_capacitor_3_unlocked = False 
				Text 865,580,"Gives an extra 20% chance to crit with the laser.",True,True
			EndIf
			If laser_capacitor_3_unlocked = True 
				Text 865,580,"Gives an extra 30% chance to crit with the laser.",True,True
			EndIf
		EndIf 
		If laser_capacitor = True
			place_x(725,285)
			If laser_capacitor_unlocked = True And laser_capacitor_2_unlocked = False And laser_capacitor_3_unlocked = False
				capacitor_crit_add# = 10
			EndIf 
			If laser_capacitor_2_unlocked = True And laser_capacitor_3_unlocked = False
				capacitor_crit_add# = 20
			EndIf 
			If laser_capacitor_3_unlocked = True 
				capacitor_crit_add# = 30
			EndIf 
			chance_to_crit# = capacitor_crit_add# + laser_crit_talent#	
		EndIf 
	EndIf
		If laser_capacitor = False
			capacitor_crit_add# = 0
		EndIf 
			Rect 710,270,31,30,False 
			Color 255,255,255
			If laser_capacitor_unlocked = False Then Color 122,122,122
			If laser_capacitor_unlocked = False And laser_capacitor_2_unlocked = False And laser_capacitor_3_unlocked = False 
				Text 750,285,"Empowered Laser Capacitors I",False,True
			EndIf 
			If laser_capacitor_unlocked = True And laser_capacitor_2_unlocked = False And laser_capacitor_3_unlocked = False 
				Text 750,285,"Empowered Laser Capacitors I",False,True
			EndIf 
			If laser_capacitor_2_unlocked = True And laser_capacitor_3_unlocked = False 
				Text 750,285,"Empowered Laser Capacitors II",False,True
			EndIf
			If laser_capacitor_3_unlocked = True 
				Text 750,285,"Empowered Laser Capacitors III",False,True
			EndIf
			
			
	If nuclear_fission_unlocked = False
		Color 122,122,122
		nuclear_fission = False 
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 310 And MouseY() < 340
			Text 865,580,"Mega shot creates plasma bursts in every direction.",True,True
			If MouseHit(1)
				must_buy_accessory_first_counter = 120
			EndIf
		EndIf
	EndIf 
	If nuclear_fission_unlocked = True 	
		Color 255,255,255
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 310 And MouseY() < 340
			If MouseHit(1)
				life_support_generator = False
				hull_generator = False
				laser_generator = False
				shield_generator = False
				laser_capacitor = False
				wideshot_generator = False
				nuclear_fission = True
				reactive_shielding = False
				protective_backup = False
				energy_split = False
				partial_phase = False
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf 
			Color 0,255,0
			config_mouse_over = True 
			If nuclear_fission_unlocked = True 
				Text 865,580,"Mega shot creates plasma bursts in every direction.",True,True
			EndIf 
		EndIf
		If nuclear_fission = True
			place_x(725,325)
		EndIf
	EndIf 
			Rect 710,310,31,30,False 
			Color 255,255,255
			If nuclear_fission_unlocked = False Then Color 122,122,122
			Text 750,325,"Nuclear Fission",False,True
			
			
			
	
	
	
	
	If reactive_shielding_unlocked = False
		Color 122,122,122
		reactive_shielding = False 
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 350 And MouseY() < 380
			Text 865,580,"Launches a plasma burst when hit with shields on.",True,True
			If MouseHit(1)
				must_buy_accessory_first_counter = 120
			EndIf
		EndIf
	EndIf 
	If reactive_shielding_unlocked = True 	
		Color 255,255,255
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 350 And MouseY() < 380
			If MouseHit(1)
				life_support_generator = False
				hull_generator = False
				laser_generator = False
				shield_generator = False
				laser_capacitor = False
				wideshot_generator = False
				nuclear_fission = False
				reactive_shielding = True
				protective_backup = False
				energy_split = False
				partial_phase = False
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf 
			Color 0,255,0
			config_mouse_over = True 
			If reactive_shielding_unlocked = True 
				Text 865,580,"Launches a plasma burst when hit with shields on.",True,True
			EndIf 
		EndIf
		If reactive_shielding = True
			place_x(725,365)
		EndIf
	EndIf 
			Rect 710,350,31,30,False 
			Color 255,255,255
			If reactive_shielding_unlocked = False Then Color 122,122,122
			Text 750,365,"Reactive Shielding",False,True
			
			
			
			
			
			
			
			
	If protective_backup_unlocked = False
		Color 122,122,122
		protective_backup = False 
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 390 And MouseY() < 420
			Text 865,580,"Gives 1.5 seconds of shield energy for each protector.",True,True
			If MouseHit(1)
				must_buy_accessory_first_counter = 120
			EndIf
		EndIf
	EndIf 
	If protective_backup_unlocked = True
		Color 255,255,255 	
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 390 And MouseY() < 420
			If MouseHit(1)
				life_support_generator = False
				hull_generator = False
				laser_generator = False
				shield_generator = False
				laser_capacitor = False
				wideshot_generator = False
				nuclear_fission = False
				reactive_shielding = False
				protective_backup = True
				energy_split = False
				partial_phase = False
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf 
			Color 0,255,0
			config_mouse_over = True 
			If protective_backup_unlocked = True 
				Text 865,580,"Gives 1.5 seconds of shield energy for each protector.",True,True
			EndIf 
		EndIf
		If protective_backup = True
			place_x(725,405)
		EndIf
	EndIf 
			Rect 710,390,31,30,False 
			Color 255,255,255
			If protective_backup_unlocked = False Then Color 122,122,122
			Text 750,405,"Protective Backup",False,True
			
			
			
			
			
			
			
			
	If energy_split_unlocked = False
		Color 122,122,122
		energy_split = False 
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 430 And MouseY() < 460
			Text 865,580,"Makes Wide shot fire 2 plasma bursts as well.",True,True
			If MouseHit(1)
				must_buy_accessory_first_counter = 120
			EndIf
		EndIf 
	EndIf 
	If energy_split_unlocked = True 	
		Color 255,255,255
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 430 And MouseY() < 460
			If MouseHit(1)
				life_support_generator = False
				hull_generator = False
				laser_generator = False
				shield_generator = False
				laser_capacitor = False
				wideshot_generator = False
				nuclear_fission = False
				reactive_shielding = False
				protective_backup = False
				energy_split = True
				partial_phase = False
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf 
			Color 0,255,0
			config_mouse_over = True 
			If energy_split_unlocked = True 
				Text 865,580,"Makes Wide shot fire 2 plasma bursts as well.",True,True
			EndIf 
		EndIf
		If energy_split = True
			place_x(725,445)
		EndIf
	EndIf 
			Rect 710,430,31,30,False 
			Color 255,255,255
			If energy_split_unlocked = False Then Color 122,122,122
			Text 750,445,"Energy Split",False,True
			
			
			
			
	If partial_phase_unlocked = False
		Color 122,122,122
		partial_phase = False 
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 470 And MouseY() < 500
			Text 865,580,"Allows the use of abilities while using the Phase Inverter.",True,True
			If MouseHit(1)
				must_buy_accessory_first_counter = 120
			EndIf 
		EndIf 
	EndIf 
	If partial_phase_unlocked = True 	
		Color 255,255,255
		If MouseX() > 710 And MouseX() < 741 And MouseY() > 470 And MouseY() < 500
			If MouseHit(1)
				life_support_generator = False
				hull_generator = False
				laser_generator = False
				shield_generator = False
				laser_capacitor = False
				wideshot_generator = False
				nuclear_fission = False
				reactive_shielding = False
				protective_backup = False
				energy_split = False
				partial_phase = True
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf 
			Color 0,255,0
			config_mouse_over = True 
			If partial_phase_unlocked = True 
				Text 865,580,"Allows the use of abilities while using the Phase Inverter.",True,True
			EndIf 
		EndIf
		If partial_phase = True
			place_x(725,485)
		EndIf
	EndIf 
			Rect 710,470,31,30,False 
			Color 255,255,255
			If partial_phase_unlocked = False Then Color 122,122,122
			Text 750,485,"Partial Phase",False,True
	
	;If wideshot_generator_unlocked = False
	;	Color 122,122,122
	;	wideshot_generator = False 
	;EndIf 
	;If wideshot_generator_unlocked = True	
	;	If MouseX() > 560 And MouseX() < 591 And MouseY() > 310 And MouseY() < 340
	;		If MouseHit(1)
	;			life_support_generator = False
	;			hull_generator = False
	;			laser_generator = False
	;			shield_generator = False
	;			protection_generator = False
	;			wideshot_generator = True
	;			If sounds = True 
	;				PlaySound button_click
	;			EndIf 
	;		EndIf 
	;		Color 255,0,0
	;		config_mouse_over = True 
	;	EndIf 
	;	If wideshot_generator = True
	;		place_x(575,325)	
	;	EndIf 
	;EndIf 
	;		Rect 560,310,31,30,False
	;		Color 255,255,255
	;		Text 600,325,"Rechargable Laser Banks",False,True
			
	
	
	
	
	
	
	
	
	
	Color 255,255,255
	If MouseX() > 20 And MouseX() < 95 And MouseY() > 560 And MouseY() < 580
		If MouseHit(1) = True
			If sounds = True 
				PlaySound button_click
			EndIf 
			mode = 1
		EndIf 
		Color 0,255,0
	EndIf 
	
	If config_mouse_over = False
		FlushKeys
		FlushMouse 
	EndIf 

	chance_to_crit# = capacitor_crit_add# 
	Rect 20,560,75,20,False
		Color 255,255,255
	Text 57,562,"Menu",True
End Function