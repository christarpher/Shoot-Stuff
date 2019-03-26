Include "class declarations.bb"
Include "functions.bb"
Include "variables.bb"
Include "talent_mouse_over.bb"
Include "talent_gui.bb"
Include "Talent_screen.bb"
Include "level_select_gui.bb"
Include "level_select_mouse_over.bb"
Include "main_screen_mouse_over.bb"
Include "get_keys.bb"
Include "draw.bb"
Include "draw_hud.bb"
Include "draw_market.bb"
Include "cheats.bb"
Include "reset_talents.bb"
Include "save_game.bb"
Include "achievements.bb"
Include "ship_config.bb"

AppTitle "Shoot Stuff"
SeedRnd(MilliSecs())
Graphics 1024,600,32,2
SetGfxDriver 2
SetBuffer BackBuffer()
AutoMidHandle True
timer = CreateTimer(60)

;modes -
; 1 = main screen (menu)
; 2 = Talent Screen
; 3 = Level Select Screen
; 4 = LEVEL 1
; 5 = LEVEL 2
; 6 = LEVEL 3
; 7 = LEVEL 4
; 8 = LEVEL 5
; 9 = LEVEL 6
; 10 = LEVEL 7
; 11 = LEVEL 8
; 12 = LEVEL 9 (final final boss)
; 100 = Status Screen (when you finish a level)
; 99 = Lose Screen (when you lose a level)
; 98 = Refueling Station Level (buy refills)
; 97 = tutorial
; 95 = Achievements
; 94 = SHIP CONFIGURATION
; 200 = DEBUG


;create_asteroid(0,0,9,0,0,15,1)
;(x,y,y_velocity,x_velocity,constraint,damage,health)
 


;SOUNDS - Always keep these loaded and ready
Global explode_sound = LoadSound("sound/explode.wav")
Global laser_pulse_sound = LoadSound("sound/laser_pulse_test1.mp3")
	SoundVolume laser_pulse_sound, .7
	SoundPitch laser_pulse_sound, 22000
Global standard_laser_sound = LoadSound("sound/standard_laser.wav")
	SoundVolume standard_laser_sound, .6
	SoundPitch standard_laser_sound, 44000
Global shield_pulse_sound = LoadSound("sound/shield_pulse.mp3")
	SoundVolume shield_pulse_sound, .6
Global death_sound = LoadSound("sound/death.wav")
Global button_roll_over = LoadSound("sound/button roll over.wav")
	SoundVolume button_roll_over, .5
Global button_click = LoadSound("sound/button click.wav")
	SoundVolume button_click, .5
Global armor_gone = LoadSound("sound/armor_gone.wav")
Global boulder_impact_sound = LoadSound("sound/boulder impact.wav")
	SoundVolume boulder_impact_sound,.5
Global boulder_impact_sound_2 = LoadSound("sound/boulder impact 2.wav")
	SoundVolume boulder_impact_sound_2,.5
Global boulder_impact_sound_3 = LoadSound("sound/boulder impact 3.wav")
	SoundVolume boulder_impact_sound_3,.5
Global boulder_impact_sound_4 = LoadSound("sound/boulder impact 4.wav")
	SoundVolume boulder_impact_sound_4,.5
Global coin_pickup_sound = LoadSound("sound/coin pickup.wav")
Global gib_sound = LoadSound("sound/gib.wav")
	SoundVolume gib_sound, .12
Global gib_sound_2 = LoadSound("sound/gib2.wav")
	SoundVolume gib_sound_2, .12

;the following are for sounds, but will be loaded when you click a level, then unloaded, once you finish. (unloaded in clear_levels())
Global level_1_music = 0 
Global level_2_music = 0 
Global level_3_music = 0
Global level_4_music = 0
Global level_5_music = 0
Global level_6_music = 0
Global level_7_music = 0 
Global level_8_music = 0
Global level_9_music = 0
Global level_10_music = 0
Global level_11_music = 0


Global level_1_channel = 0
Global level_2_channel = 0
Global level_3_channel = 0
Global level_4_channel = 0
Global level_5_channel = 0
Global level_6_channel = 0
Global level_7_channel = 0
Global level_8_channel = 0
Global level_9_channel = 0
Global level_10_channel = 0
Global level_11_channel = 0


;Global temp_image = LoadImage("images/temp.png")


Global nebula_image = LoadImage("images/nebula.jpg")
Global boss_big_ball = LoadImage("images/boss_big_ball.jpg")
Global front_shield_image = LoadImage("images/front_shield.bmp")
Global bomb = LoadImage("images/bomb.png")
Global bomb_almost = LoadImage("images/bomb_almost.png")
Global reflector_shield = LoadImage("images/reflector.png")
 
;used for phasing back to an unchanged state
Global player_image_temp = LoadImage("images/player.png")
Global ship_rotated_temp = LoadImage("images/player.png")
Global player_image = LoadImage("images/player.png")
Global ship_rotated = LoadImage("images/player.png")
Global player_image_phased = LoadImage("images/player_phased.png")
Global ship_rotated_phased = LoadImage("images/player_phased.png")

;full sized unaltered pictures to re-load when needed
Global player_image_temp_full = LoadImage("images/player.png")
Global ship_rotated_temp_full = LoadImage("images/player.png")
Global player_image_full = LoadImage("images/player.png")
Global ship_rotated_full = LoadImage("images/player.png")
Global player_image_phased_full = LoadImage("images/player_phased.png")
Global ship_rotated_phased_full = LoadImage("images/player_phased.png")

Global bullet_shot_image=LoadImage("images/laser_shot.png")
Global bullet_shot_rotated=LoadImage("images/laser_shot.png")

Global shield_image = LoadImage("images/shield_blue.png")
Global asteroid_chunk_1 = LoadImage("images/asteroid_chunk_1.bmp")
Global asteroid_chunk_2 = LoadImage("images/asteroid_chunk_2.bmp")
Global asteroid_chunk_3 = LoadImage("images/asteroid_chunk_3.bmp")
Global asteroid_chunk_4 = LoadImage("images/asteroid_chunk_4.bmp")
Global asteroid_chunk_5 = LoadImage("images/asteroid_chunk_5.bmp")
Global asteroid_chunk_6 = LoadImage("images/asteroid_chunk_6.bmp")
Global asteroid_chunk_7 = LoadImage("images/asteroid_chunk_1.bmp")
		RotateImage asteroid_chunk_7,90
Global asteroid_chunk_8 = LoadImage("images/asteroid_chunk_2.bmp")
		RotateImage asteroid_chunk_8,90
Global asteroid_chunk_9 = LoadImage("images/asteroid_chunk_3.bmp")
		RotateImage asteroid_chunk_9,90
Global asteroid_chunk_10 = LoadImage("images/asteroid_chunk_4.bmp")
		RotateImage asteroid_chunk_10,90
Global asteroid_chunk_11 = LoadImage("images/asteroid_chunk_5.bmp")
		RotateImage asteroid_chunk_11,90
Global asteroid_chunk_12 = LoadImage("images/asteroid_chunk_6.bmp")
		RotateImage asteroid_chunk_12,90
Global asteroid_chunk_13 = LoadImage("images/asteroid_chunk_1.bmp")
		RotateImage asteroid_chunk_13,180
Global asteroid_chunk_14 = LoadImage("images/asteroid_chunk_2.bmp")
		RotateImage asteroid_chunk_14,180
Global asteroid_chunk_15 = LoadImage("images/asteroid_chunk_3.bmp")
		RotateImage asteroid_chunk_15,180
Global asteroid_chunk_16 = LoadImage("images/asteroid_chunk_4.bmp")
		RotateImage asteroid_chunk_16,180
Global asteroid_chunk_17 = LoadImage("images/asteroid_chunk_5.bmp")
		RotateImage asteroid_chunk_17,180
Global asteroid_chunk_18 = LoadImage("images/asteroid_chunk_6.bmp")
		RotateImage asteroid_chunk_18,180



	RotateImage ship_rotated,180
	RotateImage bullet_shot_image, 180
	RotateImage ship_rotated_phased,180
	RotateImage ship_rotated_temp,180
	
	RotateImage ship_rotated_full,180
	RotateImage ship_rotated_phased_full,180
	RotateImage ship_rotated_temp_full,180
	
;Global coin = LoadAnimImage("images/coin.bmp",64,64,0,17)
Global coin2 = LoadAnimImage("images/coin2.bmp",50,50,0,16)
	   ScaleImage coin2,.65,.65
;Global lose_image=LoadImage("images/lose.bmp")
Global pink_shield=LoadImage("images/shield_pink.png")
Global pink_shield_reduced=LoadImage("images/shield_pink.png")
ScaleImage pink_shield_reduced,.5,.5
ScaleImage pink_shield,.5,.5

Global pink_shield_reduced_more=LoadImage("images/shield_pink.png")
ScaleImage pink_shield_reduced_more,.35,.35

Global green_shield=LoadImage("images/shield_green.png")
Global green_shield_reduced=LoadImage("images/shield_green.png")
ScaleImage green_shield_reduced,.5,.5
ScaleImage green_shield,.5,.5
	   
Global bullet_shot_enemy_image=LoadImage("images/bullet_shot_enemy.bmp")
Global bullet_shot_enemy_image_rotated=LoadImage("images/bullet_shot_enemy.bmp")
	   RotateImage bullet_shot_enemy_image_rotated,180 
Global laser_shot_image = LoadImage("images/phaser_shot.bmp")
Global laser_shot_image_green = LoadImage("images/laser_shot_green.bmp")
Global laser_shot_image_green_side = LoadImage("images/laser_shot_green.bmp")
	   RotateImage laser_shot_image_green_side, 90
Global laser_shot_image_pink = LoadImage("images/laser_shot_pink.bmp")
Global laser_shot_image_pink_side = LoadImage("images/laser_shot_pink.bmp")
	   RotateImage laser_shot_image_pink_side, 90

Global asteroid1 = LoadImage("images/asteroid1.bmp")
Global asteroid2 = LoadImage("images/asteroid2.bmp")
Global asteroid3 = LoadImage("images/asteroid3.bmp")
Global asteroid4 = LoadImage("images/asteroid1.bmp")
	   RotateImage asteroid4,45
Global asteroid5 = LoadImage("images/asteroid2.bmp")
	   RotateImage asteroid5,45
Global asteroid6 = LoadImage("images/asteroid3.bmp")
	   RotateImage asteroid6,45
Global asteroid7 = LoadImage("images/asteroid1.bmp")
	   RotateImage asteroid7,90
Global asteroid8 = LoadImage("images/asteroid2.bmp")
	   RotateImage asteroid8,90
Global asteroid9 = LoadImage("images/asteroid3.bmp")
	   RotateImage asteroid9,90
Global asteroid10 = LoadImage("images/asteroid1.bmp")
	   RotateImage asteroid10,135
Global asteroid11 = LoadImage("images/asteroid2.bmp")
	   RotateImage asteroid11,135
Global asteroid12 = LoadImage("images/asteroid3.bmp")
	   RotateImage asteroid12,135
Global asteroid13 = LoadImage("images/asteroid1.bmp")
	   RotateImage asteroid13,180
Global asteroid14 = LoadImage("images/asteroid2.bmp")
	   RotateImage asteroid14,180
Global asteroid15 = LoadImage("images/asteroid3.bmp")
	   RotateImage asteroid15,180
Global allied = LoadImage("images/enemy.bmp")
Global allied_rotated = LoadImage("images/enemy.bmp")
	   RotateImage allied_rotated,180
Global protector = LoadImage("images/enemy2.bmp")
Global protector_rotated = LoadImage("images/enemy2.bmp")
	   RotateImage protector_rotated,180
Global enemy = LoadImage("images/enemy3.bmp")
Global enemy_rotated = LoadImage("images/enemy3.bmp")
	   RotateImage enemy_rotated,180
Global enemy_2 = LoadImage("images/enemy4.bmp")
Global enemy_2_rotated = LoadImage("images/enemy4.bmp")
	   RotateImage enemy_2_rotated,180
Global final_boss_image = LoadImage("images/final_boss.bmp")
Global first_boss_image = LoadImage("images/final_boss.bmp")
Global third_boss_image = LoadImage("images/final_boss.bmp")

;Global win_image = LoadImage("images/win.bmp")
Global ball_image = LoadImage("images/blue_ball.bmp")
	   ScaleImage(ball_image,.2,.2)
Global ball_image_small = LoadImage("images/blue_ball.bmp")
	   ScaleImage(ball_image_small,.15,.15)
Global boss_2_pink = LoadImage("images/boss_2_pink.bmp")
Global boss_2_green = LoadImage("images/boss_2_green.bmp")
Global pink_ball = LoadImage("images/pink_ball.bmp")
Global green_ball = LoadImage("images/green_ball.bmp")
Global blue_ball = LoadImage("images/blue_ball.bmp")
Global bad_ship = LoadImage("images/enemy3.bmp")
Global boss_3_enemy = LoadImage("images/boss_3_enemy.png")
Global boss_3 = LoadImage("images/boss_3_up.png")
Global nicolle = LoadImage("images/enemy.bmp")
		RotateImage nicolle,90
Global nicolle_turned = LoadImage("images/enemy.bmp")
		RotateImage nicolle_turned,270

Global health_resource_image = LoadImage("images/health_up.png")
Global phaser_resource_image = LoadImage("images/phaser_up.png")
Global shield_resource_image = LoadImage("images/shield_up.png")
Global wideshot_resource_image = LoadImage("images/wideshot_up.png")
Global inverter_resource_image = LoadImage("images/inverter_up.png")
Global protection_resource_image = LoadImage("images/protection_up.png")
Global megashot_resource_image = LoadImage("images/megashot_up.png")

		
		
;save directory
Global save_directory$ = "save"
Global load_file$ = "save/save1.dat"
 


;*************************************************
;                GLOBAL IMAGES
;Global mode = 1
;*************************************************
;                    FONTS
Global font1 = LoadFont("Arial",45,True,False,True)
Global font2 = LoadFont("Arial",20,False,False,False)
Global font3 = LoadFont("Arial",15,False,False,False)
Global lose_font = LoadFont("impact",120,True,False,False)

For n=1 To 40
	create_space_dust()
Next 


;*************************************************
;                GAME LOOP BEGINS
While quit = False 
Cls
	

	;*************************************************
	;             MODE 1 (MAIN SCREEN)
	If mode = 1
		;check_cheats()
		; main title stuff
		color1 = color1 + (9*inverse1)
		color2 = color2 + (7*inverse2)
		color3 = color3 + (5*inverse3)
		If Color1 >= 245
			inverse1 = -1
		EndIf 
		If Color2 >= 245 
			inverse2 = -1
		EndIf 
		If Color3 >= 245 
			inverse3 = -1
		EndIf 
		If Color1 <= 7
			inverse1 = 1
		EndIf 
		If Color2 <= 7 
			inverse2 = 1
		EndIf 
		If Color3 <= 7
			inverse3 = 1
		EndIf  
		
		Color color1,color2,color3		
		SetFont font1
		Text 512,50,"SHOOT STUFF",True,True 
		Color 255,255,255
		;end main title stuff
		
		;display options to choose from
		SetFont font2
		main_screen_mouse_over()
		If FileType(save_directory$) = 0
			CreateDir save_directory$
		EndIf
		fade_out_music()
		;Text 512,300,paused,True,True 


	EndIf 
	;*************************************************
	;           END MODE 1 (MAIN SCREEN)
	
	
	;*************************************************
	;        MODE 2 (ABILITIES AND TALENTS SCREEN)
	If mode = 2
		mouse_over = False 
		SetFont font1
		Text 512,50,"Talents and Abilities",True,True
		Color 255,255,255
		SetFont font3
		;display_talent_gui(); Displays the gui for the talent screen (without this it's a blank screen)
		; if you remove this you will STILL BE ABLE TO CLICK TALENTS AND ALLOCATE TALENT POINTS
				
		;talent_mouse_over() ; CHECKS TO SEE WHAT YOUR MOUSE IS HOVERING OVER (VERY IMPORTANT)
		display_talents()
	EndIf 
	;*************************************************
	;     END MODE 2 (ABILITIES AND TALENTS SCREEN)
	
	
	
	;*************************************************
	;           MODE 3 (LEVEL SELECT)
	If mode = 3		
		DrawImage nebula_image,512,300
		SetFont font1
		Text 512,50,"Level Select",True,True
		Color 255,255,255
		SetFont font3
		level_select_gui()
		If pop_up = False Then level_mouse_over();disable the other level select keys if a pop up is on
				
	EndIf 
	;*************************************************
	;        END MODE 3 (LEVEL SELECT)
	
	
	
	
	;*************************************************
	;           MODE 94 (SHIP CONFIGURATION)
	If mode = 94	
		;DrawImage nebula_image,512,300
		SetFont font1
		Text 512,25,"Ship Configuration",True,True
		Color 255,255,255
		Text 175,75,"Statistics",True,True
		Text 865,75,"Accessories",True,True
		;Text 687,350,"Loadout",True,True
		;Text 434,575,"Spacebar",True,True
		Text 420,575,"A",True,True
		Text 520,575,"S",True,True
		Text 620,575,"D",True,True 
		SetFont font3
		ship_configuration()
		;If pop_up = False Then level_mouse_over();disable the other level select keys if a pop up is on
				
	EndIf 
	;*************************************************
	;        END MODE 94 (SHIP CONFIGURATION)
	
	
	
	;*************************************************
	;           MODE 100 (STATUS, level complete)
	If mode = 100	
		SetFont font3
		draw_achievement()
		update_all()
		draw_player()
		get_keys()
		draw_hud()
		show_stats()

		times_hit_by_enemies = win_hit_e
		times_hit_by_asteroid = win_hit_a
		
		change_volume_count = change_volume_count + 1
		Color 255,255,255
		done_hover_stats = False 
		If MouseX() > 20 And MouseX() < 95 And MouseY() > 560 And MouseY() < 580
			done_hover_stats = True 
			If MouseHit(1) = True
				mode = 1
				clear_levels()
				If sounds = True 
					PlaySound button_click
				EndIf
				free_music() 
			EndIf 
		EndIf 
		;done button
		If done_hover_stats = True Then Color 0,255,0
		If done_hover_stats = False 
			Color 255,255,255 
			FlushMouse
			FlushKeys
		EndIf 
		Rect 20,560,75,20,False
		Color 0,0,0
		Rect 21,561,73,18,True 
		
		Color 255,255,255
		Text 57,562,"Done",True
		;fade out the music
		fade_out_music()
		;resume_current_music()
	EndIf 
	;*************************************************
	;        END MODE 100 (STATUS, level complete)
	
	;*************************************************
	;           MODE 99 (YOU FAIL)
	If mode = 99	
		SetFont font3
		update_all()
		draw_player()
		get_keys()
		draw_hud()
		;show_stats()
		change_volume_count = change_volume_count + 1
		Color 0,0,0
		Rect 20,560,75,20,True
		Color 255,255,255
		
		SetFont lose_font 
		Color 255,0,0
			Text 512,300,"YOU LOSE",True,True 
		SetFont font3
		Color 255,255,255
		done_hover_lose = False 
		If MouseX() > 20 And MouseX() < 95 And MouseY() > 560 And MouseY() < 580
			done_hover_lose = True 
			If MouseHit(1) = True
				mode = 1
				clear_levels()
				If sounds = True 
					PlaySound button_click
				EndIf 
				free_music()
			EndIf 
		EndIf 
		;done button
		If done_hover_lose = True Then Color 0,255,0
		If done_hover_lose = False 
			Color 255,255,255 
			FlushMouse
			FlushKeys
		EndIf 
		
		Rect 20,560,75,20,False
		
		Color 255,255,255
		Text 57,562,"Menu",True
		;fade out the music
		fade_out_music()
		;resume_current_music()
	EndIf 
	;*************************************************
	;        END MODE 99 (YOU FAIL)
	
	
	;*************************************************
	;           MODE 98 (REFUELING STATION)
	If mode = 98	
		SetFont font3
		draw_hud()
		draw_market()
		Color 255,255,255
		done_hover_station = False 
		If MouseX() > 20 And MouseX() < 95 And MouseY() > 560 And MouseY() < 580
			done_hover_station = True 
			If MouseHit(1) = True
				If sounds = True 
					PlaySound button_click
				EndIf 
				mode = 1
				;clear_levels()
			EndIf 
		EndIf 
		;done button
		If done_hover_station = True Then Color 0,255,0
		If done_hover_station = False 
			Color 255,255,255 
			FlushMouse
			FlushKeys
		EndIf 
		Rect 20,560,75,20,False
		
		Color 255,255,255
		Text 57,562,"Menu",True

					
	EndIf 
	;*************************************************
	;        END MODE 98 (REFUELING STATION)
	
	
	;*************************************************
	;           MODE 97 (TUTORIAL)
	If mode = 97	
		SetFont font3
		update_all()
		get_keys()
		draw_hud()
		draw_player()
		check_music()
		
		Text 100,30,"Step: "+(tutorial_mode - 2)+" / 20",True,True 
		
		If tutorial_mode = 1 ;store variables that we will change so we can reset them back to normal
			laser_spent_before = laser_spent
			shield_spent_before = shield_spent
			protection_spent_before = protection_spent
			nuke_spent_before = nuke_spent
			wideshot_time_before# = wideshot_time#
			protection_time_before# = protection_time#
			health_before = health
			armor_before = armor
			laser_before = laser#
			shield_before# = shield#
			nuke_before = nuke
			tokens_before = tokens
			level_before = level
			experience_before = experience
			talents_available_before = talents_available
			tutorial_mode = 2
			tutorial_status = True 
		EndIf 
		
		; set all variables up so we can use them
		If tutorial_mode = 2
			laser_spent = 1
			shield_spent = 1
			protection_spent = 1
			nuke_spent = 1
			tokens = 0
			health = 1000
			armor = 1000
			laser = 1000
			shield = 1000
			nuke = 1
			wideshot_time = 1200
			protection_time = 1200
			experience = 0
			level = 1
			talents_available = 1
			tutorial_mode = 3
		EndIf 
		
		If tutorial_mode = 3
			Text 512,540,"First we will get a feel for how the ship handles.",True,True
			Text 512,560,"Move down (down arrow key) to move on to the next step.",True,True 
			If KeyHit(208)
				tutorial_mode = 4
				FlushKeys
				FlushMouse
			EndIf
		EndIf 
		If tutorial_mode = 4
			Text 512,560,"Move up (up arrow key) to move on to the next step.",True,True 
			If KeyHit(200)
				tutorial_mode = 5
				FlushKeys
				FlushMouse
			EndIf 
		EndIf 
		If tutorial_mode = 5
			Text 512,560,"Move left (left arrow key) to move on to the next step.",True,True 
			If KeyHit(203)
				tutorial_mode = 6
				FlushKeys
				FlushMouse
			EndIf 
		EndIf 
		If tutorial_mode = 6
			Text 512,560,"Move right (right arrow key) to move on to the next step.",True,True 
			If KeyHit(205)
				tutorial_mode = 7
				FlushKeys
				FlushMouse
			EndIf 
		EndIf
		If tutorial_mode = 7
			Text 512,520,"Congratulations! You have finished the movement tutorial!",True,True 	
			Text 512,540,"Now let's get a feel for some combat functions.",True,True 
			Text 512,560,"Fire your standard laser shot (spacebar) to move on to the next step.",True,True 
			If KeyHit(57)
				tutorial_mode = 8
				FlushKeys
				FlushMouse
			EndIf 
		EndIf
		If tutorial_mode = 8
			Text 512,500,"What you have just fired is your standard laser, this will always be with you, it is",True,True 	
			Text 512,520,"not possible to run out of power for firing your standard laser, you can shoot it infinite times.",True,True 
			Text 512,540,"Let's move on to some more advanced combat functions.",True,True 
			Text 512,560,"Fire your powerful laser (a key) to move on.",True,True 
			If KeyHit(30)
				tutorial_mode = 9
				FlushKeys
				FlushMouse
			EndIf 
		EndIf
		If tutorial_mode = 9
			Text 512,500,"Good! What you should know about this is that you do have a limited amount of this.",True,True 	
			Text 512,520,"You will eventually run out of power, look up on the HUD, notice that your laser",True,True 
			Text 512,540,"percentage has gone down, when this reaches 0% you will no longer be able to fire this.",True,True 
			Text 512,560,"Empty your powerful laser battery to 0% to move on",True,True 
			If laser = 0
				tutorial_mode = 10
				FlushKeys
				FlushMouse
			EndIf 
		EndIf
		If tutorial_mode = 10
			Text 512,500,"Ok! Now lets move on to your shield function, this can be a life saver, when you use",True,True 	
			Text 512,520,"this you will be surrounded by a shield, any enemy, asteroid, or enemy bullet will be",True,True 
			Text 512,540,"absorbed, however this is not effective on certain boss attacks.",True,True 
			Text 512,560,"Use your shield (s key) to move on.",True,True 
			If KeyHit(31)
				tutorial_mode = 11
				FlushKeys
				FlushMouse
			EndIf 
		EndIf
		If tutorial_mode = 11
			Text 512,520,"Just like your laser; there's a limited amount of shield battery.",True,True 	 
			Text 512,540,"When you see your shield bar reach 0% you will no longer be able to use it.",True,True 
			Text 512,560,"Empty your shield energy to move on.",True,True 
			If shield = 0
				tutorial_mode = 12
				
				nuke = 1
				nuke_over = False 
				laser_over = False
				protection_over = False
				wideshot_over = False 
				shield_over = False
				FlushKeys
				FlushMouse
			EndIf 
		EndIf
		If tutorial_mode = 12
			Text 512,500,"Moving on to one of your more powerful abilities; the Nuclear Bomb.",True,True 	 
			Text 512,520,"When used it will destroy everything on screen (Not effective against many bosses)",True,True 
			Text 512,540,"You have a limited amount of these, if you reach 0 nukes left you cannot use it anymore.",True,True 
			Text 512,560,"Detonate a nuclear bomb (d key) to move on.",True,True 
			If KeyHit(32) Or nuke = 0
				nuke_radius = nuke_radius + 10
				tutorial_mode = 13
				FlushKeys
				FlushMouse
			EndIf 
		EndIf
		If tutorial_mode = 13
			Text 512,500,"You now see that there's 2 flying ships shooting, this is your protection ability kicking in.",True,True 	 
			Text 512,520,"When your laser and shield are less than 21%, and nuclear bombs are depleted, these will appear and help you ",True,True 
			Text 512,540,"for 20 seconds. Look at your HUD and you will see that the protection bar is slowly depleting.",True,True 
			Text 512,560,"Press the next button to move on to the next step.",True,True 
			Color 255,255,255
			If MouseX() > 929 And MouseX() < 1004 And MouseY() > 560 And MouseY() < 580
				Color 0,255,0
				done_hover_tutorial = True 
				If MouseHit(1) = True
					tutorial_mode = 14
					protection_time# = 0
					wideshot_time# = 1200
					FlushMouse 
				EndIf 
			EndIf 
			Rect 929,560,75,20,False
			Color 255,255,255
			Text 966,569,"Next",True,True

		EndIf
		If tutorial_mode = 14
			Text 512,500,"Now, fire your standard laser via spacebar, you will see that you are firing 3 shots at once.",True,True 	 
			Text 512,520,"This is your wideshot. You have 20 seconds of this after every other ability has been depleted.",True,True 
			Text 512,540,"It's one of your 'last resort' abilities, once this runs out, you only have your standard laser.",True,True 
			Text 512,560,"Press the next button to move on to the next step.",True,True 
			Color 255,255,255
			If MouseX() > 929 And MouseX() < 1004 And MouseY() > 560 And MouseY() < 580
				Color 0,255,0
				done_hover_tutorial = True 
				If MouseHit(1) = True
					tutorial_mode = 15
					FlushMouse
					If fix = True Then tutorial_mode = 17 tokens = 30
				EndIf 
			EndIf 
			Rect 929,560,75,20,False
			Color 255,255,255
			Text 966,569,"Next",True,True

		EndIf
		If tutorial_mode = 15 
			tutorial_counter = tutorial_counter + 1
			Text 512,500,"To your left you will see rotating coins, these are tokens you can collect to buy things in game.",True,True 	 
			Text 512,520,"To your right you will see asteroids spawning in a line. These can be destroyed and if you get hit",True,True 
			Text 512,540,"by one then you will take damage.",True,True 
			Text 512,560,"Collect 10 tokens and destroy 10 asteroids to move on.",True,True 
			Text 200,540,"Tokens: "+tokens,True,True
			Text 824,540,"Asteroids: "+asteroids_destroyed,True,True
			If tutorial_counter >= 20
				create_coin(40,700,4)
				create_asteroid(984,700,4,100,0,10,2)
				tutorial_counter = 0
			EndIf 
			If tokens >= 10 And asteroids_destroyed >= 10 Then tutorial_mode = 16
		EndIf 
		
		If tutorial_mode = 16
			armor = 0
			If health >= 11
				health = health - 1
			EndIf 
			Text 512,520,"As you lose more and more health, your speed gets reduced more and more. This is why it's",True,True 	 
			Text 512,540,"important to have armor on as long as possible, the more health you lose the harder it gets.",True,True 
			Text 512,560,"Press the next button to move on.",True,True 
			Color 255,255,255
			If MouseX() > 929 And MouseX() < 1004 And MouseY() > 560 And MouseY() < 580
				Color 0,255,0
				done_hover_tutorial = True 
				If MouseHit(1) = True
					tutorial_mode = 17
					FlushMouse 
				EndIf 
			EndIf 
			Rect 929,560,75,20,False
			Color 255,255,255
			Text 966,569,"Next",True,True
		EndIf 
		If tutorial_mode = 17
			Text 512,520,"When you completely finish a level, you will get some talent points, you can spend these in the talent",True,True 	 
			Text 512,540,"screen to upgrade specific parts of your ship, you can also reset your talents if you want, free of charge at the market",True,True 
			Text 512,560,"Press the next button to move on.",True,True 
			Color 255,255,255
			experience = experience + 1
			If MouseX() > 929 And MouseX() < 1004 And MouseY() > 560 And MouseY() < 580
				Color 0,255,0
				done_hover_tutorial = True 
				If MouseHit(1) = True
					tutorial_mode = 18
					laser# = 1000
					protection_time# = 1200
					FlushMouse 
				EndIf 
			EndIf 
			Rect 929,560,75,20,False
			Color 255,255,255
			Text 966,569,"Next",True,True
		EndIf 
		If tutorial_mode = 18
			Text 512,500,"On certain levels, there may be an 'imaginary' line that dictates whether you rotate or not, in here, we'll draw the line",True,True 	 
			Text 512,520,"and as you cross it you can see that your ship rotates, this will also change the direction that you shoot.",True,True 
			Text 512,540,"This allows you to get 'behind' certain bosses. and still attack while avoiding damage some of the time.",True,True 
			Text 512,560,"Press the next button to continue.",True,True 
			Color 255,255,255
			Line 0,behind_line_y,1024,behind_line_y
			If behind_line_y <= 500 And switch_dir = False 
				behind_line_y = behind_line_y + 1
			EndIf 
			If behind_line_y > 500
				switch_dir = True 
			EndIf 
			If switch_dir = True Then behind_line_y = behind_line_y - 1
			If behind_line_y <= 70 Then switch_dir = False 
			
			If p_y > behind_line_y
				player_rotated = True
			EndIf 
			If p_y <= behind_line_y
				player_rotated = False
			EndIf 
			If MouseX() > 929 And MouseX() < 1004 And MouseY() > 560 And MouseY() < 580
				Color 0,255,0
				done_hover_tutorial = True 
				If MouseHit(1) = True
					tutorial_mode = 19
					player_rotated = False 
					FlushMouse 
				EndIf 
			EndIf 
			Rect 929,560,75,20,False
			Color 255,255,255
			Text 966,569,"Next",True,True
		EndIf 
		If tutorial_mode = 19
			Text 512,500,"During game at any time you can press backspace or escape to pause the game, this will take you back to the main menu.",True,True 	 
			Text 512,520,"While paused you can add more talents, or quit / resume the mission, however you cannot click on level select.",True,True 
			Text 512,540,"You must first quit the mission to use those.",True,True 
			Text 512,560,"Press the next button to continue.",True,True 
			If MouseX() > 929 And MouseX() < 1004 And MouseY() > 560 And MouseY() < 580
				Color 0,255,0
				done_hover_tutorial = True 
				If MouseHit(1) = True
					tutorial_mode = 20
					FlushMouse 
				EndIf 
			EndIf 
			Rect 929,560,75,20,False
			Color 255,255,255
			Text 966,569,"Next",True,True
		EndIf 
		If tutorial_mode = 20
			Text 512,480,"In the level select screen you can visit a level called the market. In here you can buy anything you need to refill",True,True 	 
			Text 512,500,"such as laser battery, shield battery, nukes, protection, wide shot, armor, or health using tokens you collect throughout ",True,True 
			Text 512,520,"a level. This is accessed via the green square in the level select screen.",True,True 
			Text 512,540,"You can also reset your talents here completely free of charge if you wish to do so.",True,True
			Text 512,560,"Press the next button to continue.",True,True
			done_hover_station = False 
			If MouseX() > 929 And MouseX() < 1004 And MouseY() > 560 And MouseY() < 580 ; tutorial stuff
				If MouseHit(1) = True
					tutorial_mode = 21
				EndIf 
				done_hover_station = True 
			EndIf 
			draw_market()
			Color 0,0,0
			Rect 929,560,75,20,True
			Color 255,255,255
			If MouseX() > 929 And MouseX() < 1004 And MouseY() > 560 And MouseY() < 580 Then Color 0,255,0
			Rect 929,560,75,20,False
			Color 255,255,255
			Text 966,569,"Next",True,True 
			
		EndIf 
		If tutorial_mode = 21
			Text 512,500,"If you die during a level, you will respawn back at the main menu with full health but no armor. You also lose 5",True,True 	 
			Text 512,520,"tokens when you die (15 in hardcore mode), however if you have less tokens than you have levels, you will not lose ",True,True 
			Text 512,540,"a token if you die (This does not apply to hardcore mode)",True,True
			Text 512,560,"Press the next button to continue.",True,True
			If MouseX() > 929 And MouseX() < 1004 And MouseY() > 560 And MouseY() < 580
				Color 0,255,0
				done_hover_tutorial = True 
				If MouseHit(1) = True
					tutorial_mode = 22
					FlushMouse 
				EndIf 
			EndIf 
			Rect 929,560,75,20,False
			Color 255,255,255
			Text 966,569,"Next",True,True 
		EndIf 
		If tutorial_mode = 22
			Text 512,500,"Hardcore mode can be activated from the main menu if you have beaten the game in normal mode, what this does is makes ",True,True 	 
			Text 512,520,"the levels exceptionally harder. Achievements can be seen from the main menu by clicking the achievements button, these are",True,True 
			Text 512,540,"tasks that are particularly hard to complete, but may provide a reward.",True,True
			Text 512,560,"This concludes the tutorial, you may now press the quit button to go back to the main menu.",True,True
			;fade_out_music()
		EndIf 
		
		
		
		
		;done so we can reset all variables we changed back
		Color 0,0,0
		Rect 20,560,75,20,True
		Color 255,255,255
		done_hover_tutorial = False 
		If MouseX() > 20 And MouseX() < 95 And MouseY() > 560 And MouseY() < 580
			done_hover_tutorial = True 
			If MouseHit(1) = True
				mode = 1
				tutorial_status = False
				tutorial_mode = 1
				clear_levels()
				clear_tutorial(); this will reset all variables back to what they were before they clicked play tutorial
			EndIf 
		EndIf 
		;done button
		If done_hover_tutorial = True Then Color 0,255,0
		If done_hover_tutorial = False 
			Color 255,255,255 
			FlushMouse
			FlushKeys
		EndIf 
		Rect 20,560,75,20,False
		
		Color 255,255,255
		Text 57,562,"Quit",True
		
		If health < 10 Then health = 10
					
	EndIf 
	;*************************************************
	;        END MODE 97 (TUTORIAL)

	
	
	;*************************************************
	;           MODE 95 (ACHIEVEMENTS)
	
	If mode = 95
		;SetFont font3
		draw_achievements()
		Color 255,255,255
		done_hover_achievement = False 
		If MouseX() > 20 And MouseX() < 95 And MouseY() > 560 And MouseY() < 580
			done_hover_achievement = True 
			If MouseHit(1) = True
				mode = 1
				If sounds = True 
					PlaySound button_click
				EndIf 
			EndIf 
		EndIf 
		;done button
		If done_hover_achievement = True Then Color 0,255,0
		If done_hover_achievement = False 
			Color 255,255,255 
			
		EndIf 
		Rect 20,560,75,20,False
		Color 0,0,0
		Rect 21,561,73,18,True 
		
		Color 255,255,255
		Text 57,562,"Menu",True

		
	
	EndIf 
	;*************************************************
	;        END MODE 95 (ACHIEVEMENTS)
	
	
	
	
	
	
	
	
	;*************************************************
	;           MODE 4 (LEVEL 1)
	If mode = 4	
		SetFont font3
		count_up = count_up + 1
		coin_counter = coin_counter + 1
		If asteroid_counter < 0 Then asteroid_counter = 0
		update_all()
		get_keys()
		draw_hud()
		draw_player()
		check_music()
		;create_particle(p_x,p_y)
		If hardcore = False
			If coin_counter = 800
				create_coin(0,0,4)
				coin_counter = 0
				token_counter_1 = token_counter_1 + 1
			EndIf
			amount_of_asteroid_to_win = 750
		EndIf  
		If hardcore = True 
			If coin_counter = 550
				create_coin(0,0,4)
				coin_counter = 0
				token_counter_1 = token_counter_1 + 1
			EndIf
			amount_of_asteroid_to_win = 1300
		EndIf
		
		Color 255,255,255
		Text 100,10,"Level Progress:",True,True 
		
		Color 255,0,0
		If hardcore = False 
			Rect 7,35,(750-(amount_of_asteroid_to_win-asteroid_total))/4.054,20,True
			Color 255,255,255
			Text 100,45,Floor(((750-(amount_of_asteroid_to_win-asteroid_total))/4.054)/1.85)+"%",True,True 
		EndIf 
		If hardcore = True 
			Rect 7,35,(1300-(amount_of_asteroid_to_win-asteroid_total))/7.027,20,True
			Color 255,255,255
			Text 100,45,Floor(((1300-(amount_of_asteroid_to_win-asteroid_total))/7.027)/1.85)+"%",True,True 
		EndIf 
		
		
		Rect 7,35,185,20,False
		
		;Text 200,100,asteroid_total,True,True
		;Text 200,120,amount_of_asteroid_to_win,True,True 
		If count_up >= asteroid_counter 
				
			If asteroid_total <= 300
				create_asteroid(0,0,5,100,0,46,2)
				count_up = 0
				If hardcore = True Then asteroid_counter = 7
				If hardcore = False Then asteroid_counter = 10
			EndIf 
			If asteroid_total > 300
				If hardcore = True Then create_asteroid(0,0,9,0,0,30,2)
				If hardcore = False Then create_asteroid(0,0,6,0,0,46,2)
				If hardcore = True And ships_on_screen_1 < 15
					create_enemy_ship(0,0,2,15)
					ships_on_screen_1 = ships_on_screen_1 + 1
				EndIf 
				If hardcore = True Then asteroid_counter = 2
				If hardcore = False Then asteroid_counter = 5
				count_up = 0
			EndIf 
			If asteroid_total >= amount_of_asteroid_to_win
				mode = 100
				;create_achievement(0,0,"Nathaz sucks","He really does","beat this fuvkcer")
				If level_completed < 1
					grant_talents(6) ;gets the player 6 talents automatically if they kill the boss
					level_completed = 1 
				EndIf 

				win_hit_e = times_hit_by_enemies
				win_hit_a = times_hit_by_asteroid
				If coin_addition = token_counter_1
					achievement_9_unlocked = True 
					create_achievement(0,0,"Must collect more tokens!","","")	
				EndIf 
				
				If total_talents_spent < 1
					If hardcore = True
						If achievement_1_unlocked = False 
							create_achievement(0,0,"Hardcore: The Asteroid Belt","","")
						EndIf 
						achievement_1_unlocked = True 
					EndIf 
					If times_hit_by_asteroid = 0 And asteroids_destroyed > 140
						If total_talents_spent < 1
							achievement_10_unlocked = True
							create_achievement(0,0,"Can't touch this!","","")
						EndIf 
					EndIf 
				EndIf 
			EndIf 
			;asteroid_counter = asteroid_counter - 1
		EndIf 
		
		
		
		;Text 512,300,wideshot_time,True,True 
		;Text 900,550,asteroid_total,True,True 
		
	EndIf 
	;*************************************************    
	;        END MODE 4 (LEVEL 1)
	
	
	
	
	
	;*************************************************
	;           MODE 5 (LEVEL 2 (BOSS))
	If mode = 5	
		SetFont font3
		count_up = count_up + 1
		level_2_boss_frame = level_2_boss_frame + 1
		boss_1_bullet_counter = boss_1_bullet_counter + 1
		;coin_counter = coin_counter + 1
	;	asteroid_x_speed_count = asteroid_x_speed_count + 1 
		update_all()
		get_keys()
		draw_hud()
		draw_player()
		check_music()
			
		;If coin_counter = 60
		;	create_coin(10,700,5)
		;	create_coin(1014,700,5)
		;	coin_counter = 0
		;EndIf 
		;code for moving the boss up and down
		If change_boss_1_direction = False 
			boss_1_y = boss_1_y - 1
			If boss_1_y <= 150 Then change_boss_1_direction = True
		EndIf 
		If change_boss_1_direction = True 
			boss_1_y = boss_1_y + 1
			If boss_1_y >= 550 Then change_boss_1_direction = False
		EndIf 
		DrawImage first_boss_image,boss_1_x,boss_1_y
		DrawImage front_shield_image,boss_1_x-4,boss_1_y-75
		; if you are below the boss then rotate the image so you can shoot him from behind
		If p_y > boss_1_y Then player_rotated = True
		If p_y <= boss_1_y Then player_rotated = False
		
		For b.bullet_shot = Each bullet_shot	; CHECK FOR BULLETS HIT
				;if it hits the boss and not the shield
			If hardcore = False 
				If ImagesCollide(b\image,b\x,b\y,0,First_boss_image,boss_1_x,boss_1_y,0) Then 
					boss_1_health# = boss_1_health# - (b\damage)
					b\dead = True
				EndIf 
				;if it hits the shield in front of the boss
				If ImagesCollide(b\image,b\x,b\y,0,front_shield_image,boss_1_x-4,boss_1_y-75,0) Then 
					boss_1_health# = boss_1_health# - (b\damage/2)
					b\dead = True
				EndIf 
			EndIf 
			If hardcore = True 
				If ImagesCollide(b\image,b\x,b\y,0,First_boss_image,boss_1_x,boss_1_y,0) Then 
					boss_1_health# = boss_1_health# - (b\damage)
					b\dead = True
				EndIf 
				;if it hits the shield in front of the boss
				If ImagesCollide(b\image,b\x,b\y,0,front_shield_image,boss_1_x-4,boss_1_y-75,0) Then 
					boss_1_health# = boss_1_health# - (b\damage/3)
					b\dead = True
				EndIf 
			EndIf 
		Next
		
		For ms.megashot = Each megashot	; CHECK FOR BULLETS HIT
				;if it hits the boss and not the shield
			If hardcore = False 
				If ImagesCollide(ms\image,ms\x#+ms\x_add#,ms\y#-ms\y_add#,0,First_boss_image,boss_1_x,boss_1_y,0) Then 
					boss_1_health# = boss_1_health# - (ms\damage)
					ms\dead = True
				EndIf 
				;if it hits the shield in front of the boss
				If ImagesCollide(ms\image,ms\x#+ms\x_add#,ms\y#-ms\y_add#,0,front_shield_image,boss_1_x-4,boss_1_y-75,0) Then 
					boss_1_health# = boss_1_health# - (ms\damage/3)
					ms\dead = True
				EndIf 
			EndIf 
			If hardcore = True 
				If ImagesCollide(ms\image,ms\x#+ms\x_add#,ms\y#-ms\y_add#,0,First_boss_image,boss_1_x,boss_1_y,0) Then 
					boss_1_health# = boss_1_health# - (ms\damage/2)
					ms\dead = True
				EndIf 
				;if it hits the shield in front of the boss
				If ImagesCollide(ms\image,ms\x#+ms\x_add#,ms\y#-ms\y_add#,0,front_shield_image,boss_1_x-4,boss_1_y-75,0) Then 
					boss_1_health# = boss_1_health# - (ms\damage/6)
					ms\dead = True
				EndIf 
			EndIf 
		Next
		
		For ls.littleshot = Each littleshot	; CHECK FOR LITTLE SHOTS
				;if it hits the boss and not the shield
			If hardcore = False 
				If ImagesCollide(ls\image,ls\x#+ls\x_add#,ls\y#-ls\y_add#,0,First_boss_image,boss_1_x,boss_1_y,0) Then 
					boss_1_health# = boss_1_health# - (ls\damage)
					ls\dead = True
				EndIf 
				;if it hits the shield in front of the boss
				If ImagesCollide(ls\image,ls\x#+ls\x_add#,ls\y#-ls\y_add#,0,front_shield_image,boss_1_x-4,boss_1_y-75,0) Then 
					boss_1_health# = boss_1_health# - (ls\damage/3)
					ls\dead = True
				EndIf 
			EndIf 
			If hardcore = True 
				If ImagesCollide(ls\image,ls\x#+ls\x_add#,ls\y#-ls\y_add#,0,First_boss_image,boss_1_x,boss_1_y,0) Then 
					boss_1_health# = boss_1_health# - (ls\damage/2)
					ls\dead = True
				EndIf 
				;if it hits the shield in front of the boss
				If ImagesCollide(ls\image,ls\x#+ls\x_add#,ls\y#-ls\y_add#,0,front_shield_image,boss_1_x-4,boss_1_y-75,0) Then 
					boss_1_health# = boss_1_health# - (ls\damage/6)
					ls\dead = True
				EndIf 
			EndIf 
		Next
		
		For l.laser_bullet = Each laser_bullet	; CHECK FOR LASER HIT
				If ImagesCollide(l\image,l\x,l\y,0,first_boss_image,boss_1_x,boss_1_y,0) Then 
					If l\yspeed < 0
						boss_1_health# = boss_1_health# - (l\damage)
					EndIf 
					l\dead = True
				EndIf 
		Next
		If player_rotated = False 
			If ImagesCollide(first_boss_image,boss_1_x,boss_1_y,0,player_image,p_x,p_y,0) ; lose health if you hit boss
				take_damage(10)
			EndIf 
		EndIf 
		If player_rotated = True 
			If ImagesCollide(first_boss_image,boss_1_x,boss_1_y,0,ship_rotated,p_x,p_y,0) ; lose health if you hit boss
				take_damage(10)
			EndIf 
		EndIf 

		Text 100,10,"Boss Health: "+boss_1_health,True,True 
		Rect 10,28,178,20,False
		Color 255,0,0
		Rect 11,29,boss_1_health#/39.7727,18,True 
		Color 255,255,255
		If count_up >= 4 ; create side asteroids 1 every 4 frames (one on each side)
			create_asteroid(asteroid_left_side,700,asteroid_level_2_velocity,100,0,20000,2000)
			create_asteroid(asteroid_right_side,700,asteroid_level_2_velocity,100,0,20000,2000)
			count_up = 0
		EndIf
		If level_2_boss_frame > 550
			; boss creating bullets below
			If hardcore = False 
				If boss_1_bullet_counter >= 5 ; spawn 1 boss bullet every 5 frames (one on each side)
					x_boss_rand = Rnd(50,412)
					create_enemy_bullet(x_boss_rand,650,4,15)
					x_boss_rand = Rnd(612,974)
					create_enemy_bullet(x_boss_rand,650,4,15)
					boss_1_bullet_counter = 0
				EndIf
			EndIf  
			If hardcore = True 
				If boss_1_bullet_counter >= 3 ; spawn 1 boss bullet every 3 frames (one on each side)
					x_boss_rand = Rnd(50,412)
					create_enemy_bullet(x_boss_rand,650,5,20)
					x_boss_rand = Rnd(612,974)
					create_enemy_bullet(x_boss_rand,650,5,20)
					boss_1_bullet_counter = 0
				EndIf
			EndIf  
				If level_2_boss_frame >= 1100
					level_2_boss_frame = 0 ; reset to 0 after it reaches 1200, 600 frames of bullets
					asteroid_level_2_velocity = asteroid_level_2_velocity + 3
					direction_change_count = direction_change_count + 1 
				EndIf 
			If direction_change_count = 3
				If hardcore = True
					For bullet_spawn_number = 0 To 35
						x_boss_rand = Rnd(50,412)
						create_enemy_bullet(x_boss_rand,650,5,15)
						x_boss_rand = Rnd(612,974)
						create_enemy_bullet(x_boss_rand,650,4,15)
					Next
				EndIf 
				direction_change_count = 0
			EndIf 
		EndIf 
		;If asteroid_x_speed_count >= 1
			If level_2_boss_frame < 550 ; move asteroids
				asteroid_left_side = asteroid_left_side + 1
				asteroid_right_side = asteroid_right_side + 1
			EndIf 
			If level_2_boss_frame > 550 ; move asteroids
				asteroid_left_side = asteroid_left_side - 1
				asteroid_right_side = asteroid_right_side - 1
			EndIf 
		;	asteroid_x_speed_count = 0
		;EndIf 
		;set limits on asteroids so they dont go out of the zone
		If asteroid_left_side < 15 Then asteroid_left_side = 15
		If asteroid_right_side > 1010 Then asteroid_right_side = 1010
		
		
		If boss_1_health# <= 0
			For particle_death = 0 To 140
				create_particle(boss_1_x,boss_1_y)
			Next
			If level_completed < 2
				grant_talents(6) ;gets the player 6 talents automatically if they kill the boss
				level_completed = 2
			EndIf 
			mode = 100
			
			win_hit_e = times_hit_by_enemies
			win_hit_a = times_hit_by_asteroid
			If boss_1_death_sound = 0
				If sounds = True 
					PlaySound death_sound
				EndIf 
				boss_1_death_sound = 1
			EndIf 
			
			
			If total_talents_spent < 7
				If hardcore = True
					If achievement_2_unlocked = False 
						create_achievement(0,0,"Hardcore: The Neutral Zone","","")
					EndIf 
					achievement_2_unlocked = True 
				EndIf 
				If times_hit_by_enemies = 0
					If total_talents_spent < 6
						achievement_11_unlocked = True 
						create_achievement(0,0,"Shutout!","","")
					EndIf 
				EndIf 
				If hardcore = True 
					If total_talents_spent = 0
						achievement_12_unlocked = True 
						create_achievement(0,0,"Hardcore: I can dance all day!","","")
					EndIf 
				EndIf 
			EndIf 
		EndIf

	EndIf 
	;*************************************************
	;        END MODE 5 (LEVEL 2 (BOSS))
	
	;*************************************************
	;           MODE 6 (LEVEL 3)
	If mode = 6	
		SetFont font3
		update_all()
		get_keys()
		draw_hud()
		draw_player()
		check_music()
		
		If do_once = 0 Then
			create_spin_zapper(512,330,1,20,1,3000)
			create_spin_zapper(512,330,2,20,1.4,3000)
			create_spin_zapper(512,330,3,20,1,3000)
			create_spin_zapper(512,330,4,20,1.4,3000)
			do_once = 400
		EndIf 
		
		count_up = count_up + 1
		coin_counter = coin_counter + 1
		If coin_counter >= 750
			create_coin(0,0,4)
			coin_counter = 0
		EndIf
		
		If transition < 2 Then
			Text 100,30,"Enemy Waves Remaining: "+enemy_waves_left,True,True
		EndIf 
		If transition = 2 Then
			Text 100,30,"Enemies Remaning: "+spin_zapper_on_screen,True,True
		EndIf 
		
		;check for the achievement
		If transition = 0 And enemy_waves_left > 0
			If times_hit_by_enemies < 1
				unlock_level_3_ach = True 
			EndIf 
			If times_hit_by_enemies > 0
				unlock_level_3_ach = False
			EndIf 
		EndIf 

		
		If enemy_waves_left > 0
			If enemy_on_screen < ships_at_once And total_amt_per_wave < ships_at_once
				If count_up >= 1
					create_enemy_ship(0,0,2,damage_done_by_enemy)
					enemy_on_screen = enemy_on_screen + 1
					total_amt_per_wave = total_amt_per_wave + 1
					count_up = 0
				EndIf
			EndIf 
		EndIf 
		If enemy_on_screen = 0 And enemy_waves_left > 0
			enemy_waves_left = enemy_waves_left - 1
			total_amt_per_wave = 0
			If hardcore = True 
				create_heat_seeking(512,650,150)
			EndIf 
		EndIf 
		
		If enemy_waves_left = 0 And enemy_on_screen = 0 And transition = 0
			If count_up >= 4
				create_asteroid(0,0,9,0,0,15,1)
				count_up = 0
				asteroid_until_other_wave = asteroid_until_other_wave + 1
			EndIf
			If asteroid_until_other_wave >= 250
				enemy_waves_left = 3
				transition = 1
				ships_at_once = 40
				damage_done_by_enemy = 20
			EndIf 
		EndIf 
		
		If enemy_waves_left = 0 And enemy_on_screen = 0 And transition = 1
			If count_up >= 2
				create_asteroid(0,0,9,0,0,15,1)
				count_up = 0
				asteroid_until_other_wave = asteroid_until_other_wave + 1
			EndIf
			If asteroid_until_other_wave >= 450
				enemy_waves_left = 1
				transition = 2
				ships_at_once = 100
				damage_done_by_enemy = 30
			EndIf 
		EndIf 
		
		If transition = 2 Then
		
			If spin_zapper_on_screen <= 0 Then transition = 3
			
			If spin_zapper_on_screen > 0 Then	
				If text_counter < text_on_screen_time And enemy_waves_left <= 0 And enemy_on_screen <= 0 Then
					Text 512,300,"The shields have fallen! Kill all the remaining enemies!",True,True
					text_counter = text_counter + 1
				EndIf
			EndIf 
			
		EndIf

		If enemy_waves_left <= 0 And enemy_on_screen <= 0 And spin_zapper_on_screen <= 0 And transition = 3
			If level_completed < 3
				grant_talents(6) ;gets the player 6 talents automatically if they kill the boss
				level_completed = 3
			EndIf 
			
			mode = 100
			win_hit_e = times_hit_by_enemies
			win_hit_a = times_hit_by_asteroid
			If total_talents_spent < 13
				If unlock_level_3_ach = True And total_talents_spent < 13
					achievement_13_unlocked = True 
					create_achievement(0,0,"No harm done.","","")
				EndIf 
				If hardcore = True
					If achievement_3_unlocked = False 
						create_achievement(0,0,"Hardcore: Neptunian Region","","")
					EndIf 
					achievement_3_unlocked = True 
				EndIf 
			EndIf 
		EndIf 		
				
	EndIf 
	;*************************************************    
	;        END MODE 6 (LEVEL 3)
	
	
	
	;*************************************************
	;           MODE 7 (LEVEL 4)
	If mode = 7	
		SetFont font3
		DrawImage green_shield,green_buff_x,green_buff_y
		DrawImage pink_shield,pink_buff_x,pink_buff_y
		update_all()
		get_keys()
		draw_hud()
		draw_player()
		check_music()

		;Text 512,300,green_boss_health,True,True 
		;Text 512,320,pink_boss_health,True,True 
		
		;achievement stuff 
		If KeyHit(30) And laser_spent > 0 And laser > 0
			laser_ach = False
			If hardcore = True 
				nothing_ach = False 
			EndIf 
		EndIf 
		If KeyHit(31) And shield_spent > 0 And shield > 0
			shield_ach = False
			If hardcore = True 
				nothing_ach = False 
			EndIf 
		EndIf 
		
		token_counter = token_counter + 1
		spawn_add_count = spawn_add_count + 1
		
		If hardcore = False 
			If spawn_add_count >= 360
				create_enemy_ship(0,0,2,1)
				create_enemy_ship_phaser(0,0,2,1,210)
				spawn_add_count = 0
			EndIf 
		EndIf 
		If hardcore = True 
			If spawn_add_count >= 180
				create_enemy_ship(0,0,2,1)
				create_enemy_ship_phaser(0,0,2,1,210)
				spawn_add_count = 0
			EndIf 
		EndIf 
		If token_counter >= 600
			create_coin(0,0,4)
			token_counter = 0
		EndIf 
		If ImagesCollide (green_shield,green_buff_x,green_buff_y,0,player_image,p_x,p_y,0)
			green_buff = True 
			pink_buff = False 
		EndIf 
		If ImagesCollide (pink_shield,pink_buff_x,pink_buff_y,0,player_image,p_x,p_y,0)
			green_buff = False 
			pink_buff = True
		EndIf 
		If ImagesCollide (boss_2_green,green_boss_x,green_boss_y,0,player_image,p_x,p_y,0)
			take_damage(2)
		EndIf 
		If ImagesCollide (boss_2_pink,pink_boss_x,pink_boss_y,0,player_image,p_x,p_y,0)
			take_damage(2)
		EndIf 
		
		If ImagesCollide (boss_2_pink,pink_boss_x,pink_boss_y,0,boss_2_green,green_boss_x,green_boss_y,0)
			create_green_laser(green_boss_x,green_boss_y + 60,-2)
			create_pink_laser(pink_boss_x,pink_boss_y + 60,-2)	
		EndIf 
		
		;If nuke_radius > 10 
		;	pink_boss_health# = pink_boss_health# - 50
		;	green_boss_health# = green_boss_health# - 50
		;EndIf 
		
		;pink boss health bar
		Color 0,0,0
		Rect 7,5,185,20,True
		Color 255,0,0
		Rect 7,5,(pink_boss_health#/270.27),20,True  
		Color 255,255,255
		Rect 7,5,185,20,False
		Text 100,15,"Health: "+pink_boss_health,True,True 
		
		;green boss health bar
		Color 0,0,0
		Rect 7,35,185,20,True
		Color 0,255,0
		Rect 7,35,(green_boss_health#/270.27),20,True  
		Color 255,255,255
		Rect 7,35,185,20,False 
		Text 100,45,"Health: "+green_boss_health,True,True 
		

			For b.bullet_shot = Each bullet_shot ; bullets hitting bosses changing damage based on color
				If ImagesCollide(b\image,b\x,b\y,0,boss_2_green,green_boss_x,green_boss_y,0)
					If green_buff = True 
						green_boss_health# = green_boss_health# - (b\damage/2)
					EndIf 
					If green_buff = False And pink_buff = False
						green_boss_health# = green_boss_health# - (b\damage)
					EndIf 
					If pink_buff = True
						green_boss_health# = green_boss_health# - (b\damage*1.4)
					EndIf 
					b\dead = True 
				EndIf 
				If ImagesCollide(b\image,b\x,b\y,0,boss_2_pink,pink_boss_x,pink_boss_y,0)
					If pink_buff = True 
						pink_boss_health# = pink_boss_health# - (b\damage*0.6)
					EndIf 
					If green_buff = False And pink_buff = False
						pink_boss_health# = pink_boss_health# - (b\damage)
					EndIf 
					If green_buff = True
						pink_boss_health# = pink_boss_health# - (b\damage*1.4)
					EndIf 
					b\dead = True 
				EndIf 
			Next
			
			For ms.megashot = Each megashot ; bullets hitting bosses changing damage based on color
				If ImagesCollide(ms\image,ms\x#+ms\x_add#,ms\y-ms\y_add#,0,boss_2_green,green_boss_x,green_boss_y,0)
					If green_buff = True 
						green_boss_health# = green_boss_health# - (ms\damage/2)
					EndIf 
					If green_buff = False And pink_buff = False
						green_boss_health# = green_boss_health# - (ms\damage)
					EndIf 
					If pink_buff = True
						green_boss_health# = green_boss_health# - (ms\damage*2)
					EndIf 
					ms\dead = True 
				EndIf 
				If ImagesCollide(ms\image,ms\x#+ms\x_add#,ms\y#-ms\y_add#,0,boss_2_pink,pink_boss_x,pink_boss_y,0)
					If pink_buff = True 
						pink_boss_health# = pink_boss_health# - (ms\damage/2)
					EndIf 
					If green_buff = False And pink_buff = False
						pink_boss_health# = pink_boss_health# - (ms\damage)
					EndIf 
					If green_buff = True
						pink_boss_health# = pink_boss_health# - (ms\damage*2)
					EndIf 
					ms\dead = True 
				EndIf 
			Next
			
			For ls.littleshot = Each littleshot ; bullets hitting bosses changing damage based on color
				If ImagesCollide(ls\image,ls\x#+ls\x_add#,ls\y-ls\y_add#,0,boss_2_green,green_boss_x,green_boss_y,0)
					If green_buff = True 
						green_boss_health# = green_boss_health# - (ls\damage/2)
					EndIf 
					If green_buff = False And pink_buff = False
						green_boss_health# = green_boss_health# - (ls\damage)
					EndIf 
					If pink_buff = True
						green_boss_health# = green_boss_health# - (ls\damage*2)
					EndIf 
					ls\dead = True 
				EndIf 
				If ImagesCollide(ls\image,ls\x#+ls\x_add#,ls\y#-ls\y_add#,0,boss_2_pink,pink_boss_x,pink_boss_y,0)
					If pink_buff = True 
						pink_boss_health# = pink_boss_health# - (ls\damage/2)
					EndIf 
					If green_buff = False And pink_buff = False
						pink_boss_health# = pink_boss_health# - (ls\damage)
					EndIf 
					If green_buff = True
						pink_boss_health# = pink_boss_health# - (ls\damage*2)
					EndIf 
					ls\dead = True 
				EndIf 
			Next
			
			For l.laser_bullet = Each laser_bullet ; bullets hitting bosses changing damage based on color
				If ImagesCollide(l\image,l\x,l\y,0,boss_2_green,green_boss_x,green_boss_y,0)
					If green_buff = True 
						green_boss_health# = green_boss_health# - (l\damage*0.6)
					EndIf 
					If green_buff = False And pink_buff = False
						green_boss_health# = green_boss_health# - (l\damage)
					EndIf 
					If pink_buff = True
						green_boss_health# = green_boss_health# - (l\damage*1.4)
					EndIf 
					l\dead = True 
				EndIf 
				If ImagesCollide(l\image,l\x,l\y,0,boss_2_pink,pink_boss_x,pink_boss_y,0)
					If pink_buff = True 
						pink_boss_health# = pink_boss_health# - (l\damage*0.6)
					EndIf 
					If green_buff = False And pink_buff = False
						pink_boss_health# = pink_boss_health# - (l\damage)
					EndIf 
					If green_buff = True
						pink_boss_health# = pink_boss_health# - (l\damage*1.4)
					EndIf 
					l\dead = True 
				EndIf 
			Next
			
			
			
			;if one dies then add more damage (crappy way of doing it i know but deal w/i)
			
			If hardcore = False And pink_boss_health = 0
				For b.bullet_shot = Each bullet_shot ; bullets hitting bosses changing damage based on color
					If ImagesCollide(b\image,b\x,b\y,0,boss_2_green,green_boss_x,green_boss_y,0)
						If green_buff = True 
							green_boss_health# = green_boss_health# - (b\damage*0.6)
						EndIf 
						If green_buff = False And pink_buff = False
							green_boss_health# = green_boss_health# - (b\damage)
						EndIf 
						If pink_buff = True
							green_boss_health# = green_boss_health# - (b\damage*1.4)
						EndIf 
						b\dead = True 
					EndIf  
				Next
			
				For l.laser_bullet = Each laser_bullet ; bullets hitting bosses changing damage based on color
					If ImagesCollide(l\image,l\x,l\y,0,boss_2_green,green_boss_x,green_boss_y,0)
						If green_buff = True 
							green_boss_health# = green_boss_health# - (l\damage*0.6)
						EndIf 
						If green_buff = False And pink_buff = False
							green_boss_health# = green_boss_health# - (l\damage)
						EndIf 
						If pink_buff = True
							green_boss_health# = green_boss_health# - (l\damage*1.4)
						EndIf 
						l\dead = True 
					EndIf  
				Next	
			EndIf 
			
			
			If hardcore = False And green_boss_health = 0
				For b.bullet_shot = Each bullet_shot ; bullets hitting bosses changing damage based on color
					If ImagesCollide(b\image,b\x,b\y,0,boss_2_pink,pink_boss_x,pink_boss_y,0)
						If pink_buff = True 
							pink_boss_health# = pink_boss_health# - (b\damage*0.6)
						EndIf 
						If green_buff = False And pink_buff = False
							pink_boss_health# = pink_boss_health# - (b\damage)
						EndIf 
						If green_buff = True
							pink_boss_health# = pink_boss_health# - (b\damage*1.4)
						EndIf 
						b\dead = True 
					EndIf   
				Next
			
				For l.laser_bullet = Each laser_bullet ; bullets hitting bosses changing damage based on color
					If ImagesCollide(l\image,l\x,l\y,0,boss_2_pink,pink_boss_x,pink_boss_y,0)
						If pink_buff = True 
							pink_boss_health# = pink_boss_health# - (l\damage*0.6)
						EndIf 
						If green_buff = False And pink_buff = False
							pink_boss_health# = pink_boss_health# - (l\damage)
						EndIf 
						If green_buff = True
							pink_boss_health# = pink_boss_health# - (l\damage*1.4)
						EndIf 
						l\dead = True 
					EndIf 
				Next	
			EndIf 
			
		
		
		DrawImage boss_2_green,green_boss_x,green_boss_y
		DrawImage boss_2_pink,pink_boss_x,pink_boss_y
		;Text 512,300,green_boss_x,True,True
		;Text 512,320,pink_boss_health#,True,True 
		If boss_2_phase = 1
			get_position_counter = get_position_counter + 1
			shoot_laser_counter = shoot_laser_counter + 1
			color_switch_counter = color_switch_counter + 1
			dont_switch = False 
				If color_switch_counter >= 3200; decides what boss moves next
					If green_active = True
						green_active = False
						pink_active = True
						dont_switch = True 
					EndIf 
					If pink_active = True And dont_switch = False 
						pink_active = False
						green_active = True 
					EndIf 
					total_switches = total_switches + 1
					color_switch_counter = 0
				EndIf  
			If total_switches = 2
				boss_2_phase = 2
				random_color = Rand(0,1)
			EndIf 
			
			If green_boss_health < 1 Then pink_active = True
			If pink_boss_health < 1 Then green_active = True 
			
			If pink_boss_health# < 10000 Then boss_2_phase = 2
			If green_boss_health# < 10000 Then boss_2_phase = 2
			
			If green_active = True And green_boss_health# > 0 
				If pink_active = False ;return to start position if not active
					If pink_boss_x > 74 Then pink_boss_x = pink_boss_x - 2
					If pink_boss_x < 74 Then pink_boss_x = pink_boss_x + 2
				EndIf 
				If get_position_counter >= 120;every 120 frames get player y coordinate
					current_player_position = p_y
					get_position_counter = 0
				EndIf
				If shoot_laser_counter >= 2
					create_side_green_laser(1034,current_player_position,3)
					If green_boss_x < p_x
						green_boss_x = green_boss_x + 1
					EndIf 
					If green_boss_x > p_x
						green_boss_x = green_boss_x - 1 
					EndIf 
					shoot_laser_counter = 0
				EndIf 
				
				If green_boss_x >= p_x-3 And green_boss_x <= p_x+3
					create_green_laser(green_boss_x,green_boss_y + 60,-2)
				EndIf 
			EndIf 
			If pink_active = True And pink_boss_health# > 0
				If green_active = False;return to start position if not active
					If green_boss_x > 950 Then green_boss_x = green_boss_x - 2
					If green_boss_x < 950 Then green_boss_x = green_boss_x + 2
				EndIf 
				If get_position_counter >= 120;every 120 frames get player y coordinate
					current_player_position = p_y
					get_position_counter = 0
				EndIf
				If shoot_laser_counter >= 2
					create_side_pink_laser(-10,current_player_position,-3)
					If pink_boss_x < p_x
						pink_boss_x = pink_boss_x + 1
					EndIf 
					If pink_boss_x > p_x
						pink_boss_x = pink_boss_x - 1 
					EndIf 
					shoot_laser_counter = 0
				EndIf 
				
				If pink_boss_x >= p_x-3 And pink_boss_x <= p_x+3
					create_pink_laser(pink_boss_x,pink_boss_y + 60,-2)
				EndIf 
			EndIf
		
		EndIf 
		
		If boss_2_phase = 2 ; reset positions phase
			If green_boss_x > 950 Then green_boss_x = green_boss_x - 2
			If green_boss_x < 950 Then green_boss_x = green_boss_x + 2
			If pink_boss_x > 74 Then pink_boss_x = pink_boss_x - 2
			If pink_boss_x < 74 Then pink_boss_x = pink_boss_x + 2
			If pink_boss_health# = 0 Then pink_boss_x = 76
			If green_boss_health# = 0 Then green_boss_x = 950
			
			If green_boss_x > 947 And green_boss_x < 953 And pink_boss_x > 72 And pink_boss_x < 78
				If random_color = 0
					DrawImage green_ball,944,ball_y
					ball_y = ball_y - 1
					If hardcore = True 
						ball_y = ball_y - 1
					EndIf 
				EndIf
				
				If random_color = 1
					DrawImage pink_ball,80,ball_y
					ball_y = ball_y - 1
					If hardcore = True 
						ball_y = ball_y - 1
					EndIf 
				EndIf  
				
				If ball_y = 140
					If random_color = 1
						If pink_buff = False And green_buff = False
							If armor = 0
								health = health - 400
							EndIf 
							armor = armor - 400
							
						EndIf 
						If pink_buff = True
							
						EndIf 
						If green_buff = True 
							If armor = 0
								health = health - 800
							EndIf 
							armor = armor - 800
							
						EndIf 
						Color 255,0,0
						Rect 0,61,1024,600
					EndIf 
					If random_color = 0
						If pink_buff = False And green_buff = False
							If armor = 0
								health = health - 400
							EndIf 
							armor = armor - 400
							
						EndIf 
						If pink_buff = True
							If armor = 0
								health = health - 800
							EndIf
							armor = armor - 800
							
						EndIf 
						If green_buff = True 
							 
						EndIf 
						Color 0,255,0
						Rect 0,61,1024,600
					EndIf 
					boss_2_phase = 3
					ball_y = 4000
					pink_buff = False
					green_buff = False 
				EndIf 
				
			EndIf 
			;If pink_boss_health# < 1 And green_boss_x > 947 And green_boss_x < 953
			;	pink_buff = False
			;	green_buff = False 
			;	boss_2_phase = 3
			;EndIf 
			;If green_boss_health# < 1 And pink_boss_x > 72 And pink_boss_x < 78
			;	pink_buff = False
			;	green_buff = False 
			;	boss_2_phase = 3
			;EndIf 
		EndIf 
		
		
		If boss_2_phase = 3
			If hardcore = True 
				If random_color = 0
					green_buff_x = green_buff_x - 1
				EndIf 
				If random_color = 1
					pink_buff_x = pink_buff_x + 1
				EndIf 
			EndIf 
			;Text 512,340,reset_green_pos,True,True
			;Text 512,360,reset_pink_pos,True,True
			If ImagesCollide (green_shield,green_buff_x,green_buff_y,0,player_image,p_x,p_y,0);reset positions if they touch shields
				If green_boss_health > 0
					reset_green_pos = True 
				EndIf 
			EndIf 
			If ImagesCollide (pink_shield,pink_buff_x,pink_buff_y,0,player_image,p_x,p_y,0)
				If pink_boss_health > 0
					reset_pink_pos = True 
				EndIf 
			EndIf 
			If reset_green_pos = True
				If green_boss_x > 950 Then green_boss_x = green_boss_x - 2
				If green_boss_x < 950 Then green_boss_x = green_boss_x + 2
								
				If green_boss_x > 947 And green_boss_x < 953
					reset_green_pos = False
				EndIf
				If green_boss_health# < 1 Then reset_green_pos = False 
			EndIf 
			
			If reset_pink_pos = True
				If pink_boss_x > 74 Then pink_boss_x = pink_boss_x - 2
				If pink_boss_x < 74 Then pink_boss_x = pink_boss_x + 2
			
				If pink_boss_x > 72 And pink_boss_x < 78
					reset_pink_pos = False 
				EndIf 
				If pink_boss_health# < 1 Then reset_pink_pos = False 
			EndIf 
			get_position_counter = get_position_counter + 1
			shoot_laser_counter = shoot_laser_counter + 1
			get_position_counter_b = get_position_counter_b + 1
			shoot_laser_counter_b = shoot_laser_counter_b + 1
			If hardcore = False ;hardcore = false 
					
					
				If reset_green_pos = False
					If get_position_counter >= 130;every 120 frames get player y coordinate
						current_player_position = p_y
						get_position_counter = 0
					EndIf
					If get_position_counter < 90
						If shoot_laser_counter >= 2
							create_side_green_laser(1034,current_player_position,3)
							If green_boss_x < p_x
								green_boss_x = green_boss_x + 1
							EndIf 
							If green_boss_x > p_x
								green_boss_x = green_boss_x - 1 
							EndIf 
							shoot_laser_counter = 0
						EndIf 
					EndIf 
					If green_boss_health# > 0
						If green_boss_x >= p_x-3 And green_boss_x <= p_x+3
							create_green_laser(green_boss_x,green_boss_y - 30,-2)
						EndIf 
					EndIf 
				EndIf
				If reset_pink_pos = False 
					If get_position_counter_b >= 100;every 120 frames get player y coordinate
						current_player_position_b = p_y
						get_position_counter_b = 0
					EndIf
					If get_position_counter_b < 70
						If shoot_laser_counter_b >= 2
							create_side_pink_laser(-10,current_player_position_b,-3)
							If pink_boss_x < p_x
								pink_boss_x = pink_boss_x + 1
							EndIf 
							If pink_boss_x > p_x
								pink_boss_x = pink_boss_x - 1 
							EndIf 
							shoot_laser_counter_b = 0
						EndIf 
					EndIf 
					If pink_boss_health# > 0
						If pink_boss_x >= p_x-3 And pink_boss_x <= p_x+3
							create_pink_laser(pink_boss_x,pink_boss_y - 30,-2)
						EndIf 
					EndIf 
				EndIf 
			EndIf 
			If hardcore = True ; if hardcore = true
				If reset_green_pos = False And green_boss_health# > 0
					If green_boss_x >= p_x-3 And green_boss_x <= p_x+3
						create_green_laser(green_boss_x,green_boss_y - 30,-2)
					EndIf 
				EndIf 
				
					
				
					If get_position_counter >= get_y_green;every 120 frames get player y coordinate
						current_player_position = p_y
						get_position_counter = 0
					EndIf
					If shoot_laser_counter >= 2
						create_side_green_laser(1034,current_player_position,3)
						
						shoot_laser_counter = 0
					EndIf 
					
				If green_boss_health# > 0	
						If green_boss_x < p_x
							green_boss_x = green_boss_x + 1
						EndIf 
						If green_boss_x > p_x
							green_boss_x = green_boss_x - 1 
						EndIf 
				EndIf 
				If reset_pink_pos = False And pink_boss_health# > 0
					If pink_boss_x >= p_x-3 And pink_boss_x <= p_x+3
						create_pink_laser(pink_boss_x,pink_boss_y - 30,-2)
					EndIf 
				EndIf 
				
					If get_position_counter_b >= get_y_pink;every 120 frames get player y coordinate
						current_player_position_b = p_y
						get_position_counter_b = 0
					EndIf
					If shoot_laser_counter_b >= 2
						create_side_pink_laser(-10,current_player_position_b,-3)
						shoot_laser_counter_b = 0
					EndIf
					
					
				If pink_boss_health > 0
						If pink_boss_x < p_x
							pink_boss_x = pink_boss_x + 1
						EndIf 
						If pink_boss_x > p_x
							pink_boss_x = pink_boss_x - 1 
						EndIf 
				EndIf  
				
						
			EndIf 
		EndIf 
		
		If green_boss_health# < 1 Then green_boss_health# = 0
		If green_boss_health# = 0 And green_dead_counter = 0
			For particle_death = 0 To 140
				create_particle(green_boss_x,green_boss_y)
			Next
			green_boss_x = 4000
			green_boss_y = 4000
			green_dead_counter = 20
			get_y_pink = 50
			If boss_2_death_sound = 0
				If sounds = True 
					PlaySound death_sound
				EndIf 
				boss_2_death_sound = 1
			EndIf 
		EndIf
		If pink_boss_health# < 1 Then pink_boss_health# = 0
		If pink_boss_health# = 0 And pink_dead_counter = 0
			For particle_death = 0 To 140
				create_particle(pink_boss_x,pink_boss_y)
			Next
			pink_boss_x = -4000
			pink_boss_y = 4000
			pink_dead_counter = 20
			get_y_green = 50
			If boss_3_death_sound = 0
				If sounds = True 
					PlaySound death_sound
				EndIf 
				boss_3_death_sound = 1
			EndIf 
		EndIf 
		
		If pink_boss_health# <= 0 And green_boss_health# <= 0
			If level_completed < 4
				grant_talents(6) ;gets the player 6 talents automatically if they kill the boss
				level_completed = 4
			EndIf 
			mode = 100
			win_hit_e = times_hit_by_enemies
			win_hit_a = times_hit_by_asteroid
			If total_talents_spent < 25
				If hardcore = True
					If achievement_4_unlocked = False 
						create_achievement(0,0,"Hardcore: The Supercluster","","")
					EndIf 
					achievement_4_unlocked = True 
				EndIf 
				If laser_ach = True 
					achievement_14_unlocked = True 
					create_achievement(0,0,"I have no need for lasers.","","")
				EndIf 
				If shield_ach = True 
					achievement_15_unlocked = True 
					create_achievement(0,0,"I have no need for shields.","","")
				EndIf 
				If hardcore = True 
					If nothing_ach = True 
						achievement_16_unlocked = True 
						create_achievement(0,0,"Hardcore: I got nothing!","","")
					EndIf 
				EndIf 
			EndIf 
			
		EndIf 

		
		
		;create_green_laser(350,550,22,-6)
		;create_pink_laser(674,550,22,-6)
		;create_side_green_laser(974,475,22,6)
		;create_side_pink_laser(50,400,22,-6)
		;create_coin(512,300,4)
		
	EndIf 
	;*************************************************    
	;        END MODE 7 (LEVEL 4)
	
	
	;*************************************************
	;           MODE 8 (LEVEL 5)
	If mode = 8
		SetFont font3
		update_all()
		get_keys()
		draw_hud()
		draw_player()
		check_music()

		protector_counter = protector_counter + 1
		allied_counter = allied_counter + 1
		enemy_counter = enemy_counter + 1 
		side_laser_count = side_laser_count + 1
		token_counter = token_counter + 1
		rotator_counter = rotator_counter + 1
		
		If hardcore = True 
			If armor < 200 Then armor_ach = False 
		EndIf 
		
		If token_counter >= 600
			create_coin(0,0,4)
			token_counter = 0
		EndIf 
		

		Text 100,10,"protectors Remaining: "+total_protectors+"/800",True,True
		Text 100,30,"Allied Remaining: "+total_allied+"/800",True,True
		;If hardcore = False 
			Text 100,50,"Enemies Remaining: "+total_enemies+"/2300",True,True
		;EndIf
		;If hardcore = True 
		;	Text 100,50,"Enemies Remaining: "+total_enemies+"/2800",True,True
		;EndIf 
		
		If total_protectors > 0
			If protector_on_screen < friendly_on_screen
				If protector_counter >= friendly_count_timer
					create_friendly_protector(0,0,-4,0,512)
					protector_on_screen = protector_on_screen + 1
					protector_counter = 0
				EndIf 
			EndIf 
		EndIf 
		If total_allied > 0
			If allied_on_screen < friendly_on_screen
				If allied_counter >= friendly_count_timer
					create_friendly_allied(512,0,-4,512,1024)
					allied_on_screen = allied_on_screen + 1
					allied_counter = 0
				EndIf 
			EndIf 
		EndIf 
		If total_enemies > 0
			If hardcore = False 
				If rotator_counter >= 1800
					create_enemy_ship_rotator(0,0,2,10,200)
					create_enemy_ship_phaser(0,0,2,2,200)
					create_enemy_ship_phaser(0,0,2,2,200)
					create_enemy_ship_bomb(0,0,2,20)
					create_enemy_ship_bomb(0,0,2,20)
					create_enemy_ship_bomb(0,0,2,20)
					create_enemy_ship_bomb(0,0,2,20)
					create_enemy_ship_bomb(0,0,2,20)
					create_enemy_ship_bomb(0,0,2,20)
					;enemy_on_screen = enemy_on_screen + 9
					rotator_counter = 0
				EndIf
			EndIf
			If hardcore = True 
				If rotator_counter >= 1800
					create_enemy_ship_rotator(0,0,2,20,300)
					create_enemy_ship_phaser(0,0,2,3,200)
					create_enemy_ship_phaser(0,0,2,3,200)
					create_enemy_ship_phaser(0,0,2,3,200)
					create_enemy_ship_bomb(0,0,2,20)
					create_enemy_ship_bomb(0,0,2,25)
					create_enemy_ship_bomb(0,0,2,30)
					create_enemy_ship_bomb(0,0,2,35)
					create_enemy_ship_bomb(0,0,2,40)
					create_enemy_ship_bomb(0,0,2,45)
					create_enemy_ship_bomb(0,0,2,50)
					create_enemy_ship_bomb(0,0,2,55)
					create_enemy_ship_bomb(0,0,2,60)
					create_enemy_ship_bomb(0,0,2,65)
					;enemy_on_screen = enemy_on_screen + 14
					rotator_counter = 0
				EndIf 
			EndIf 
			If enemy_on_screen < on_screen 
				If enemy_counter >= count_timer 
					create_enemy_ship(0,0,2,21);x,y (0 for random), bullet velocity, damage
					enemy_on_screen = enemy_on_screen + 1
					enemy_counter = 0
				EndIf 
			EndIf 
		EndIf
		If total_enemies < 2000
			If hardcore = True
				count_timer = 9
				on_screen = 16
			EndIf 
			how_long = 35
		EndIf 
		If total_enemies < 1500
			count_timer = 9
			on_screen = 18
			If hardcore = False 
				friendly_on_screen = 6
				friendly_count_timer = 12
			EndIf 
			how_long = 40
		EndIf
		If total_enemies < 1100
			count_timer = 7
			on_screen = 20
			If hardcore = False 
				friendly_on_screen = 7
				friendly_count_timer = 11
			EndIf 
			how_long = 60
		EndIf
		If total_enemies < 800
			count_timer = 6
			on_screen = 22
			If hardcore = False 
				friendly_on_screen = 8
				friendly_count_timer = 10
			EndIf 
			how_long = 80
		EndIf
		If total_enemies < 500
			count_timer = 5
			on_screen = 25
			If hardcore = False 
				friendly_on_screen = 9
				friendly_count_timer = 9
			EndIf 
			how_long = 100
		EndIf
		If hardcore = False 
			If total_enemies < 200 
				count_timer = 3 ; soft enrage at 200 left, save CD's for this part you get no buffs
				on_screen = 40
				how_long = 100
			EndIf 
		EndIf 
		If hardcore = True 
			If total_enemies < 400 
				count_timer = 2 ; soft enrage at 400 left, save CD's for this part you get no buffs
				on_screen = 60
				how_long = 150
			EndIf 
		EndIf 
		
		If side_laser_count >= (side_laser_often-how_long);-75 (how_long) means it will fire 75 frames early, aka 75 frames of shots
			If total_enemies < 200; spam lasers EVERYWHERE with 200 left
				random_side_laser = Rnd(75,500)
				side_laser_chooser = Rand(0,1)
			EndIf 
			If side_laser_chooser = 0
				create_side_pink_laser(-10,random_side_laser,-3)
			EndIf
			If side_laser_chooser = 1
				create_side_green_laser(1034,random_side_laser,3)
			EndIf 
			If side_laser_count >= side_laser_often
				side_laser_count = 0;reset the count
				side_laser_often = Rnd(how_long,600);randomize how often it does the laser
				random_side_laser = Rnd(200,500); for picking a new y axis number
				side_laser_chooser = Rand(0,1);choose either pink or green
			EndIf 
		EndIf 
		
		
		;Text 512,300,times_hit_by_enemies,True,True 
		If total_enemies < 1 
			If level_completed < 5
				grant_talents(6) ;gets the player 6 talents automatically if they kill the boss
				level_completed = 5
			EndIf 
			mode = 100
			
			win_hit_e = times_hit_by_enemies
			win_hit_a = times_hit_by_asteroid			
			If total_talents_spent < 25
				If hardcore = True
					If achievement_5_unlocked = False 
						create_achievement(0,0,"Hardcore: Interstellar Space","","")
					EndIf 
					achievement_5_unlocked = True 
				EndIf 
				If hardcore = True 
					If armor_ach = True 
						achievement_18_unlocked = True 
						create_achievement(0,0,"Hardcore: Don't go below 20%","","")
					EndIf 
				EndIf 
				If total_protectors Or total_allied > 0
					achievement_17_unlocked = True 
					create_achievement(0,0,"I love those guys.","","")
				EndIf 
			EndIf 
		EndIf
	EndIf 
	;*************************************************    
	;        END MODE 8 (LEVEL 5)
	
	
	
	
	
	;*************************************************
	;		START MODE 9 (LEVEL 6)
	If mode = 9
		SetFont font3
		update_all()
		get_keys()
		draw_hud()
		draw_player()
		check_music()
		
		
		
		
	EndIf 
	
	
	
	
	
	
	
	
;*************************************************
;     DEBUG LEVEL (ONLY ACTIVE WITH DEBUG ON)
		
		
	If mode = 200
		SetFont font3
		If wank = 0	
			;create_health_resource(100,100)
			;create_shield_resource(200,100)
			;create_phaser_resource(300,100)
			;create_wideshot_resource(400,100)
			;create_protection_resource(600,100)
			;create_megashot_resource(700,100)
			;create_inverter_resource(700,300)
			wank = 4242
		EndIf 
		;typical draw everything stuff at the beginning with more added to make sure the targeting stuff doesnt draw over the hud
		draw_achievement()
		update_all()
		
		If ship_disabled = False
			get_keys()
		EndIf
		If ship_disabled = True
			ship_disabled_counter = ship_disabled_counter + 1
			If ship_disabled_counter >= 600
				ship_disabled = False
				ship_disabled_counter = 0
			EndIf
		EndIf
		If boss_3_phase = 4
			If draw_targeting_reticle = True
				Color 255,0,0
				Rect void_zone_target_x - 100, void_zone_target_y - 100, 200, 200, 0
				Color 255,255,255
			EndIf
			If draw_void_zone_explosion = True
				boss_3_color_changer_counter = boss_3_color_changer_counter + 1
				If boss_3_color_changer_counter >= 5 And boss_3_color_changer = False
					boss_3_color_changer = True
					boss_3_color_changer_counter = 0
				EndIf
				If boss_3_color_changer_counter >= 5 And boss_3_color_changer = True
					boss_3_color_changer = False
					boss_3_color_changer_counter = 0
				EndIf
				If boss_3_color_changer = False
					Color 0,0,255
				EndIf
				If boss_3_color_changer = True
					Color 122,122,255
				EndIf
				Rect void_zone_target_x - 100, void_zone_target_y - 100, 200, 200
				Color 255,255,255
			EndIf
		EndIf
		draw_hud()
		draw_player()
		If draw_targeting_reticle = True
			Color 255,0,0
			Oval void_zone_target_x-10, void_zone_target_y-10, 20, 20, 1
			Color 255,255,255
		EndIf 
		check_music()  
		
		
		
		
		
		
		
		
		
		;draw hud stuff
		Text 100,10,"Boss health: "+boss_3_health,True,True
		Text 100,22,"Boss %: "+boss_3_health_percentage#,True,True
		Text 100,34,"Boss damage: "+(damage_increment_percentage#*100)+"%",True,True
		boss_3_health_percentage# = (boss_3_health# / boss_3_health_max#) * 100
		
		
		;draw reflector
		reflector_shield_toggled = False
		If reflector_shield_toggled = True 
			DrawImage reflector_shield, reflector_shield_x, reflector_shield_y
			reflector_shield_x = p_x
			reflector_shield_y = p_y+40
		EndIf 
		If reflector_shield_toggled = False
			reflector_shield_x = 3000
			reflector_shield_y = 3000
		EndIf 
		
		;all the reflector stuff needed
		For eb.enemy_bullet_shot = Each enemy_bullet_shot
			If ImagesCollide(eb\image,eb\x,eb\y,0,reflector_shield,reflector_shield_x,reflector_shield_y,0)
				create_bullet(eb\x,eb\y,eb\yspeed*3,0)
				eb\dead = True
			EndIf
		Next
					;stationary bomb interactions are done in draw_bomb
							
		For v_bombs.enemy_v_bomb = Each enemy_v_bomb
			If ImagesCollide(v_bombs\image,v_bombs\x,v_bombs\y,0,reflector_shield,reflector_shield_x,reflector_shield_y,0) And v_bombs\touched = False
				v_bombs\angle = 270 - (v_bombs\angle - 90)
				v_bombs\xperm = v_bombs\x
				v_bombs\yperm = v_bombs\y
				v_bombs\x_distance = 0
				v_bombs\y_distance = 0
				v_bombs\xy_radius# = 1
				v_bombs\touched = True
			EndIf
		Next
		For eba.enemy_ball_shot = Each enemy_ball_shot
			If ImagesCollide(eba\image,eba\x+eba\x_add,eba\y-eba\y_add,0,reflector_shield,reflector_shield_x,reflector_shield_y,0) And eba\touched = False
				eba\angle = 270 - (eba\angle - 90)
				eba\x = eba\x+eba\x_add
				eba\y = eba\y-eba\y_add
				eba\x_add = 0
				eba\y_add = 0
				eba\radius# = 0
				eba\touched = True
			EndIf
		Next
				
				;phaser dudes are done in draw_enemy_ship_phaser
		
		
		
		;draw boss and detect if player is touching
		DrawImage boss_3,boss_3_x,boss_3_y
		If ImagesCollide (boss_3,boss_3_x,boss_3_y,0,player_image,p_x,p_y,0)
			take_damage(5*damage_increment_percentage#)
		EndIf 
		
		
		
		;boss random movement stuff
		boss_random_movement_counter = boss_random_movement_counter + 1
		If boss_random_movement_counter >= boss_random_movement_interval
			If boss_3_move_left = False And boss_3_move_right = True
				boss_3_move_left = True
				boss_3_move_right = False
				boss_random_movement_counter = 0
				boss_random_movement_interval = Rnd(400,700)
			EndIf 
			If boss_3_move_left = True And boss_3_move_right = False And boss_random_movement_counter > 0
				boss_3_move_left = False
				boss_3_move_right = True
				boss_random_movement_counter = 0
				boss_random_movement_interval = Rnd(400,700)
			EndIf
		EndIf 
		If boss_3_move_left = True 
			If boss_3_x > 80
				If boss_3_movement_paused = False
					boss_3_x = boss_3_x - 1
				EndIf
			EndIf
		EndIf
		If boss_3_move_right = True 
			If boss_3_x < 944
				If boss_3_movement_paused = False
					boss_3_x = boss_3_x + 1
				EndIf
			EndIf
		EndIf 
		
		;boss detecting hits
		For b.bullet_shot = Each bullet_shot 
			If ImagesCollide(b\image,b\x,b\y,0,boss_3,boss_3_x,boss_3_y,0)
				boss_3_health# = boss_3_health# - b\damage
				b\dead = True
			EndIf
		Next
		For l.laser_bullet = Each laser_bullet
			If ImagesCollide(l\image,l\x,l\y,0,boss_3,boss_3_x,boss_3_y,0)
				boss_3_health# = boss_3_health# - l\damage
				l\dead = True
			EndIf
		Next
		For ms.megashot = Each megashot
			If ImagesCollide(ms\image,ms\x,ms\y,0,boss_3,boss_3_x,boss_3_y,0)
				boss_3_health# = boss_3_health# - ms\damage
				ms\dead = True
			EndIf
		Next
		For ls.littleshot = Each littleshot
			If ImagesCollide(ls\image,ls\x+ls\x_add#,ls\y-ls\y_add#,0,boss_3,boss_3_x,boss_3_y,0)
				boss_3_health# = boss_3_health# - ls\damage
				ls\dead = True
			EndIf
		Next
		
		
		
		;change the phase ya dingus
		boss_3_phase_counter = boss_3_phase_counter + 1
		If boss_3_phase_counter > boss_3_phase_interval And draw_targeting_reticle = False
			boss_3_phase = Rand(1,4)
			boss_3_phase_counter = 0
		EndIf 
		
		
		;boss damage incrementer
		damage_increment_counter = damage_increment_counter + 1
		If damage_increment_counter >= damage_increment_interval
			damage_increment_percentage# = damage_increment_percentage# + 0.001
			damage_increment_counter = 0
		EndIf
		
		
		
		;nicolle cameo wow whoa intense
		nicolle_fly_by_counter = nicolle_fly_by_counter + 1
		If nicolle_fly_by_counter > nicolle_fly_by_interval
			nicolle_fly_by = True
			nicolle_fly_by_counter = 0
		EndIf
		
		If nicolle_fly_by = True
			If nicolle_fly_by_counter_2 <= 0
				nicolle_x = -100
				nicolle_y = 100
				create_health = False
				create_phaser = False
				create_shield = False
				create_protection = False
				create_wideshot = False
				create_megashot = False
				kill_resources()
				nicolle_zoom_away = False
			EndIf
			nicolle_fly_by_counter_2 = nicolle_fly_by_counter_2 + 1
			nicolle_x = nicolle_x + 5
			If nicolle_zoom_away = True
				nicolle_x = nicolle_x + 4
			EndIf
			If nicolle_zoom_away = False
				If nicolle_x >= 146 And create_health = False
					create_health_resource(nicolle_x,nicolle_y)
					create_health = True 
				EndIf
				If nicolle_x >= 292  And create_phaser = False
					create_phaser_resource(nicolle_x,nicolle_y)
					create_phaser = True 
				EndIf
				If nicolle_x >= 438 And create_shield = False
					create_shield_resource(nicolle_x,nicolle_y)
					create_shield = True 
				EndIf
				If nicolle_x >= 584 And create_wideshot = False
					create_wideshot_resource(nicolle_x,nicolle_y)
					create_wideshot = True 
				EndIf
				If nicolle_x >= 730 And create_protection = False
					create_protection_resource(nicolle_x,nicolle_y)
					create_protection = True 
				EndIf
				If nicolle_x >= 876 And create_megashot = False
					create_megashot_resource(nicolle_x,nicolle_y)
					create_megashot = True 
				EndIf
			EndIf
			If nicolle_x > 1080
				nicolle_fly_by_counter_2 = 0
				nicolle_fly_by = False
			EndIf
		EndIf
				
		DrawImage nicolle, nicolle_x, nicolle_y
		Text 512,300, nicolle_fly_by_counter
		
		
		
		;boss launches bombs
		If boss_3_phase = 1
			boss_3_movement_paused = False
			draw_targeting_reticle = False
			draw_void_zone_explosion = False
			boss_3_bomb_launch_interval = 120
			boss_3_bomb_launch_counter = boss_3_bomb_launch_counter + 1
			boss_3_add_counter = boss_3_add_counter + 1
			If boss_3_bomb_launch_counter > boss_3_bomb_launch_interval
				boss_3_angle# = ATan2(p_x - boss_3_x ,p_y - boss_3_y)
				create_vector_bomb(boss_3_x,boss_3_y,50,boss_3_angle#-90,6,150)
				boss_3_bomb_launch_counter = 0
			EndIf
			If boss_3_add_counter > boss_3_add_interval
				boss_3_add_random = Rand(1,4)
				If boss_3_add_random = 1
					create_enemy_ship_phaser(Rand(40,984),660,6,10*damage_increment_percentage#,10)
					create_enemy_ship_phaser(Rand(40,984),660,6,10*damage_increment_percentage#,10)
				EndIf
				If boss_3_add_random = 2
					create_enemy_ship_bomb(Rand(40,984),660,6,50*damage_increment_percentage#)
					create_enemy_ship_bomb(Rand(40,984),660,6,50*damage_increment_percentage#)
				EndIf
				If boss_3_add_random = 3
					create_enemy_ship(Rand(40,984),660,6,20*damage_increment_percentage#)
					create_enemy_ship(Rand(40,984),660,6,20*damage_increment_percentage#)
				EndIf
				If boss_3_add_random = 4
					create_enemy_ship_rotator(Rand(40,984),660,6,5*damage_increment_percentage#,10)
					create_enemy_ship_rotator(Rand(40,984),660,6,5*damage_increment_percentage#,10)
				EndIf
				boss_3_add_counter = 0
			EndIf
			
		EndIf
		
		;boss launches lots of bombs quickly and moves to center
		If boss_3_phase = 2
			boss_3_movement_paused = True
			draw_targeting_reticle = False
			draw_void_zone_explosion = False
			boss_3_bomb_launch_interval = 4
			If boss_3_x > 512 Then boss_3_x = boss_3_x - 5
			If boss_3_x < 512 Then boss_3_x = boss_3_x + 5
			
			If boss_3_sweep_down = False Then boss_3_sweep_angle# = boss_3_sweep_angle# + 2
			If boss_3_sweep_down = True Then boss_3_sweep_angle# = boss_3_sweep_angle# - 2
			
			If boss_3_sweep_angle# > 190 Then boss_3_sweep_down = True
			If boss_3_sweep_angle# < -10 Then boss_3_sweep_down = False
			
			If boss_3_x > 505 And boss_3_x < 520
				boss_3_bomb_launch_counter = boss_3_bomb_launch_counter + 1
				If boss_3_bomb_launch_counter > boss_3_bomb_launch_interval
					create_vector_bomb(boss_3_x,boss_3_y,35*damage_increment_percentage#,boss_3_sweep_angle#,6,Rnd(40,180))
					boss_3_bomb_launch_counter = 0
				EndIf
			EndIf
		EndIf
		
		;boss carpet bombs area while shooting
		If boss_3_phase = 3
			boss_3_movement_paused = False
			draw_targeting_reticle = False
			draw_void_zone_explosion = False
			boss_3_laser_interval = 4
			boss_3_laser_counter = boss_3_laser_counter + 1
			boss_3_bomb_sweep_counter = boss_3_bomb_sweep_counter + 1
			If boss_3_laser_counter > boss_3_laser_interval
				create_enemy_bullet(boss_3_x,boss_3_y,2,100*damage_increment_percentage#)
				boss_3_laser_counter = 0
			EndIf 
			
			If boss_3_bomb_sweep_counter > boss_3_bomb_sweep_interval
				create_enemy_ship_bomb(Rand(40,984),700,9,50*damage_increment_percentage#)
				boss_3_bomb_sweep_counter = 0
			EndIf 
		EndIf 
		
		;boss does a ship disabler void zone
		If boss_3_phase = 4
			boss_3_movement_paused = False
			void_zone_target_counter = void_zone_target_counter + 1
			boss_3_add_counter = boss_3_add_counter + 1
			
			If boss_3_add_counter > boss_3_add_interval
				boss_3_add_random = Rand(1,4)
				If boss_3_add_random = 1
					create_enemy_ship_phaser(Rand(40,984),660,6,10*damage_increment_percentage#,10)
					create_enemy_ship_phaser(Rand(40,984),660,6,10*damage_increment_percentage#,10)
				EndIf
				If boss_3_add_random = 2
					create_enemy_ship_bomb(Rand(40,984),660,6,50*damage_increment_percentage#)
					create_enemy_ship_bomb(Rand(40,984),660,6,50*damage_increment_percentage#)
				EndIf
				If boss_3_add_random = 3
					create_enemy_ship(Rand(40,984),660,6,20*damage_increment_percentage#)
					create_enemy_ship(Rand(40,984),660,6,20*damage_increment_percentage#)
				EndIf
				If boss_3_add_random = 4
					create_enemy_ship_rotator(Rand(40,984),660,6,5*damage_increment_percentage#,10)
					create_enemy_ship_rotator(Rand(40,984),660,6,5*damage_increment_percentage#,10)
				EndIf
				boss_3_add_counter = 0
			EndIf

			If void_zone_target_counter > void_zone_target_interval
				If capture_player_coordinates = 0
					void_zone_target_x = p_x
					void_zone_target_y = p_y
					capture_player_coordinates = 1
				EndIf
				draw_targeting_reticle = True
				If void_zone_target_counter > void_zone_target_interval + 15
					Color 0,0,255
					Line boss_3_x-40,boss_3_y,void_zone_target_x,void_zone_target_y
					Color 255,255,255
				EndIf
				If void_zone_target_counter > void_zone_target_interval + 30
					Color 0,0,255
					Line boss_3_x-27,boss_3_y-13,void_zone_target_x,void_zone_target_y
					Color 255,255,255
				EndIf
				If void_zone_target_counter > void_zone_target_interval + 45
					Color 0,0,255
					Line boss_3_x-14,boss_3_y-27,void_zone_target_x,void_zone_target_y
					Color 255,255,255
				EndIf
				If void_zone_target_counter > void_zone_target_interval + 60
					Color 0,0,255
					Line boss_3_x,boss_3_y-40,void_zone_target_x,void_zone_target_y
					Color 255,255,255
				EndIf
				If void_zone_target_counter > void_zone_target_interval + 75
					Color 0,0,255
					Line boss_3_x+14,boss_3_y-27,void_zone_target_x,void_zone_target_y
					Color 255,255,255
				EndIf
				If void_zone_target_counter > void_zone_target_interval + 90
					Color 0,0,255
					Line boss_3_x+27,boss_3_y-13,void_zone_target_x,void_zone_target_y
					Color 255,255,255
				EndIf
				If void_zone_target_counter > void_zone_target_interval + 105
					Color 0,0,255
					Line boss_3_x+38,boss_3_y,void_zone_target_x,void_zone_target_y
					Color 255,255,255
				EndIf
				If void_zone_target_counter > void_zone_target_interval + 120
					boss_3_blow_up_void_zone = True 
				EndIf
				If void_zone_target_counter > void_zone_target_interval + 240
					void_zone_target_counter = 0
					capture_player_coordinates = 0
					draw_targeting_reticle = False
					boss_3_blow_up_void_zone = False
					draw_void_zone_explosion = False
				EndIf
				
				If boss_3_blow_up_void_zone = True
					;draw explosion is at the top before hud
					draw_void_zone_explosion = True
					
					If p_x > (void_zone_target_x - 100) And p_x < (void_zone_target_x + 100) And p_y > (void_zone_target_y - 100) And p_y < (void_zone_target_y + 100)
						ship_disabled = True
					EndIf
				EndIf
			EndIf 
		EndIf
		
		
	EndIf 
	
	
	
	
	
	
	
	
	
;*************************************************
;                 GAME LOOP ENDS
;VWait

If level_completed >= levels_available Then unlock_hardcore = True 
If tokens < 0 Then tokens = 0 ;so no matter where tokens will never be less than 0
Flip 
WaitTimer(timer)
Wend


; each gang has a special ability that will help you fight the last boss.
; unlock hardcore mode after you beat the first mode (no deaths, auto switch levels, no help from either clan on last boss)