Type asteroid
	Field image
	Field x#,y#
	Field yspeed#
	Field xspeed#
	Field health#
	Field dead
	Field random_asteroid
	Field experience
	Field damage
	Field random_split
	Field sound 
End Type

Type asteroid_chunk
	Field image
	Field x#,y#
	Field xspeed#,yspeed#
	Field dead
	Field killed 
	Field level
	Field random_asteroid
	Field sound 
End Type 

Type achievement
	Field x,y
	Field words1$,words2$,words3$
End Type 



Type spin_zapper
	Field x_start#,y_start#

	Field mode
	Field move
	Field movement_speed#
	Field health#
	Field health_start
	Field x_dist_from_player,y_dist_from_player
	Field shoot_distance#
	Field shoot_timer
	Field shoot_damage#
	Field x_slop, y_slop
	Field shoot_frame
	Field health_rectangle
	Field image
	Field dead
	Field disable_right
	Field angle_to_shoot#
	Field bomb_timer
	Field bomb_counter
	Field x_bomb_dist, y_bomb_dist
	Field angle#
	Field bomb_speed#
	Field killed
End Type 


Type enemy_ship
	Field image
	Field x,y
	Field yspeed#,xspeed
	Field dead
	Field experience
	Field shoot_frame
	Field shoot_timer 
	Field y_adder
	Field explode 
	Field damage
End Type

Type enemy_bomb
	Field image
	Field image2
	Field touched
	Field x,y
	Field yspeed#
	Field damage#
	Field detonate
	Field frame_explode
	Field frame_counter
	Field radius
	Field radius_increaser
	Field x_distance, y_distance
	Field deleter
End Type

Type enemy_v_bomb
	Field image
	Field image2
	Field x,y,xperm,yperm
	Field damage#
	Field detonate
	Field frame_explode
	Field frame_counter
	Field radius
	Field radius_increaser
	Field x_distance, y_distance
	Field angle,speed#,xy_radius#
	Field touched
	Field deleter
End Type

Type enemy_ship_phaser
	Field image
	Field x,y
	Field yspeed#,xspeed
	Field dead
	Field shoot_frame
	Field shoot_timer
	Field player_x,player_y
	Field y_adder
	Field x_slop,y_slop
	Field explode 
	Field damage#
	Field health#
End Type

Type enemy_ship_bomb
	Field image
	Field x,y
	Field yspeed#
	Field dead
	
	Field deploy_y
	Field deployed
	Field explode
	Field damage#
	Field health#
End Type


Type enemy_ship_rotator
	Field image
	Field x,y
	Field health#
	Field yspeed#,xspeed
	Field dead
	Field experience
	Field shoot_frame
	Field shoot_timer 
	Field y_adder
	Field explode 
	Field damage
	
	Field ball_x
	Field ball_y
	Field ball_x_2
	Field ball_y_2
	Field rise#
	Field run#
	Field slope#
	Field radius#
	Field angle#
End Type


Type protection
	Field image
	Field x#,y#
	Field y_speed#,x_speed#
	Field dead
	Field shoot_frame
	Field shoot_timer 
	Field y_adder
	Field retreat
	Field time
End Type


Type no_armor_protection
	Field image
	Field x#,y#
	Field y_speed#,x_speed#
	Field dead
	Field shoot_frame
	Field shoot_timer 
	Field y_adder
	Field retreat
	Field time
	Field retreat_timer
End Type

Type megashot
	Field image
	Field x#, y#
	Field angle#
	Field radius#
	Field y_velocity
	Field rotated
	Field x_add#, y_add#
	Field dead
	Field killed
	Field damage
	Field more
	Field fission_counter
	Field fission_angle
	Field reverse_direction
End Type

Type littleshot
	Field image
	Field x#, y#
	Field angle#
	Field radius#
	Field x_add#, y_add#
	Field dead
	Field killed
	Field rotated
	Field damage
	Field chain
	Field speed#
End Type


Type bounce_ball
	Field image
	Field x#,y#
	Field damage#
	Field Deleter
	Field hits
	Field y_velocity#
	
	Field temp_angle#
	Field temp_x#,temp_y#
	Field temp_radius#
	Field temp_distance#
	Field temp_x_velocity#, temp_y_velocity#

	Field perm_angle#
	Field perm_x#,perm_y#
	Field perm_radius#
	Field perm_distance# 
	Field perm_x_velocity#, perm_y_velocity#
	
	Field closest_x#,closest_y#
	
End Type 

Type friendly_protector
	Field image
	Field x,y
	Field yspeed#,xspeed
	Field dead
	Field shoot_frame
	Field shoot_timer 
	Field y_adder
	Field min,max
End Type

Type friendly_allied
	Field image
	Field x,y
	Field yspeed#,xspeed
	Field dead
	Field shoot_frame
	Field shoot_timer 
	Field y_adder
	Field min,max
End Type

Type health_pickup
	Field image
	Field x,y
	Field yspeed
End Type

Type armor_pickup
	Field image
	Field x,y
	Field yspeed
End Type

Type laser_pickup
	Field image 
	Field x,y
	Field yspeed
End Type

Type shield_pickup
	Field image
	Field x,y
	Field yspeed
End Type

Type nuke_pickup
	Field image
	Field x,y
	Field yspeed
End Type

Type repel_pickup
	Field image
	Field x,y
	Field yspeed
End Type




Type wideshot_pickup
	Field image
	Field x,y
	Field yspeed
End Type

Type protection_pickup
	Field image
	Field x,y
	Field yspeed
End Type


Type coin_pickup
	Field image
	Field x,y
	Field dead
	Field yspeed
	Field frame
	Field frame_speed
End Type



Type laser_bullet
    Field image
	Field x,y
	Field yspeed
	Field dead
	Field damage
End Type

Type bullet_shot
    Field image
	Field x,y
	Field yspeed
	Field dead
	Field damage
	Field crit#
	Field crit_strike
	Field wideshot_random
End Type

Type bullet_shot_allied
    Field image
	Field x,y
	Field yspeed
	Field dead
	Field damage
End Type

Type bullet_shot_protector
    Field image
	Field x,y
	Field yspeed
	Field dead
	Field damage
End Type

Type energy_ball_prot
    Field image
	Field x,y
	Field yspeed#
	Field dead
	Field damage
End Type


Type enemy_bullet_shot
    Field image
	Field x,y
	Field yspeed
	Field dead
	Field damage
	Field level
End Type

Type enemy_ball_shot
    Field image
	Field x,y
	Field yspeed
	Field dead
	Field damage
	Field level
	Field angle#
	Field radius#
	Field x_add, y_add
	Field touched
End Type

Type heat_seeking
	Field image
	Field x#,y#
	Field dead
	Field damage
	Field i_up#, i_down#, i_left#, i_right#
End Type

Type green_laser
	Field x,y
	Field image
	Field yspeed
	Field dead
	Field damage
End Type 

Type pink_laser
	Field x,y
	Field image
	Field yspeed
	Field dead
	Field damage
End Type 

Type side_pink_laser
	Field x,y
	Field image
	Field xspeed
	Field dead
	Field damage
End Type 

Type side_green_laser
	Field x,y
	Field image
	Field xspeed
	Field dead
	Field damage
End Type 

Type energy_ball
    Field image
	Field x#,y#
	Field yspeed#
	Field xspeed#
	Field dead
End Type

Type space_dust
	Field x#,y#
	Field yspeed#
End Type 

Type particle
	Field x#,y#
	Field xv#,yv#
	Field colour
	Field time
End Type


Type health_resource
	Field x#,y#
	Field movement_speed#
	Field movement_direction
	Field movement_counter
	Field image
	Field dead
End Type

Type phaser_resource
	Field x#,y#
	Field movement_speed#
	Field movement_direction
	Field movement_counter
	Field image
	Field dead
End Type

Type shield_resource
	Field x#,y#
	Field movement_speed#
	Field movement_direction
	Field movement_counter
	Field image
	Field dead
End Type

Type wideshot_resource
	Field x#,y#
	Field movement_speed#
	Field movement_direction
	Field movement_counter
	Field image
	Field dead
End Type

Type megashot_resource
	Field x#,y#
	Field movement_speed#
	Field movement_direction
	Field movement_counter
	Field image
	Field dead
End Type

Type protection_resource
	Field x#,y#
	Field movement_speed#
	Field movement_direction
	Field movement_counter
	Field image
	Field dead
End Type

Type inverter_resource
	Field x#,y#
	Field movement_speed#
	Field movement_direction
	Field movement_counter
	Field image
	Field dead
End Type