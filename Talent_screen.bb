Include "variables.bb"
Include "functions.bb"

Function display_talents()
	;shot all boxes at the side
	Rect 20,127,290,180,False ; description box
	Rect 20,100,290,20,False ; talent name box
	Rect 20,20,190,20,False ; available talents box
	Rect 20,45,190,20,False ; talents spent box
	Rect 390,100,570,70,False ;box surrounding abilites
	Rect 390,205,570,370,False ;box surrounding talents
	
	Text 115,22,"Talents available: "+talents_available,True
	Text 115,47,"Total Talents spent: "+total_talents_spent,True
	
	Text 165,102,talent_name$,True,False  
	Text 25,130,talent_line1$,False
	Text 25,150,talent_line2$,False
	Text 25,170,talent_line3$,False
	Text 25,190,talent_line4$,False
	Text 25,210,talent_line5$,False
	Text 25,230,talent_line6$,False
	Text 25,250,talent_line7$,False
	Color 0,255,0
	If no_green = True
		Color 255,255,255
	EndIf 
	Text 25,270,talent_line8$,False
	Color 255,255,255
	Text 25,290,talent_line9$,False
	
	
	
	;~~~~~~~~~~~~~~~~~~~ DISPLAYS OF TALENTS HERE, THIS IS THE UI PART~~~~~~~~~~~~~~~~~~~~~
	If laser_spent = 0 Then Color 255,255,255
	If laser_spent = laser_avail Then Color 0,255,0
	If total_talents_spent < laser_req Then Color 122,122,122
	Rect laser_x,laser_y,talent_box_size,talent_box_size,False
	Line (laser_x+talent_box_size)-1,laser_y+1,laser_x+1,(laser_y+talent_box_size)-1
	Text laser_x+7,laser_y+2,laser_spent,True
	Text (laser_x+talent_box_size)-7,(laser_y+talent_box_size)-17,laser_avail,True
	
	If shield_spent = 0 Then Color 255,255,255
	If shield_spent = shield_avail Then Color 0,255,0
	If total_talents_spent < shield_req Then Color 122,122,122
	Rect shield_x,shield_y,talent_box_size,talent_box_size,False
	Line (shield_x+talent_box_size)-1,shield_y+1,shield_x+1,(shield_y+talent_box_size)-1
	Text shield_x+7,shield_y+2,shield_spent,True
	Text (shield_x+talent_box_size)-7,(shield_y+talent_box_size)-17,shield_avail,True
	
	If megashot_spent = 0 Then Color 255,255,255
	If megashot_spent = megashot_avail Then Color 0,255,0
	If total_talents_spent < megashot_req Then Color 122,122,122
	Rect megashot_x,megashot_y,talent_box_size,talent_box_size,False
	Line (megashot_x+talent_box_size)-1,megashot_y+1,megashot_x+1,(megashot_y+talent_box_size)-1
	Text megashot_x+7,megashot_y+2,megashot_spent,True
	Text (megashot_x+talent_box_size)-7,(megashot_y+talent_box_size)-17,megashot_avail,True
	
	If protection_spent = 0 Then Color 255,255,255
	If protection_spent = protection_avail Then Color 0,255,0
	If total_talents_spent < protection_req Then Color 122,122,122
	Rect protection_x,protection_y,talent_box_size,talent_box_size,False
	Line (protection_x+talent_box_size)-1,protection_y+1,protection_x+1,(protection_y+talent_box_size)-1
	Text protection_x+7,protection_y+2,protection_spent,True
	Text (protection_x+talent_box_size)-7,(protection_y+talent_box_size)-17,protection_avail,True
	
	If phase_inverter_spent = 0 Then Color 255,255,255
	If phase_inverter_spent = phase_inverter_avail Then Color 0,255,0
	If total_talents_spent < phase_inverter_req Then Color 122,122,122
	Rect phase_inverter_x,phase_inverter_y,talent_box_size,talent_box_size,False
	Line (phase_inverter_x+talent_box_size)-1,phase_inverter_y+1,phase_inverter_x+1,(phase_inverter_y+talent_box_size)-1
	Text phase_inverter_x+7,phase_inverter_y+2,phase_inverter_spent,True
	Text (phase_inverter_x+talent_box_size)-7,(phase_inverter_y+talent_box_size)-17,phase_inverter_avail,True
	
	
	
	
	;talent 1
	If talent_1_spent > 0 And talent_1_spent < talent_1_avail Then Color 0,0,255
	If talent_1_spent = 0 Then Color 255,255,255
	If talent_1_spent = talent_1_avail Then Color 0,255,0
	If total_talents_spent < talent_1_req Then Color 122,122,122
	Rect talent_1_x,talent_1_y,talent_box_size,talent_box_size,False 
	Line (talent_1_x+talent_box_size)-1,talent_1_y+1,talent_1_x+1,(talent_1_y+talent_box_size)-1
	Text talent_1_x+7,talent_1_y+2,talent_1_spent,True
	Text (talent_1_x+talent_box_size)-7,(talent_1_y+talent_box_size)-17,talent_1_avail,True
	
	;talent 2
	If talent_2_spent > 0 And talent_2_spent < talent_2_avail Then Color 0,0,255
	If talent_2_spent = 0 Then Color 255,255,255
	If talent_2_spent = talent_2_avail Then Color 0,255,0
	If total_talents_spent < talent_2_req Then Color 122,122,122
	Rect talent_2_x,talent_2_y,talent_box_size,talent_box_size,False 
	Line (talent_2_x+talent_box_size)-1,talent_2_y+1,talent_2_x+1,(talent_2_y+talent_box_size)-1
	Text talent_2_x+7,talent_2_y+2,talent_2_spent,True
	Text (talent_2_x+talent_box_size)-7,(talent_2_y+talent_box_size)-17,talent_2_avail,True
	
	;talent 3
	If talent_3_spent > 0 And talent_3_spent < talent_3_avail Then Color 0,0,255
	If talent_3_spent = 0 Then Color 255,255,255
	If talent_3_spent = talent_3_avail Then Color 0,255,0
	If total_talents_spent < talent_3_req Then Color 122,122,122
	Rect talent_3_x,talent_3_y,talent_box_size,talent_box_size,False 
	Line (talent_3_x+talent_box_size)-1,talent_3_y+1,talent_3_x+1,(talent_3_y+talent_box_size)-1
	Text talent_3_x+7,talent_3_y+2,talent_3_spent,True
	Text (talent_3_x+talent_box_size)-7,(talent_3_y+talent_box_size)-17,talent_3_avail,True
	
	;talent 4
	If talent_4_spent > 0 And talent_4_spent < talent_4_avail Then Color 0,0,255
	If talent_4_spent = 0 Then Color 255,255,255
	If talent_4_spent = talent_4_avail Then Color 0,255,0
	If total_talents_spent < talent_4_req Then Color 122,122,122
	Rect talent_4_x,talent_4_y,talent_box_size,talent_box_size,False 
	Line (talent_4_x+talent_box_size)-1,talent_4_y+1,talent_4_x+1,(talent_4_y+talent_box_size)-1
	Text talent_4_x+7,talent_4_y+2,talent_4_spent,True
	Text (talent_4_x+talent_box_size)-7,(talent_4_y+talent_box_size)-17,talent_4_avail,True
	
	;talent 5
	If talent_5_spent > 0 And talent_5_spent < talent_5_avail Then Color 0,0,255
	If talent_5_spent = 0 Then Color 255,255,255
	If talent_5_spent = talent_5_avail Then Color 0,255,0
	If total_talents_spent < talent_5_req Then Color 122,122,122
	Rect talent_5_x,talent_5_y,talent_box_size,talent_box_size,False 
	Line (talent_5_x+talent_box_size)-1,talent_5_y+1,talent_5_x+1,(talent_5_y+talent_box_size)-1
	Text talent_5_x+7,talent_5_y+2,talent_5_spent,True
	Text (talent_5_x+talent_box_size)-7,(talent_5_y+talent_box_size)-17,talent_5_avail,True
	
	;talent 6
	If talent_6_spent > 0 And talent_6_spent < talent_6_avail Then Color 0,0,255
	If talent_6_spent = 0 Then Color 255,255,255
	If talent_6_spent = talent_6_avail Then Color 0,255,0
	If total_talents_spent < talent_6_req Then Color 122,122,122
	Rect talent_6_x,talent_6_y,talent_box_size,talent_box_size,False 
	Line (talent_6_x+talent_box_size)-1,talent_6_y+1,talent_6_x+1,(talent_6_y+talent_box_size)-1
	Text talent_6_x+7,talent_6_y+2,talent_6_spent,True
	Text (talent_6_x+talent_box_size)-7,(talent_6_y+talent_box_size)-17,talent_6_avail,True
	
	;talent 7
	If talent_7_spent > 0 And talent_7_spent < talent_7_avail Then Color 0,0,255
	If talent_7_spent = 0 Then Color 255,255,255
	If talent_7_spent = talent_7_avail Then Color 0,255,0
	If total_talents_spent < talent_7_req Then Color 122,122,122
	Rect talent_7_x,talent_7_y,talent_box_size,talent_box_size,False 
	Line (talent_7_x+talent_box_size)-1,talent_7_y+1,talent_7_x+1,(talent_7_y+talent_box_size)-1
	Text talent_7_x+7,talent_7_y+2,talent_7_spent,True
	Text (talent_7_x+talent_box_size)-7,(talent_7_y+talent_box_size)-17,talent_7_avail,True
	
	;talent 8
	If talent_8_spent > 0 And talent_8_spent < talent_8_avail Then Color 0,0,255
	If talent_8_spent = 0 Then Color 255,255,255
	If talent_8_spent = talent_8_avail Then Color 0,255,0
	If total_talents_spent < talent_8_req Then Color 122,122,122
	Rect talent_8_x,talent_8_y,talent_box_size,talent_box_size,False 
	Line (talent_8_x+talent_box_size)-1,talent_8_y+1,talent_8_x+1,(talent_8_y+talent_box_size)-1
	Text talent_8_x+7,talent_8_y+2,talent_8_spent,True
	Text (talent_8_x+talent_box_size)-7,(talent_8_y+talent_box_size)-17,talent_8_avail,True
	
	;talent 9
	If talent_9_spent > 0 And talent_9_spent < talent_9_avail Then Color 0,0,255
	If talent_9_spent = 0 Then Color 255,255,255
	If talent_9_spent = talent_9_avail Then Color 0,255,0
	If total_talents_spent < talent_9_req Then Color 122,122,122
	Rect talent_9_x,talent_9_y,talent_box_size,talent_box_size,False 
	Line (talent_9_x+talent_box_size)-1,talent_9_y+1,talent_9_x+1,(talent_9_y+talent_box_size)-1
	Text talent_9_x+7,talent_9_y+2,talent_9_spent,True
	Text (talent_9_x+talent_box_size)-7,(talent_9_y+talent_box_size)-17,talent_9_avail,True
	
	;talent 10
	If talent_10_spent > 0 And talent_10_spent < talent_10_avail Then Color 0,0,255
	If talent_10_spent = 0 Then Color 255,255,255
	If talent_10_spent = talent_10_avail Then Color 0,255,0
	If total_talents_spent < talent_10_req Then Color 122,122,122
	Rect talent_10_x,talent_10_y,talent_box_size,talent_box_size,False 
	Line (talent_10_x+talent_box_size)-1,talent_10_y+1,talent_10_x+1,(talent_10_y+talent_box_size)-1
	Text talent_10_x+7,talent_10_y+2,talent_10_spent,True
	Text (talent_10_x+talent_box_size)-7,(talent_10_y+talent_box_size)-17,talent_10_avail,True
	
	;talent 11
	If talent_11_spent > 0 And talent_11_spent < talent_11_avail Then Color 0,0,255
	If talent_11_spent = 0 Then Color 255,255,255
	If talent_11_spent = talent_11_avail Then Color 0,255,0
	If total_talents_spent < talent_11_req Then Color 122,122,122
	Rect talent_11_x,talent_11_y,talent_box_size,talent_box_size,False 
	Line (talent_11_x+talent_box_size)-1,talent_11_y+1,talent_11_x+1,(talent_11_y+talent_box_size)-1
	Text talent_11_x+7,talent_11_y+2,talent_11_spent,True
	Text (talent_11_x+talent_box_size)-7,(talent_11_y+talent_box_size)-17,talent_11_avail,True
	
	;talent 12
	If talent_12_spent > 0 And talent_12_spent < talent_12_avail Then Color 0,0,255
	If talent_12_spent = 0 Then Color 255,255,255
	If talent_12_spent = talent_12_avail Then Color 0,255,0
	If total_talents_spent < talent_12_req Then Color 122,122,122
	Rect talent_12_x,talent_12_y,talent_box_size,talent_box_size,False 
	Line (talent_12_x+talent_box_size)-1,talent_12_y+1,talent_12_x+1,(talent_12_y+talent_box_size)-1
	Text talent_12_x+7,talent_12_y+2,talent_12_spent,True
	Text (talent_12_x+talent_box_size)-7,(talent_12_y+talent_box_size)-17,talent_12_avail,True
	
	;talent 13
	If talent_13_spent > 0 And talent_13_spent < talent_13_avail Then Color 0,0,255
	If talent_13_spent = 0 Then Color 255,255,255
	If talent_13_spent = talent_13_avail Then Color 0,255,0
	If total_talents_spent < talent_13_req Then Color 122,122,122
	Rect talent_13_x,talent_13_y,talent_box_size,talent_box_size,False 
	Line (talent_13_x+talent_box_size)-1,talent_13_y+1,talent_13_x+1,(talent_13_y+talent_box_size)-1
	Text talent_13_x+7,talent_13_y+2,talent_13_spent,True
	Text (talent_13_x+talent_box_size)-7,(talent_13_y+talent_box_size)-17,talent_13_avail,True
	
	;talent 14
	If talent_14_spent > 0 And talent_14_spent < talent_14_avail Then Color 0,0,255
	If talent_14_spent = 0 Then Color 255,255,255
	If talent_14_spent = talent_14_avail Then Color 0,255,0
	If total_talents_spent < talent_14_req Then Color 122,122,122
	Rect talent_14_x,talent_14_y,talent_box_size,talent_box_size,False 
	Line (talent_14_x+talent_box_size)-1,talent_14_y+1,talent_14_x+1,(talent_14_y+talent_box_size)-1
	Text talent_14_x+7,talent_14_y+2,talent_14_spent,True
	Text (talent_14_x+talent_box_size)-7,(talent_14_y+talent_box_size)-17,talent_14_avail,True
	
	;talent 15
	If talent_15_spent > 0 And talent_15_spent < talent_15_avail Then Color 0,0,255
	If talent_15_spent = 0 Then Color 255,255,255
	If talent_15_spent = talent_15_avail Then Color 0,255,0
	If total_talents_spent < talent_15_req Then Color 122,122,122
	Rect talent_15_x,talent_15_y,talent_box_size,talent_box_size,False 
	Line (talent_15_x+talent_box_size)-1,talent_15_y+1,talent_15_x+1,(talent_15_y+talent_box_size)-1
	Text talent_15_x+7,talent_15_y+2,talent_15_spent,True
	Text (talent_15_x+talent_box_size)-7,(talent_15_y+talent_box_size)-17,talent_15_avail,True
	
	;talent 16
	If talent_16_spent > 0 And talent_16_spent < talent_16_avail Then Color 0,0,255
	If talent_16_spent = 0 Then Color 255,255,255
	If talent_16_spent = talent_16_avail Then Color 0,255,0
	If total_talents_spent < talent_16_req Then Color 122,122,122
	Rect talent_16_x,talent_16_y,talent_box_size,talent_box_size,False 
	Line (talent_16_x+talent_box_size)-1,talent_16_y+1,talent_16_x+1,(talent_16_y+talent_box_size)-1
	Text talent_16_x+7,talent_16_y+2,talent_16_spent,True
	Text (talent_16_x+talent_box_size)-7,(talent_16_y+talent_box_size)-17,talent_16_avail,True
	
	;talent 17
	If talent_17_spent > 0 And talent_17_spent < talent_17_avail Then Color 0,0,255
	If talent_17_spent = 0 Then Color 255,255,255
	If talent_17_spent = talent_17_avail Then Color 0,255,0
	If total_talents_spent < talent_17_req Then Color 122,122,122
	Rect talent_17_x,talent_17_y,talent_box_size,talent_box_size,False 
	Line (talent_17_x+talent_box_size)-1,talent_17_y+1,talent_17_x+1,(talent_17_y+talent_box_size)-1
	Text talent_17_x+7,talent_17_y+2,talent_17_spent,True
	Text (talent_17_x+talent_box_size)-7,(talent_17_y+talent_box_size)-17,talent_17_avail,True
	
	;talent 18
	If talent_18_spent > 0 And talent_18_spent < talent_18_avail Then Color 0,0,255
	If talent_18_spent = 0 Then Color 255,255,255
	If talent_18_spent = talent_18_avail Then Color 0,255,0
	If total_talents_spent < talent_18_req Then Color 122,122,122
	Rect talent_18_x,talent_18_y,talent_box_size,talent_box_size,False 
	Line (talent_18_x+talent_box_size)-1,talent_18_y+1,talent_18_x+1,(talent_18_y+talent_box_size)-1
	Text talent_18_x+7,talent_18_y+2,talent_18_spent,True
	Text (talent_18_x+talent_box_size)-7,(talent_18_y+talent_box_size)-17,talent_18_avail,True
	
	;talent 19
	If talent_19_spent > 0 And talent_19_spent < talent_19_avail Then Color 0,0,255
	If talent_19_spent = 0 Then Color 255,255,255
	If talent_19_spent = talent_19_avail Then Color 0,255,0
	If total_talents_spent < talent_19_req Then Color 122,122,122
	Rect talent_19_x,talent_19_y,talent_box_size,talent_box_size,False 
	Line (talent_19_x+talent_box_size)-1,talent_19_y+1,talent_19_x+1,(talent_19_y+talent_box_size)-1
	Text talent_19_x+7,talent_19_y+2,talent_19_spent,True
	Text (talent_19_x+talent_box_size)-7,(talent_19_y+talent_box_size)-17,talent_19_avail,True
	
	;talent 20
	If talent_20_spent > 0 And talent_20_spent < talent_20_avail Then Color 0,0,255
	If talent_20_spent = 0 Then Color 255,255,255
	If talent_20_spent = talent_20_avail Then Color 0,255,0
	If total_talents_spent < talent_20_req Then Color 122,122,122
	Rect talent_20_x,talent_20_y,talent_box_size,talent_box_size,False 
	Line (talent_20_x+talent_box_size)-1,talent_20_y+1,talent_20_x+1,(talent_20_y+talent_box_size)-1
	Text talent_20_x+7,talent_20_y+2,talent_20_spent,True
	Text (talent_20_x+talent_box_size)-7,(talent_20_y+talent_box_size)-17,talent_20_avail,True
	
	;talent 21
	If talent_21_spent > 0 And talent_21_spent < talent_21_avail Then Color 0,0,255
	If talent_21_spent = 0 Then Color 255,255,255
	If talent_21_spent = talent_21_avail Then Color 0,255,0
	If total_talents_spent < talent_21_req Then Color 122,122,122
	Rect talent_21_x,talent_21_y,talent_box_size,talent_box_size,False 
	Line (talent_21_x+talent_box_size)-1,talent_21_y+1,talent_21_x+1,(talent_21_y+talent_box_size)-1
	Text talent_21_x+7,talent_21_y+2,talent_21_spent,True
	Text (talent_21_x+talent_box_size)-7,(talent_21_y+talent_box_size)-17,talent_21_avail,True
	
	;talent 22
	If talent_22_spent > 0 And talent_22_spent < talent_22_avail Then Color 0,0,255
	If talent_22_spent = 0 Then Color 255,255,255
	If talent_22_spent = talent_22_avail Then Color 0,255,0
	If total_talents_spent < talent_22_req Then Color 122,122,122
	Rect talent_22_x,talent_22_y,talent_box_size,talent_box_size,False 
	Line (talent_22_x+talent_box_size)-1,talent_22_y+1,talent_22_x+1,(talent_22_y+talent_box_size)-1
	Text talent_22_x+7,talent_22_y+2,talent_22_spent,True
	Text (talent_22_x+talent_box_size)-7,(talent_22_y+talent_box_size)-17,talent_22_avail,True
	
	;talent 23
	If talent_23_spent > 0 And talent_23_spent < talent_23_avail Then Color 0,0,255
	If talent_23_spent = 0 Then Color 255,255,255
	If talent_23_spent = talent_23_avail Then Color 0,255,0
	If total_talents_spent < talent_23_req Then Color 122,122,122
	Rect talent_23_x,talent_23_y,talent_box_size,talent_box_size,False 
	Line (talent_23_x+talent_box_size)-1,talent_23_y+1,talent_23_x+1,(talent_23_y+talent_box_size)-1
	Text talent_23_x+7,talent_23_y+2,talent_23_spent,True
	Text (talent_23_x+talent_box_size)-7,(talent_23_y+talent_box_size)-17,talent_23_avail,True
	
	;talent 24
	If talent_24_spent > 0 And talent_24_spent < talent_24_avail Then Color 0,0,255
	If talent_24_spent = 0 Then Color 255,255,255
	If talent_24_spent = talent_24_avail Then Color 0,255,0
	If total_talents_spent < talent_24_req Then Color 122,122,122
	Rect talent_24_x,talent_24_y,talent_box_size,talent_box_size,False 
	Line (talent_24_x+talent_box_size)-1,talent_24_y+1,talent_24_x+1,(talent_24_y+talent_box_size)-1
	Text talent_24_x+7,talent_24_y+2,talent_24_spent,True
	Text (talent_24_x+talent_box_size)-7,(talent_24_y+talent_box_size)-17,talent_24_avail,True
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	;~~~~~~~~~~~~~~~~~~~ THIS PART IS FOR WHEN MOUSING OVER THE TALENTS ~~~~~~~~~~~~~~~~~~~
	
	;laser
	If MouseX() > laser_x And MouseY() > laser_y And MouseX() < (laser_x+talent_box_size) And MouseY() < (laser_y+talent_box_size)
		talent_name$ = "Phaser Ability"
		talent_line1$ = "This talent unlocks an ability called the phaser. It"
		talent_line2$ = "does less damage than your standard laser, but "
		talent_line3$ = "it has no cooldown to fire again."
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = ""
		talent_line9$ = "Requires "+laser_req+" talents spent"
		mouse_over = True
		no_green = True 
		If talents_available > 0
			If total_talents_spent >= laser_req
				If laser_avail > laser_spent
					If MouseHit(1)
						laser_spent = laser_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf
			EndIf 
		EndIf 
	EndIf 
	
	;shield
	If MouseX() > shield_x And MouseY() > shield_y And MouseX() < (shield_x+talent_box_size) And MouseY() < (shield_y+talent_box_size)
		talent_name$ = "Shield Ability"
		talent_line1$ = "This ability protects you from most sources of"
		talent_line2$ = "damage. This is not always effective against "
		talent_line3$ = "certain attacks, and if it sustains too much damage"
		talent_line4$ = "then the shield will drain even quicker."
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = ""
		talent_line9$ = "Requires "+shield_req+" talents spent"
		mouse_over = True
		no_green = True 
		If talents_available > 0
			If total_talents_spent >= shield_req
				If shield_avail > shield_spent
					If MouseHit(1)
						shield_spent = shield_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf
			EndIf 
		EndIf 
	EndIf 
	
	;megashot
	If MouseX() > megashot_x And MouseY() > megashot_y And MouseX() < (megashot_x+talent_box_size) And MouseY() < (megashot_y+talent_box_size)
		talent_name$ = "Mega shot ability"
		talent_line1$ = "This ability fires a single shot that does massive "
		talent_line2$ = "damage. When it hits a target, it will then split into 2"
		talent_line3$ = "plasma bursts that do less damage. When the "
		talent_line4$ = "plasma bursts hit a target, those will split again"
		talent_line5$ = "into a standard laser shot."
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = ""
		talent_line9$ = "Requires "+megashot_req+" talents spent"
		mouse_over = True
		no_green = True 
		If talents_available > 0
			If total_talents_spent >= megashot_req
				If megashot_avail > megashot_spent
					If MouseHit(1)
						megashot_spent = megashot_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf
			EndIf 
		EndIf 
	EndIf 
	
	;protection
	If MouseX() > protection_x And MouseY() > protection_y And MouseX() < (protection_x+talent_box_size) And MouseY() < (protection_y+talent_box_size)
		talent_name$ = "Protection Ability"
		talent_line1$ = "This is an ability you can trigger multiple times. "
		talent_line2$ = "Each time you use this ability, a ship will come "
		talent_line3$ = "down and help you defeat the enemies. These "
		talent_line4$ = "ships fire the same lasers that you do. You can "
		talent_line5$ = "have as many as you want on screen at the same "
		talent_line6$ = "time. These ships cannot be killed but they retreat"
		talent_line7$ = "back after 20 seconds."
		talent_line8$ = ""
		talent_line9$ = "Requires "+protection_req+" talents spent"
		mouse_over = True
		no_green = True 
		If talents_available > 0
			If total_talents_spent >= protection_req
				If protection_avail > protection_spent
					If MouseHit(1)
						protection_spent = protection_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf
			EndIf 
		EndIf 
	EndIf 
	
	;phase inverter
	If MouseX() > phase_inverter_x And MouseY() > phase_inverter_y And MouseX() < (phase_inverter_x+talent_box_size) And MouseY() < (phase_inverter_y+talent_box_size)
		talent_name$ = "Phase Inverter Ability"
		talent_line1$ = "This ability inverts your phased state. When you're"
		talent_line2$ = "phased out of space, you become transparent and "
		talent_line3$ = "cannot use any of your abilities. However, instead"
		talent_line4$ = "of taking damage when you are hit, you instead get"
		talent_line5$ = "healed for the amount of damage you would have"
		talent_line6$ = "Taken. Once you use this ability you cannot cancel"
		talent_line7$ = "it. Lasts for 20 seconds."
		talent_line8$ = ""
		talent_line9$ = "Requires "+phase_inverter_req+" talents spent"
		mouse_over = True
		no_green = True 
		If talents_available > 0
			If total_talents_spent >= phase_inverter_req
				If phase_inverter_avail > phase_inverter_spent
					If MouseHit(1)
						phase_inverter_spent = phase_inverter_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf
			EndIf 
		EndIf 
	EndIf
	
	
	
	
	;TALENT 1:
	If MouseX() > talent_1_x And MouseY() > talent_1_y And MouseX() < (talent_1_x+talent_box_size) And MouseY() < (talent_1_y+talent_box_size)
		talent_name$ = "A Change of Base"			
		talent_line1$ = "Increases the firing rate of your laser by: "+(laser_mod#*100)+"%"
		talent_line2$ = ""
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+((laser_mod#*100)+10)+"%"
		talent_line9$ = "Requires "+talent_1_req+" talents spent"
		mouse_over = True
		If talent_1_spent = 0
			laser_mod# = 0
		EndIf
		If talent_1_spent = 1
			laser_mod# = .1
		EndIf
		If talent_1_spent = 2				
			laser_mod# = .2		
		EndIf 
		If talent_1_spent = 3
			laser_mod# = .3
		EndIf
		If talent_1_spent = talent_1_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_1_avail > talent_1_spent
				If total_talents_spent >= talent_1_req
					If MouseHit(1)
						talent_1_spent = talent_1_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf 
	
	;TALENT 2:
	If MouseX() > talent_2_x And MouseY() > talent_2_y And MouseX() < (talent_2_x+talent_box_size) And MouseY() < (talent_2_y+talent_box_size)
		talent_name$ = "Basic Destruction"			
		talent_line1$ = "Increases the damage of your laser by: "+(standard_shot_damage_increaser#*100)+"%"
		talent_line2$ = ""
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+((standard_shot_damage_increaser#*100)+10)+"%"
		talent_line9$ = "Requires "+talent_2_req+" talents spent"
		mouse_over = True
		If talent_2_spent = 0
			standard_shot_damage_increaser# = 0
		EndIf
		If talent_2_spent = 1
			standard_shot_damage_increaser# = .1
		EndIf
		If talent_2_spent = 2				
			standard_shot_damage_increaser# = .2
		EndIf 
		If talent_2_spent = 3
			standard_shot_damage_increaser# = .3
		EndIf
		If talent_2_spent = talent_2_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_2_avail > talent_2_spent
				If total_talents_spent >= talent_2_req
					If MouseHit(1)
						talent_2_spent = talent_2_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf 
	
	;TALENT 3:
	If MouseX() > talent_3_x And MouseY() > talent_3_y And MouseX() < (talent_3_x+talent_box_size) And MouseY() < (talent_3_y+talent_box_size)
		talent_name$ = "Nano Technology"			
		If talent_3_spent = 0
			talent_line1$ = "Reduces the size of your ship by: 0%"
			talent_line8$ = "Next rank: 25%"
		EndIf
		If talent_3_spent = 1
			talent_line1$ = "Reduces the size of your ship by: 25%"
			talent_line8$ = "Next rank: 50%"
		EndIf
		If talent_3_spent = 2			
			talent_line1$ = "Reduces the size of your ship by: 50%"
		EndIf 
		talent_line2$ = ""
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line9$ = "Requires "+talent_3_req+" talents spent"
		mouse_over = True 
		If talent_3_spent = talent_3_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_3_avail > talent_3_spent
				If total_talents_spent >= talent_3_req
					If MouseHit(1)
						talent_3_spent = talent_3_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
						reset_ship_scale()	; we want to scale off the ships original dimensions, not the scaled versions
						If talent_3_spent = 0
							ship_scale# = 1
						EndIf
						If talent_3_spent = 1
							ship_scale# = .85
						EndIf
						If talent_3_spent = 2			
							ship_scale# = .70
						EndIf 
						;scaling of the ships is done in the clear_levels function so you don't scale off of scales.
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf 
	
	;TALENT 4:
	If MouseX() > talent_4_x And MouseY() > talent_4_y And MouseX() < (talent_4_x+talent_box_size) And MouseY() < (talent_4_y+talent_box_size)
		talent_name$ = "Final Push"			
		talent_line1$ = "When you run out of wide shot charges, your"
		talent_line2$ = "laser shot firing speed is increased by "+(1-wideshot_speed_increase#)*200+"%"
		talent_line3$ = "for "+wideshot_duration_time+" seconds"
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+(1-(wideshot_speed_increase#-0.25))*200+"% for "+(wideshot_duration_time+10)+" seconds"
		talent_line9$ = "Requires "+talent_4_req+" talents spent"
		mouse_over = True
		If talent_4_spent = 0
			wideshot_speed_increase# = 1
			wideshot_duration_time = 0
		EndIf
		If talent_4_spent = 1
			wideshot_speed_increase# = .75
			wideshot_duration_time = 10
		EndIf
		If talent_4_spent = 2				
			wideshot_speed_increase# = .5
			wideshot_duration_time = 20
		EndIf 
		If talent_4_spent = talent_4_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_4_avail > talent_4_spent
				If total_talents_spent >= talent_4_req
					If MouseHit(1)
						talent_4_spent = talent_4_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf 
	
	;TALENT 5:
	If MouseX() > talent_5_x And MouseY() > talent_5_y And MouseX() < (talent_5_x+talent_box_size) And MouseY() < (talent_5_y+talent_box_size)
		talent_name$ = "Upgraded Capacitors"			
		talent_line1$ = "Increases the duration of your phaser by "+((1-laser_drain#)*100)+"%"
		talent_line2$ = ""
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+(((1-laser_drain#)*100)+10)+"%"
		talent_line9$ = "Requires "+talent_5_req+" talents spent"
		mouse_over = True
		If talent_5_spent = 0
			laser_drain# = 1
		EndIf
		If talent_5_spent = 1
			laser_drain# = .9
		EndIf
		If talent_5_spent = 2				
			laser_drain# = .8
		EndIf
		If talent_5_spent = 3				
			laser_drain# = .7
		EndIf 
		If talent_5_spent = talent_5_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_5_avail > talent_5_spent
				If total_talents_spent >= talent_5_req
					If MouseHit(1)
						talent_5_spent = talent_5_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	;TALENT 6:
	If MouseX() > talent_6_x And MouseY() > talent_6_y And MouseX() < (talent_6_x+talent_box_size) And MouseY() < (talent_6_y+talent_box_size)
		talent_name$ = "Power Overwhelming"			
		talent_line1$ = "Increases your chance to crit (do double damage)"
		talent_line2$ = "with your laser by "+laser_crit_talent#+"%"
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+(laser_crit_talent#+10)+"%"
		talent_line9$ = "Requires "+talent_6_req+" talents spent"
		mouse_over = True
		If talent_6_spent = 0
			laser_crit_talent# = 0
			chance_to_crit# = capacitor_crit_add# + laser_crit_talent#
		EndIf
		If talent_6_spent = 1
			laser_crit_talent# = 10
			chance_to_crit# = capacitor_crit_add# + laser_crit_talent#
		EndIf
		If talent_6_spent = 2				
			laser_crit_talent# = 20
			chance_to_crit# = capacitor_crit_add# + laser_crit_talent#
		EndIf 
		If talent_6_spent = 3				
			laser_crit_talent# = 30
			chance_to_crit# = capacitor_crit_add# + laser_crit_talent#
		EndIf 
		If talent_6_spent = talent_6_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_6_avail > talent_6_spent
				If total_talents_spent >= talent_6_req
					If MouseHit(1)
						talent_6_spent = talent_6_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	;TALENT 7:
	If MouseX() > talent_7_x And MouseY() > talent_7_y And MouseX() < (talent_7_x+talent_box_size) And MouseY() < (talent_7_y+talent_box_size)
		talent_name$ = "Stay on the move"			
		talent_line1$ = "As you move with your ship, you regenerate some"
		talent_line2$ = "of your shield battery."
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: Faster Renegeration"
		talent_line9$ = "Requires "+talent_7_req+" talents spent"
		mouse_over = True
		; variable calculations in get_keys.bb, under movement commands
		; rate of regeneration in draw.bb 
		If talent_7_spent = talent_7_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_7_avail > talent_7_spent
				If total_talents_spent >= talent_7_req
					If MouseHit(1)
						talent_7_spent = talent_7_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	
	;TALENT 8:
	If MouseX() > talent_8_x And MouseY() > talent_8_y And MouseX() < (talent_8_x+talent_box_size) And MouseY() < (talent_8_y+talent_box_size)
		talent_name$ = "Enraged Regeneration"			
		talent_line1$ = "Regenerates 1% of the phaser energy for every"
		talent_line2$ = (10/laser_and_phaser_talent#)+" times you shoot your laser"
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		If talent_8_spent = 0 Then talent_line8$ = "Next rank: every 15 times"
		If talent_8_spent = 1 Then talent_line8$ = "Next rank: every 10 times"
		If talent_8_spent = 2 Then talent_line8$ = "Next rank: every 5 times"
		talent_line9$ = "Requires "+talent_8_req+" talents spent"
		mouse_over = True
		If talent_8_spent = 0
			laser_and_phaser_talent# = 0
		EndIf
		If talent_8_spent = 1
			laser_and_phaser_talent# = 0.66666666
		EndIf
		If talent_8_spent = 2				
			laser_and_phaser_talent# = 1
		EndIf 
		If talent_8_spent = 3				
			laser_and_phaser_talent# = 2
		EndIf 
		If talent_8_spent = talent_8_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_8_avail > talent_8_spent
				If total_talents_spent >= talent_8_req
					If MouseHit(1)
						talent_8_spent = talent_8_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	;TALENT 9:
	If MouseX() > talent_9_x And MouseY() > talent_9_y And MouseX() < (talent_9_x+talent_box_size) And MouseY() < (talent_9_y+talent_box_size)
		talent_name$ = "Quantum Amplification"			
		talent_line1$ = "Increases the damage of plasma bursts by "+((1-energy_ball_damage_increase#)*100)*-1+"%"
		talent_line2$ = ""
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+((((1-energy_ball_damage_increase#+0.5)*100)*-1)+100)+"%"
		talent_line9$ = "Requires "+talent_9_req+" talents spent"
		mouse_over = True
		If talent_9_spent = 0
			energy_ball_damage_increase# = 1
		EndIf
		If talent_9_spent = 1
			energy_ball_damage_increase# = 1.5
		EndIf
		If talent_9_spent = 2				
			energy_ball_damage_increase# = 2
		EndIf 
		If talent_9_spent = talent_9_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_9_avail > talent_9_spent
				If total_talents_spent >= talent_9_req
					If MouseHit(1)
						talent_9_spent = talent_9_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	;TALENT 10:
	If MouseX() > talent_10_x And MouseY() > talent_10_y And MouseX() < (talent_10_x+talent_box_size) And MouseY() < (talent_10_y+talent_box_size)
		talent_name$ = "Extended Life Support"			
		talent_line1$ = "When no armor remains, damage is reduced by"
		talent_line2$ = "an additional "+(no_armor_damage_reducer#*100)+"%"
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+((no_armor_damage_reducer#+.1)*100)+"%"
		talent_line9$ = "Requires "+talent_10_req+" talents spent"
		mouse_over = True
		If talent_10_spent = 0
			no_armor_damage_reducer# = 0
		EndIf
		If talent_10_spent = 1
			no_armor_damage_reducer# = .1
		EndIf
		If talent_10_spent = 2				
			no_armor_damage_reducer# = .2
		EndIf 
		If talent_10_spent = 3				
			no_armor_damage_reducer# = .3
		EndIf 
		If talent_10_spent = talent_10_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_10_avail > talent_10_spent
				If total_talents_spent >= talent_10_req
					If MouseHit(1)
						talent_10_spent = talent_10_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	;TALENT 11:
	If MouseX() > talent_11_x And MouseY() > talent_11_y And MouseX() < (talent_11_x+talent_box_size) And MouseY() < (talent_11_y+talent_box_size)
		talent_name$ = "Titanium Plating"			
		talent_line1$ = "Reduces all damage taken by "+(damage_reduction#*100)+"%"
		talent_line2$ = ""
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+((damage_reduction#+.1)*100)+"%"
		talent_line9$ = "Requires "+talent_11_req+" talents spent"
		mouse_over = True
		If talent_11_spent = 0
			damage_reduction# = 0
		EndIf
		If talent_11_spent = 1
			damage_reduction# = .1
		EndIf
		If talent_11_spent = 2				
			damage_reduction# = .2
		EndIf 
		If talent_11_spent = 3				
			damage_reduction# = .3
		EndIf 
		If talent_11_spent = 4				
			damage_reduction# = .4
		EndIf 
		If talent_11_spent = talent_11_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_11_avail > talent_11_spent
				If total_talents_spent >= talent_11_req
					If MouseHit(1)
						talent_11_spent = talent_11_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	;TALENT 12:
	If MouseX() > talent_12_x And MouseY() > talent_12_y And MouseX() < (talent_12_x+talent_box_size) And MouseY() < (talent_12_y+talent_box_size)
		talent_name$ = "Self Mending Hull"			
		talent_line1$ = "While your shield is active, the hull integrity of"
		talent_line2$ = "the ship renegerates at "+(shield_armor_increaser#/2)+"% per second"
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+((shield_armor_increaser#+2)/2)+"% per second"
		talent_line9$ = "Requires "+talent_12_req+" talents spent"
		mouse_over = True
		If talent_12_spent = 0
			shield_armor_increaser# = 0
		EndIf
		If talent_12_spent = 1
			shield_armor_increaser# = 2
		EndIf
		If talent_12_spent = 2				
			shield_armor_increaser# = 4
		EndIf 
		If talent_12_spent = 3				
			shield_armor_increaser# = 6
		EndIf 
		If talent_12_spent = talent_12_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_12_avail > talent_12_spent
				If total_talents_spent >= talent_12_req
					If MouseHit(1)
						talent_12_spent = talent_12_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	;TALENT 13:
	If MouseX() > talent_13_x And MouseY() > talent_13_y And MouseX() < (talent_13_x+talent_box_size) And MouseY() < (talent_13_y+talent_box_size)
		talent_name$ = "Diamond Coating"			
		talent_line1$ = "Increases the total hull integrity of your ship"
		talent_line2$ = "by "+(hull_integrity_increase#/10)+"%"
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+((hull_integrity_increase#+250)/10)+"%"
		talent_line9$ = "Requires "+talent_13_req+" talents spent"
		mouse_over = True
		If talent_13_spent = 0
			hull_integrity_increase# = 0
		EndIf
		If talent_13_spent = 1
			hull_integrity_increase# = 250
		EndIf
		If talent_13_spent = 2				
			hull_integrity_increase# = 500
		EndIf
		If talent_13_spent = 3
			hull_integrity_increase# = 750
		EndIf
		If talent_13_spent = 4				
			hull_integrity_increase# = 1000
		EndIf 
		If talent_13_spent = talent_13_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_13_avail > talent_13_spent
				If total_talents_spent >= talent_13_req
					If MouseHit(1)
						talent_13_spent = talent_13_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	;TALENT 14:
	If MouseX() > talent_14_x And MouseY() > talent_14_y And MouseX() < (talent_14_x+talent_box_size) And MouseY() < (talent_14_y+talent_box_size)
		talent_name$ = "Efficiency"			
		talent_line1$ = "Increases the duration of your shield by "+((1-shield_mod#)*100)+"%"
		talent_line2$ = ""
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+((1-shield_mod#+.20)*100)+"%"
		talent_line9$ = "Requires "+talent_14_req+" talents spent"
		mouse_over = True
		If talent_14_spent = 0
			shield_mod# = 1
		EndIf
		If talent_14_spent = 1
			shield_mod# = .8
		EndIf
		If talent_14_spent = 2				
			shield_mod# = .6
		EndIf 
		If talent_14_spent = talent_14_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_14_avail > talent_14_spent
				If total_talents_spent >= talent_14_req
					If MouseHit(1)
						talent_14_spent = talent_14_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	;TALENT 15:
	If MouseX() > talent_15_x And MouseY() > talent_15_y And MouseX() < (talent_15_x+talent_box_size) And MouseY() < (talent_15_y+talent_box_size)
		talent_name$ = "Upgraded Laser Array"			
		talent_line1$ = "You have a "+wideshot_force_chance#+"% chance to make the next laser"
		talent_line2$ = "shot a wide shot after scoring a critical hit. Only the"
		talent_line3$ = "middle of the wide shot can crit, unlike a regular"
		talent_line4$ = "wide shot where all three shots have a chance to"
		talent_line5$ = "critically hit."
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+(wideshot_force_chance#+25)+"%"
		talent_line9$ = "Requires "+talent_15_req+" talents spent"
		mouse_over = True
		If talent_15_spent = 0
			wideshot_force_chance# = 0
		EndIf
		If talent_15_spent = 1
			wideshot_force_chance# = 25
		EndIf
		If talent_15_spent = 2				
			wideshot_force_chance# = 50 
		EndIf 
		If talent_15_spent = 3				
			wideshot_force_chance# = 75 
		EndIf
		If talent_15_spent = 4				
			wideshot_force_chance# = 100
		EndIf
		If talent_15_spent = talent_15_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_15_avail > talent_15_spent
				If total_talents_spent >= talent_15_req
					If MouseHit(1)
						talent_15_spent = talent_15_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	;TALENT 16:
	If MouseX() > talent_16_x And MouseY() > talent_16_y And MouseX() < (talent_16_x+talent_box_size) And MouseY() < (talent_16_y+talent_box_size)
		talent_name$ = "Additional Reinforcement"			
		talent_line1$ = "Increases the number of ships that you have"
		talent_line2$ = "access to with your protection ability by "+extra_protection_ships
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+(extra_protection_ships+2)
		talent_line9$ = "Requires "+talent_16_req+" talents spent"
		mouse_over = True
		If talent_16_spent = 0
			extra_protection_ships = 0
		EndIf
		If talent_16_spent = 1
			extra_protection_ships = 2
		EndIf
		If talent_16_spent = 2				
			extra_protection_ships = 4
		EndIf 
		If talent_16_spent = 3				
			extra_protection_ships = 6
		EndIf 
		If talent_16_spent = talent_16_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_16_avail > talent_16_spent
				If total_talents_spent >= talent_16_req
					If MouseHit(1)
						talent_16_spent = talent_16_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	;TALENT 17:
	If MouseX() > talent_17_x And MouseY() > talent_17_y And MouseX() < (talent_17_x+talent_box_size) And MouseY() < (talent_17_y+talent_box_size)
		talent_name$ = "Additional supplies"			
		talent_line1$ = "For each charge of protection you use, you "
		talent_line2$ = "regenerate "+(additional_supplies_shield_increaser#/10)+"% of your shield battery."
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+((additional_supplies_shield_increaser#+10)/10)+"%"
		talent_line9$ = "Requires "+talent_17_req+" talents spent"
		mouse_over = True
		If talent_17_spent = 0
			additional_supplies_shield_increaser# = 0
		EndIf
		If talent_17_spent = 1
			additional_supplies_shield_increaser# = 10
		EndIf
		If talent_17_spent = 2				
			additional_supplies_shield_increaser# = 20
		EndIf 
		If talent_17_spent = 3				
			additional_supplies_shield_increaser# = 30
		EndIf 
		If talent_17_spent = talent_17_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_17_avail > talent_17_spent
				If total_talents_spent >= talent_17_req
					If MouseHit(1)
						talent_17_spent = talent_17_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	;TALENT 18:
	If MouseX() > talent_18_x And MouseY() > talent_18_y And MouseX() < (talent_18_x+talent_box_size) And MouseY() < (talent_18_y+talent_box_size)
		talent_name$ = "Burgeoning Bane"			
		talent_line1$ = "Increases the damage of Mega Shot by "+megashot_percentage+"%"
		talent_line2$ = ""
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+(megashot_percentage+50)+"%"
		talent_line9$ = "Requires "+talent_18_req+" talents spent"
		mouse_over = True
		If talent_18_spent = 0
			megashot_damage_increase# = 1
			megashot_percentage = 0
		EndIf
		If talent_18_spent = 1
			megashot_damage_increase# = 1.5
			megashot_percentage = 50
		EndIf
		If talent_18_spent = 2				
			megashot_damage_increase# = 2
			megashot_percentage = 100
		EndIf 
		If talent_18_spent = talent_18_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_18_avail > talent_18_spent
				If total_talents_spent >= talent_18_req
					If MouseHit(1)
						talent_18_spent = talent_18_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	;TALENT 19:
	If MouseX() > talent_19_x And MouseY() > talent_19_y And MouseX() < (talent_19_x+talent_box_size) And MouseY() < (talent_19_y+talent_box_size)
		talent_name$ = "Interphase Technology"			
		talent_line1$ = "Increases the time that you are phased out of"
		talent_line2$ = "space when using your phase inverter by "+(phase_inverter_time_added/60)
		talent_line3$ = "seconds"
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+((phase_inverter_time_added+120)/60)+" seconds"
		talent_line9$ = "Requires "+talent_19_req+" talents spent"
		mouse_over = True
		If talent_19_spent = 0
			phase_inverter_time_added = 0
		EndIf
		If talent_19_spent = 1
			phase_inverter_time_added = 120
		EndIf
		If talent_19_spent = 2				
			phase_inverter_time_added = 240
		EndIf 
		If talent_19_spent = 3				
			phase_inverter_time_added = 360
		EndIf 
		If talent_19_spent = talent_19_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_19_avail > talent_19_spent
				If total_talents_spent >= talent_19_req
					If MouseHit(1)
						talent_19_spent = talent_19_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	;TALENT 20:
	If MouseX() > talent_20_x And MouseY() > talent_20_y And MouseX() < (talent_20_x+talent_box_size) And MouseY() < (talent_20_y+talent_box_size)
		talent_name$ = "Enlarged Electrical Conduits"			
		talent_line1$ = "Increases your chance to crit by "+crit_after_megashot_addition#+"% for 10"
		talent_line2$ = "seconds after using a Mega Shot."
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+(crit_after_megashot_addition#+10)+"%"
		talent_line9$ = "Requires "+talent_20_req+" talents spent"
		mouse_over = True
		If talent_20_spent = 0
			crit_after_megashot_addition# = 0
		EndIf
		If talent_20_spent = 1
			crit_after_megashot_addition# = 10
		EndIf
		If talent_20_spent = 2				
			crit_after_megashot_addition# = 20
		EndIf 
		If talent_20_spent = 3				
			crit_after_megashot_addition# = 30
		EndIf 
		If talent_20_spent = 4				
			crit_after_megashot_addition# = 40
		EndIf 
		If talent_20_spent = talent_20_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_20_avail > talent_20_spent
				If total_talents_spent >= talent_20_req
					If MouseHit(1)
						talent_20_spent = talent_20_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	;TALENT 21:
	If MouseX() > talent_21_x And MouseY() > talent_21_y And MouseX() < (talent_21_x+talent_box_size) And MouseY() < (talent_21_y+talent_box_size)
		talent_name$ = "Subspace Particle Collection"			
		talent_line1$ = "While your Phase Inverter is active, you regenerate"
		talent_line2$ = (phaser_increaser#*6)+"% of your phaser per second."
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+((phaser_increaser#+0.1666666)*6)+"%"
		talent_line9$ = "Requires "+talent_21_req+" talents spent"
		mouse_over = True
		If talent_21_spent = 0
			phaser_increaser# = 0
		EndIf
		If talent_21_spent = 1
			phaser_increaser# = 0.1666666
		EndIf
		If talent_21_spent = 2				
			phaser_increaser# = 0.3333333
		EndIf 
		If talent_21_spent = talent_21_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_21_avail > talent_21_spent
				If total_talents_spent >= talent_21_req
					If MouseHit(1)
						talent_21_spent = talent_21_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	;TALENT 22:
	If MouseX() > talent_22_x And MouseY() > talent_22_y And MouseX() < (talent_22_x+talent_box_size) And MouseY() < (talent_22_y+talent_box_size)
		talent_name$ = "Emergency Phase"			
		talent_line1$ = "When you run out of Shield energy you become"
		talent_line2$ = "phased for "+phase_time_talent#/60+" seconds. This ability cannot be"
		talent_line3$ = "used again until your shields reach 50%"
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+(phase_time_talent#+180)/60+" seconds"
		talent_line9$ = "Requires "+talent_22_req+" talents spent"
		mouse_over = True
		If talent_22_spent = 0
			phase_time_talent# = 0
			phase_time_talent_unchanged# = 0
		EndIf
		If talent_22_spent = 1
			phase_time_talent# = 180
			phase_time_talent_unchanged# = 180
		EndIf
		If talent_22_spent = 2				
			phase_time_talent# = 360
			phase_time_talent_unchanged# = 360
		EndIf 
		If talent_22_spent = talent_22_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_22_avail > talent_22_spent
				If total_talents_spent >= talent_22_req
					If MouseHit(1)
						talent_22_spent = talent_22_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	;TALENT 23:
	If MouseX() > talent_23_x And MouseY() > talent_23_y And MouseX() < (talent_23_x+talent_box_size) And MouseY() < (talent_23_y+talent_box_size)
		talent_name$ = "Spontaneous Materialization"			
		talent_line1$ = "When you run out of Phaser energy you regenerate"
		talent_line2$ = phaser_talent_megashot_addition+" charges of Mega Shot. This ability cannot be"
		talent_line3$ = "used again until your Phaser energy reaches 50%"
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+(phaser_talent_megashot_addition+1)
		talent_line9$ = "Requires "+talent_23_req+" talents spent"
		mouse_over = True
		If talent_23_spent = 0
			phaser_talent_megashot_addition = 0
		EndIf
		If talent_23_spent = 1
			phaser_talent_megashot_addition = 1
		EndIf
		If talent_23_spent = 2				
			phaser_talent_megashot_addition = 2
		EndIf 
		If talent_23_spent = 3				
			phaser_talent_megashot_addition = 3
		EndIf 
		If talent_23_spent = talent_23_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_23_avail > talent_23_spent
				If total_talents_spent >= talent_23_req
					If MouseHit(1)
						talent_23_spent = talent_23_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	;TALENT 24:
	If MouseX() > talent_24_x And MouseY() > talent_24_y And MouseX() < (talent_24_x+talent_box_size) And MouseY() < (talent_24_y+talent_box_size)
		talent_name$ = "Last Stand"			
		talent_line1$ = "When your Hull Integrity has fallen to 0%, "+create_protection_no_armor_counter+" ships"
		talent_line2$ = "will come to help you until your Hull Integrity"
		talent_line3$ = "has risen above 0%, at that point they will retreat."
		talent_line4$ = "These ships will not trigger bonuses from other"
		talent_line5$ = "talents or abilities that trigger from Protection."
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = "Next rank: "+(create_protection_no_armor_counter+1)+" ships"
		talent_line9$ = "Requires "+talent_24_req+" talents spent"
		mouse_over = True
		If talent_24_spent = 0
			create_protection_no_armor_counter = 0
		EndIf
		If talent_24_spent = 1
			create_protection_no_armor_counter = 1
		EndIf
		If talent_24_spent = 2				
			create_protection_no_armor_counter = 2
		EndIf 
		If talent_24_spent = 3
			create_protection_no_armor_counter = 3
		EndIf
		If talent_24_spent = 4				
			create_protection_no_armor_counter = 4
		EndIf 
		If talent_24_spent = talent_24_avail
			talent_line8$ = ""
		EndIf 
		If talents_available > 0
			If talent_24_avail > talent_24_spent
				If total_talents_spent >= talent_24_req
					If MouseHit(1)
						talent_24_spent = talent_24_spent + 1
						talents_available = talents_available - 1
						total_talents_spent = total_talents_spent + 1
					EndIf 
				EndIf 
			EndIf 
		EndIf
	EndIf
	
	 
	
	
	Color 255,255,255
	If MouseX() > 115 And MouseX() < 215 And MouseY() > 315 And MouseY() < 340;reset talents
		mouse_over = True 
		talent_name$ = "Reset Talents"
		talent_line1$ = "Resets all of your talents. This cannot be undone!"
		talent_line2$ = ""
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = ""
		talent_line9$ = ""
		If MouseHit(1)
			If sounds = True 
				PlaySound button_click
			EndIf 
			talents_available = total_talents_spent + talents_available
			total_talents_spent = 0
			reset_talents(); in reset_talents.bb you can find out what this function does
			clear_levels()
		EndIf 
		Color 0,255,0
	EndIf 
	
	Rect 115,315,100,25,False
	Color 255,255,255
	Text 165,320,"Reset talents",True
	
	
	
	
	;back button
	talent_done = False 
	If MouseX() > 20 And MouseX() < 95 And MouseY() > 560 And MouseY() < 580
		talent_done = True 
		mouse_over = True
		If MouseHit(1)
			If sounds = True 
				PlaySound button_click
			EndIf 
			mode = 94
		EndIf 
	EndIf
	If talent_done = True
		Color 0,255,0
	EndIf 
	If talent_done = False 
		Color 255,255,255
	EndIf 
	Rect 20,560,75,20,False ; the done button
	Color 255,255,255
	Text 57,562,"Back",True
	
	
	; flush the keys if the mouse is not hovering over anything
	If mouse_over = False
		FlushMouse
		talent_name$ = ""
		talent_line1$ = ""
		talent_line2$ = ""
		talent_line3$ = ""
		talent_line4$ = ""
		talent_line5$ = ""
		talent_line6$ = ""
		talent_line7$ = ""
		talent_line8$ = ""
		talent_line9$ = ""
		no_green = False 
		talents_mouse_over = False 
	EndIf
	
	

End Function