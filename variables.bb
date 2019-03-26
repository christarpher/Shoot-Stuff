
Const debug = True

Global littleshots = 0
Const levels_available = 5
Const locked_levels = 6
Global dumb_mode = False

;*************************************************
;                ACHIEVEMENTS
Global achievement_1_unlocked = False 
Global achievement_2_unlocked = False 
Global achievement_3_unlocked = False 
Global achievement_4_unlocked = False  
Global achievement_5_unlocked = False 
Global achievement_6_unlocked = False 
Global achievement_7_unlocked = False 
Global achievement_8_unlocked = False 
Global achievement_9_unlocked = False 
Global achievement_10_unlocked = False 
Global achievement_11_unlocked = False 
Global achievement_12_unlocked = False 
Global achievement_13_unlocked = False  
Global achievement_14_unlocked = False 
Global achievement_15_unlocked = False 
Global achievement_16_unlocked = False 
Global achievement_17_unlocked = False 
Global achievement_18_unlocked = False 
Global token_counter_1 = 0
Global unlock_level_3_ach = False 
Global laser_ach = True
Global shield_ach = True 
Global nothing_ach = True 
Global armor_ach = True  




;*************************************************
;      GLOBAL OPTIONS / SOUND COUNT VARIABLES

Const fix = False 
Global quit = False 
Global fileout = 0
Global load_counter_error = 200
Global load_counter_success = 200
Global save_counter_success = 200
Global play_once = 0
Global laser_pulse_count = 0
Global shield_pulse_count = 0
Global death_sound_count = 0
Global boss_1_death_sound = 0
Global boss_2_death_sound = 0
Global boss_3_death_sound = 0
Global boss_4_death_sound = 0
Global boss_5_death_sound = 0
Global main_screen_roll_over_repeat = 0
Global level_select_roll_over_repeat = 0
Global armor_gone_counter = 0
Global health_gone_counter = 0
Global level_3_explode_counter = 0
Global out_of_game_volume# = 1.0
Global change_volume_count = 0
Global died_at_mode = 0
Global random_music_selection = 0
Global sounds = True
Global music_vol# = 1.00
Global sound_effects_vol# = 1.00
Global inertia_sensitivity# = 1.25

;*************************************************
;                DISPLAYED ON HUD
Global score=0
Global killed=0
Global times_hit = 0

;*************************************************
;                ABOUT THE PLAYER
Global health#=1000
Global armor#=2000
Global shield#=1000
Global laser#=1000
Global wideshot_charge# = 100
Global protection_charge# = 20
Global megashot_charge# = 10
Global phase_inverter_capacity# = 1200
Global phase_inverter_trigger = False 

Global p_x#=512,p_y#=100
Global speedmod# = 8
Global speedmod_min = 2
Global speedmod_max# = 8
Global tokens = 25

Global megashot_damage = 500
Global littleshot_damage = 15
Global extra_talents = 0
Global hardcore = False  
Global unlock_hardcore = False 
Global do_once_death = 0
Global health_percent = 0
Global armor_percent = 0
Global laser_percent = 0
Global shield_percent = 0
Global phase_inverter_percent = 0
Global asteroids_destroyed = 0
Global times_hit_by_asteroid = 0
Global times_hit_by_enemies = 0
Global total_bullets = 0
Global player_rotated = False 
Global pink_buff = False 
Global green_buff = False 
Global talents_available = 0
Global level_completed = 0

If debug = True Then tokens = 5000

If debug = True 
	talents_available = 100
EndIf

If debug = False
	talents_available = 0
EndIf 

If debug = True 
	level_completed = levels_available
EndIf 

If debug = False 
	level_completed = 0
EndIf 




;*************************************************
;        GET KEYS / COUNTERS / TALENT VARIABLES

Global bullet_counter = 0
Global laser_mod# = 0
Global standard_shot_damage_increaser# = 0
Global random_asteroid = 0
Global destroyable_on_screen = 0
Global bullet_counter_summon = 0
Global flush_keys = True 
Global inertia_down# = 0
Global inertia_up# = 0
Global inertia_left# = 0
Global inertia_right# = 0
Global start_inertia_down# = 0
Global start_inertia_up# = 0
Global start_inertia_left# = 0
Global start_inertia_right# = 0
Global ship_scale# = 1.0
Global wideshot_speed_increase# = 1
Global wideshot_duration_time = 0
Global actual_wideshot_speed_increase# = 1
Global wideshot_speed_increase_counter = 0
Global laser_drain# = 1
Global laser_crit_talent# = 0
Global shield_mod# = 1
Global laser_and_phaser_talent# = 0
Global energy_ball_damage_increase# = 1
Global no_armor_damage_reducer# = 0
Global damage_reduction# = 0
Global shield_armor_increaser# = 0
Global hull_integrity_increase# = 0
Global wideshot_force_chance# = 0
Global extra_protection_ships# = 0
Global protection_percentage# = 100
Global additional_supplies_shield_increaser# = 0
Global megashot_damage_increase# = 1
Global megashot_percentage = 0
Global phase_inverter_time_added# = 0
Global chance_to_crit# = 0
Global wideshot_forced = False 
Global crit_after_megashot_addition# = 0
Global time_after_megashot# = 0
Global phaser_increaser# = 0
Global phase_time_talent# = 0
Global phase_talent = False 
Global check_phase_talent_shields = False 
Global phase_time_talent_unchanged# = 0
Global check_megashot_talent_phasers = False 
Global phaser_talent_megashot_addition = 0
Global create_protection_no_armor = False 
Global create_protection_no_armor_counter = 0
Global shield_addition# = 0
Global shield_bar_length# = 0
Global capacitor_crit_add# = 0
Global damage_reduction_armor_upgrade# = 0.00
Global coin_counter = 0
Global coin_addition = 0
Global down_key = False
Global up_key = False
Global Left_key = False
Global right_key = False 
Global protection_clicked = False 
Global wideshot_shooting = False 


;*************************************************
;                    OPTIONS

Global credits = False
Global alwaysdown = False
Global controls = False
Global particle_limiter = True 
Global particle_count = 0
Global particle_amount = 8
Global paused = False 
Global current_mode = 1

;*************************************************
;          USED FOR MODE 100 (LEVEL COMPLETE)
Global done_hover_stats = False 
Global win_hit_e = times_hit_by_enemies
Global win_hit_a = times_hit_by_asteroid


;*************************************************
;          USED FOR MODE 99 (LOSE)
Global done_hover_lose = False

;*************************************************
;          USED FOR MODE 98 (REFUELING STATION)
Global done_hover_station = False

Const talent_cost = 50
Const phaser_acc_cost = 10
Const reactive_shielding_acc_cost = 20
Const protective_backup_acc_cost = 25
Const energy_split_acc_cost = 10
Const nuclear_fission_acc_cost = 10
Const partial_phase_acc_cost = 20

Const hull_generator_cost = 10
Const laser_capacitor_cost = 5
Const life_support_generator_cost = 10
Const laser_generator_cost = 10
Const shield_generator_cost = 10 

Const hull_generator_2_cost = 15
Const laser_capacitor_2_cost = 10
Const life_support_generator_2_cost = 15
Const laser_generator_2_cost = 15
Const shield_generator_2_cost = 15 

Const hull_generator_3_cost = 20
Const laser_capacitor_3_cost = 15
Const life_support_generator_3_cost = 20
Const laser_generator_3_cost = 20
Const shield_generator_3_cost = 20 



Global talents_mouse_over = False 
Global hull_generator_mouse_over = False
Global laser_capacitor_mouse_over = False
Global life_support_generator_mouse_over = False
Global laser_generator_mouse_over = False
Global shield_generator_mouse_over = False 
Global hull_generator_2_mouse_over = False
Global laser_capacitor_2_mouse_over = False
Global life_support_generator_2_mouse_over = False
Global laser_generator_2_mouse_over = False
Global shield_generator_2_mouse_over = False 
Global hull_generator_3_mouse_over = False
Global laser_capacitor_3_mouse_over = False
Global life_support_generator_3_mouse_over = False
Global laser_generator_3_mouse_over = False
Global shield_generator_3_mouse_over = False 
Global nuclear_fission_mouse_over = False
Global reactive_shielding_mouse_over = False
Global protective_backup_mouse_over = False
Global energy_split_mouse_over = False
Global partial_phase_mouse_over = False 

Global name_buy$ = ""
Global line1_buy$ = ""
Global line2_buy$ = ""
Global line3_buy$ = ""
Global line4_buy$ = ""
Global line5_buy$ = ""
Global line6_buy$ = ""
Global line7_buy$ = ""

Global already_full_counter = 121
Global not_enough_tokens = 121
Global not_unlocked = 121

;*************************************************
;          USED FOR MODE 97 (TUTORIAL)
Global done_hover_tutorial = False 
Global tutorial_mode = 1
Global laser_spent_before = 0
Global shield_spent_before = 0
Global protection_spent_before = 0
Global nuke_spent_before = 0
Global wideshot_time_before# = 0
Global protection_time_before# = 0
Global health_before = 0
Global armor_before = 0
Global shield_before# = 0
Global laser_before = 0
Global tokens_before = 0
Global level_before = 0
Global experience_before = 0
Global talents_available_before = 0
Global tutorial_status = False 
Global tutorial_counter = 0
Global tutorial_next = False 
Global behind_line_y = 70
Global switch_dir = False 



;*************************************************
;          USED FOR MODE 95 (achievements)

Global done_hover_achievement = False 
Global achievement_name$ = ""
Global achievement_line_1$ = ""
Global achievement_line_2$ = ""
Global achievement_line_3$ = ""
Global achievement_line_4$ = ""
Global achievement_line_5$ = ""


;*************************************************
;          USED FOR MODE 94 (ship configuration)


Global a_protection = False
Global a_laser = False
Global a_shield = False
Global a_wideshot = True
Global a_megashot = False 
Global a_phase_inverter = False 

Global s_protection = False
Global s_laser = False
Global s_shield = False
Global s_wideshot = False
Global s_megashot = False 
Global s_phase_inverter = False 

Global d_protection = False
Global d_laser = False
Global d_shield = False
Global d_wideshot = False
Global d_megashot = False 
Global d_phase_inverter = False 

Global make_sound = False 
Global config_mouse_over = False 


Global inertia_box_x# = 445
Global inertia_box_y = 70
Global speed_box_x# = 650
Global speed_box_y = 70


Global hull_generator_unlocked = False
Global laser_capacitor_unlocked = False
Global life_support_generator_unlocked = False
Global laser_generator_unlocked = False
Global shield_generator_unlocked = False

Global hull_generator_2_unlocked = False
Global laser_capacitor_2_unlocked = False
Global life_support_generator_2_unlocked = False
Global laser_generator_2_unlocked = False
Global shield_generator_2_unlocked = False

Global hull_generator_3_unlocked = False
Global laser_capacitor_3_unlocked = False
Global life_support_generator_3_unlocked = False
Global laser_generator_3_unlocked = False
Global shield_generator_3_unlocked = False

Global nuclear_fission_unlocked = False
Global reactive_shielding_unlocked = False
Global protective_backup_unlocked = False
Global energy_split_unlocked = False
Global partial_phase_unlocked = False 


Global hull_generator = False
Global laser_capacitor = False
Global life_support_generator = False
Global laser_generator = False
Global shield_generator = False 
Global nuclear_fission = False 
Global reactive_shielding = False
Global protective_backup = False
Global energy_split = False
Global partial_phase = False 

Global generator_counter = 0
Global autoshoot = False 
Global ticked = False 

Global color_changer = 255
Global color_changer_switcher = True
Global must_unlock_first_counter = 0
Global must_buy_accessory_first_counter = 0
;*************************************************
;          USED FOR MODE 1 (MAIN SCREEN)
Global inverse1 = 0 ;color title
Global inverse2 = 0 ;color title
Global inverse3 = 0 ;color title
Global color1 = 0 ;color title
Global color2 = 0 ;color title
Global color3 = 0 ;color title
Global mode = 1
Global main_mouse_over = False 
Global unlock_hardcore_counter = 200
Global clicked = False  
Global save_slot_number = 1
Global mouse_over_1 = False
Global mouse_over_2 = False
Global mouse_over_3 = False 
Global box_x# = 300
Global box_y = 505

Global sound_box_x# = 300
Global sound_box_y = 460
;*************************************************
;          USED FOR MODE 2 (TALENT SCREEN)

Global laser_unlock = False
Global shield_unlock = False
Global protection_unlock = False
Global nuke_unlock = False
Global megashot_unlock = False
Global phase_inverter_unlock = False

Global no_green = False 

Global total_talents_spent = 0
Global ability_talents_spent = 0
Global side_a_talents_spent = 0
Global side_b_talents_spent = 0

Const laser_avail = 1
Const shield_avail = 1
Const protection_avail = 1
Const nuke_avail = 1
Const megashot_avail = 1
Const phase_inverter_avail = 1

Global laser_spent = 0
Global shield_spent = 0
Global protection_spent = 0
Global nuke_spent = 0
Global megashot_spent = 0
Global phase_inverter_spent = 0

Const laser_req = 5
Const shield_req = 5
Const protection_req = 10
Const nuke_req = 0
Const megashot_req = 10
Const phase_inverter_req = 15

Const laser_x = 400
Const shield_x = 525
Const megashot_x = 650
Const protection_x = 775
Const phase_inverter_x = 900

Const laser_y = 110
Const shield_y = 110
Const megashot_y = 110
Const protection_y = 110
Const phase_inverter_y = 110

Global talent_name$ = ""
Global talent_line1$ = ""
Global talent_line2$ = ""
Global talent_line3$ = ""
Global talent_line4$ = ""
Global talent_line5$ = ""
Global talent_line6$ = ""
Global talent_line7$ = ""
Global talent_line8$ = ""
Global talent_line9$ = ""
Global mouse_over = False 
Global talent_done = False 

;available number of talents you can spend in a talent
Const talent_1_avail = 3
Const talent_2_avail = 3
Const talent_3_avail = 2
Const talent_4_avail = 2
Const talent_5_avail = 3
Const talent_6_avail = 3
Const talent_7_avail = 2
Const talent_8_avail = 3
Const talent_9_avail = 2
Const talent_10_avail = 3
Const talent_11_avail = 4
Const talent_12_avail = 3
Const talent_13_avail = 4
Const talent_14_avail = 2
Const talent_15_avail = 4
Const talent_16_avail = 3
Const talent_17_avail = 3
Const talent_18_avail = 2
Const talent_19_avail = 3
Const talent_20_avail = 4
Const talent_21_avail = 2
Const talent_22_avail = 2
Const talent_23_avail = 3
Const talent_24_avail = 4

;how many talents you have put in to a certain talent
Global talent_1_spent = 0
Global talent_2_spent = 0
Global talent_3_spent = 0
Global talent_4_spent = 0
Global talent_5_spent = 0
Global talent_6_spent = 0
Global talent_7_spent = 0
Global talent_8_spent = 0
Global talent_9_spent = 0
Global talent_10_spent = 0
Global talent_11_spent = 0
Global talent_12_spent = 0
Global talent_13_spent = 0
Global talent_14_spent = 0
Global talent_15_spent = 0
Global talent_16_spent = 0
Global talent_17_spent = 0
Global talent_18_spent = 0
Global talent_19_spent = 0
Global talent_20_spent = 0
Global talent_21_spent = 0
Global talent_22_spent = 0
Global talent_23_spent = 0
Global talent_24_spent = 0

; talents required to have spent get to a certain talent
Const talent_1_req = 0
Const talent_2_req = 0
Const talent_3_req = 0
Const talent_4_req = 0
Const talent_5_req = 5
Const talent_6_req = 5
Const talent_7_req = 5
Const talent_8_req = 5
Const talent_9_req = 5
Const talent_10_req = 10
Const talent_11_req = 20
Const talent_12_req = 10
Const talent_13_req = 20
Const talent_14_req = 10
Const talent_15_req = 20
Const talent_16_req = 10
Const talent_17_req = 10
Const talent_18_req = 15
Const talent_19_req = 15
Const talent_20_req = 15
Const talent_21_req = 15
Const talent_22_req = 15
Const talent_23_req = 10
Const talent_24_req = 20


Const talent_1_x = 400
Const talent_2_x = 566
Const talent_3_x = 732
Const talent_4_x = 900
Const talent_5_x = 400
Const talent_6_x = 525
Const talent_7_x = 650
Const talent_8_x = 775
Const talent_9_x = 900
Const talent_10_x = 900
Const talent_11_x = 400
Const talent_12_x = 400
Const talent_13_x = 566
Const talent_14_x = 500
Const talent_15_x = 732
Const talent_16_x = 700
Const talent_17_x = 800
Const talent_18_x = 400
Const talent_19_x = 525
Const talent_20_x = 650
Const talent_21_x = 775
Const talent_22_x = 900
Const talent_23_x = 600
Const talent_24_x = 900


Const talent_1_y = 215
Const talent_2_y = 215
Const talent_3_y = 215
Const talent_4_y = 215
Const talent_5_y = 290
Const talent_6_y = 290
Const talent_7_y = 290
Const talent_8_y = 290
Const talent_9_y = 290
Const talent_10_y = 365
Const talent_11_y = 515
Const talent_12_y = 365
Const talent_13_y = 515
Const talent_14_y = 365
Const talent_15_y = 515
Const talent_16_y = 365
Const talent_17_y = 365
Const talent_18_y = 440
Const talent_19_y = 440
Const talent_20_y = 440
Const talent_21_y = 440
Const talent_22_y = 440
Const talent_23_y = 365
Const talent_24_y = 515


Const talent_box_size = 50


;*************************************************
;          USED FOR MODE 3 (LEVEL SELECT SCREEN)

Global zone_counter = 0
Global zone_down = False 
Global level_select_done = False 

Global zone_1_x = 25, zone_1_y = 25
Global zone_2_x = 25, zone_2_y = 25
Global zone_3_x = 25, zone_3_y = 25
Global zone_4_x = 25, zone_4_y = 25
Global zone_5_x = 25, zone_5_y = 25
Global zone_6_x = 25, zone_6_y = 25
Global zone_7_x = 25, zone_7_y = 25
Global zone_8_x = 25, zone_8_y = 25
Global zone_9_x = 25, zone_9_y = 25
Global zone_10_x = 25, zone_10_y = 25

Global zone_name$ = ""
Global zone_line1$ = ""
Global zone_line2$ = ""
Global zone_line3$ = ""
Global zone_line4$ = ""
Global zone_line5$ = ""
Global zone_line6$ = ""
Global zone_line7$ = ""
Global zone_line8$ = ""
Global zone_line9$ = ""
Global zone_mouse_over = False 
Global zone_1_mouse_over = False 
Global zone_2_mouse_over = False 
Global zone_3_mouse_over = False 
Global zone_4_mouse_over = False 
Global zone_5_mouse_over = False 
Global zone_6_mouse_over = False 
Global zone_7_mouse_over = False 
Global zone_8_mouse_over = False 
Global zone_9_mouse_over = False 
Global zone_10_mouse_over = False 



;*************************************************
;          USED FOR MODE 4 (FIRST LEVEL)
Global amount_of_asteroid_to_win = 750
Global ships_on_screen_1 = 0
Global asteroid_counter = 15
Global count_up = 0
Global asteroid_total = 0

;*************************************************
;          USED FOR MODE 5 (SECOND LEVEL)
Global level_2_boss_frame = 0
Global asteroid_left_side = 15
Global asteroid_right_side = 1010
Global boss_1_bullet_counter = 0
Global asteroid_level_2_velocity = 10
Global diretion_change_count = 0
Global boss_1_x = 512
Global boss_1_y = 600
Global change_boss_1_direction = False
Global boss_1_health# = 7000
Global asteroid_x_speed_count = 0


;*************************************************
;          USED FOR MODE 6 (THIRD LEVEL)
Global enemy_waves_left = 5
Global total_amt_per_wave = 0
Global asteroid_until_other_wave = 0
Global ships_at_once = 30
Global damage_done_by_enemy = 10
Global transition = 0
Global do_once = 0
Global spin_zapper_on_screen = 0
Global text_on_screen_time = 300
Global text_counter = 0
;Global enemy_on_screen = 0
;Global count_up = 0 

;*************************************************
;          USED FOR MODE 7 (FOURTH LEVEL)
Global green_boss_x = 950
Global green_boss_y = 525
Global pink_boss_x = 74
Global pink_boss_y = 525
Global green_buff_x = 30
Global green_buff_y = 90
Global pink_buff_x = 594
Global pink_buff_y = 90
Global boss_2_phase = 1
Global shoot_green_counter = 0
Global shoot_pink_counter = 0
Global pink_active = False
Global green_active = True 
Global current_player_position = 0
Global get_position_counter = 0
Global shoot_laser_counter = 0
Global color_switch_counter = 0
Global total_switches = 0
Global green_side_y = 80
Global pink_side_y = 590
Global dont_switch = False 
Global deactivate_switch = False 
Global random_color = 0
Global shoot_laser_counter_b = 0
Global get_position_counter_b = 0
Global current_player_position_b = 0
Global reset_pink_pos = False
Global reset_green_pos = False 
Global green_boss_health# = 50000
Global pink_boss_health# = 50000
Global green_dead_counter = 0
Global pink_dead_counter = 0
Global ball_y = 550
Global armor_tick = 0
Global get_y_pink = 100
Global get_y_green = 130
Global spawn_add_count = 0

;*************************************************
;          USED FOR MODE 8 (FIFTH LEVEL)
Global allied_on_screen = 0
Global protector_on_screen = 0
Global allied_counter = 0
Global protector_counter = 0
Global enemy_counter = 0
Global enemy_on_screen = 0
Global total_allied = 800
Global total_protectors = 800
Global total_enemies = 2300
Global count_timer = 10
Global on_screen = 15
Global friendly_count_timer = 15
Global friendly_on_screen = 5
Global random_side_laser = Rnd(200,500)
Global side_laser_count = 0
Global side_laser_often = Rnd(0,600)
Global side_laser_chooser = Rand(0,1)
Global how_long = 30


;*************************************************
;          USED FOR MODE 9 (SIXTH LEVEL)

Global boss_3_x = 512
Global boss_3_y = 550
Global boss_random_movement_interval = Rnd(300,500)
Global boss_random_movement_counter = 0
Global boss_3_move_left = False
Global boss_3_move_right = True
Global boss_3_movement_paused = False
Global boss_3_health# = 150000
Global boss_3_health_max# = boss_3_health#
Global boss_3_health_percentage# = 100
Global boss_3_phase = 1
Global boss_3_phase_counter = 0
Global boss_3_phase_interval = 1200
Global boss_3_bomb_launch_counter = 0
Global boss_3_bomb_launch_interval = 120
Global boss_3_angle# = 0
Global boss_3_sweep_angle# = 0
Global boss_3_sweep_down = False
Global boss_3_laser_counter = 0
Global boss_3_laser_interval = 4
Global boss_3_bomb_sweep_counter = 0
Global boss_3_bomb_sweep_interval = 25
Global boss_3_add_counter = 0
Global boss_3_add_interval = 180
Global boss_3_add_random = Rnd(1,5)
Global reflector_shield_toggled = True
Global reflector_shield_x = p_x
Global reflector_shield_y = p_y+40
Global void_zone_target_x = 0
Global void_zone_target_y = 0
Global void_zone_target_counter = 0
Global void_zone_target_interval = 300
Global capture_player_coordinates = 0
Global draw_targeting_reticle = False
Global boss_3_blow_up_void_zone = False 
Global boss_3_color_changer_counter = 0
Global boss_3_color_changer = False
Global draw_void_zone_explosion = False
Global ship_disabled = False
Global ship_disabled_counter = 0
Global nicolle_fly_by_counter = 0
Global nicolle_fly_by_interval = 1800
Global nicolle_fly_by_counter_2 = 0
Global nicolle_x = -100
Global nicolle_y = 100
Global nicolle_zoom_away = False 
Global create_health = False
Global create_phaser = False
Global create_shield = False
Global create_protection = False
Global create_wideshot = False
Global create_megashot = False
Global damage_increment_counter = 0
Global damage_increment_interval = 15
Global damage_increment_percentage# = 1.00







;*************************************************
;          USED FOR DEBUG 

Global debug_x = 512
Global debug_y = 200
Global debug_angle# = 45
Global debug_angle_adder# = 1
Global debug_temp# = 0
Global debug_sinb# = 0
Global debus_sinc# = 0
Global debug_tether# = 65
Global debug_tether_squared# = 0
Global debug_sinb_squared# = 0
Global debug_sinc_squared# = 0
Global debug_x_speed = 2
Global debug_y_speed = 2
Global debug_object_x = 0
Global debug_object_y = 0