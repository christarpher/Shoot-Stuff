Include "variables.bb"

Function save_game(game_to_save)
	If game_to_save = 1
		fileout = WriteFile("save/save1.dat")
	EndIf 
	If game_to_save = 2
		fileout = WriteFile("save/save2.dat")
	EndIf 
	If game_to_save = 3
		fileout = WriteFile("save/save3.dat")
	EndIf 
	
	;*************************************************
	;                ACHIEVEMENTS
	WriteByte(fileout, achievement_1_unlocked)
	WriteByte(fileout, achievement_2_unlocked)
	WriteByte(fileout, achievement_3_unlocked)
	WriteByte(fileout, achievement_4_unlocked) 
	WriteByte(fileout, achievement_5_unlocked)
	WriteByte(fileout, achievement_6_unlocked) 
	WriteByte(fileout, achievement_7_unlocked) 
	WriteByte(fileout, achievement_8_unlocked) 
	WriteByte(fileout, achievement_9_unlocked) 
	WriteByte(fileout, achievement_10_unlocked) 
	WriteByte(fileout, achievement_11_unlocked)  
	WriteByte(fileout, achievement_12_unlocked) 
	WriteByte(fileout, achievement_13_unlocked)   
	WriteByte(fileout, achievement_14_unlocked)  
	WriteByte(fileout, achievement_15_unlocked) 
	WriteByte(fileout, achievement_16_unlocked)  
	WriteByte(fileout, achievement_17_unlocked) 
	WriteByte(fileout, achievement_18_unlocked) 
	WriteInt(fileout, token_counter_1)
	WriteByte(fileout, unlock_level_3_ach) 
	WriteByte(fileout, laser_ach) 
	WriteByte(fileout, shield_ach)  
	WriteByte(fileout, nothing_ach)  
	WriteByte(fileout, armor_ach) 
	
	;*************************************************
	;      GLOBAL OPTIONS / SOUND COUNT VARIABLES  
	WriteFloat(fileout, music_vol#)
	WriteFloat(fileout, sound_effects_vol#)
	WriteFloat(fileout, inertia_sensitivity#)
	
	
	;*************************************************
	;                ABOUT THE PLAYER
	WriteFloat(fileout, speedmod#)
	WriteInt(fileout, tokens)
	WriteInt(fileout, megashot_damage)
	WriteInt(fileout, littleshot_damage)
	WriteInt(fileout, extra_talents)
	WriteByte(fileout, hardcore)
	WriteByte(fileout, unlock_hardcore)
	WriteInt(fileout, talents_available)
	WriteInt(fileout, level_completed)
	
	;*************************************************
	;        GET KEYS / COUNTERS / TALENT VARIABLES
	
	WriteInt(fileout, bullet_counter) 
	WriteFloat(fileout, laser_mod#)
	WriteFloat(fileout, standard_shot_damage_increaser#)
	WriteInt(fileout, random_asteroid) 
	WriteInt(fileout, destroyable_on_screen)
	WriteInt(fileout, bullet_counter_summon)
	WriteByte(fileout, flush_keys)
	WriteFloat(fileout, inertia_down#)
	WriteFloat(fileout, inertia_up#)
	WriteFloat(fileout, inertia_left#)
	WriteFloat(fileout, inertia_right#)
	WriteFloat(fileout, start_inertia_down#)
	WriteFloat(fileout, start_inertia_up#)
	WriteFloat(fileout, start_inertia_left#)
	WriteFloat(fileout, start_inertia_right#)
	WriteFloat(fileout, ship_scale#) 
	WriteFloat(fileout, wideshot_speed_increase#) 
	WriteInt(fileout, wideshot_duration_time)
	WriteFloat(fileout, actual_wideshot_speed_increase#)
	WriteInt(fileout, wideshot_speed_increase_counter) 
	WriteFloat(fileout, laser_drain#) 
	WriteFloat(fileout, laser_crit_talent#)
	WriteFloat(fileout, shield_mod#)
	WriteFloat(fileout, laser_and_phaser_talent#)
	WriteFloat(fileout, energy_ball_damage_increase#) 
	WriteFloat(fileout, no_armor_damage_reducer#) 
	WriteFloat(fileout, damage_reduction#) 
	WriteFloat(fileout, shield_armor_increaser#) 
	WriteFloat(fileout, hull_integrity_increase#) 
	WriteFloat(fileout, wideshot_force_chance#) 
	WriteFloat(fileout, extra_protection_ships#) 
	WriteFloat(fileout, protection_percentage#) 
	WriteFloat(fileout, additional_supplies_shield_increaser#) 
	WriteFloat(fileout, megashot_damage_increase#)
	WriteInt(fileout, megashot_percentage)
	WriteFloat(fileout, phase_inverter_time_added#) 
	WriteFloat(fileout, chance_to_crit#) 
	WriteByte(fileout, wideshot_forced)
	WriteFloat(fileout, crit_after_megashot_addition#) 
	WriteFloat(fileout, time_after_megashot#) 
	WriteFloat(fileout, phaser_increaser#) 
	WriteFloat(fileout, phase_time_talent#)
	WriteInt(fileout, phase_talent)
	WriteByte(fileout, check_phase_talent_shields)
	WriteFloat(fileout, phase_time_talent_unchanged#) 
	WriteByte(fileout, check_megashot_talent_phasers)
	WriteInt(fileout, phaser_talent_megashot_addition) 
	WriteByte(fileout, create_protection_no_armor)
	WriteInt(fileout, create_protection_no_armor_counter)
	WriteFloat(fileout, shield_addition#) 
	WriteFloat(fileout, shield_bar_length#)
	WriteFloat(fileout, capacitor_crit_add#)
	WriteFloat(fileout, damage_reduction_armor_upgrade#) 
	WriteInt(fileout, coin_counter)
	WriteInt(fileout, coin_addition) 
	WriteByte(fileout, down_key)
	WriteByte(fileout, up_key) 
	WriteByte(fileout, Left_key)
	WriteByte(fileout, right_key) 
	WriteByte(fileout, protection_clicked)
	
	
	
	;*************************************************
	;          USED FOR MODE 94 (ship configuration)
	WriteByte(fileout, a_protection)
	WriteByte(fileout, a_laser)
	WriteByte(fileout, a_shield)
	WriteByte(fileout, a_wideshot)
	WriteByte(fileout, a_megashot)
	WriteByte(fileout, a_phase_inverter)
	WriteByte(fileout, s_protection)
	WriteByte(fileout, s_laser)
	WriteByte(fileout, s_shield)
	WriteByte(fileout, s_wideshot)
	WriteByte(fileout, s_megashot)
	WriteByte(fileout, s_phase_inverter)
	WriteByte(fileout, d_protection)
	WriteByte(fileout, d_laser)
	WriteByte(fileout, d_shield)
	WriteByte(fileout, d_wideshot)
	WriteByte(fileout, d_megashot) 
	WriteByte(fileout, d_phase_inverter)
	WriteByte(fileout, make_sound) 
	WriteByte(fileout, config_mouse_over)
	WriteFloat(fileout, inertia_box_x#)
	WriteInt(fileout, inertia_box_y)
	WriteFloat(fileout, speed_box_x#)
	WriteInt(fileout, speed_box_y)
	WriteByte(fileout, hull_generator_unlocked)
	WriteByte(fileout, laser_capacitor_unlocked)
	WriteByte(fileout, life_support_generator_unlocked)
	WriteByte(fileout, laser_generator_unlocked)
	WriteByte(fileout, shield_generator_unlocked)
	WriteByte(fileout, hull_generator_2_unlocked)
	WriteByte(fileout, laser_capacitor_2_unlocked)
	WriteByte(fileout, life_support_generator_2_unlocked)
	WriteByte(fileout, laser_generator_2_unlocked)
	WriteByte(fileout, shield_generator_2_unlocked)
	WriteByte(fileout, hull_generator_3_unlocked)
	WriteByte(fileout, laser_capacitor_3_unlocked)
	WriteByte(fileout, life_support_generator_3_unlocked)
	WriteByte(fileout, laser_generator_3_unlocked)
	WriteByte(fileout, shield_generator_3_unlocked)
	WriteByte(fileout, nuclear_fission_unlocked) 
	WriteByte(fileout, reactive_shielding_unlocked) 
	WriteByte(fileout, protective_backup_unlocked)
	WriteByte(fileout, energy_split_unlocked) 
	WriteByte(fileout, partial_phase_unlocked)
	WriteByte(fileout, hull_generator)
	WriteByte(fileout, laser_capacitor)
	WriteByte(fileout, life_support_generator)
	WriteByte(fileout, laser_generator)
	WriteByte(fileout, shield_generator)
	WriteByte(fileout, nuclear_fission)
	WriteByte(fileout, reactive_shielding)
	WriteByte(fileout, protective_backup) 
	WriteByte(fileout, energy_split)
	WriteByte(fileout, partial_phase)
	WriteInt(fileout, generator_counter)
	WriteByte(fileout, autoshoot) 
	WriteByte(fileout, ticked)
	
	
	
	;*************************************************
	;          USED FOR MODE 1 (MAIN SCREEN)
	WriteInt(fileout, save_slot_number)
	WriteFloat(fileout, box_x#)
	WriteInt(fileout, box_y)
	WriteFloat(fileout, sound_box_x#)
	WriteInt(fileout, sound_box_y)
	
	
	
	;*************************************************
	;          USED FOR MODE 2 (TALENT SCREEN)
	WriteByte(fileout, laser_unlock)
	WriteByte(fileout, shield_unlock)
	WriteByte(fileout, protection_unlock)
	WriteByte(fileout, nuke_unlock)
	WriteByte(fileout, megashot_unlock)
	WriteByte(fileout, phase_inverter_unlock)
	WriteInt(fileout, total_talents_spent)
	WriteInt(fileout, laser_spent)
	WriteInt(fileout, shield_spent)
	WriteInt(fileout, protection_spent)
	WriteInt(fileout, nuke_spent)
	WriteInt(fileout, megashot_spent)
	WriteInt(fileout, phase_inverter_spent)
	WriteInt(fileout, talent_1_spent)
	WriteInt(fileout, talent_2_spent)
	WriteInt(fileout, talent_3_spent)
	WriteInt(fileout, talent_4_spent)
	WriteInt(fileout, talent_5_spent)
	WriteInt(fileout, talent_6_spent)
	WriteInt(fileout, talent_7_spent)
	WriteInt(fileout, talent_8_spent)
	WriteInt(fileout, talent_9_spent)
	WriteInt(fileout, talent_10_spent)
	WriteInt(fileout, talent_11_spent)
	WriteInt(fileout, talent_12_spent)
	WriteInt(fileout, talent_13_spent)
	WriteInt(fileout, talent_14_spent)
	WriteInt(fileout, talent_15_spent)
	WriteInt(fileout, talent_16_spent)
	WriteInt(fileout, talent_17_spent)
	WriteInt(fileout, talent_18_spent)
	WriteInt(fileout, talent_19_spent)
	WriteInt(fileout, talent_20_spent)
	WriteInt(fileout, talent_21_spent)
	WriteInt(fileout, talent_22_spent)
	WriteInt(fileout, talent_23_spent)
	WriteInt(fileout, talent_24_spent)
	
	
	
	
	
	CloseFile(fileout)
End Function



Function load_game(game_to_load)
	If game_to_load = 1
		fileout = ReadFile("save/save1.dat")
	EndIf 
	If game_to_load = 2
		fileout = ReadFile("save/save2.dat")
	EndIf 
	If game_to_load = 3
		fileout = ReadFile("save/save3.dat")
	EndIf 
	
	
	;*************************************************
	;                ACHIEVEMENTS
	achievement_1_unlocked = ReadByte(fileout)
	achievement_2_unlocked = ReadByte(fileout)
	achievement_3_unlocked = ReadByte(fileout)
	achievement_4_unlocked = ReadByte(fileout)  
	achievement_5_unlocked = ReadByte(fileout) 
	achievement_6_unlocked = ReadByte(fileout)  
	achievement_7_unlocked = ReadByte(fileout) 
	achievement_8_unlocked = ReadByte(fileout) 
	achievement_9_unlocked = ReadByte(fileout) 
	achievement_10_unlocked = ReadByte(fileout) 
	achievement_11_unlocked = ReadByte(fileout)  
	achievement_12_unlocked = ReadByte(fileout) 
	achievement_13_unlocked = ReadByte(fileout)   
	achievement_14_unlocked = ReadByte(fileout)  
	achievement_15_unlocked = ReadByte(fileout) 
	achievement_16_unlocked = ReadByte(fileout)  
	achievement_17_unlocked = ReadByte(fileout) 
	achievement_18_unlocked = ReadByte(fileout)
	token_counter_1 = ReadInt(fileout) 
	unlock_level_3_ach = ReadByte(fileout) 
	laser_ach = ReadByte(fileout) 
	shield_ach = ReadByte(fileout)  
	nothing_ach = ReadByte(fileout)  
	armor_ach = ReadByte(fileout) 
	
	;*************************************************
	;      GLOBAL OPTIONS / SOUND COUNT VARIABLES  
	music_vol# = ReadFloat(fileout)
	sound_effects_vol# = ReadFloat(fileout)
	inertia_sensitivity# = ReadFloat(fileout)
	
	
	;*************************************************
	;                ABOUT THE PLAYER
	speedmod# = ReadFloat(fileout)
	tokens = ReadInt(fileout) 
	megashot_damage = ReadInt(fileout) 
	littleshot_damage = ReadInt(fileout) 
	extra_talents = ReadInt(fileout) 
	hardcore = ReadByte(fileout) 
	unlock_hardcore = ReadByte(fileout)
	talents_available = ReadInt(fileout) 
	level_completed = ReadInt(fileout) 
	
	;*************************************************
	;        GET KEYS / COUNTERS / TALENT VARIABLES
	
	bullet_counter = ReadInt(fileout)  
	laser_mod# = ReadFloat(fileout) 
	standard_shot_damage_increaser# = ReadFloat(fileout)
	random_asteroid = ReadInt(fileout)  
	destroyable_on_screen = ReadInt(fileout) 
	bullet_counter_summon = ReadInt(fileout) 
	flush_keys = ReadByte(fileout)
	inertia_down# = ReadFloat(fileout)
	inertia_up# = ReadFloat(fileout)
	inertia_left# = ReadFloat(fileout)
	inertia_right# = ReadFloat(fileout)
	start_inertia_down# = ReadFloat(fileout)
	start_inertia_up# = ReadFloat(fileout)
	start_inertia_left# = ReadFloat(fileout)
	start_inertia_right# = ReadFloat(fileout)
	ship_scale# = ReadFloat(fileout) 
	wideshot_speed_increase# = ReadFloat(fileout) 
	wideshot_duration_time = ReadInt(fileout)
	actual_wideshot_speed_increase# = ReadFloat(fileout)
	wideshot_speed_increase_counter = ReadInt(fileout)  
	laser_drain# = ReadFloat(fileout) 
	laser_crit_talent# = ReadFloat(fileout)
	shield_mod# = ReadFloat(fileout)
	laser_and_phaser_talent# = ReadFloat(fileout)
	energy_ball_damage_increase# = ReadFloat(fileout)
	no_armor_damage_reducer# = ReadFloat(fileout) 
	damage_reduction# = ReadFloat(fileout) 
	shield_armor_increaser# = ReadFloat(fileout) 
	hull_integrity_increase# = ReadFloat(fileout)
	wideshot_force_chance# = ReadFloat(fileout) 
	extra_protection_ships# = ReadFloat(fileout) 
	protection_percentage# = ReadFloat(fileout) 
	additional_supplies_shield_increaser# = ReadFloat(fileout) 
	megashot_damage_increase# = ReadFloat(fileout)
	megashot_percentage = ReadInt(fileout) 
	phase_inverter_time_added# = ReadFloat(fileout) 
	chance_to_crit# = ReadFloat(fileout) 
	wideshot_forced = ReadByte(fileout) 
	crit_after_megashot_addition# = ReadFloat(fileout) 
	time_after_megashot# = ReadFloat(fileout) 
	phaser_increaser# = ReadFloat(fileout) 
	phase_time_talent# = ReadFloat(fileout)
	phase_talent = ReadInt(fileout) 
	check_phase_talent_shields = ReadByte(fileout) 
	phase_time_talent_unchanged# = ReadFloat(fileout) 
	check_megashot_talent_phasers = ReadByte(fileout) 
	phaser_talent_megashot_addition = ReadInt(fileout)  
	create_protection_no_armor = ReadByte(fileout)
	create_protection_no_armor_counter = ReadInt(fileout) 
	shield_addition# = ReadFloat(fileout) 
	shield_bar_length# = ReadFloat(fileout)
	capacitor_crit_add# = ReadFloat(fileout)
	damage_reduction_armor_upgrade# = ReadFloat(fileout) 
	coin_counter = ReadInt(fileout) 
	coin_addition = ReadInt(fileout)  
	down_key = ReadByte(fileout) 
	up_key = ReadByte(fileout) 
	Left_key = ReadByte(fileout)
	right_key = ReadByte(fileout) 
	protection_clicked = ReadByte(fileout)
	
	
	
	;*************************************************
	;          USED FOR MODE 94 (ship configuration)
	a_protection = ReadByte(fileout)
	a_laser = ReadByte(fileout)
	a_shield = ReadByte(fileout)
	a_wideshot = ReadByte(fileout)
	a_megashot = ReadByte(fileout)
	a_phase_inverter = ReadByte(fileout)
	s_protection = ReadByte(fileout)
	s_laser = ReadByte(fileout)
	s_shield = ReadByte(fileout)
	s_wideshot = ReadByte(fileout)
	s_megashot = ReadByte(fileout)
	s_phase_inverter = ReadByte(fileout)
	d_protection = ReadByte(fileout)
	d_laser = ReadByte(fileout)
	d_shield = ReadByte(fileout)
	d_wideshot = ReadByte(fileout)
	d_megashot = ReadByte(fileout) 
	d_phase_inverter = ReadByte(fileout)
	make_sound = ReadByte(fileout) 
	config_mouse_over = ReadByte(fileout)
	inertia_box_x# = ReadFloat(fileout)
	inertia_box_y = ReadInt(fileout) 
	speed_box_x# = ReadFloat(fileout)
	speed_box_y = ReadInt(fileout) 
	hull_generator_unlocked = ReadByte(fileout)
	laser_capacitor_unlocked = ReadByte(fileout)
	life_support_generator_unlocked = ReadByte(fileout)
	laser_generator_unlocked = ReadByte(fileout)
	shield_generator_unlocked = ReadByte(fileout)
	hull_generator_2_unlocked = ReadByte(fileout)
	laser_capacitor_2_unlocked = ReadByte(fileout)
	life_support_generator_2_unlocked = ReadByte(fileout)
	laser_generator_2_unlocked = ReadByte(fileout)
	shield_generator_2_unlocked = ReadByte(fileout)
	hull_generator_3_unlocked = ReadByte(fileout)
	laser_capacitor_3_unlocked = ReadByte(fileout)
	life_support_generator_3_unlocked = ReadByte(fileout)
	laser_generator_3_unlocked = ReadByte(fileout)
	shield_generator_3_unlocked = ReadByte(fileout) 
	nuclear_fission_unlocked = ReadByte(fileout)
	reactive_shielding_unlocked = ReadByte(fileout) 
	protective_backup_unlocked = ReadByte(fileout)
	energy_split_unlocked = ReadByte(fileout) 
	partial_phase_unlocked = ReadByte(fileout) 
	hull_generator = ReadByte(fileout)
	laser_capacitor = ReadByte(fileout)
	life_support_generator = ReadByte(fileout)
	laser_generator = ReadByte(fileout)
	shield_generator = ReadByte(fileout)
	nuclear_fission = ReadByte(fileout)
	reactive_shielding = ReadByte(fileout)
	protective_backup = ReadByte(fileout) 
	energy_split = ReadByte(fileout) 
	partial_phase = ReadByte(fileout) 
	generator_counter = ReadInt(fileout)  
	autoshoot = ReadByte(fileout) 
	ticked = ReadByte(fileout)
	
	
	
	;*************************************************
	;          USED FOR MODE 1 (MAIN SCREEN)
	save_slot_number = ReadInt(fileout) 
	box_x# = ReadFloat(fileout)
	box_y = ReadInt(fileout) 
	sound_box_x# = ReadFloat(fileout)
	sound_box_y = ReadInt(fileout) 
	
	
	
	;*************************************************
	;          USED FOR MODE 2 (TALENT SCREEN)
	laser_unlock = ReadByte(fileout)
	shield_unlock = ReadByte(fileout)
	protection_unlock = ReadByte(fileout)
	nuke_unlock = ReadByte(fileout)
	megashot_unlock = ReadByte(fileout)
	phase_inverter_unlock = ReadByte(fileout)
	total_talents_spent = ReadInt(fileout)
	laser_spent = ReadInt(fileout) 
	shield_spent = ReadInt(fileout) 
	protection_spent = ReadInt(fileout) 
	nuke_spent = ReadInt(fileout) 
	megashot_spent = ReadInt(fileout) 
	phase_inverter_spent = ReadInt(fileout) 
	talent_1_spent = ReadInt(fileout) 
	talent_2_spent = ReadInt(fileout) 
	talent_3_spent = ReadInt(fileout) 
	talent_4_spent = ReadInt(fileout) 
	talent_5_spent = ReadInt(fileout) 
	talent_6_spent = ReadInt(fileout) 
	talent_7_spent = ReadInt(fileout) 
	talent_8_spent = ReadInt(fileout) 
	talent_9_spent = ReadInt(fileout) 
	talent_10_spent = ReadInt(fileout) 
	talent_11_spent = ReadInt(fileout) 
	talent_12_spent = ReadInt(fileout) 
	talent_13_spent = ReadInt(fileout) 
	talent_14_spent = ReadInt(fileout) 
	talent_15_spent = ReadInt(fileout) 
	talent_16_spent = ReadInt(fileout) 
	talent_17_spent = ReadInt(fileout) 
	talent_18_spent = ReadInt(fileout) 
	talent_19_spent = ReadInt(fileout) 
	talent_20_spent = ReadInt(fileout) 
	talent_21_spent = ReadInt(fileout) 
	talent_22_spent = ReadInt(fileout) 
	talent_23_spent = ReadInt(fileout) 
	talent_24_spent = ReadInt(fileout) 
	
	
		
	CloseFile(fileout)
End Function