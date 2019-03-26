Include "variables.bb"
	Function display_talent_gui()	
		Rect 20,300,190,90,False ; description box
		Text 25,310,talent_line1$,False
		Text 25,330,talent_line2$,False
		Color 0,255,0
		If no_green = True
			Color 255,255,255
		EndIf 
		Text 25,350,talent_line3$,False
		Color 255,255,255
		Text 25,370,talent_line4$,False
		Rect 20,250,190,30,False ; talent name box
		Text 115,258,talent_name$,True,False  
		Rect 20,100,190,20,False ; available talents box
		Text 110,102,"Talents available: "+talents_available,True
		
		Text 375,265,"Offensive Talents:",True
		Text 725,265,"Defensive Talents:",True
		
		Text 25,450,"Offensive Talents spent: "+side_a_talents_spent,False
		Text 25,470,"Defensive Talents spent: "+side_b_talents_spent,False
		Text 25,490,"Ability Talents spent: "+ability_talents_spent,False
		Text 25,510,"Total Talents spent: "+total_talents_spent,False
		
		Color 255,255,255
		Text 940,560,"Reset Talents",True,True
		If talents_mouse_over = True Then Color 0,255,0
		Rect 890,545,100,30,False
		
		Color 255,255,255
		;SET 1
		If talent_1_spent > 0 And talent_1_spent < talent_1_avail Then Color 0,0,255
		If talent_1_spent = 0 Then Color 255,255,255
		If talent_1_spent = talent_1_avail Then Color 0,255,0
		Rect 250,300,50,50,False ;talent 1
			Line 250,349,299,300
			Text 260,305,talent_1_spent,True
			Text 290,330,talent_1_avail,True
			
		If talent_2_spent > 0 And talent_2_spent < talent_2_avail Then Color 0,0,255
		If talent_2_spent = 0 Then Color 255,255,255
		If talent_2_spent = talent_2_avail Then Color 0,255,0
		Rect 350,300,50,50,False ;talent 2
			Line 350,349,399,300
			Text 360,305,talent_2_spent,True
			Text 390,330,talent_2_avail,True
			
		If talent_3_spent > 0 And talent_3_spent < talent_3_avail Then Color 0,0,255
		If talent_3_spent = 0 Then Color 255,255,255
		If talent_3_spent = talent_3_avail Then Color 0,255,0
		Rect 450,300,50,50,False ;talent 3
			Line 450,349,499,300
			Text 460,305,talent_3_spent,True
			Text 490,330,talent_3_avail,True
			
			
		
		If talent_4_spent > 0 And talent_4_spent < talent_4_avail Then Color 0,0,255
		If talent_4_spent = 0 Then Color 255,255,255
		If talent_4_spent = talent_4_avail Then Color 0,255,0
		If side_a_talents_spent < talent_4_req Then Color 255,0,0
		Rect 250,400,50,50,False ;talent 4
			Line 250,449,299,400
			Text 260,405,talent_4_spent,True
			Text 290,430,talent_4_avail,True
			
		If talent_5_spent > 0 And talent_5_spent < talent_5_avail Then Color 0,0,255
		If talent_5_spent = 0 Then Color 255,255,255
		If talent_5_spent = talent_5_avail Then Color 0,255,0
		If side_a_talents_spent < talent_5_req Then Color 255,0,0
		Rect 350,400,50,50,False ;talent 5
			Line 350,449,399,400
			Text 360,405,talent_5_spent,True
			Text 390,430,talent_5_avail,True
		
		If talent_6_spent > 0 And talent_6_spent < talent_6_avail Then Color 0,0,255
		If talent_6_spent = 0 Then Color 255,255,255
		If talent_6_spent = talent_6_avail Then Color 0,255,0
		If side_a_talents_spent < talent_6_req Then Color 255,0,0
		Rect 450,400,50,50,False ;talent 6
			Line 450,449,499,400
			Text 460,405,talent_6_spent,True
			Text 490,430,talent_6_avail,True
			
			
		If talent_7_spent > 0 And talent_7_spent < talent_7_avail Then Color 0,0,255
		If talent_7_spent = 0 Then Color 255,255,255
		If talent_7_spent = talent_7_avail Then Color 0,255,0
		If side_a_talents_spent < talent_7_req Then Color 255,0,0
		Rect 300,500,50,50,False ;talent 7
			Line 300,549,349,500
			Text 310,505,talent_7_spent,True
			Text 340,530,talent_7_avail,True
			
			
		If talent_8_spent > 0 And talent_8_spent < talent_8_avail Then Color 0,0,255
		If talent_8_spent = 0 Then Color 255,255,255
		If talent_8_spent = talent_8_avail Then Color 0,255,0
		If side_a_talents_spent < talent_8_req Then Color 255,0,0
		Rect 400,500,50,50,False ;talent 8
			Line 400,549,449,500
			Text 410,505,talent_8_spent,True
			Text 440,530,talent_8_avail,True
		
		
		;SET 2
		If talent_9_spent > 0 And talent_9_spent < talent_9_avail Then Color 0,0,255
		If talent_9_spent = 0 Then Color 255,255,255
		If talent_9_spent = talent_9_avail Then Color 0,255,0
		Rect 600,300,50,50,False ;talent 9
			Line 600,349,649,300
			Text 610,305,talent_9_spent,True
			Text 640,330,talent_9_avail,True
			
		If talent_10_spent > 0 And talent_10_spent < talent_10_avail Then Color 0,0,255
		If talent_10_spent = 0 Then Color 255,255,255
		If talent_10_spent = talent_10_avail Then Color 0,255,0
		Rect 700,300,50,50,False ;talent 10
			Line 700,349,749,300
			Text 710,305,talent_10_spent,True
			Text 740,330,talent_10_avail,True
			
		If talent_11_spent > 0 And talent_11_spent < talent_11_avail Then Color 0,0,255
		If talent_11_spent = 0 Then Color 255,255,255
		If talent_11_spent = talent_11_avail Then Color 0,255,0
		Rect 800,300,50,50,False ;talent 11
			Line 800,349,849,300
			Text 810,305,talent_11_spent,True
			Text 840,330,talent_11_avail,True
		
		If talent_12_spent > 0 And talent_12_spent < talent_12_avail Then Color 0,0,255
		If talent_12_spent = 0 Then Color 255,255,255
		If talent_12_spent = talent_12_avail Then Color 0,255,0
		If side_b_talents_spent < talent_12_req Then Color 255,0,0
		Rect 600,400,50,50,False ;talent 12
			Line 600,449,649,400
			Text 610,405,talent_12_spent,True
			Text 640,430,talent_12_avail,True
			
		If talent_13_spent > 0 And talent_13_spent < talent_13_avail Then Color 0,0,255
		If talent_13_spent = 0 Then Color 255,255,255
		If talent_13_spent = talent_13_avail Then Color 0,255,0
		If side_b_talents_spent < talent_13_req Then Color 255,0,0
		Rect 700,400,50,50,False ;talent 13
			Line 700,449,749,400
			Text 710,405,talent_13_spent,True
			Text 740,430,talent_13_avail,True
			
		If talent_14_spent > 0 And talent_14_spent < talent_14_avail Then Color 0,0,255
		If talent_14_spent = 0 Then Color 255,255,255
		If talent_14_spent = talent_14_avail Then Color 0,255,0
		If side_b_talents_spent < talent_14_req Then Color 255,0,0
		Rect 800,400,50,50,False ;talent 14
			Line 800,449,849,400
			Text 810,405,talent_14_spent,True
			Text 840,430,talent_14_avail,True
			
		If talent_15_spent > 0 And talent_15_spent < talent_15_avail Then Color 0,0,255
		If talent_15_spent = 0 Then Color 255,255,255
		If talent_15_spent = talent_15_avail Then Color 0,255,0
		If side_b_talents_spent < talent_15_req Then Color 255,0,0
		Rect 650,500,50,50,False ;talent 15
			Line 650,549,699,500
			Text 660,505,talent_15_spent,True
			Text 690,530,talent_15_avail,True
			
		If talent_16_spent > 0 And talent_16_spent < talent_16_avail Then Color 0,0,255
		If talent_16_spent = 0 Then Color 255,255,255
		If talent_16_spent = talent_16_avail Then Color 0,255,0
		If side_b_talents_spent < talent_16_req Then Color 255,0,0
		Rect 750,500,50,50,False ;talent 16
			Line 750,549,799,500
			Text 760,505,talent_16_spent,True
			Text 790,530,talent_16_avail,True
		
		;ABILITIES
		If laser_spent = 0 Then Color 255,255,255
		If laser_spent = laser_avail Then Color 0,255,0
		If side_a_talents_spent < 7 Then Color 255,0,0
		Rect 250,150,50,50,False ;laser unlock
			Line 250,199,299,150
			Text 260,155,laser_spent,True
			Text 290,180,laser_avail,True
			
		If shield_spent = 0 Then Color 255,255,255
		If shield_spent = shield_avail Then Color 0,255,0
		If side_b_talents_spent < 7 Then Color 255,0,0
		Rect 433,150,50,50,False ;shield unlock
			Line 433,199,482,150
			Text 443,155,shield_spent,True
			Text 473,180,shield_avail,True
			
		If protection_spent = 0 Then Color 255,255,255
		If protection_spent = protection_avail Then Color 0,255,0
		If side_b_talents_spent < 14 Then Color 255,0,0
		Rect 616,150,50,50,False ;slow time unlock
			Line 616,199,665,150
			Text 626,155,protection_spent,True
			Text 656,180,protection_avail,True
			
		If megashot_spent = 0 Then Color 255,255,255
		If megashot_spent = megashot_avail Then Color 0,255,0
		If side_a_talents_spent < 14 Color 255,0,0
		Rect 800,150,50,50,False ;nuke unlock
			Line 800,199,849,150
			Text 810,155,megashot_spent,True
			Text 840,180,megashot_avail,True
			
		If talent_done = True
			Color 0,255,0
		EndIf 
		If talent_done = False 
			Color 255,255,255
		EndIf 
		Rect 20,560,75,20,False ; the done button
		Color 255,255,255
			Text 57,562,"Back",True

	End Function