Include "class declarations.bb"
Include "variables.bb"

SeedRnd MilliSecs()

Function clear_levels() ; if the user presses quit mission then this will occur, this resets all the level stuff, not stuff like
; talents and health and stuff like that though
	For a.asteroid = Each asteroid
		FreeImage a\image
		Delete a
	Next 
	
	For ac.asteroid_chunk = Each asteroid_chunk
		FreeImage ac\image
		Delete ac
	Next 
	
	For b.bullet_shot = Each bullet_shot
		FreeImage b\image
		Delete b
	Next
	
	For l.laser_bullet = Each laser_bullet
		FreeImage l\image
		Delete l
	Next
	
	For p.particle = Each particle 
		Delete p
	Next
	
	For hs.heat_seeking = Each heat_seeking
		FreeImage hs\image
		Delete hs
	Next 
	
	For c.coin_pickup = Each coin_pickup
		FreeImage c\image
		Delete c
	Next 
	
	
	For eb.enemy_bullet_shot = Each enemy_bullet_shot
		FreeImage eb\image
		Delete eb
	Next
	
	For eba.enemy_ball_shot = Each enemy_ball_shot
		FreeImage eba\image
		Delete eba
	Next
	
	For fa.friendly_allied = Each friendly_allied
		FreeImage fa\image
		Delete fa
	Next
	
	For fp.friendly_protector = Each friendly_protector
		FreeImage fp\image
		Delete fp
	Next	
	
	For gl.green_laser = Each green_laser
		FreeImage gl\image
		Delete gl
	Next 
	
	For pl.pink_laser = Each pink_laser
		FreeImage pl\image
		Delete pl
	Next
	
	For spl.side_pink_laser = Each side_pink_laser
		FreeImage spl\image
		Delete spl
	Next 
	
	For sgl.side_green_laser = Each side_green_laser
		FreeImage sgl\image
		Delete sgl
	Next 
	
	For es.enemy_ship = Each enemy_ship
		FreeImage es\image
		Delete es
	Next 
	
	For ms.megashot = Each megashot
		FreeImage ms\image
		Delete ms
	Next 
	
	For ls.littleshot = Each littleshot
		FreeImage ls\image
		Delete ls
	Next
	
	For esp.enemy_ship_phaser = Each enemy_ship_phaser
		FreeImage esp\image
		Delete esp
	Next 
	
	For esb.enemy_ship_bomb = Each enemy_ship_bomb
		FreeImage esb\image
		Delete esb
	Next 
	
	For bombs.enemy_bomb = Each enemy_bomb
		FreeImage bombs\image
		Delete bombs
	Next 
	
	For v_bombs.enemy_v_bomb = Each enemy_v_bomb
		FreeImage v_bombs\image
		Delete v_bombs
	Next 
	
	For esr.enemy_ship_rotator = Each enemy_ship_rotator
		FreeImage esr\image
		Delete esr
	Next 
	
	For ach.achievement = Each achievement
		Delete ach
	Next
	
	For pp.protection = Each protection
		FreeImage pp\image
		Delete pp
	Next
	
	For na.no_armor_protection = Each no_armor_protection
		FreeImage na\image
		Delete na
	Next
	
	For sz.spin_zapper = Each spin_zapper
		FreeImage sz\image
		Delete sz
	Next 

	
	
	
	
	p_x = 512
	p_y = 100
	
	war_protectors_total = 0
	destroyable_on_screen = 0
	asteroid_counter = 15
	count_up = 0
	asteroid_total = 0
	asteroids_destroyed = 0
	allied_destroyed = 0
	protectors_destroyed = 0
	times_hit_by_protector = 0
	times_hit_by_allied = 0
	times_hit_by_asteroid = 0
	total_bullets = 0
	standard_laser_hit_percentage# = 0
	enemies_killed_talent_8 = 0
	do_once_death = 0
	amount_of_asteroid_to_win = 675
	level_2_boss_frame = 0
	asteroid_left_side = 15
	asteroid_right_side = 1010
	boss_1_bullet_counter = 0
	asteroid_level_2_velocity = 10
	diretion_change_count = 0
	boss_1_x = 512
	boss_1_y = 600
	change_boss_1_direction = False
	boss_1_health# = 7000
	player_rotated = False 
	coin_counter = 0
	war_protector_total = 0
	war_allied_total = 0
	enemy_waves_left = 5
	total_amt_per_wave = 0
	asteroid_until_other_wave = 0
	ships_at_once = 30
	damage_done_by_enemy = 10
	transition = 0
	pink_buff = False
	green_buff = False 
	green_boss_x = 950
	green_boss_y = 525
	pink_boss_x = 74
	pink_boss_y = 525
	green_buff_x = 80
	green_buff_y = 140
	pink_buff_x = 944
	pink_buff_y = 140
	boss_2_phase = 1
	shoot_green_counter = 0
	shoot_pink_counter = 0
	pink_active = False
	green_active = True 
	current_player_position = 0
	get_position_counter = 0
	shoot_laser_counter = 0
	color_switch_counter = 0
	total_switches = 0
	green_side_y = 80
	pink_side_y = 590
	dont_switch = False 
	deactivate_switch = False 
	random_color = 0
	shoot_laser_counter_b = 0
	get_position_counter_b = 0
	current_player_position_b = 0
	reset_pink_pos = False
	reset_green_pos = False 
	green_boss_health = 50000
	pink_boss_health = 50000
	green_dead_counter = 0
	pink_dead_counter = 0
	ball_y = 550
	times_hit_by_enemies = 0
	coin_addition = 0
	allied_on_screen = 0
	protector_on_screen = 0
	allied_counter = 0
	protector_counter = 0
	enemy_counter = 0
	enemy_on_screen = 0
	total_allied = 800
	total_protectors = 800
	total_enemies = 2300
	;If hardcore = True Then total_enemies = 2800
	count_timer = 10
	on_screen = 15
	friendly_count_timer = 15
	friendly_on_screen = 5
	random_side_laser = Rnd(200,500)
	side_laser_count = 0
	side_laser_often = Rnd(0,600)
	side_laser_chooser = Rand(0,1)
	how_long = 30
	death_sound_count = 0
	laser_pulse_count = 0
	shield_pulse_count = 0
	boss_1_death_sound = 0
	boss_2_death_sound = 0
	boss_3_death_sound = 0
	boss_4_death_sound = 0
	boss_5_death_sound = 0
	level_3_explode_counter = 0
	out_of_game_volume# = music_vol#
	change_volume_count = 0
	token_counter_1 = 0
	unlock_level_3_ach = False 
	laser_ach = True
	shield_ach = True 
	nothing_ach = True 
	armor_ach = True  
	
	
	phase_talent = False
	phase_time_talent# = phase_time_talent_unchanged#
	
	
	;reset all images to original and re-scale depending on talent
	player_image = CopyImage(player_image_full)
	ship_rotated = CopyImage(ship_rotated_full)
	player_image_phased = CopyImage(player_image_phased_full)
	ship_rotated_phased = CopyImage(ship_rotated_phased_full)
	player_image_temp = CopyImage(player_image_temp_full)
	ship_rotated_temp = CopyImage(ship_rotated_temp_full)
	ScaleImage(player_image_temp, ship_scale#, ship_scale#)
	ScaleImage(ship_rotated_temp, ship_scale#, ship_scale#)
	ScaleImage(player_image, ship_scale#, ship_scale#)
	ScaleImage(ship_rotated, ship_scale#, ship_scale#)
	ScaleImage(player_image_phased, ship_scale#, ship_scale#)
	ScaleImage(ship_rotated_phased, ship_scale#, ship_scale#)
	
	health = 1000
	shield#=1000
	laser#=1000
	armor# = (1000 + hull_integrity_increase#)
	phase_inverter_capacity# = 1200 + phase_inverter_time_added#
	phase_inverter_trigger = False 
	wideshot_charge = 100
	protection_charge# = 20 + extra_protection_ships#
	megashot_charge = 10
	time_after_megashot# = 0
	total_protection_shield_time# = 0
	shield_addition# = 0
	do_once = 0
	spin_zapper_on_screen = 0
	text_counter = 0
	
End Function

Function reset_ship_scale()
	player_image_temp = player_image_temp_full
	ship_rotated_temp = ship_rotated_temp_full
	player_image = player_image_full
	ship_rotated = ship_rotated_full
	player_image_phased = player_image_phased_full
	ship_rotated_phased = ship_rotated_phased_full
End Function


Function clear_tutorial()
	laser_spent = laser_spent_before
	shield_spent = shield_spent_before
	protection_spent = protection_spent_before
	nuke_spent = nuke_spent_before
	wideshot_time# = wideshot_time_before#
	protection_time# = protection_time_before#
	health = health_before
	armor = armor_before
	laser = laser_before
	shield# = shield_Before#
	nuke = nuke_before
	tokens = tokens_before
	level = level_before
	experience = experience_before
	talents_available = talents_available_before
	behind_line_x = 100
	switch_dir = False 
End Function






Function show_stats()
	SetFont font1
	Text 512,100,"LEVEL COMPLETE",True,True 
	SetFont font3
	;Text 512,150, "Destroy Nathaz' butthole",True,True
	If hardcore = True Then Text 512,300,"Hardcore mode: On",True,True 
	If hardcore = False Then Text 512,300,"Hardcore mode: Off",True,True
	Text 512,320,"Asteroids Destroyed: "+asteroids_destroyed,True,True
	Text 512,340,"Times hit by Asteroids: "+times_hit_by_asteroid,True,True
	Text 512,360,"Times hit by Enemies: "+times_hit_by_enemies,True,True 
	Text 512,380,"Total Tokens Collected: "+coin_addition,True,True 
	Text 512,400,"Total Standard Laser Shots: "+total_bullets,True,True
	;Text 512,420,"Level Completed: "+level_completed,True,True 
End Function 




Function grant_talents(talent_number)
	talents_available = talents_available + talent_number
	tokens = tokens + talent_number
End Function


Function take_damage(damage#)
	If mode < 100 Or mode = 200
		If phase_inverter_trigger = False 
			If armor# < 1
				health# = health# - ((damage#*(1-(damage_reduction#+damage_reduction_armor_upgrade#+no_armor_damage_reducer#)))*2)
			EndIf
			If armor# > 0
				armor# = armor# - (damage#*(1-(damage_reduction#+damage_reduction_armor_upgrade#)))
				If armor# < 1
					health# = health# + armor#
				EndIf 
			EndIf 
		EndIf 
		
		If phase_inverter_trigger = True 
			If health# < 1000
				health# = health# + ((damage#*(1-(damage_reduction#+damage_reduction_armor_upgrade#+no_armor_damage_reducer#)))*2)
			EndIf
			If health# >= 1000
				If armor# < (1000 + hull_integrity_increase#)
					armor# = armor# + (damage#*(1-(damage_reduction#+damage_reduction_armor_upgrade#)))
				EndIf 
			EndIf 
		EndIf 
	EndIf 
End Function


Function create_particle(x,y)
	p.particle = New particle
	p\x# = x
	p\y# = y
    p\xv# = Rnd(-3.00,3.00)
	p\yv# = Rnd(-3.00,3.00)
	p\colour = Rnd(1,3)
	p\time = 0
	particle_count = particle_count + 1
End Function 


Function draw_particles()
	For p.particle = Each particle
		p\x# = p\x# + p\xv#
		p\y# = p\y# + p\yv#
		
		If p\colour = 1 Color 155,155,155
		If p\colour = 2 Color 200,150,60
		If p\colour = 3 Color 200,180,110
		
		Oval p\x#,p\y#,1,1,1
		
		p\time = p\time + 1
		
		If p\time > 100
			Delete p
			particle_count = particle_count - 1
		EndIf
		
		If particle_count < 0 Then particle_count = 0
		
		If particle_limiter = True And particle_count > 600
			Delete p
			particle_count = particle_count - 1
		EndIf
		
		
	Next
End Function



;CREATE ALLIED


Function create_asteroid_chunk(x,y)
	ac.asteroid_chunk = New asteroid_chunk
	ac\random_asteroid = Rnd(1,18)

	
		If ac\random_asteroid = 1 Then ac\image = CopyImage(asteroid_chunk_1)
		If ac\random_asteroid = 2 Then ac\image = CopyImage(asteroid_chunk_2)
		If ac\random_asteroid = 3 Then ac\image = CopyImage(asteroid_chunk_3)
		If ac\random_asteroid = 4 Then ac\image = CopyImage(asteroid_chunk_4)
		If ac\random_asteroid = 5 Then ac\image = CopyImage(asteroid_chunk_5)
		If ac\random_asteroid = 6 Then ac\image = CopyImage(asteroid_chunk_6)
		If fix = False 
			If ac\random_asteroid = 7 Then ac\image = CopyImage(asteroid_chunk_7)
			If ac\random_asteroid = 8 Then ac\image = CopyImage(asteroid_chunk_8)
			If ac\random_asteroid = 9 Then ac\image = CopyImage(asteroid_chunk_9)
		EndIf 
		If ac\random_asteroid = 10 Then ac\image = CopyImage(asteroid_chunk_10)
		If ac\random_asteroid = 11 Then ac\image = CopyImage(asteroid_chunk_11)
		If ac\random_asteroid = 12 Then ac\image = CopyImage(asteroid_chunk_12)
		If ac\random_asteroid = 13 Then ac\image = CopyImage(asteroid_chunk_13)
		If fix = False 
			If ac\random_asteroid = 14 Then ac\image = CopyImage(asteroid_chunk_14)
		EndIf 
		If ac\random_asteroid = 15 Then ac\image = CopyImage(asteroid_chunk_15)
		If fix = False
			If ac\random_asteroid = 16 Then ac\image = CopyImage(asteroid_chunk_16)
		EndIf 
		If ac\random_asteroid = 17 Then ac\image = CopyImage(asteroid_chunk_17)
		If ac\random_asteroid = 18 Then ac\image = CopyImage(asteroid_chunk_18)
		
		
	ac\x# = x
	ac\y# = y
	
	ac\xspeed# = Rnd(-3.00,3.00)
	ac\yspeed# = Rnd(-3.00,3.00)
	ac\sound = False 
	If ac\xspeed# = 0 Then ac\xspeed# = 1
	If ac\yspeed# = 0 Then ac\yspeed# = -1
	ac\dead = False
	ac\killed = False 
End Function


Function draw_asteroid_chunk()
	For ac.asteroid_chunk = Each asteroid_chunk
		ac\x# = ac\x# + ac\xspeed#
		ac\y# = ac\y# + ac\yspeed#
		
		DrawImage ac\image,ac\x,ac\y
		;Text ac\x,ac\y,ac\random_asteroid,True,True
		
				
		
		For b.bullet_shot = Each bullet_shot	; CHECK FOR BULLETS HIT	
			If ImagesCollide(b\image,b\x,b\y,0,ac\image,ac\x,ac\y,0) Then 
					ac\killed = True 
					ac\dead = True
					For particle_counter = 1 To 4
						create_particle(ac\x,ac\y)
					Next 
				b\dead = True
				ac\sound = True
			EndIf 
		Next
		
		
		
		
		For l.laser_bullet = Each laser_bullet	; CHECK FOR LASER HITS
			If ImagesCollide(l\image,l\x,l\y,0,ac\image,ac\x,ac\y,0) Then 
					ac\killed = True
					ac\dead = True
					For particle_counter = 1 To 4
						create_particle(ac\x,ac\y)
					Next	
				 
				l\dead = True
				ac\sound = True
			 EndIf
		Next
		
		If player_rotated = False
			If ImagesCollide(player_image,p_x,p_y,0,ac\image,ac\x,ac\y,0) ; CHECK TO SEE IF IT HITS THE PLAYER
				If sounds = True 
					If ac\random_asteroid >= 1 And ac\random_asteroid <= 5
						PlaySound boulder_impact_sound 
					EndIf 
					If ac\random_asteroid >= 6 And ac\random_asteroid <= 10
						PlaySound boulder_impact_sound_2
					EndIf 
					If ac\random_asteroid >= 11 And ac\random_asteroid <= 14
						PlaySound boulder_impact_sound_3
					EndIf 
					If ac\random_asteroid >= 15 And ac\random_asteroid <= 18
						PlaySound boulder_impact_sound_4
					EndIf 
				EndIf 
				times_hit_by_asteroid = times_hit_by_asteroid + 1
				ac\dead = True 
				take_damage(2)
				For particle_counter = 1 To 4
					create_particle(ac\x,ac\y)
				Next 
			EndIf
		EndIf
		
		If player_rotated = True 
			If ImagesCollide(ship_rotated,p_x,p_y,0,ac\image,ac\x,ac\y,0) ; CHECK TO SEE IF IT HITS THE PLAYER
				If sounds = True 
					If ac\random_asteroid >= 1 And ac\random_asteroid <= 5
						PlaySound boulder_impact_sound 
					EndIf 
					If ac\random_asteroid >= 6 And ac\random_asteroid <= 10
						PlaySound boulder_impact_sound_2
					EndIf 
					If ac\random_asteroid >= 11 And ac\random_asteroid <= 14
						PlaySound boulder_impact_sound_3
					EndIf 
					If ac\random_asteroid >= 15 And ac\random_asteroid <= 18
						PlaySound boulder_impact_sound_4
					EndIf 
				EndIf 
				times_hit_by_asteroid = times_hit_by_asteroid + 1
				ac\dead = True 
				take_damage(2)
				For particle_counter = 1 To 4
					create_particle(ac\x,ac\y)
				Next 
			EndIf
		EndIf 
		
		
		If ac\x > 1040 Or ac\x < -20 Then ac\dead = True
		If ac\y > 620 Or ac\y < -20 Then ac\dead = True 

		If ac\killed = True 
				For particle_counter = 1 To 4
					create_particle(ac\x,ac\y)
				Next
				ac\dead = True 
		EndIf 

		If ac\dead = True 
			If sounds = True 
				If ac\sound = True 
					If ac\random_asteroid >= 1 And ac\random_asteroid <= 5
						PlaySound boulder_impact_sound 
					EndIf 
					If ac\random_asteroid >= 6 And ac\random_asteroid <= 10
						PlaySound boulder_impact_sound_2
					EndIf 
					If ac\random_asteroid >= 11 And ac\random_asteroid <= 14
						PlaySound boulder_impact_sound_3
					EndIf 
					If ac\random_asteroid >= 15 And ac\random_asteroid <= 18
						PlaySound boulder_impact_sound_4
					EndIf
				EndIf 
			EndIf 
			FreeImage ac\image
			Delete ac	
		EndIf 
	
	Next
End Function



Function create_asteroid(x,y,y_velocity,x_velocity,constraint,damage,health)
	a.asteroid = New asteroid
	a\random_asteroid = Rnd(1,15)
	
	If a\random_asteroid = 1 Then a\image = CopyImage(asteroid1)
	If a\random_asteroid = 2 Then a\image = CopyImage(asteroid2)
	If a\random_asteroid = 3 Then a\image = CopyImage(asteroid3)
	If a\random_asteroid = 4 Then a\image = CopyImage(asteroid4)
	If a\random_asteroid = 5 Then a\image = CopyImage(asteroid5)
	If a\random_asteroid = 6 Then a\image = CopyImage(asteroid6)
	If a\random_asteroid = 7 Then a\image = CopyImage(asteroid7)
	If a\random_asteroid = 8 Then a\image = CopyImage(asteroid8)
	If a\random_asteroid = 9 Then a\image = CopyImage(asteroid9)
	If a\random_asteroid = 10 Then a\image = CopyImage(asteroid10)
	If a\random_asteroid = 11 Then a\image = CopyImage(asteroid11)
	If a\random_asteroid = 12 Then a\image = CopyImage(asteroid12)
	If a\random_asteroid = 13 Then a\image = CopyImage(asteroid13)
	If a\random_asteroid = 14 Then a\image = CopyImage(asteroid14)
	If a\random_asteroid = 15 Then a\image = CopyImage(asteroid15)
	If x > 0 Or y > 0
		a\x# = x
		a\y# = y
	EndIf 
	If x = 0
		If constraint > 0
			a\x# = Rnd(constraint,1004)
		EndIf 
			
		If constraint = 0
			a\x# = Rnd(20,1004)
		EndIf 
	EndIf 
	If y = 0
		a\y# = 700  
	EndIf  
	a\random_split = Rnd(1,3)                
	a\yspeed# = 0-Rnd(y_velocity - (y_velocity/2),y_velocity)
	a\health# = health
	a\dead = False
	a\damage = damage
	destroyable_on_screen = destroyable_on_screen + 1
	asteroid_total = asteroid_total + 1
	a\sound = True  
	If x_velocity = 100
		a\xspeed# = 0
	EndIf
	If x_velocity = 0
		a\xspeed# = Rnd(-2,2)
	EndIf 
	If x_velocity > 0 And x_velocity < 100 Or x_velocity < 0
		a\xspeed# = x_velocity
	EndIf 
End Function

Function draw_asteroid()
	For a.asteroid = Each asteroid
		a\y# = a\y# + a\yspeed#
		a\x# = a\x# + a\xspeed#
		DrawImage a\image,a\x,a\y
		;Text a\x,a\y,a\random_split,True,True 
		
		
		
		For b.bullet_shot = Each bullet_shot	; CHECK FOR BULLETS HIT
				If ImagesCollide(b\image,b\x,b\y,0,a\image,a\x,a\y,0) Then 
					a\health# = a\health# - 2
					b\dead = True
				EndIf 
		Next
		
		
		
		For l.laser_bullet = Each laser_bullet	; CHECK FOR LASER HITS
				If ImagesCollide(l\image,l\x,l\y,0,a\image,a\x,a\y,0) Then 
					a\health# = a\health# - 1
					l\dead = True
				EndIf 
		Next
		
		If player_rotated = False
			If ImagesCollide(player_image,p_x,p_y,0,a\image,a\x,a\y,0) ; CHECK TO SEE IF IT HITS THE PLAYER
				If sounds = True 
					If a\random_asteroid >= 1 And a\random_asteroid <= 4
						PlaySound boulder_impact_sound 
					EndIf 
					If a\random_asteroid >= 5 And a\random_asteroid <= 8
						PlaySound boulder_impact_sound_2
					EndIf 
					If a\random_asteroid >= 9 And a\random_asteroid <= 12
						PlaySound boulder_impact_sound_3
					EndIf 
					If a\random_asteroid >= 13 And a\random_asteroid <= 15
						PlaySound boulder_impact_sound_4
					EndIf 
				EndIf 
				If a\random_split = 1
					For chunk = 1 To 4
						create_asteroid_chunk(a\x,a\y)
					Next 
				EndIf
				times_hit_by_asteroid = times_hit_by_asteroid + 1
				a\dead = True 
				take_damage(a\damage)
				For particle_counter = 1 To 8
					create_particle(a\x,a\y)
				Next 
			EndIf
		EndIf
		
		If player_rotated = True 
			If ImagesCollide(ship_rotated,p_x,p_y,0,a\image,a\x,a\y,0) ; CHECK TO SEE IF IT HITS THE PLAYER
				If sounds = True 
					If a\random_asteroid >= 1 And a\random_asteroid <= 4
						PlaySound boulder_impact_sound 
					EndIf 
					If a\random_asteroid >= 5 And a\random_asteroid <= 8
						PlaySound boulder_impact_sound_2
					EndIf 
					If a\random_asteroid >= 9 And a\random_asteroid <= 12
						PlaySound boulder_impact_sound_3
					EndIf 
					If a\random_asteroid >= 13 And a\random_asteroid <= 15
						PlaySound boulder_impact_sound_4
					EndIf 
				EndIf 
				If a\random_split = 1
					For chunk = 1 To 4
						create_asteroid_chunk(a\x,a\y)
					Next 
				EndIf
				times_hit_by_asteroid = times_hit_by_asteroid + 1
				a\dead = True 
				take_damage(a\damage)
				For particle_counter = 1 To 8
					create_particle(a\x,a\y)
				Next 
			EndIf
		EndIf 

		; if it dies / dies after off screen
		If a\y < -50 Then
			a\dead = True
		EndIf 
		
		If a\health < 1 Then ; if it dies from lack of health
			a\dead = True
			If a\random_split > 1
				For particle_counter = 1 To 8
					create_particle(a\x,a\y)
				Next 
			EndIf 
			If a\random_split = 1
				For chunk = 1 To 4
					create_asteroid_chunk(a\x,a\y)
				Next 
			EndIf 

				asteroids_destroyed = asteroids_destroyed + 1 
			If sounds = True 
				If a\sound = True
					If a\random_asteroid >= 1 And a\random_asteroid <= 4
						PlaySound boulder_impact_sound 
					EndIf 
					If a\random_asteroid >= 5 And a\random_asteroid <= 8
						PlaySound boulder_impact_sound_2
					EndIf 
					If a\random_asteroid >= 9 And a\random_asteroid <= 12
						PlaySound boulder_impact_sound_3
					EndIf 
					If a\random_asteroid >= 13 And a\random_asteroid <= 15
						PlaySound boulder_impact_sound_4
					EndIf 
				EndIf 
			EndIf 
		EndIf 
		
		If a\dead = True Then ; just set a\dead to true to destroy asteroid and not give experience
			FreeImage a\image
			Delete a
			destroyable_on_screen = destroyable_on_screen - 1
		EndIf 
		
	Next 
End Function






;------------- BULLET CREATE AND DRAW
Function create_bullet(x,y,y_velocity,crit_strike)
	b.bullet_shot = New bullet_shot
	If player_rotated = False 
		b\image = CopyImage(bullet_shot_image)
	EndIf
	If player_rotated = True 
		b\image = CopyImage(bullet_shot_rotated)
	EndIf 
	b\x = (x)
	b\y = (y+25)
	b\yspeed = y_velocity
	b\dead = False
	b\wideshot_random# = Rnd(0,100)
	If crit_strike = True 
		b\crit# = Rnd(0,100)
	EndIf 
	b\damage = (30)*(1+standard_shot_damage_increaser#) ; modify damage based on talent 3
	If crit_strike = True
		If b\crit# <= chance_to_crit# 
			b\damage = b\damage*2 
			If b\wideshot_random# <= wideshot_force_chance#
				wideshot_forced = True 
			EndIf 
		EndIf 
	EndIf 
	total_bullets = total_bullets + 1
End Function
;------------
Function draw_bullet()
	For b.bullet_shot = Each bullet_shot
		b\y = b\y + b\yspeed
		DrawImage b\image,b\x,b\y
		
		
		;Text b\x,b\y,b\damage,True,True
		
		
		
		
		
		; if it dies / dies after off screen
		If b\y > 768 Then
			b\dead = True
		EndIf 
		
		If b\y < -100 Then
			b\dead = True
		EndIf
		
		If b\dead = True Then
			FreeImage b\image
			Delete b
		EndIf 
	Next 
End Function














;-------------- LITTLESHOTS
Function create_littleshot(x,y,angle#,damage,rotated,chain,speed#)
	ls.littleshot = New littleshot
	ls\image = CopyImage(ball_image_small)
	ls\x# = (x)
	ls\y# = (y)
	ls\dead = False
	ls\killed = False
	ls\damage = damage
	ls\angle# = angle#
	ls\rotated = rotated
	ls\radius# = 0
	ls\speed# = speed#
	ls\x_add# = 0
	ls\y_add# = 0
	ls\chain = chain
End Function



;------------
Function draw_littleshot()
	For ls.littleshot = Each littleshot
		
	
		DrawImage ls\image,ls\x+ls\x_add,ls\y-ls\y_add
		
		ls\x_add = (ls\radius# * Cos(ls\angle#))
		ls\y_add = (ls\radius# * Sin(ls\angle#))
		
		
		
		ls\radius# = ls\radius# + ls\speed#
		
		
		For es.enemy_ship = Each enemy_ship
			If ImagesCollide(ls\image,ls\x#+ls\x_add,ls\y#-ls\y_add,0,es\image,es\x,es\y,0)
				es\dead = True 
				ls\killed = True
			EndIf
		Next 
		
		For esr.enemy_ship_rotator = Each enemy_ship_rotator
			If ImagesCollide(ls\image,ls\x#+ls\x_add,ls\y#-ls\y_add,0,esr\image,esr\x,esr\y,0)
				esr\dead = True 
				ls\killed = True
			EndIf
		Next
		
		For esp.enemy_ship_phaser = Each enemy_ship_phaser
			If ImagesCollide(ls\image,ls\x#+ls\x_add,ls\y#-ls\y_add,0,esp\image,esp\x,esp\y,0)
				esp\health# = esp\health# - ls\damage
				ls\killed = True 
			EndIf
		Next
		
		For esb.enemy_ship_bomb = Each enemy_ship_bomb
			If ImagesCollide(ls\image,ls\x#+ls\x_add,ls\y#-ls\y_add,0,esb\image,esb\x,esb\y,0)
				esb\health# = esb\health# - ls\damage
				ls\killed = True 
			EndIf
		Next
			
		For a.asteroid = Each asteroid
			If ImagesCollide(ls\image,ls\x#+ls\x_add,ls\y#-ls\y_add,0,a\image,a\x,a\y,0)
				a\health# = a\health# - 4
				ls\killed = True
			EndIf 
		Next
		
		For ac.asteroid_chunk = Each asteroid_chunk
			If ImagesCollide(ls\image,ls\x#+ls\x_add,ls\y#-ls\y_add,0,ac\image,ac\x,ac\y,0)
				ac\killed = True 
				ac\sound = True 
				ls\killed = True
			EndIf  
		Next
		
		If ls\killed = True Then
			If ls\chain = True
				If ls\rotated = False Then
					;create_megashot(ls\x#+ls\x_add,ls\y#-ls\y_add,500,False)
				EndIf
				If ls\rotated = True Then
					;create_megashot(ls\x#+ls\x_add,ls\y#-ls\y_add,500,True)
				EndIf
			EndIf 
		EndIf
		
		
		; if it dies / dies after off screen
		If ls\y#-ls\y_add# > 768 Or ls\y#-ls\y_add# < -100 Or ls\x#+ls\x_add# > 1200 Or ls\x#+ls\x_add# < -100
			ls\dead = True
		EndIf 
		
		If ls\dead = True Or ls\killed = True Then
			FreeImage ls\image
			Delete ls
		EndIf 
	Next 
End Function










;-------------- MEGASHOT
Function create_megashot(x,y,damage,rotated)
	ms.megashot = New megashot
	ms\image = CopyImage(ball_image)
	ms\x# = (x)
	ms\y# = (y)
	If rotated = False Then
		ms\y_velocity = 5
	EndIf
	If rotated = True Then
		ms\y_velocity = -5
	EndIf
	ms\rotated = rotated
	ms\dead = False
	ms\killed = False
	ms\damage = damage
	ms\angle# = 0
	ms\radius# = 0
	ms\x_add# = 0
	ms\y_add# = 0
	ms\fission_counter = 0
	ms\fission_angle = 180
	ms\reverse_direction = False
End Function





;------------
Function draw_megashot()
	For ms.megashot = Each megashot
	
		DrawImage ms\image,ms\x,ms\y		
		
		;If nuclear_fission = False
			ms\y = ms\y + ms\y_velocity
		;EndIf 
		
		If nuclear_fission = True
			ms\fission_counter = ms\fission_counter + 1
			ms\fission_angle = ms\fission_angle + 35
			;If ms\reverse_direction = False 
			;	ms\fission_angle = ms\fission_angle + 10
			;	If ms\fission_angle >= 360 Then ms\reverse_direction = True
			;EndIf
			;If ms\reverse_direction = True 
			;	ms\fission_angle = ms\fission_angle - 10
			;	If ms\fission_angle <= 180 Then ms\reverse_direction = False
			;EndIf 
			
			If ms\fission_counter >= 1 Then
				If ms\rotated = False Then
					create_littleshot(ms\x,ms\y,ms\fission_angle,littleshot_damage,False,False,3.5)
				EndIf
				If ms\rotated = True Then
					create_littleshot(ms\x,ms\y,ms\fission_angle,littleshot_damage,True,False,3.5)
				EndIf
				ms\fission_counter = 0
			EndIf 
		EndIf 
		
		
		For es.enemy_ship = Each enemy_ship
			If ImagesCollide(ms\image,ms\x,ms\y,0,es\image,es\x,es\y,0)
				es\dead = True 
				ms\killed = True
			EndIf
		Next 
		
		For esr.enemy_ship_rotator = Each enemy_ship_rotator
			If ImagesCollide(ms\image,ms\x,ms\y,0,esr\image,esr\x,esr\y,0)
				esr\dead = True 
				ms\killed = True
			EndIf
		Next
		
		For esb.enemy_ship_bomb = Each enemy_ship_bomb
			If ImagesCollide(ms\image,ms\x,ms\y,0,esb\image,esb\x,esb\y,0)
				esb\dead = True 
				ms\killed = True
			EndIf
		Next
		
		For esp.enemy_ship_phaser = Each enemy_ship_phaser
			If ImagesCollide(ms\image,ms\x,ms\y,0,esp\image,esp\x,esp\y,0)
				esp\dead = True
				ms\killed = True 
			EndIf
		Next
			
		For a.asteroid = Each asteroid
			If ImagesCollide(ms\image,ms\x,ms\y,0,a\image,a\x,a\y,0)
				a\health# = a\health# - 4
				
				If a\health# <= 4 Then
					ms\killed = True
				EndIf 
			EndIf 
		Next
		
		For ac.asteroid_chunk = Each asteroid_chunk
			If ImagesCollide(ms\image,ms\x,ms\y,0,ac\image,ac\x,ac\y,0)
				ac\killed = True 
				ac\sound = True 
				ms\killed = True
			EndIf  
		Next
		
		If ms\killed = True Then
			If ms\rotated = False Then
				create_littleshot(ms\x,ms\y,225,littleshot_damage,False,True,3.5)
				create_littleshot(ms\x,ms\y,315,littleshot_damage,False,True,3.5)
			EndIf
			If ms\rotated = True Then
				create_littleshot(ms\x,ms\y,45,littleshot_damage,True,True,3.5)
				create_littleshot(ms\x,ms\y,135,littleshot_damage,True,True,3.5)
			EndIf
		EndIf
		
		
		; if it dies / dies after off screen
		If ms\y> 768 Or ms\y < -100 Or ms\x > 1200 Or ms\x < -100
			ms\dead = True
		EndIf 
		
		If ms\dead = True Or ms\killed = True Then
			FreeImage ms\image
			Delete ms
		EndIf 
	Next 
End Function






;-------------- ENEMY BULLET CREATE
Function create_enemy_bullet(x,y,y_velocity,damage)
	eb.enemy_bullet_shot = New enemy_bullet_shot
	eb\image = CopyImage(bullet_shot_enemy_image)
	eb\x = (x)
	eb\y = (y-25)
	eb\yspeed = y_velocity*2
	eb\dead = False
	eb\damage = damage
End Function
;------------
Function draw_enemy_bullet()
	For eb.enemy_bullet_shot = Each enemy_bullet_shot
		eb\y = eb\y - eb\yspeed
		DrawImage eb\image,eb\x,eb\y
		
		
		If player_rotated = False 
			If ImagesCollide(player_image,p_x,p_y,0,eb\image,eb\x,eb\y,0)
				eb\dead = True 
				take_damage(eb\damage)
				times_hit_by_enemies = times_hit_by_enemies + 1 
			EndIf 
		EndIf 
		If player_rotated = True 
			If ImagesCollide(ship_rotated,p_x,p_y,0,eb\image,eb\x,eb\y,0)
				eb\dead = True 
				take_damage(eb\damage)
				times_hit_by_enemies = times_hit_by_enemies + 1 
			EndIf 
		EndIf
		
		For fp.friendly_protector = Each friendly_protector
			If ImagesCollide(fp\image,fp\x,fp\y,0,eb\image,eb\x,eb\y,0)
				eb\dead = True 
				fp\dead = True 
			EndIf 
		Next 
		For fa.friendly_allied = Each friendly_allied
			If ImagesCollide(fa\image,fa\x,fa\y,0,eb\image,eb\x,eb\y,0)
				eb\dead = True 
				fa\dead = True 
			EndIf 
		Next 
		
		
		; if it dies / dies after off screen
		If eb\y > 768 Or eb\y < -100 Then
			eb\dead = True
		EndIf 
		
		If eb\dead = True Then
			FreeImage eb\image
			Delete eb
		EndIf 
	Next 
End Function













;-------------- CREATE BOUNCE BALL
Function create_bounce_ball(x,y,y_velocity#,damage#)
	bounce.bounce_ball = New bounce_ball
	bounce\image = CopyImage(ball_image)
	bounce\x# = (x)
	bounce\y# = (y)
	bounce\hits = 0
	bounce\deleter = False
	bounce\damage# = damage#
	bounce\y_velocity# = y_velocity#
	
	bounce\temp_angle# = 0
	bounce\temp_x# = 0
	bounce\temp_y# = 0
	bounce\temp_radius# = 0
	bounce\temp_distance# = 0
	bounce\temp_x_velocity# = 0
	bounce\temp_y_velocity# = 0

	bounce\perm_angle# = 0
	bounce\perm_x# = 0
	bounce\perm_y# = 0
	bounce\perm_radius# = 0
	bounce\perm_distance#  = 0
	bounce\perm_x_velocity# = 0
	bounce\perm_y_velocity# = 0
	
	bounce\closest_x# = 0
	bounce\closest_y# = 0
End Function



Function draw_bounce_ball()
	For bounce.bounce_ball = Each bounce_ball
		Text 512,120,"perm Angle: "+bounce\perm_angle#,True,True
		Text 512,140,"perm distance: "+bounce\perm_distance#,True,True
		Text 512,160,"perm x: "+bounce\perm_x#,True,True
		Text 512,180,"perm y: "+bounce\perm_y#,True,True
		Text 512,200,"perm radius: "+bounce\perm_radius#,True,True
		Text 512,220,"perm x_velocity: "+bounce\perm_x_velocity#,True,True
		Text 512,240,"perm y_velocity: "+bounce\perm_y_velocity#,True,True
		;Text 512,260,"temp distance: "+bounce\temp_distance#,True,True
		;Text 512,280,"radius: "+bounce\radius#,True,True
		;Text 512,300,"y_speed: "+bounce\y_speed#,True,True
		
		
		
		
		If bounce\hits = 0
			DrawImage bounce\image,bounce\x#,bounce\y#
			bounce\y# = bounce\y# + bounce\y_velocity#
		EndIf 
		If bounce\hits > 0
			DrawImage bounce\image,(bounce\x# + bounce\perm_x_velocity#),(bounce\y# + bounce\perm_y_velocity#)
			bounce\perm_radius# = bounce\perm_radius# + 8
			bounce\perm_x_velocity# = (bounce\perm_radius# * Cos(bounce\perm_angle#))
			bounce\perm_y_velocity# = (bounce\perm_radius# * Sin(bounce\perm_angle#))
		EndIf 
		
		For es.enemy_ship = Each enemy_ship
		;For esr.enemy_ship_rotator = Each enemy_ship_rotator
		;For esp.enemy_ship_phaser = Each enemy_ship_phaser
			If ImagesCollide(bounce\image,bounce\x#,bounce\y#,0,es\image,es\x,es\y,0)
					bounce\hits = bounce\hits + 1
					
			 	;For es.enemy_ship = Each enemy_ship
					es\x = bounce\temp_x#
					es\y = bounce\temp_y#
					bounce\temp_x# = bounce\temp_x# * bounce\temp_x#
					bounce\temp_y# = bounce\temp_y# * bounce\temp_y#
					bounce\temp_distance# = Sqr(bounce\temp_x# + bounce\temp_y#)
					;If bounce\temp_distance# > 0
					;	bounce\perm_distance# = bounce\temp_distance#
					;EndIf 
					If bounce\temp_distance# < bounce\perm_distance# And bounce\temp_distance# > 0
						bounce\perm_distance# = bounce\temp_distance#
						bounce\closest_x# = bounce\temp_x#
						bounce\closest_y# = bounce\temp_y#
						bounce\perm_angle# = ATan((bounce\closest_y# - bounce\y#)/(bounce\closest_x# - bounce\x#))
					EndIf 
					es\dead = True  
					If bounce\perm_distance = 1
						bounce\deleter = True
					EndIf 
				;Next
			EndIf
			
			
		Next 
		;Next 
		;Next
		
		
		If bounce\hits > max_hits Or bounce\y# > 650 Or bounce\y# < -50
			bounce\deleter = True
		EndIf 
		
		If bounce\deleter = True
			FreeImage bounce\image
			Delete bounce
		EndIf 
	
	
	Next
End Function













;-------------- ENEMY BULLET CREATE
Function create_enemy_ball(x,y,angle#,damage)
	eba.enemy_ball_shot = New enemy_ball_shot
	eba\image = CopyImage(ball_image)
	eba\x = (x)
	eba\y = (y)
	eba\yspeed = y_velocity*2
	eba\dead = False
	eba\damage = damage
	eba\angle# = angle#
	eba\touched = False
	eba\radius# = 0
	eba\x_add = 0
	eba\y_add = 0
End Function
;------------
Function draw_enemy_ball()
	For eba.enemy_ball_shot = Each enemy_ball_shot
	
		DrawImage eba\image,eba\x+eba\x_add,eba\y-eba\y_add
		
		eba\x_add = (eba\radius# * Cos(eba\angle#))
		eba\y_add = (eba\radius# * Sin(eba\angle#))
		
		
		
		eba\radius# = eba\radius# + 7
		
		If player_rotated = False 
			If ImagesCollide(player_image,p_x,p_y,0,eba\image,eba\x+eba\x_add,eba\y-eba\y_add,0)
				eba\dead = True 
				take_damage(eba\damage)
				times_hit_by_enemies = times_hit_by_enemies + 1 
			EndIf 
		EndIf 
		If player_rotated = True 
			If ImagesCollide(ship_rotated,p_x,p_y,0,eba\image,eba\x+eba\x_add,eba\y-eba\y_add,0)
				eba\dead = True 
				take_damage(eba\damage)
				times_hit_by_enemies = times_hit_by_enemies + 1 
			EndIf 
		EndIf
		
		For fp.friendly_protector = Each friendly_protector
			If ImagesCollide(fp\image,fp\x,fp\y,0,eba\image,eba\x+eba\x_add,eba\y-eba\y_add,0)
				eba\dead = True 
				fp\dead = True 
			EndIf 
		Next 
		For fa.friendly_allied = Each friendly_allied
			If ImagesCollide(fa\image,fa\x,fa\y,0,eba\image,eba\x+eba\x_add,eba\y-eba\y_add,0)
				eba\dead = True 
				fa\dead = True 
			EndIf 
		Next 
		
		
		; if it dies / dies after off screen
		If eba\y-eba\y_add > 768 Or eba\y-eba\y_add < -100 Or eba\x+eba\x_add > 1200 Or eba\x+eba\x_add < -100
			eba\dead = True
		EndIf 
		
		If eba\dead = True Then
			FreeImage eba\image
			Delete eba
		EndIf 
	Next 
End Function



;-------------- ENEMY HEAT SEEKING
Function create_heat_seeking(x,y,damage)
	hs.heat_seeking = New heat_seeking
	hs\image = CopyImage(ball_image)
	hs\x# = (x)
	hs\y# = (y-25)
	hs\dead = False
	hs\damage = damage
	hs\i_up# = 0
	hs\i_down# = 0
	hs\i_right# = 0
	hs\i_left# = 0
End Function
;------------
Function draw_heat_seeking()
	For hs.heat_seeking = Each heat_seeking
		DrawImage hs\image,hs\x#,hs\y#
		If p_x > hs\x#
			hs\i_right# = hs\i_right# + .03
			hs\i_left# = hs\i_left# - .03
		EndIf 
		If p_x < hs\x#
			hs\i_left# = hs\i_left# + .03
			hs\i_right# = hs\i_right# - .03
		EndIf 
		If p_y > hs\y# 
			hs\i_down# = hs\i_down# + .03
			hs\i_up# = hs\i_up# - .03
		EndIf 
		If p_y < hs\y# 
			hs\i_up# = hs\i_up# + .03
			hs\i_down# = hs\i_down# - .03
		EndIf 
		
		If hs\i_down# > 1 Then hs\i_down# = 1 
		If hs\i_up# > 1 Then hs\i_up# = 1
		If hs\i_left# > 1 Then hs\i_left# = 1
		If hs\i_right# > 1 Then hs\i_right# = 1
		
		If hs\i_down# < 0 Then hs\i_down# = 0
		If hs\i_up# < 0 Then hs\i_up# = 0
		If hs\i_left# < 0 Then hs\i_left# = 0
		If hs\i_right# < 0 Then hs\i_right# = 0
		
		hs\x = hs\x + hs\i_right#
		hs\x = hs\x - hs\i_left#
		hs\y = hs\y + hs\i_down#
		hs\y = hs\y - hs\i_up#
		;all of these are + because when were checking position against player we did < and >
		
		If player_rotated = False 
			If ImagesCollide(player_image,p_x,p_y,0,hs\image,hs\x#,hs\y#,0)
				hs\dead = True 
				take_damage(hs\damage)
				times_hit_by_enemies = times_hit_by_enemies + 1 
			EndIf 
		EndIf 
		If player_rotated = True 
			If ImagesCollide(ship_rotated,p_x,p_y,0,hs\image,hs\x#,hs\y#,0)
				hs\dead = True 
				take_damage(hs\damage)
				times_hit_by_enemies = times_hit_by_enemies + 1 
			EndIf 
		EndIf
		
		If hs\dead = True Then
			FreeImage hs\image
			Delete hs
		EndIf 

	Next 

End Function 


;-------------LASER CREATE AND DRAW
Function create_laser(x,y,y_velocity)
	l.laser_bullet = New laser_bullet
	l\image = CopyImage(laser_shot_image)
	l\x = (p_x)
	l\y = (p_y+25)
	l\yspeed = y_velocity
	l\dead = False
	l\damage = 10
End Function
;------------
Function draw_laser()
	For l.laser_bullet = Each laser_bullet
		l\y = l\y + l\yspeed
		DrawImage l\image,l\x,l\y
			
			
			
			
		; if it dies / dies after off screen
		If l\y > 768 Then
			l\dead = True
		EndIf 	
					
		If l\dead = True Then
			FreeImage l\image
			Delete l
		EndIf 
	Next 
End Function







Function update_nuke()
	If nuke_radius > 0
		nuke_radius = nuke_radius + 10
		Color 250,(MilliSecs()*1.8 Mod 500)/2,20
		Oval p_x-nuke_radius,p_y-nuke_radius,2*nuke_radius,2*nuke_radius
	
	EndIf 
	
		For a.asteroid = Each asteroid
			nuke_x_dist_a = Abs(p_x-a\x)
			nuke_y_dist_a = Abs(p_y-a\y)
							
			If Sqr((nuke_x_dist_a*nuke_x_dist_a)+(nuke_y_dist_a*nuke_y_dist_a)) < nuke_radius Then
				If a\health# < 10
					a\random_split = 1
					a\sound = False 
					a\health# = 0
				EndIf 
			EndIf 
		Next 
		
		
			
		For es.enemy_ship = Each enemy_ship
			nuke_x_dist_f = Abs(p_x-es\x)
			nuke_y_dist_f = Abs(p_y-es\y)
			
			If Sqr((nuke_x_dist_f*nuke_x_dist_f)+(nuke_y_dist_f*nuke_y_dist_f)) < (nuke_radius) Then
				es\dead = True 
				es\explode = False 
			EndIf 
		Next  
		
		For esr.enemy_ship_rotator = Each enemy_ship_rotator
			nuke_x_dist_f = Abs(p_x-esr\x)
			nuke_y_dist_f = Abs(p_y-esr\y)
			
			If Sqr((nuke_x_dist_f*nuke_x_dist_f)+(nuke_y_dist_f*nuke_y_dist_f)) < (nuke_radius) Then
				esr\dead = True 
				esr\explode = False 
			EndIf 
		Next  
		
		For esp.enemy_ship_phaser = Each enemy_ship_phaser
			nuke_x_dist_f = Abs(p_x-esp\x)
			nuke_y_dist_f = Abs(p_y-esp\y)
			
			If Sqr((nuke_x_dist_f*nuke_x_dist_f)+(nuke_y_dist_f*nuke_y_dist_f)) < (nuke_radius) Then
				esp\dead = True 
				esp\explode = False 
			EndIf 
		Next 
		
		For esb.enemy_ship_bomb = Each enemy_ship_bomb
			nuke_x_dist_f = Abs(p_x-esb\x)
			nuke_y_dist_f = Abs(p_y-esb\y)
			
			If Sqr((nuke_x_dist_f*nuke_x_dist_f)+(nuke_y_dist_f*nuke_y_dist_f)) < (nuke_radius) Then
				esb\dead = True 
				esb\explode = False 
			EndIf 
		Next 
		
		
		For bombs.enemy_bomb = Each enemy_bomb
			nuke_x_dist_f = Abs(p_x-bombs\x)
			nuke_y_dist_f = Abs(p_y-bombs\y)
			
			If Sqr((nuke_x_dist_f*nuke_x_dist_f)+(nuke_y_dist_f*nuke_y_dist_f)) < (nuke_radius) Then
				bombs\deleter = True 
			EndIf 
		Next 
	
	
	If nuke_radius > 650 Then
		nuke_radius = 0
		If talent_8_spent = 1
			nuke_shoot_speed_increase_frame_timer = 180
		EndIf
		If talent_8_spent = 2
			nuke_shoot_speed_increase_frame_timer = 360
		EndIf
		If talent_8_spent = 3
			nuke_shoot_speed_increase_frame_timer = 540			
		EndIf
	EndIf


End Function




;------------DRAW SHIELD
Function draw_shield()

	DrawImage shield_image,p_x,p_y
	
	shield_counter = shield_counter + 1
	If shield_counter >= 12
		armor# = armor# + shield_armor_increaser#
		shield_counter = 0
	EndIf 
	
	
		
		
	For a.asteroid = Each asteroid
		If ImagesCollide(shield_image,p_x,p_y,0,a\image,a\x,a\y,0)
			a\health# = a\health# - 4
			If reactive_shielding = True Then
				If player_rotated = True
					create_littleshot(p_x,p_y,Rnd(0,180),littleshot_damage,False,False,3.5)
				EndIf
				If player_rotated = False Then
					create_littleshot(p_x,p_y,Rnd(180,360),littleshot_damage,False,False,3.5)
				EndIf
			EndIf	
		EndIf 
		
	Next
	For ac.asteroid_chunk = Each asteroid_chunk
		If ImagesCollide(shield_image,p_x,p_y,0,ac\image,ac\x,ac\y,0)
			ac\killed = True 
			ac\sound = True
			If reactive_shielding = True Then
				If player_rotated = True
					create_littleshot(p_x,p_y,Rnd(0,180),littleshot_damage,False,False,3.5)
				EndIf
				If player_rotated = False Then
					create_littleshot(p_x,p_y,Rnd(180,360),littleshot_damage,False,False,3.5)
				EndIf
			EndIf 
		EndIf  
	Next
		
	For eb.enemy_bullet_shot = Each enemy_bullet_shot 
		If ImagesCollide(shield_image,p_x,p_y,0,eb\image,eb\x,eb\y,0)
			eb\dead = True
			If reactive_shielding = True Then
				If player_rotated = True
					create_littleshot(p_x,p_y,Rnd(0,180),littleshot_damage,False,False,3.5)
				EndIf
				If player_rotated = False Then
					create_littleshot(p_x,p_y,Rnd(180,360),littleshot_damage,False,False,3.5)
				EndIf
			EndIf 
		EndIf 
	Next
	
	For eba.enemy_ball_shot = Each enemy_ball_shot 
		If ImagesCollide(shield_image,p_x,p_y,0,eba\image,eba\x+eba\x_add,eba\y-eba\y_add,0)
			eba\dead = True
			If reactive_shielding = True Then
				If player_rotated = True
					create_littleshot(p_x,p_y,Rnd(0,180),littleshot_damage,False,False,3.5)
				EndIf
				If player_rotated = False Then
					create_littleshot(p_x,p_y,Rnd(180,360),littleshot_damage,False,False,3.5)
				EndIf
			EndIf 
		EndIf 
	Next
	
	For gl.green_laser = Each green_laser 
		If ImagesCollide(shield_image,p_x,p_y,0,gl\image,gl\x,gl\y,0)
			gl\dead = True 
			If reactive_shielding = True Then
				If player_rotated = True
					create_littleshot(p_x,p_y,Rnd(0,180),littleshot_damage,False,False,3.5)
				EndIf
				If player_rotated = False Then
					create_littleshot(p_x,p_y,Rnd(180,360),littleshot_damage,False,False,3.5)
				EndIf
			EndIf
		EndIf 
	Next
	For pl.pink_laser = Each pink_laser 
		If ImagesCollide(shield_image,p_x,p_y,0,pl\image,pl\x,pl\y,0)
			pl\dead = True 
			If reactive_shielding = True Then
				If player_rotated = True
					create_littleshot(p_x,p_y,Rnd(0,180),littleshot_damage,False,False,3.5)
				EndIf
				If player_rotated = False Then
					create_littleshot(p_x,p_y,Rnd(180,360),littleshot_damage,False,False,3.5)
				EndIf
			EndIf
		EndIf 
	Next
	
	For sgl.side_green_laser = Each side_green_laser 
		If ImagesCollide(shield_image,p_x,p_y,0,sgl\image,sgl\x,sgl\y,0)
			sgl\dead = True 
			If reactive_shielding = True Then
				If player_rotated = True
					create_littleshot(p_x,p_y,Rnd(0,180),littleshot_damage,False,False,3.5)
				EndIf
				If player_rotated = False Then
					create_littleshot(p_x,p_y,Rnd(180,360),littleshot_damage,False,False,3.5)
				EndIf
			EndIf
		EndIf 
	Next
	For spl.side_pink_laser = Each side_pink_laser 
		If ImagesCollide(shield_image,p_x,p_y,0,spl\image,spl\x,spl\y,0)
			spl\dead = True
			If reactive_shielding = True Then
				If player_rotated = True
					create_littleshot(p_x,p_y,Rnd(0,180),littleshot_damage,False,False,3.5)
				EndIf
				If player_rotated = False Then
					create_littleshot(p_x,p_y,Rnd(180,360),littleshot_damage,False,False,3.5)
				EndIf
			EndIf 
		EndIf 
	Next
	
	For es.enemy_ship = Each enemy_ship
		If ImagesCollide(shield_image,p_x,p_y,0,es\image,es\x,es\y,0)
			shield = shield - 5
			es\dead = True 
			If reactive_shielding = True Then
				If player_rotated = True
					create_littleshot(p_x,p_y,Rnd(0,180),littleshot_damage,False,False,3.5)
				EndIf
				If player_rotated = False Then
					create_littleshot(p_x,p_y,Rnd(180,360),littleshot_damage,False,False,3.5)
				EndIf
			EndIf
		EndIf
	Next 
	
	For esr.enemy_ship_rotator = Each enemy_ship_rotator
		If ImagesCollide(shield_image,p_x,p_y,0,esr\image,esr\x,esr\y,0)
			shield = shield - 5
			esr\dead = True 
			If reactive_shielding = True Then
				If player_rotated = True
					create_littleshot(p_x,p_y,Rnd(0,180),littleshot_damage,False,False,3.5)
				EndIf
				If player_rotated = False Then
					create_littleshot(p_x,p_y,Rnd(180,360),littleshot_damage,False,False,3.5)
				EndIf
			EndIf
		EndIf
	Next
	
	For esp.enemy_ship_phaser = Each enemy_ship_phaser
		If ImagesCollide(shield_image,p_x,p_y,0,esp\image,esp\x,esp\y,0)
			shield = shield - 5
			esp\dead = True 
			If reactive_shielding = True Then
				If player_rotated = True
					create_littleshot(p_x,p_y,Rnd(0,180),littleshot_damage,False,False,3.5)
				EndIf
				If player_rotated = False Then
					create_littleshot(p_x,p_y,Rnd(180,360),littleshot_damage,False,False,3.5)
				EndIf
			EndIf
		EndIf
	Next
	
	 
		
End Function


Function draw_player()
	If player_rotated = False 
		DrawImage player_image,p_x,p_y
	EndIf 
	If player_rotated = True 
		DrawImage ship_rotated,p_x,p_y
	EndIf
End Function



Function create_no_armor_protection()
		na.no_armor_protection = New no_armor_protection
		na\image = CopyImage(allied_rotated)
		na\x# = 512
		na\y# = -30
		na\y_speed# = Rnd(1,2)
		na\x_speed# = Rnd(-6,6)
		na\shoot_frame = 0
		na\shoot_timer = Rnd(20,30)
		na\y_adder = Rnd(0,50)
		na\retreat = False 
		na\retreat_timer = 120
		na\dead = False 
End Function


Function draw_no_armor_protection()
	For na.no_armor_protection = Each no_armor_protection
		If na\dead = False
				DrawImage na\image,na\x#,na\y#
				
				If na\retreat = False
					If na\y# < (75 + na\y_adder)
						na\y# = na\y# + na\y_speed#
					EndIf ;move the ships down
				EndIf 
					
				na\x# = na\x# + na\x_speed#
				If na\x# > 1000 Then na\x_speed# = Rnd(-6,-1)
				If na\x# < 24 Then na\x_speed# = Rnd(1,6)
					
				na\shoot_frame = na\shoot_frame + 1; increase frame counter by 1
				
					
				If na\shoot_frame >= na\shoot_timer
					create_bullet(na\x#,(na\y#+30),8,False)
					na\shoot_frame = 0
				EndIf ;shoot bullets 
		EndIf 
				If armor# > 0 Then na\retreat = True
				
				If na\retreat = True Then
					na\retreat_timer = na\retreat_timer - 1
					If na\y# > -100
						na\y# = na\y# - na\y_speed#
					EndIf ;move the ships up
				EndIf 
				
				If na\retreat_timer <= 0
					na\dead = True 
				EndIf 
				
				If na\dead = True 
					FreeImage na\image
					Delete na
				EndIf   	
							
	Next 
End Function









Function create_protection()
		pp.protection = New protection
		pp\image = CopyImage(allied_rotated)
		pp\x# = 512
		pp\y# = -30
		pp\y_speed# = Rnd(1,2)
		pp\x_speed# = Rnd(-6,6)
		pp\shoot_frame = 0
		pp\shoot_timer = Rnd(20,30)
		pp\y_adder = Rnd(0,50)
		pp\retreat = False 
		pp\dead = False 
		pp\time = 900 ; 15 seconds
		If protective_backup = True
			shield_addition# = shield_addition# + 90
			total_protection_shield_time# = total_protection_shield_time# + 90
		EndIf 
End Function


Function draw_protection()
	For pp.protection = Each protection
		If pp\dead = False
				DrawImage pp\image,pp\x#,pp\y#
				
				If pp\time >= 120
					If pp\y# < (75 + pp\y_adder)
						pp\y# = pp\y# + pp\y_speed#
					EndIf ;move the ships down
				EndIf
					
				pp\x# = pp\x# + pp\x_speed#
				If pp\x# > 1000 Then pp\x_speed# = Rnd(-6,-1)
				If pp\x# < 24 Then pp\x_speed# = Rnd(1,6)
				
				pp\time = pp\time - 1
				
					
				If pp\time < 120  
						pp\y# = pp\y# - 2
				EndIf 	
				
				
				pp\shoot_frame = pp\shoot_frame + 1; increase frame counter by 1
				
					
				If pp\shoot_frame >= pp\shoot_timer
					create_bullet(pp\x#,(pp\y#+30),8,False)
					pp\shoot_frame = 0
				EndIf ;shoot bullets 
		EndIf 
				If pp\time <= 0 Then pp\dead = True
				
				If pp\dead = True 
					FreeImage pp\image
					Delete pp
				EndIf   	
							
	Next 
End Function





;------------- COIN CREATE AND DRAW
Function create_coin(x,y,y_velocity)
	c.coin_pickup = New coin_pickup
	c\image = CopyImage(coin2)
	If x > 0 Or y > 0
		c\x = x
		c\y = y
	EndIf 
	If x = 0
		c\x = Rnd(20,1004)
	EndIf 
	If y = 0
		c\y = 700  
	EndIf 
	c\yspeed = y_velocity*-1
	c\dead = False
	c\frame = 0
	c\frame_speed = 0
End Function
;------------
Function draw_coin()
	For c.coin_pickup = Each coin_pickup
		c\y = c\y + c\yspeed
		c\frame_speed = c\frame_speed + 1
		If c\frame_speed >= 2
			c\frame = c\frame + 1
			If c\frame = 16 Then c\frame = 0
			c\frame_speed = 0
		EndIf 
		DrawImage c\image,c\x,c\y,c\frame
		
		
		If player_rotated = False 
			If ImagesCollide(player_image,p_x,p_y,0,c\image,c\x,c\y,c\frame) ; CHECK TO SEE IF IT HITS THE PLAYER
				If sounds = True 
					PlaySound coin_pickup_sound
				EndIf 
				c\dead = True 
				tokens = tokens + 1
				coin_addition = coin_addition + 1
			EndIf
		EndIf 
		If player_rotated = True 
			If ImagesCollide(ship_rotated,p_x,p_y,0,c\image,c\x,c\y,c\frame) ; CHECK TO SEE IF IT HITS THE PLAYER
				If sounds = True 
					PlaySound coin_pickup_sound
				EndIf 
				c\dead = True 
				tokens = tokens + 1
				coin_addition = coin_addition + 1
			EndIf
		EndIf 
		
		
		
		; if it dies / dies after off screen
		If c\y > 768 Or c\y < -100 Then
			c\dead = True
		EndIf 
		
		If c\dead = True Then
			FreeImage c\image
			Delete c
		EndIf 
	Next 
End Function



Function create_space_dust()
	s.space_dust = New space_dust
	s\x# = Rnd(1,1024)
	s\y# = Rnd(1,700)
	s\yspeed# = Rnd(-2,-10)
End Function 


Function update_space_dust()
	For s.space_dust = Each space_dust
		s\y# = s\y# + s\yspeed#
		If s\y# < 0
			s\x# = Rnd(1,1024)
			s\y# = 700
		EndIf 
		Oval s\x#,s\y#,1,1,1
	Next
End Function



Function create_green_laser(x,y,y_velocity)
	gl.green_laser  = New green_laser
	gl\image = CopyImage(laser_shot_image_green)
	gl\x = (x)
	gl\y = (y)
	gl\yspeed = y_velocity*-1
	gl\dead = False
	gl\damage = 4
End Function

Function draw_green_laser()
	For gl.green_laser = Each green_laser
		gl\y = gl\y - gl\yspeed
		DrawImage gl\image,gl\x,gl\y
		
		
		If player_rotated = False 
				If pink_buff = True ; multiply damage by 2 if different color buff
					If ImagesCollide(pink_shield_reduced,p_x,p_y,0,gl\image,gl\x,gl\y,0)
						take_damage(gl\damage*2)
						gl\dead = True 
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 
				If green_buff = False And pink_buff = False ;without a buff - normal damage
					If ImagesCollide(player_image,p_x,p_y,0,gl\image,gl\x,gl\y,0)
						take_damage(gl\damage)
						gl\dead = True
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 
				If green_buff = True      ;with same color - no damage
					If ImagesCollide(green_shield_reduced,p_x,p_y,0,gl\image,gl\x,gl\y,0)
						take_damage(gl\damage/3)
						gl\dead = True
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 	
		EndIf 
		If player_rotated = True 
				If pink_buff = True ; multiply damage by 2 if different color buff
					If ImagesCollide(pink_shield_reduced,p_x,p_y,0,gl\image,gl\x,gl\y,0)
						take_damage(gl\damage*2)
						gl\dead = True 
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 
				If green_buff = False And pink_buff = False ;without a buff - normal damage
					If ImagesCollide(ship_rotated,p_x,p_y,0,gl\image,gl\x,gl\y,0)
						take_damage(gl\damage)
						gl\dead = True
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 
				If green_buff = True      ;with same color - no damage
					If ImagesCollide(green_shield_reduced,p_x,p_y,0,gl\image,gl\x,gl\y,0)
						take_damage(gl\damage/3)
						gl\dead = True
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 	

		EndIf
		
		
		; if it dies / dies after off screen
		If gl\y > 768 Or gl\y < -100 Then
			gl\dead = True
		EndIf 
		
		If gl\dead = True Then
			FreeImage gl\image
			Delete gl
		EndIf 
	Next 
End Function


Function create_pink_laser(x,y,y_velocity)
	pl.pink_laser  = New pink_laser
	pl\image = CopyImage(laser_shot_image_pink)
	pl\x = (x)
	pl\y = (y)
	pl\yspeed = y_velocity*-1
	pl\dead = False
	pl\damage = 4
End Function

Function draw_pink_laser()
	For pl.pink_laser = Each pink_laser
		pl\y = pl\y - pl\yspeed
		DrawImage pl\image,pl\x,pl\y
		
		
		If player_rotated = False 
				If pink_buff = True ;with same color - no damage
					If ImagesCollide(pink_shield_reduced,p_x,p_y,0,pl\image,pl\x,pl\y,0)
						take_damage(pl\damage/3)
						pl\dead = True 
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 
				If green_buff = False And pink_buff = False ;without a buff - normal damage
					If ImagesCollide(player_image,p_x,p_y,0,pl\image,pl\x,pl\y,0)
						take_damage(pl\damage)
						pl\dead = True
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 
				If green_buff = True      ; multiply damage by 2 if different color buff
					If ImagesCollide(green_shield_reduced,p_x,p_y,0,pl\image,pl\x,pl\y,0)
						take_damage(pl\damage*2)
						pl\dead = True
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 	
		EndIf 
		If player_rotated = True 
				If pink_buff = True ;with same color - no damage
					If ImagesCollide(pink_shield_reduced,p_x,p_y,0,pl\image,pl\x,pl\y,0)
						take_damage(pl\damage/3)
						pl\dead = True 
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 
				If green_buff = False And pink_buff = False ;without a buff - normal damage
					If ImagesCollide(ship_rotated,p_x,p_y,0,pl\image,pl\x,pl\y,0)
						take_damage(pl\damage)
						pl\dead = True
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 
				If green_buff = True      ; multiply damage by 2 if different color buff
					If ImagesCollide(green_shield_reduced,p_x,p_y,0,pl\image,pl\x,pl\y,0)
						take_damage(pl\damage*2)
						pl\dead = True
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 	

		EndIf
		
		
		; if it dies / dies after off screen
		If pl\y > 768 Or pl\y < -100 Then
			pl\dead = True
		EndIf 
		
		If pl\dead = True Then
			FreeImage pl\image
			Delete pl
		EndIf 
	Next 
End Function









Function create_side_pink_laser(x,y,x_velocity)
	spl.side_pink_laser  = New side_pink_laser
	spl\image = CopyImage(laser_shot_image_pink_side)
	spl\x = (x)
	spl\y = (y)
	spl\xspeed = x_velocity*-1
	spl\dead = False
	spl\damage = 3
End Function

Function draw_side_pink_laser()
	For spl.side_pink_laser = Each side_pink_laser
		spl\x = spl\x + spl\xspeed
		DrawImage spl\image,spl\x,spl\y
		
		
		If player_rotated = False 
				If pink_buff = True ;with same color - no damage
					If ImagesCollide(pink_shield_reduced,p_x,p_y,0,spl\image,spl\x,spl\y,0)
						take_damage(spl\damage/3)
						spl\dead = True 
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 
				If green_buff = False And pink_buff = False ;without a buff - normal damage
					If ImagesCollide(player_image,p_x,p_y,0,spl\image,spl\x,spl\y,0)
						take_damage(spl\damage)
						spl\dead = True
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 
				If green_buff = True      ; multiply damage by 2 if different color buff
					If ImagesCollide(green_shield_reduced,p_x,p_y,0,spl\image,spl\x,spl\y,0)
						take_damage(spl\damage*2)
						spl\dead = True
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 	
		EndIf 
		If player_rotated = True 
				If pink_buff = True ;with same color - no damage
					If ImagesCollide(pink_shield_reduced,p_x,p_y,0,spl\image,spl\x,spl\y,0)
						take_damage(spl\damage/3)
						spl\dead = True
						times_hit_by_enemies = times_hit_by_enemies + 1  
					EndIf 
				EndIf 
				If green_buff = False And pink_buff = False ;without a buff - normal damage
					If ImagesCollide(ship_rotated,p_x,p_y,0,spl\image,spl\x,spl\y,0)
						take_damage(spl\damage)
						spl\dead = True
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 
				If green_buff = True      ; multiply damage by 2 if different color buff
					If ImagesCollide(green_shield_reduced,p_x,p_y,0,spl\image,spl\x,spl\y,0)
						take_damage(spl\damage*2)
						spl\dead = True
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 	

		EndIf
		
		
		; if it dies / dies after off screen
		If spl\y > 768 Or spl\y < -100 Then
			spl\dead = True
		EndIf 
		If spl\x > 1074 Or spl\x < -50 Then
			spl\dead = True
		EndIf 
		
		If spl\dead = True Then
			FreeImage spl\image
			Delete spl
		EndIf 
	Next 
End Function









Function create_side_green_laser(x,y,x_velocity)
	sgl.side_green_laser  = New side_green_laser
	sgl\image = CopyImage(laser_shot_image_green_side)
	sgl\x = (x)
	sgl\y = (y)
	sgl\xspeed = x_velocity*-1
	sgl\dead = False
	sgl\damage = 3
End Function

Function draw_side_green_laser()
	For sgl.side_green_laser = Each side_green_laser
		sgl\x = sgl\x + sgl\xspeed
		DrawImage sgl\image,sgl\x,sgl\y
		
		
		If player_rotated = False 
				If pink_buff = True      ; multiply damage by 2 if different color buff 
					If ImagesCollide(pink_shield_reduced,p_x,p_y,0,sgl\image,sgl\x,sgl\y,0)
						take_damage(sgl\damage*2)
						sgl\dead = True 
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 
				If green_buff = False And pink_buff = False ;without a buff - normal damage
					If ImagesCollide(player_image,p_x,p_y,0,sgl\image,sgl\x,sgl\y,0)
						take_damage(sgl\damage)
						sgl\dead = True
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 
				If green_buff = True	;with same color - no damage
					If ImagesCollide(green_shield_reduced,p_x,p_y,0,sgl\image,sgl\x,sgl\y,0)
						take_damage(sgl\damage/3)
						sgl\dead = True
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 	
		EndIf 
		If player_rotated = True 
				If pink_buff = True      ; multiply damage by 2 if different color buff 
					If ImagesCollide(pink_shield_reduced,p_x,p_y,0,sgl\image,sgl\x,sgl\y,0)
						take_damage(sgl\damage*2)
						sgl\dead = True 
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 
				If green_buff = False And pink_buff = False ;without a buff - normal damage
					If ImagesCollide(ship_rotated,p_x,p_y,0,sgl\image,sgl\x,sgl\y,0)
						take_damage(sgl\damage)
						sgl\dead = True
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 
				If green_buff = True	;with same color - no damage
					If ImagesCollide(green_shield_reduced,p_x,p_y,0,sgl\image,sgl\x,sgl\y,0)
						take_damage(sgl\damage/3)
						sgl\dead = True
						times_hit_by_enemies = times_hit_by_enemies + 1 
					EndIf 
				EndIf 	


		EndIf
		
		
		; if it dies / dies after off screen
		If sgl\y > 768 Or sgl\y < -100 Then
			sgl\dead = True
		EndIf 
		If sgl\x > 1074 Or sgl\x < -50 Then
			sgl\dead = True
		EndIf 
		
		If sgl\dead = True Then
			FreeImage sgl\image
			Delete sgl
		EndIf 
	Next 
End Function





Function create_friendly_protector(x,y,y_velocity,min,max)
	fp.friendly_protector = New friendly_protector
	
	total_protectors = total_protectors - 1

	fp\image = CopyImage(protector_rotated) 
	If min > max Then max = min + 50
	fp\min = min
	fp\max = max
	If x > 0 Or y > 0
		fp\x = x
		fp\y = y
		If x > max Or x < min Then x = 0
	EndIf 
	If x = 0
		fp\x = Rnd(min+10,max-10)
	EndIf 
	If y = 0
		fp\y = -100  
	EndIf                 
	fp\yspeed# = 0-Rnd(y_velocity - (y_velocity/2),y_velocity)
	fp\dead = False
	fp\xspeed = Rnd(-3,3)
	If fp\xspeed = 0 Then fp\xspeed = 1

	fp\shoot_frame = Rnd(150,200)
	fp\shoot_timer = 0
	fp\y_adder = Rnd(0,50)
End Function

Function draw_friendly_protector()
	For fp.friendly_protector = Each friendly_protector
		If fp\y < 110+fp\y_adder
			fp\y = fp\y + (fp\yspeed#/2)
		EndIf 
		
			fp\x = fp\x + fp\xspeed; move left and right 
		
		If fp\x >= (fp\max-10)
			fp\xspeed# = Rnd(-4,-1)
		EndIf
		If fp\x <= (fp\min+10)
			fp\xspeed# = Rnd(1,4)
		EndIf
		
		DrawImage fp\image,fp\x,fp\y
		
		If mode < 100
			fp\shoot_timer = fp\shoot_timer + 1
		EndIf 
		If fp\shoot_timer >= fp\shoot_frame
			create_bullet(fp\x,fp\y,fp\yspeed#,False)
			fp\shoot_timer = 0
		EndIf
		
		
		; death		
		If fp\x < -100 Or fp\x > 1124
			fp\dead = True 
		EndIf
		
		If fp\dead = True 
			For particle_counter = 1 To 8
				create_particle(fp\x,fp\y)
			Next 
			protector_on_screen = protector_on_screen - 1
			protectors_destroyed = protectors_destroyed + 1 
			FreeImage fp\image
			Delete fp
		EndIf 
		
		 
				
	Next 
End Function

Function create_friendly_allied(x,y,y_velocity,min,max)
	fa.friendly_allied = New friendly_allied
	
	total_allied = total_allied - 1

	fa\image = CopyImage(allied_rotated) 
	If min > max Then max = min + 50
	fa\min = min
	fa\max = max
	If x > 0 Or y > 0
		fa\x = x
		fa\y = y
		If x > max Or x < min Then x = 0
	EndIf 
	If x = 0
		fa\x = Rnd(min+10,max-10)
	EndIf 
	If y = 0
		fa\y = -100  
	EndIf                 
	fa\yspeed# = 0-Rnd(y_velocity - (y_velocity/2),y_velocity)
	fa\dead = False
	fa\xspeed = Rnd(-3,3)
	If fa\xspeed = 0 Then fa\xspeed = 1

	fa\shoot_frame = Rnd(150,200)
	fa\shoot_timer = 0
	fa\y_adder = Rnd(0,50)
End Function

Function draw_friendly_allied()
	For fa.friendly_allied = Each friendly_allied
		If fa\y < 110+fa\y_adder
			fa\y = fa\y + (fa\yspeed#/2)
		EndIf 
		
			fa\x = fa\x + fa\xspeed; move left and right 
		
		If fa\x >= (fa\max-10)
			fa\xspeed# = Rnd(-4,-1)
		EndIf
		If fa\x <= (fa\min+10)
			fa\xspeed# = Rnd(1,4)
		EndIf
		
		DrawImage fa\image,fa\x,fa\y
		
		If mode < 100
			fa\shoot_timer = fa\shoot_timer + 1
		EndIf 
		If fa\shoot_timer >= fa\shoot_frame
			create_bullet(fa\x,fa\y,fa\yspeed#,False)
			fa\shoot_timer = 0
		EndIf
		
		
		; death		
		If fa\x < -100 Or fa\x > 1124
			fa\dead = True 
		EndIf
		
		If fa\dead = True 
			For particle_counter = 1 To 8
				create_particle(fa\x,fa\y)
			Next 
			allied_on_screen = allied_on_screen - 1
			allied_destroyed = allied_destroyed + 1 
			FreeImage fa\image
			Delete fa
		EndIf 
		
		 
				
	Next 
End Function





Function create_spin_zapper(x,y,mode,damage#,speed#,health)
	sz.spin_zapper = New spin_zapper
	
	sz\image = CopyImage(boss_3_enemy)
	sz\x_start# = x
	sz\y_start# = y
	sz\disable_right = False 
	sz\movement_speed# = speed#
	sz\health# = health
	sz\health_start = health
	sz\x_dist_from_player = 0
	sz\y_dist_from_player = 0
	sz\shoot_distance# = 200
	sz\shoot_timer = 0
	sz\shoot_damage# = damage#
	sz\x_slop = 5
	sz\y_slop = 3
	sz\shoot_frame = 90
	sz\health_rectangle = 30
	sz\mode = mode
	sz\bomb_timer = 570 + (mode * 30)
	sz\bomb_counter = 0
	sz\angle# = 0
	sz\angle_to_shoot# = 0
	sz\move = 1
	sz\bomb_speed# = Rand(6,10)
	sz\dead = False
	sz\killed = False 
	
	spin_zapper_on_screen = spin_zapper_on_screen + 1
End Function 


Function draw_spin_zapper()
	For sz.spin_zapper = Each spin_zapper
		If sz\mode = 1
			If sz\x_start# < 990 Then sz\x_start# = sz\x_start# + 2
			If sz\y_start# > 90 Then sz\y_start# = sz\y_start# - 1
			
			If sz\x_start# >= 990 And sz\y_start# <= 90 Then sz\mode = 5
		EndIf 
		
		If sz\mode = 2
			If sz\x_start# > 34 Then sz\x_start# = sz\x_start# - 2
			If sz\y_start# < 565 Then sz\y_start# = sz\y_start + 1
			
			If sz\x_start# <= 34 And sz\y_start# >= 565
				sz\mode = 5
				sz\move = 3
			EndIf 
		EndIf 
		
		If sz\mode = 3
			If sz\x_start# > 34 Then sz\x_start# = sz\x_start# - 2
			If sz\y_start# > 90 Then sz\y_start# = sz\y_start - 1
			
			If sz\x_start# <= 34 And sz\y_start# <= 90
				sz\mode = 5
				sz\move = 2
			EndIf 
		EndIf 
		
		If sz\mode = 4
			If sz\x_start# < 990 Then sz\x_start# = sz\x_start# + 2
			If sz\y_start# < 565 Then sz\y_start# = sz\y_start + 1
			
			If sz\x_start# >= 990 And sz\y_start# >= 565
				sz\mode = 5
				sz\move = 4
			EndIf 
		EndIf 
		
		If sz\mode = 5
			If sz\move = 1 
				If sz\x_start# > 34 Then sz\x_start# = sz\x_start# - sz\movement_speed#
				If sz\x_start# <= 34 Then sz\move = 2
			EndIf 
			If sz\move = 2
				If sz\y_start# < 565 Then sz\y_start# = sz\y_start# + sz\movement_speed#
				If sz\y_start# >= 565 Then sz\move = 3
			EndIf
			If sz\move = 3
				If sz\x_start# < 990 Then sz\x_start# = sz\x_start# + sz\movement_speed#
				If sz\x_start# >= 990 Then sz\move = 4
			EndIf
			If sz\move = 4
				If sz\y_start# > 90 Then sz\y_start# = sz\y_start# - sz\movement_speed#
				If sz\y_start# <= 90 Then sz\move = 1
			EndIf
			
			x_dist_from_player = Abs(p_x-sz\x_start)
			y_dist_from_player = Abs(p_y-sz\y_start)
			
			If Sqr((x_dist_from_player * x_dist_from_player) + (y_dist_from_player * y_dist_from_player)) <= sz\shoot_distance#
				If mode < 99 Or mode > 99
					sz\shoot_timer = sz\shoot_timer + 1
					If sz\shoot_timer >= (sz\shoot_frame-20)
						Color 255,60,20
							Line(sz\x_start,sz\y_start,(p_x+sz\x_slop),(p_y+sz\y_slop))
							Line(sz\x_start,sz\y_start,(p_x+sz\x_slop),(p_y+sz\y_slop))
						Color 255,255,255
						take_damage(sz\shoot_damage#/20)
						If sz\shoot_timer >= sz\shoot_frame
							sz\shoot_timer = 0 
							sz\x_slop = Rnd(-8,8)
							sz\y_slop = Rnd(-8,8)
						EndIf 
					EndIf 
				EndIf 
			EndIf 
			
			sz\health_rectangle = (sz\health / sz\health_start) * 30
			Color 255,60,0
			Rect sz\x_start - 15, sz\y_start - 4, sz\health_rectangle, 9, True
			
			If mode < 99 Or mode > 99
				sz\bomb_counter = sz\bomb_counter + 1
				If sz\bomb_counter >= sz\bomb_timer
					x_bomb_dist = p_x - sz\x_start 
					y_bomb_dist = p_y - sz\y_start 
					;tempxdist = x_bomb_dist * x_bomb_dist
					;tempydist = y_bomb_dist * y_bomb_dist
					angle# = ATan2(p_x - sz\x_start,p_y - sz\y_start)
					If mode = 6 Then
						create_vector_bomb(sz\x_start,sz\y_start,50,angle#-90,sz\bomb_speed*.65,240)
					Else 
						create_vector_bomb(sz\x_start,sz\y_start,50,angle#-90,sz\bomb_speed,240)
					EndIf 
					sz\bomb_counter = 0
					sz\bomb_speed# = Rand(6,10)
				EndIf 
			EndIf 
			
			Color 255,255,255
			;Text sz\x_start,sz\y_start,sz\bomb_timer,True,True
			
			
			;specifically for level 3
			
			If mode = 6 And transition < 2 Or enemy_waves_left > 0 Or enemy_on_screen > 0 Then
				DrawImage pink_shield_reduced_more,sz\x_start,sz\y_start
			EndIf
			
			If mode = 6 And transition >= 2 And enemy_waves_left <= 0 And enemy_on_screen <= 0 Then
				For l.laser_bullet = Each laser_bullet	; CHECK FOR LASER HITS
					If ImagesCollide(l\image,l\x,l\y,0,sz\image,sz\x_start,sz\y_start,0) Then 
						sz\health# = sz\health# - l\damage
						l\dead = True
					EndIf 
				Next
			
				For b.bullet_shot = Each bullet_shot	; CHECK FOR BULLET HITS
					If ImagesCollide(b\image,b\x,b\y,0,sz\image,sz\x_start,sz\y_start,0) Then 
						sz\health# = sz\health# - b\damage
						b\dead = True
					EndIf 
				Next
				
				For ls.littleshot = Each littleshot	; CHECK FOR BULLET HITS
					If ImagesCollide(ls\image,ls\x+ls\x_add,ls\y-ls\y_add,0,sz\image,sz\x_start,sz\y_start,0) Then 
						sz\health# = sz\health# - ls\damage
						ls\killed = True
					EndIf 
				Next
				
				For ms.megashot = Each megashot	; CHECK FOR BULLET HITS
					If ImagesCollide(ms\image,ms\x,ms\y,0,sz\image,sz\x_start,sz\y_start,0) Then 
						sz\health# = sz\health# - ms\damage
						ms\killed = True
					EndIf 
				Next
			EndIf 
			
			
			; for all other levels
			If mode < 6 Or mode > 6 Then
				For l.laser_bullet = Each laser_bullet	; CHECK FOR LASER HITS
					If ImagesCollide(l\image,l\x,l\y,0,sz\image,sz\x_start,sz\y_start,0) Then 
						sz\health# = sz\health# - l\damage
						l\dead = True
					EndIf 
				Next
			
				For b.bullet_shot = Each bullet_shot	; CHECK FOR BULLET HITS
					If ImagesCollide(b\image,b\x,b\y,0,sz\image,sz\x_start,sz\y_start,0) Then 
						sz\health# = sz\health# - b\damage
						b\dead = True
					EndIf 
				Next
				
				For ls.littleshot = Each littleshot	; CHECK FOR BULLET HITS
					If ImagesCollide(ls\image,ls\x+ls\x_add,ls\y-ls\y_add,0,sz\image,sz\x_start,sz\y_start,0) Then 
						sz\health# = sz\health# - ls\damage
						ls\killed = True
					EndIf 
				Next
				
				For ms.megashot = Each megashot	; CHECK FOR BULLET HITS
					If ImagesCollide(ms\image,ms\x,ms\y,0,sz\image,sz\x_start,sz\y_start,0) Then 
						sz\health# = sz\health# - ms\damage
						ms\killed = True
					EndIf 
				Next
			EndIf 
			
		EndIf 
				
		
	
		
		DrawImage sz\image,sz\x_start,sz\y_start
		
		If sz\health# < 0 Then
			sz\dead = True
			If sounds = True 
				PlaySound death_sound 
			EndIf 
			For particle_death = 0 To 40
				create_particle(sz\x_start,sz\y_start)
			Next
		EndIf
		
		If sz\dead = True Then
			spin_zapper_on_screen = spin_zapper_on_screen - 1
			FreeImage sz\image
			Delete sz
		EndIf
		

		
		
		
	Next
End Function


Function create_enemy_ship_phaser(x,y,y_velocity,damage#,health#)
	esp.enemy_ship_phaser = New enemy_ship_phaser

	esp\image = CopyImage(enemy) 
	total_enemies = total_enemies - 1
	esp\explode = True 
	esp\health# = health#
	esp\x_slop = Rnd(-8,8)
	esp\y_slop = Rnd(-8,8)
	If x > 0 Or y > 0
		esp\x = x
		esp\y = y
	EndIf 
	If x = 0
		esp\x = Rnd(20,1004)
	EndIf 
	If y = 0
		esp\y = 650 
	EndIf                 
	esp\yspeed# = 0-Rnd(y_velocity - (y_velocity/2),y_velocity)
	esp\dead = False
	esp\xspeed = Rnd(-3,3)
	If esp\xspeed = 0 Then esp\xspeed = 1

	esp\shoot_frame = Rnd(90,150)
	esp\shoot_timer = 0
	esp\y_adder = Rnd(0,50)
	esp\damage# = damage#
End Function

Function draw_enemy_ship_phaser()
	For esp.enemy_ship_phaser = Each enemy_ship_phaser
		If esp\y > 575-esp\y_adder
			esp\y = esp\y + esp\yspeed#
		EndIf 
			
			esp\x = esp\x + esp\xspeed
			
		If esp\x >= 1004
			esp\xspeed# = Rnd(-4,-1)
		EndIf
		If esp\x <= 20
			esp\xspeed# = Rnd(1,4)
		EndIf
		
		DrawImage esp\image,esp\x,esp\y
		
		If mode < 99 Or mode > 99
			esp\shoot_timer = esp\shoot_timer + 1
			If esp\shoot_timer >= (esp\shoot_frame-30)
				If reflector_shield_toggled = False
					Color 255,160,20
						Line(esp\x+6,esp\y-22,(p_x+esp\x_slop),(p_y+esp\y_slop))
						Line(esp\x-6,esp\y-22,(p_x+esp\x_slop),(p_y+esp\y_slop))
					Color 255,255,255
					take_damage(esp\damage#/30)
				EndIf
				If reflector_shield_toggled = True
					Color 0,20,255
						Line(esp\x+6,esp\y-22,(reflector_shield_x+esp\x_slop),(reflector_shield_y+esp\y_slop))
						Line(esp\x-6,esp\y-22,(reflector_shield_x+esp\x_slop),(reflector_shield_y+esp\y_slop))
					Color 255,255,255
					
				EndIf 
				If esp\shoot_timer >= esp\shoot_frame
					esp\shoot_timer = 0 
					esp\x_slop = Rnd(-8,8)
					esp\y_slop = Rnd(-8,8)
					If reflector_shield_toggled = True
						esp\dead = True
					EndIf 
				EndIf 
			EndIf 
		EndIf 
		

		
		For l.laser_bullet = Each laser_bullet	; CHECK FOR LASER HITS
				If ImagesCollide(l\image,l\x,l\y,0,esp\image,esp\x,esp\y,0) Then 
					esp\health# = esp\health# - 10 = True 
					l\dead = True
				EndIf 
		Next
		
		For b.bullet_shot = Each bullet_shot	; CHECK FOR BULLET HITS
			;Text 512,200,b\damage,True,True 
				If ImagesCollide(b\image,b\x,b\y,0,esp\image,esp\x,esp\y,0) Then 
					esp\health# = esp\health# - b\damage
					b\dead = True
				EndIf 
		Next
		
		
		For eb.energy_ball_prot = Each energy_ball_prot	; CHECK FOR ENERGY BALL HITS
				If ImagesCollide(eb\image,eb\x,eb\y,0,esp\image,esp\x,esp\y,0) Then 
					esp\health# = esp\health# - 40
					eb\dead = True
				EndIf 
		Next
		
		;player collision
			If ImagesCollide(player_image,p_x,p_y,0,esp\image,esp\x,esp\y,0)
				esp\dead = True
				take_damage(esp\damage*3)
				times_hit_by_enemies = times_hit_by_enemies + 1  
			EndIf 
		
		If esp\x < -100 Or esp\x > 1124 Or esp\health# <= 0
			esp\dead = True 
		EndIf
		
		
		If esp\dead = True 
			If esp\explode = True 
				For particle_counter = 1 To 8
					create_particle(esp\x,esp\y)
				Next 
			EndIf 
			enemy_on_screen = enemy_on_screen - 1;control how many are on screen at once
			ships_on_screen_1 = ships_on_screen_1 - 1
			FreeImage esp\image
			Delete esp
		EndIf 
				
	Next 
End Function



Function create_bomb(x,y,damage#)
	bombs.enemy_bomb = New enemy_bomb
	bombs\image = CopyImage(bomb)
	bombs\image2 = CopyImage(bomb_almost)
	bombs\damage# = damage#
	bombs\x = x
	bombs\y = y
	bombs\yspeed# = 0
	bombs\radius = Rnd(150,200)
	bombs\radius_increaser = 0
	bombs\frame_explode = Rnd(480,660)
	bombs\frame_counter = 0
	bombs\x_distance = 0
	bombs\y_distance = 0
	bombs\detonate = False 
	bombs\Deleter = False 
	bombs\touched = False 
End Function 

Function draw_bomb()
	For bombs.enemy_bomb = Each enemy_bomb
		If bombs\frame_explode - bombs\frame_counter > 120
			DrawImage bombs\image,bombs\x,bombs\y
		EndIf 
		If bombs\frame_explode - bombs\frame_counter <= 120
			DrawImage bombs\image2,bombs\x,bombs\y
		EndIf 
		
		bombs\frame_counter = bombs\frame_counter + 1
		
		;reflector shield stuff
		If reflector_shield_toggled = True
			If ImagesCollide(reflector_shield,reflector_shield_x,reflector_shield_y,0,bombs\image,bombs\x,bombs\y,0) And bombs\touched = False
				If inertia_down# > 0
					bombs\yspeed# = inertia_down# + 1
				EndIf
				If inertia_up# > 0
					bombs\yspeed# = (inertia_up# + 1) * -1
				EndIf
				bombs\touched = True
			EndIf
			bombs\y = bombs\y + bombs\yspeed#
		EndIf 
		
		If bombs\frame_counter >= bombs\frame_explode 
			bombs\detonate = True
		EndIf  
		
		If ImagesCollide(player_image,p_x,p_y,0,bombs\image,bombs\x,bombs\y,0)
			bombs\detonate = True
		EndIf 

		If bombs\detonate = True
			bombs\radius_increaser = bombs\radius_increaser + 7
			Color 250,180,30
			Oval (bombs\x-(bombs\radius_increaser/2)),(bombs\y-(bombs\radius_increaser/2)),bombs\radius_increaser,bombs\radius_increaser
			Color 255,255,255
			bombs\x_distance = Abs(bombs\x-p_x)
			bombs\y_distance = Abs(bombs\y-p_y)
			
			If Sqr((bombs\x_distance*bombs\x_distance)+(bombs\y_distance*bombs\y_distance)) <= bombs\radius_increaser
				speedmod# = 0
				take_damage(bombs\damage#/23)			
			EndIf 
			
			If bombs\radius_increaser >= bombs\radius
				bombs\deleter = True
			EndIf 
		EndIf 
		
	
		If bombs\Deleter = True 
			FreeImage bombs\image
			Delete bombs
		EndIf 

	Next
End Function








Function create_vector_bomb(x,y,damage#,angle,speed#,frame_explode)
	v_bombs.enemy_v_bomb = New enemy_v_bomb
	v_bombs\image = CopyImage(bomb)
	v_bombs\image2 = CopyImage(bomb_almost)
	v_bombs\damage# = damage#
	v_bombs\x = x
	v_bombs\y = y
	v_bombs\xperm = x
	v_bombs\yperm = y
	v_bombs\xy_radius# = 1
	v_bombs\radius = Rnd(150,200)
	v_bombs\radius_increaser = 0
	v_bombs\frame_explode = frame_explode
	v_bombs\frame_counter = 0
	v_bombs\x_distance = 0
	v_bombs\y_distance = 0
	v_bombs\speed# = speed#
	v_bombs\angle = angle*-1
	v_bombs\detonate = False 
	v_bombs\Deleter = False 
End Function 

Function draw_vector_bomb()
	For v_bombs.enemy_v_bomb = Each enemy_v_bomb
		If v_bombs\frame_explode - v_bombs\frame_counter > 120
			DrawImage v_bombs\image,v_bombs\x,v_bombs\y
		EndIf 
		If v_bombs\frame_explode - v_bombs\frame_counter <= 120
			DrawImage v_bombs\image2,v_bombs\x,v_bombs\y
		EndIf 
		
		v_bombs\frame_counter = v_bombs\frame_counter + 1
		
		If v_bombs\frame_counter >= v_bombs\frame_explode 
			v_bombs\detonate = True
		EndIf  
		
		If ImagesCollide(player_image,p_x,p_y,0,v_bombs\image,v_bombs\x,v_bombs\y,0)
			v_bombs\detonate = True
		EndIf 
		
		If v_bombs\detonate = False
			v_bombs\xy_radius# = v_bombs\xy_radius# + v_bombs\speed#
			v_bombs\x = (v_bombs\xy_radius# * Cos(v_bombs\angle))+v_bombs\xperm
			v_bombs\y = (v_bombs\xy_radius# * Sin(v_bombs\angle))+v_bombs\yperm
		EndIf 
		
		If v_bombs\detonate = True
			v_bombs\radius_increaser = v_bombs\radius_increaser + 7
			Color 250,180,30
			Oval (v_bombs\x-(v_bombs\radius_increaser/2)),(v_bombs\y-(v_bombs\radius_increaser/2)),v_bombs\radius_increaser,v_bombs\radius_increaser
			Color 255,255,255
			v_bombs\x_distance = Abs(v_bombs\x-p_x)
			v_bombs\y_distance = Abs(v_bombs\y-p_y)
			
			If Sqr((v_bombs\x_distance*v_bombs\x_distance)+(v_bombs\y_distance*v_bombs\y_distance)) <= v_bombs\radius_increaser
				speedmod# = 0
				take_damage(v_bombs\damage#/23)			
			EndIf 
			
			If v_bombs\radius_increaser >= v_bombs\radius
				v_bombs\deleter = True
			EndIf 
		EndIf 
		
	
		If v_bombs\Deleter = True 
			FreeImage v_bombs\image
			Delete v_bombs
		EndIf 

	Next
End Function






Function create_enemy_ship_bomb(x,y,y_velocity#,damage#)
	esb.enemy_ship_bomb = New enemy_ship_bomb

	esb\image = CopyImage(enemy) 
	total_enemies = total_enemies - 1
	esb\explode = True 

	
	If x > 0 Or y > 0
		esb\x = x
		esb\y = y
	EndIf 
	If x = 0
		esb\x = Rnd(20,1004)
	EndIf 
	If y = 0
		esb\y = 650 
	EndIf                 
	esb\yspeed# = 0-Rnd(y_velocity# - (y_velocity#/2),y_velocity#)
	esb\dead = False


	esb\deploy_y = Rnd(150,540)
	esb\deployed = False 
	esb\damage# = damage#
	esb\health# = 300
End Function

Function draw_enemy_ship_bomb()
	For esb.enemy_ship_bomb = Each enemy_ship_bomb
		If esb\y > -50
			esb\y = esb\y + esb\yspeed#
		EndIf 
			
			
		
		DrawImage esb\image,esb\x,esb\y
		
		If esb\deploy_y >= esb\y
			If esb\deployed = False 
				create_bomb(esb\x,esb\y,esb\damage#)
				esb\deployed = True
			EndIf 
		EndIf 
		
		

		
		For l.laser_bullet = Each laser_bullet	; CHECK FOR LASER HITS
				If ImagesCollide(l\image,l\x,l\y,0,esb\image,esb\x,esb\y,0) Then 
					esb\health# = esb\health# - 10 
					l\dead = True
				EndIf 
		Next
		
		For b.bullet_shot = Each bullet_shot	; CHECK FOR BULLET HITS
				If ImagesCollide(b\image,b\x,b\y,0,esb\image,esb\x,esb\y,0) Then 
					esb\health# = esb\health# - b\damage
					b\dead = True
				EndIf 
		Next
		
		
		For eb.energy_ball_prot = Each energy_ball_prot	; CHECK FOR ENERGY BALL HITS
				If ImagesCollide(eb\image,eb\x,eb\y,0,esb\image,esb\x,esb\y,0) Then 
					esb\dead = True 
					eb\dead = True
				EndIf 
		Next
		
		;player collision
			If ImagesCollide(player_image,p_x,p_y,0,esb\image,esb\x,esb\y,0)
				esb\dead = True
				If esb\deployed = True 
					take_damage(esb\damage/3)
				EndIf 
				If esb\deployed = False 
					create_bomb(p_x,p_y,esb\damage#)
					take_damage(esb\damage/3)
				EndIf 
				
				times_hit_by_enemies = times_hit_by_enemies + 1  
			EndIf 
		
		If esb\x < -100 Or esb\x > 1124 Or esb\health# <= 0
			esb\dead = True 
		EndIf
		
		If esb\dead = True 
			If esb\explode = True 
				For particle_counter = 1 To 8
					create_particle(esb\x,esb\y)
				Next 
			EndIf 
			enemy_on_screen = enemy_on_screen - 1;control how many are on screen at once
			ships_on_screen_1 = ships_on_screen_1 - 1
			FreeImage esb\image
			Delete esb
		EndIf 
				
	Next 
End Function









Function create_enemy_ship(x,y,y_velocity,damage)
	es.enemy_ship = New enemy_ship

	es\image = CopyImage(enemy) 
	total_enemies = total_enemies - 1
	es\explode = True 

	
	If x > 0 Or y > 0
		es\x = x
		es\y = y
	EndIf 
	If x = 0
		es\x = Rnd(20,1004)
	EndIf 
	If y = 0
		es\y = 650 
	EndIf                 
	es\yspeed# = 0-Rnd(y_velocity - (y_velocity/2),y_velocity)
	es\dead = False
	es\xspeed = Rnd(-3,3)
	If es\xspeed = 0 Then es\xspeed = 1

	es\shoot_frame = Rnd(90,150)
	es\shoot_timer = 0
	es\y_adder = Rnd(0,50)
	es\damage = damage
End Function

Function draw_enemy_ship()
	For es.enemy_ship = Each enemy_ship
		If es\y > 575-es\y_adder
			es\y = es\y + es\yspeed#
		EndIf 
			
			es\x = es\x + es\xspeed
			
		If es\x >= 1004
			es\xspeed# = Rnd(-4,-1)
		EndIf
		If es\x <= 20
			es\xspeed# = Rnd(1,4)
		EndIf
		
		DrawImage es\image,es\x,es\y
		
		es\shoot_timer = es\shoot_timer + 1
		If es\shoot_timer >= es\shoot_frame
			create_enemy_bullet(es\x,es\y,es\yspeed#*-1,es\damage)
			es\shoot_timer = 0 
		EndIf 
		

		
		For l.laser_bullet = Each laser_bullet	; CHECK FOR LASER HITS
				If ImagesCollide(l\image,l\x,l\y,0,es\image,es\x,es\y,0) Then 
					es\dead = True 
					l\dead = True
				EndIf 
		Next
		
		For b.bullet_shot = Each bullet_shot	; CHECK FOR BULLET HITS
				If ImagesCollide(b\image,b\x,b\y,0,es\image,es\x,es\y,0) Then 
					es\dead = True 
					b\dead = True
				EndIf 
		Next
		
		
		For eb.energy_ball_prot = Each energy_ball_prot	; CHECK FOR ENERGY BALL HITS
				If ImagesCollide(eb\image,eb\x,eb\y,0,es\image,es\x,es\y,0) Then 
					es\dead = True 
					eb\dead = True
				EndIf 
		Next
		
		;player collision
			If ImagesCollide(player_image,p_x,p_y,0,es\image,es\x,es\y,0)
				es\dead = True
				take_damage(es\damage*2)
				times_hit_by_enemies = times_hit_by_enemies + 1  
			EndIf 
		
		If es\x < -100 Or es\x > 1124
			es\dead = True 
		EndIf
		
		If es\dead = True 
			If es\explode = True 
				For particle_counter = 1 To 8
					create_particle(es\x,es\y)
				Next 
			EndIf 
			enemy_on_screen = enemy_on_screen - 1;control how many are on screen at once
			ships_on_screen_1 = ships_on_screen_1 - 1
			FreeImage es\image
			Delete es
		EndIf 
				
	Next 
End Function






Function create_enemy_ship_rotator(x,y,y_velocity,damage,health#)
	esr.enemy_ship_rotator = New enemy_ship_rotator

	esr\image = CopyImage(enemy_2) 
	total_enemies = total_enemies - 1
	esr\explode = True 
	esr\health# = health#
	esr\radius = 55
	esr\angle# = Rand(0,359)
	esr\ball_x = 0
	esr\ball_y = 0
	esr\ball_x_2 = 0
	esr\ball_y_2 = 0
	esr\rise# = 0
	esr\run# = 0
	esr\slope# = 0
	
	
	If x > 0 Or y > 0
		esr\x = x
		esr\y = y
	EndIf 
	If x = 0
		esr\x = Rnd(20,1004)
	EndIf 
	If y = 0
		esr\y = 650 
	EndIf                 
	esr\yspeed# = 0-Rnd(y_velocity - (y_velocity/2),y_velocity)
	esr\dead = False
	esr\xspeed = Rnd(-3,3)
	If esr\xspeed = 0 Then esr\xspeed = 1

	esr\shoot_frame = Rnd(10,30)
	esr\shoot_timer = 0
	esr\y_adder = Rnd(0,50)
	esr\damage = damage
End Function

Function draw_enemy_ship_rotator()
	For esr.enemy_ship_rotator = Each enemy_ship_rotator
		If esr\y > 575-esr\y_adder
			esr\y = esr\y + esr\yspeed#
		EndIf 
			
			esr\x = esr\x + esr\xspeed
			
		If esr\x >= 1004
			esr\xspeed# = Rnd(-4,-1)
		EndIf
		If esr\x <= 20
			esr\xspeed# = Rnd(1,4)
		EndIf
		
		DrawImage esr\image,esr\x,esr\y
		DrawImage ball_image,esr\x+esr\ball_x,esr\y-esr\ball_y
		
		Color 0,0,0
		Plot esr\x+esr\ball_x,esr\y-esr\ball_y
		Color 255,255,255
		;DrawImage ball_image,esr\x+esr\ball_x_2,esr\y-esr\ball_y_2
		
		esr\shoot_timer = esr\shoot_timer + 1
		
		If esr\angle# > 360 Then esr\angle# = 0
		
		If esr\shoot_timer <= esr\shoot_frame
			;If esr\angle# > 0 And esr\angle# < 360
				create_enemy_ball(esr\x+esr\ball_x,esr\y-esr\ball_y,esr\angle#,esr\damage)
			;EndIf 
			;create_enemy_ball(esr\x,esr\y,esr\angle#,esr\radius#,esr\damage)
			
		EndIf 
		If esr\shoot_timer >= esr\shoot_frame * 3
			esr\shoot_timer = 0 
		EndIf 
		;Text 512,300,"SLOPE: "+esr\slope#,True,True 

		
		For l.laser_bullet = Each laser_bullet	; CHECK FOR LASER HITS
				If ImagesCollide(l\image,l\x,l\y,0,esr\image,esr\x,esr\y,0) Then 
					esr\health# = esr\health# - 15
					l\dead = True
				EndIf 
		Next
		
		For b.bullet_shot = Each bullet_shot	; CHECK FOR BULLET HITS
				If ImagesCollide(b\image,b\x,b\y,0,esr\image,esr\x,esr\y,0) Then 
					esr\health# = esr\health# - b\damage
					b\dead = True
				EndIf 
		Next
		
		
		
		For eb.energy_ball_prot = Each energy_ball_prot	; CHECK FOR ENERGY BALL HITS
				If ImagesCollide(eb\image,eb\x,eb\y,0,esr\image,esr\x,esr\y,0) Then 
					esr\dead = True 
					eb\dead = True
				EndIf 
		Next
		
		;player collision
			If ImagesCollide(player_image,p_x,p_y,0,esr\image,esr\x,esr\y,0)
				esr\dead = True
				take_damage(esr\damage*2)
				times_hit_by_enemies = times_hit_by_enemies + 1  
			EndIf 
		
		esr\ball_x = (esr\radius# * Cos(esr\angle#))
		esr\ball_y = (esr\radius# * Sin(esr\angle#))
		esr\ball_x_2 = esr\ball_x * -1
		esr\ball_y_2 = esr\ball_y * -1
		
		esr\angle# = esr\angle# + 7
		
		If esr\x < -100 Or esr\x > 1124
			esr\dead = True 
		EndIf
		
		If esr\health# < 1 Then esr\dead = True 

		
		If esr\dead = True 
			If esr\explode = True 
				For particle_counter = 1 To 8
					create_particle(esr\x,esr\y)
				Next 
			EndIf 
			enemy_on_screen = enemy_on_screen - 1;control how many are on screen at once
			ships_on_screen_1 = ships_on_screen_1 - 1
			FreeImage esr\image
			Delete esr
		EndIf 
				
	Next 
End Function







Function create_health_resource(x,y)
	hr.health_resource = New health_resource
	hr\x# = x
	hr\y# = y
	hr\movement_speed# = 0.3
	hr\movement_direction = False
	hr\movement_counter = 0
	hr\image = CopyImage(health_resource_image)
	hr\dead = False
End Function

Function draw_health_resource()
	For hr.health_resource = Each health_resource
		DrawImage hr\image,hr\x#,hr\y#
		hr\movement_counter = hr\movement_counter + 1
		If hr\movement_counter > 60 And hr\movement_direction = False
			hr\movement_direction = True
			hr\movement_counter = 0
		EndIf
		If hr\movement_counter > 60 And hr\movement_direction = True
			hr\movement_direction = False
			hr\movement_counter = 0
		EndIf
		If hr\movement_direction = False
			hr\y# = hr\y# - hr\movement_speed#
		EndIf
		If hr\movement_direction = True
			hr\y# = hr\y# + hr\movement_speed#
		EndIf
		If ImagesCollide(hr\image,hr\x#,hr\y#,0,player_image,p_x,p_y,0)
			armor# = armor# + 500
			hr\dead = True
			kill_resources()
		EndIf
		If hr\dead = True 
			For particle_counter = 1 To 10
				create_particle(hr\x,hr\y)
			Next 
			FreeImage hr\image
			Delete hr
		EndIf
	Next
End Function





Function create_phaser_resource(x,y)
	ph.phaser_resource = New phaser_resource
	ph\x# = x
	ph\y# = y
	ph\movement_speed# = 0.3
	ph\movement_direction = False
	ph\movement_counter = 0
	ph\image = CopyImage(phaser_resource_image)
	ph\dead = False
End Function

Function draw_phaser_resource()
	For ph.phaser_resource = Each phaser_resource
		DrawImage ph\image,ph\x#,ph\y#
		ph\movement_counter = ph\movement_counter + 1
		If ph\movement_counter > 60 And ph\movement_direction = False
			ph\movement_direction = True
			ph\movement_counter = 0
		EndIf
		If ph\movement_counter > 60 And ph\movement_direction = True
			ph\movement_direction = False
			ph\movement_counter = 0
		EndIf
		If ph\movement_direction = False
			ph\y# = ph\y# - ph\movement_speed#
		EndIf
		If ph\movement_direction = True
			ph\y# = ph\y# + ph\movement_speed#
		EndIf
		If ImagesCollide(ph\image,ph\x#,ph\y#,0,player_image,p_x,p_y,0)
			laser# = laser# + 500
			ph\dead = True
			kill_resources()
		EndIf
		If ph\dead = True 
			For particle_counter = 1 To 10
				create_particle(ph\x,ph\y)
			Next 
			FreeImage ph\image
			Delete ph
		EndIf
	Next
End Function






Function create_shield_resource(x,y)
	sh.shield_resource = New shield_resource
	sh\x# = x
	sh\y# = y
	sh\movement_speed# = 0.3
	sh\movement_direction = False
	sh\movement_counter = 0
	sh\image = CopyImage(shield_resource_image)
	sh\dead = False
End Function

Function draw_shield_resource()
	For sh.shield_resource = Each shield_resource
		DrawImage sh\image,sh\x#,sh\y#
		sh\movement_counter = sh\movement_counter + 1
		If sh\movement_counter > 60 And sh\movement_direction = False
			sh\movement_direction = True
			sh\movement_counter = 0
		EndIf
		If sh\movement_counter > 60 And sh\movement_direction = True
			sh\movement_direction = False
			sh\movement_counter = 0
		EndIf
		If sh\movement_direction = False
			sh\y# = sh\y# - sh\movement_speed#
		EndIf
		If sh\movement_direction = True
			sh\y# = sh\y# + sh\movement_speed#
		EndIf
		If ImagesCollide(sh\image,sh\x#,sh\y#,0,player_image,p_x,p_y,0)
			shield# = shield# + 500
			sh\dead = True
			kill_resources()
		EndIf
		If sh\dead = True
			For particle_counter = 1 To 10
				create_particle(sh\x,sh\y)
			Next  
			FreeImage sh\image
			Delete sh
		EndIf
	Next
End Function









Function create_wideshot_resource(x,y)
	ws.wideshot_resource = New wideshot_resource
	ws\x# = x
	ws\y# = y
	ws\movement_speed# = 0.3
	ws\movement_direction = False
	ws\movement_counter = 0
	ws\image = CopyImage(wideshot_resource_image)
	ws\dead = False
End Function

Function draw_wideshot_resource()
	For ws.wideshot_resource = Each wideshot_resource
		DrawImage ws\image,ws\x#,ws\y#
		ws\movement_counter = ws\movement_counter + 1
		If ws\movement_counter > 60 And ws\movement_direction = False
			ws\movement_direction = True
			ws\movement_counter = 0
		EndIf
		If ws\movement_counter > 60 And ws\movement_direction = True
			ws\movement_direction = False
			ws\movement_counter = 0
		EndIf
		If ws\movement_direction = False
			ws\y# = ws\y# - ws\movement_speed#
		EndIf
		If ws\movement_direction = True
			ws\y# = ws\y# + ws\movement_speed#
		EndIf
		If ImagesCollide(ws\image,ws\x#,ws\y#,0,player_image,p_x,p_y,0)
			wideshot_charge = wideshot_charge + 50
			ws\dead = True
			kill_resources()
		EndIf
		If ws\dead = True 
			For particle_counter = 1 To 10
				create_particle(ws\x,ws\y)
			Next 
			FreeImage ws\image
			Delete ws
		EndIf
	Next
End Function









Function create_protection_resource(x,y)
	prot.protection_resource = New protection_resource
	prot\x# = x
	prot\y# = y
	prot\movement_speed# = 0.3
	prot\movement_direction = False
	prot\movement_counter = 0
	prot\image = CopyImage(protection_resource_image)
	prot\dead = False
End Function

Function draw_protection_resource()
	For prot.protection_resource = Each protection_resource
		DrawImage prot\image,prot\x#,prot\y#
		prot\movement_counter = prot\movement_counter + 1
		If prot\movement_counter > 60 And prot\movement_direction = False
			prot\movement_direction = True
			prot\movement_counter = 0
		EndIf
		If prot\movement_counter > 60 And prot\movement_direction = True
			prot\movement_direction = False
			prot\movement_counter = 0
		EndIf
		If prot\movement_direction = False
			prot\y# = prot\y# - prot\movement_speed#
		EndIf
		If prot\movement_direction = True
			prot\y# = prot\y# + prot\movement_speed#
		EndIf
		If ImagesCollide(prot\image,prot\x#,prot\y#,0,player_image,p_x,p_y,0)
			protection_charge = protection_charge + 10
			prot\dead = True
			kill_resources()
		EndIf
		If prot\dead = True 
			For particle_counter = 1 To 10
				create_particle(prot\x,prot\y)
			Next 
			FreeImage prot\image
			Delete prot
		EndIf
	Next
End Function













Function create_megashot_resource(x,y)
	mega.megashot_resource = New megashot_resource
	mega\x# = x
	mega\y# = y
	mega\movement_speed# = 0.3
	mega\movement_direction = False
	mega\movement_counter = 0
	mega\image = CopyImage(megashot_resource_image)
	mega\dead = False
End Function

Function draw_megashot_resource()
	For mega.megashot_resource = Each megashot_resource
		DrawImage mega\image,mega\x#,mega\y#
		mega\movement_counter = mega\movement_counter + 1
		If mega\movement_counter > 60 And mega\movement_direction = False
			mega\movement_direction = True
			mega\movement_counter = 0
		EndIf
		If mega\movement_counter > 60 And mega\movement_direction = True
			mega\movement_direction = False
			mega\movement_counter = 0
		EndIf
		If mega\movement_direction = False
			mega\y# = mega\y# - mega\movement_speed#
		EndIf
		If mega\movement_direction = True
			mega\y# = mega\y# + mega\movement_speed#
		EndIf
		If ImagesCollide(mega\image,mega\x#,mega\y#,0,player_image,p_x,p_y,0)
			megashot_charge = megashot_charge + 5
			mega\dead = True
			kill_resources()
		EndIf
		If mega\dead = True
			For particle_counter = 1 To 10
				create_particle(mega\x,mega\y)
			Next  
			FreeImage mega\image
			Delete mega
		EndIf
	Next
End Function








Function create_inverter_resource(x,y)
	inv.inverter_resource = New inverter_resource
	inv\x# = x
	inv\y# = y
	inv\movement_speed# = 0.3
	inv\movement_direction = False
	inv\movement_counter = 0
	inv\image = CopyImage(inverter_resource_image)
	inv\dead = False
End Function

Function draw_inverter_resource()
	For inv.inverter_resource = Each inverter_resource
		DrawImage inv\image,inv\x#,inv\y#
		inv\movement_counter = inv\movement_counter + 1
		If inv\movement_counter > 60 And inv\movement_direction = False
			inv\movement_direction = True
			inv\movement_counter = 0
		EndIf
		If inv\movement_counter > 60 And inv\movement_direction = True
			inv\movement_direction = False
			inv\movement_counter = 0
		EndIf
		If inv\movement_direction = False
			inv\y# = inv\y# - inv\movement_speed#
		EndIf
		If inv\movement_direction = True
			inv\y# = inv\y# + inv\movement_speed#
		EndIf
		If ImagesCollide(inv\image,inv\x#,inv\y#,0,player_image,p_x,p_y,0)
			phase_inverter_capacity# = phase_inverter_capacity# + 600
			inv\dead = True
			kill_resources()
		EndIf
		If inv\dead = True 
			For particle_counter = 1 To 10
				create_particle(inv\x,inv\y)
			Next 
			FreeImage inv\image
			Delete inv
		EndIf
	Next
End Function



Function kill_resources()
	For hr.health_resource = Each health_resource
		hr\dead = True
	Next
	For ph.phaser_resource = Each phaser_resource
		ph\dead = True
	Next
	For sh.shield_resource = Each shield_resource
		sh\dead = True
	Next
	For ws.wideshot_resource = Each wideshot_resource
		ws\dead = True
	Next
	For prot.protection_resource = Each protection_resource
		prot\dead = True
	Next
	For mega.megashot_resource = Each megashot_resource
		mega\dead = True
	Next
	For inv.inverter_resource = Each inverter_resource
		inv\dead = True
	Next
	nicolle_zoom_away = True
End Function





Function start_music()
		random_music_selection = Rand(1,11)
		If random_music_selection = 1
			level_1_music = LoadSound("sound/path of borealis.mp3")
			SoundVolume level_1_music, music_vol#
			level_1_channel = PlaySound(level_1_music)
		EndIf 
		If random_music_selection = 2
			level_2_music = LoadSound("sound/HL2_song16.mp3")
			SoundVolume level_2_music, music_vol#
			level_2_channel = PlaySound(level_2_music)
		EndIf 
		If random_music_selection = 3
			level_3_music = LoadSound("sound/HL2_song14.mp3")
			SoundVolume level_3_music, music_vol#
			level_3_channel = PlaySound(level_3_music)
		EndIf 
		If random_music_selection = 4
			level_4_music = LoadSound("sound/HL2_song20.mp3")
			SoundVolume level_4_music, music_vol#
			level_4_channel = PlaySound(level_4_music)
		EndIf 
		If random_music_selection = 5
			level_5_music = LoadSound("sound/HL2_song29.mp3")
			SoundVolume level_5_music, music_vol#
			level_5_channel = PlaySound(level_5_music)
		EndIf 
		If random_music_selection = 6
			level_6_music = LoadSound("sound/VLVX_song18.mp3")
			SoundVolume level_6_music, music_vol#
			level_6_channel = PlaySound(level_6_music)
		EndIf 
		If random_music_selection = 7
			level_7_music = LoadSound("sound/VLVX_song21.mp3")
			SoundVolume level_7_music, music_vol#
			level_7_channel = PlaySound(level_7_music)
		EndIf 
		If random_music_selection = 8
			level_8_music = LoadSound("sound/VLVX_song22.mp3")
			SoundVolume level_8_music, music_vol#
			level_8_channel = PlaySound(level_8_music)
		EndIf 
		If random_music_selection = 9
			level_9_music = LoadSound("sound/VLVX_song23.mp3")
			SoundVolume level_9_music, music_vol#
			level_9_channel = PlaySound(level_9_music)
		EndIf 
		If random_music_selection = 10
			level_10_music = LoadSound("sound/VLVX_song24.mp3")
			SoundVolume level_10_music, music_vol#
			level_10_channel = PlaySound(level_10_music)
		EndIf 
		If random_music_selection = 11
			level_11_music = LoadSound("sound/VLVX_song28.mp3")
			SoundVolume level_11_music, music_vol#
			level_11_channel = PlaySound(level_11_music)
		EndIf 
End Function

Function check_music()
		If random_music_selection = 1
			If ChannelPlaying (level_1_channel) = False
				StopChannel level_1_channel
				level_1_channel = PlaySound(level_1_music)
			EndIf 
		EndIf 
		If random_music_selection = 2
			If ChannelPlaying (level_2_channel) = False
				StopChannel level_2_channel
				level_2_channel = PlaySound(level_2_music)
			EndIf 
		EndIf 
		If random_music_selection = 3
			If ChannelPlaying (level_3_channel) = False
				StopChannel level_3_channel
				level_3_channel = PlaySound(level_3_music)
			EndIf 
		EndIf 
		If random_music_selection = 4
			If ChannelPlaying (level_4_channel) = False
				StopChannel level_4_channel
				level_4_channel = PlaySound(level_4_music)
			EndIf 
		EndIf 
		If random_music_selection = 5
			If ChannelPlaying (level_5_channel) = False
				StopChannel level_5_channel
				level_5_channel = PlaySound(level_5_music)
			EndIf 
		EndIf 
		If random_music_selection = 6
			If ChannelPlaying (level_6_channel) = False
				StopChannel level_6_channel
				level_6_channel = PlaySound(level_6_music)
			EndIf 
		EndIf 
		If random_music_selection = 7
			If ChannelPlaying (level_7_channel) = False
				StopChannel level_7_channel
				level_7_channel = PlaySound(level_7_music)
			EndIf 
		EndIf 
		If random_music_selection = 8
			If ChannelPlaying (level_8_channel) = False
				StopChannel level_8_channel
				level_8_channel = PlaySound(level_8_music)
			EndIf 
		EndIf 
		If random_music_selection = 9
			If ChannelPlaying (level_9_channel) = False
				StopChannel level_9_channel
				level_9_channel = PlaySound(level_9_music)
			EndIf 
		EndIf 
		If random_music_selection = 10
			If ChannelPlaying (level_10_channel) = False
				StopChannel level_10_channel
				level_10_channel = PlaySound(level_10_music)
			EndIf 
		EndIf 
		If random_music_selection = 11
			If ChannelPlaying (level_11_channel) = False
				StopChannel level_11_channel
				level_11_channel = PlaySound(level_11_music)
			EndIf 
		EndIf 
End Function 

Function fade_out_music()
		If change_volume_count >= 4
			If ChannelPlaying(level_1_channel) = True 
				ChannelVolume level_1_channel, out_of_game_volume#
			EndIf 
			If ChannelPlaying(level_2_channel) = True 
				ChannelVolume level_2_channel, out_of_game_volume#
			EndIf 
			If ChannelPlaying(level_3_channel) = True 
				ChannelVolume level_3_channel, out_of_game_volume#
			EndIf 
			If ChannelPlaying(level_4_channel) = True 
				ChannelVolume level_4_channel, out_of_game_volume#
			EndIf 
			If ChannelPlaying(level_5_channel) = True 
				ChannelVolume level_5_channel, out_of_game_volume#
			EndIf 
			If ChannelPlaying(level_6_channel) = True 
				ChannelVolume level_6_channel, out_of_game_volume#
			EndIf 
			If ChannelPlaying(level_7_channel) = True 
				ChannelVolume level_7_channel, out_of_game_volume#
			EndIf 
			If ChannelPlaying(level_8_channel) = True 
				ChannelVolume level_8_channel, out_of_game_volume#
			EndIf 
			If ChannelPlaying(level_9_channel) = True 
				ChannelVolume level_9_channel, out_of_game_volume#
			EndIf 
			If ChannelPlaying(level_10_channel) = True 
				ChannelVolume level_10_channel, out_of_game_volume#
			EndIf 
			If ChannelPlaying(level_11_channel) = True 
				ChannelVolume level_11_channel, out_of_game_volume#
			EndIf 
			
			
			If out_of_game_volume# > 0
				out_of_game_volume# = out_of_game_volume# - .01
			EndIf 
			change_volume_count = 0
		EndIf 
End Function

Function free_music()

	If random_music_selection = 1
		StopChannel level_1_channel
		FreeSound level_1_music
	EndIf 
	If random_music_selection = 2
		StopChannel level_2_channel
		FreeSound level_2_music
	EndIf 
	If random_music_selection = 3
		StopChannel level_3_channel
		FreeSound level_3_music
	EndIf 
	If random_music_selection = 4
		StopChannel level_4_channel
		FreeSound level_4_music
	EndIf 
	If random_music_selection = 5
		StopChannel level_5_channel
		FreeSound level_5_music
	EndIf 
	If random_music_selection = 6
		StopChannel level_6_channel
		FreeSound level_6_music
	EndIf 
	If random_music_selection = 7
		StopChannel level_7_channel
		FreeSound level_7_music
	EndIf 
	If random_music_selection = 8
		StopChannel level_8_channel
		FreeSound level_8_music
	EndIf 
	If random_music_selection = 9
		StopChannel level_9_channel
		FreeSound level_9_music
	EndIf 
	If random_music_selection = 10
		StopChannel level_10_channel
		FreeSound level_10_music
	EndIf 
	If random_music_selection = 11
		StopChannel level_11_channel
		FreeSound level_11_music
	EndIf 

End Function 

Function resume_current_music()
		If random_music_selection = 1
			ResumeChannel level_1_channel
		EndIf 
		If random_music_selection = 2
			ResumeChannel level_2_channel
		EndIf 
		If random_music_selection = 3
			ResumeChannel level_3_channel
		EndIf 
		If random_music_selection = 4
			ResumeChannel level_4_channel
		EndIf 
		If random_music_selection = 5
			ResumeChannel level_5_channel
		EndIf 
		If random_music_selection = 6
			ResumeChannel level_6_channel
		EndIf 
		If random_music_selection = 7
			ResumeChannel level_7_channel
		EndIf 
		If random_music_selection = 8
			ResumeChannel level_8_channel
		EndIf  
		If random_music_selection = 9
			ResumeChannel level_9_channel
		EndIf 
		If random_music_selection = 10
			ResumeChannel level_10_channel
		EndIf 
		If random_music_selection = 11
			ResumeChannel level_11_channel
		EndIf  
End Function 


Function place_x(x,y)
	Line x-15,y-15,x+15,y+14
	Line x+15,y-15,x-15,y+14
End Function 

Function create_achievement(x,y,words1$,words2$,words3$)
ach.achievement = New achievement 
If x = 0 And y = 0
	ach\x = Rnd(100,924)
	ach\y = 800
EndIf 
	ach\words1$ = words1$
	ach\words2$ = words2$
	ach\words3$ = words3$
End Function

Function draw_achievement()
	For ach.achievement = Each achievement
		ach\y = ach\y - 1
		Color 0,0,0
		Rect ach\x-100,ach\y-40,200,80,True
		Color 255,255,255
		Rect ach\x-100,ach\y-40,200,80,False 
		Text ach\x,ach\y-30,"ACHIEVEMENT UNLOCKED:",True,True 
		Text ach\x,ach\y-10,ach\words1$,True,True 
		Text ach\x,ach\y+10,ach\words2$,True,True 
		Text ach\x,ach\y+30,ach\words3$,True,True 
		
		
		
		; if it dies after off screen
		If ach\y < -100 Then
			Delete ach
		EndIf 
	Next 
End Function