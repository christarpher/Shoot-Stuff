Include "variables.bb"
Include "draw.bb"


Function draw_market()

	Text 100,30,"Tokens Left: "+tokens,True,True
	
	Rect 680,100,310,30,False 
	Rect 680,140,310,150,False 
	Text 840,115,name_buy$,True,True 
	Text 685,155,line1_buy$,False,True 
	Text 685,175,line2_buy$,False,True 
	Text 685,195,line3_buy$,False,True 
	Text 685,215,line4_buy$,False,True 
	Text 685,235,line5_buy$,False,True 
	Text 685,255,line6_buy$,False,True 
	Text 685,275,line7_buy$,False,True 
	
	already_full_counter = already_full_counter + 1
	not_enough_tokens = not_enough_tokens + 1
	not_unlocked = not_unlocked + 1
	
	If already_full_counter <= 120 Then 
		Rect 680,360,310,20,False
		Text 835,370,"You already have that accessory!",True,True 
	EndIf 
	If not_enough_tokens <= 120 Then 
		Rect 680,330,310,20,False
		Text 835,340,"You do not have enough tokens!",True,True 
	EndIf 
	If not_unlocked <= 120 Then 
		Rect 680,300,310,20,False
		Text 835,310,"You have not unlocked that ability yet!",True,True 
	EndIf 

	If MouseX() > 50 And MouseX() < 200 And MouseY() > 100 And MouseY() < 130; talent
		talent_mouse_over = True 
		name_buy$ = "Buy an extra talent point"
		line1_buy$ = "Buying this will give you an extra talent point that you"
		line2_buy$ = "can use to upgrade your ship "
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+talent_cost+" token(s)."
		If talent_cost <= tokens
			If MouseHit(1)
					If sounds = True 
						PlaySound button_click
					EndIf 
					talents_available = talents_available + 1
					tokens = tokens - talent_cost
					extra_talents = extra_talents + 1 
			EndIf 
		EndIf
		If talent_cost > tokens 
			If MouseHit(1)
				not_enough_tokens = 0 
			EndIf 
		EndIf 
		
		
	Else If MouseX() > 50 And MouseX() < 200 And MouseY() > 400 And MouseY() < 430; talent
		nuclear_fission_mouse_over = True 
		name_buy$ = "Nuclear Fission"
		line1_buy$ = "Buying this accessory will make your Mega shot"
		line2_buy$ = "continually create plasma bursts in every direction"
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+nuclear_fission_acc_cost+" token(s)."
		If nuclear_fission_unlocked = True
			If MouseHit(1)
				already_full_counter = 0
			EndIf 
		EndIf
		If nuclear_fission_acc_cost <= tokens
			If MouseHit(1)
				If nuclear_fission_unlocked = False
					If sounds = True 
						PlaySound button_click
					EndIf 
					tokens = tokens - nuclear_fission_acc_cost
					nuclear_fission_unlocked = True
				EndIf 
			EndIf 
		EndIf
		If nuclear_fission_acc_cost > tokens 
			If MouseHit(1)
				not_enough_tokens = 0 
			EndIf 
		EndIf 
		
		
	
	Else If MouseX() > 50 And MouseX() < 200 And MouseY() > 220 And MouseY() < 250; talent
		partial_phase_mouse_over = True 
		name_buy$ = "Partial Phase"
		line1_buy$ = "Buying this accessory will allow you to continue using"
		line2_buy$ = "other abilities while using your Phase Inverter."
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+partial_phase_acc_cost+" token(s)."
		If partial_phase_unlocked = True
			If MouseHit(1)
				already_full_counter = 0
			EndIf 
		EndIf
		If partial_phase_acc_cost <= tokens
			If MouseHit(1)
				If partial_phase_unlocked = False
					If sounds = True 
						PlaySound button_click
					EndIf 
					tokens = tokens - partial_phase_acc_cost
					partial_phase_unlocked = True
				EndIf 
			EndIf 
		EndIf
		If partial_phase_acc_cost > tokens 
			If MouseHit(1)
				not_enough_tokens = 0 
			EndIf 
		EndIf 
		
		
		
		
	Else If MouseX() > 50 And MouseX() < 200 And MouseY() > 280 And MouseY() < 310; talent
		reactive_shielding_mouse_over = True 
		name_buy$ = "Reactive Shielding"
		line1_buy$ = "Buying this accessory will make your shield shoot a"
		line2_buy$ = "plasma burst in a random direction when absorbing a"
		line3_buy$ = "hit."
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+reactive_shielding_acc_cost+" token(s)."
		If reactive_shielding_unlocked = True
			If MouseHit(1)
				already_full_counter = 0
			EndIf 
		EndIf
		If reactive_shielding_acc_cost <= tokens
			If MouseHit(1)
				If reactive_shielding_unlocked = False
					If sounds = True 
						PlaySound button_click
					EndIf 
					tokens = tokens - reactive_shielding_acc_cost
					reactive_shielding_unlocked = True
				EndIf 
			EndIf 
		EndIf
		If reactive_shielding_acc_cost > tokens 
			If MouseHit(1)
				not_enough_tokens = 0 
			EndIf 
		EndIf 
		
		
		
	Else If MouseX() > 50 And MouseX() < 200 And MouseY() > 340 And MouseY() < 370; talent
		protective_backup_mouse_over = True 
		name_buy$ = "Protective Backup"
		line1_buy$ = "Buying this accessory will give you 1.5 seconds of"
		line2_buy$ = "shield for every protection ship on the field."
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+protective_backup_acc_cost+" token(s)."
		If protective_backup_unlocked = True
			If MouseHit(1)
				already_full_counter = 0
			EndIf 
		EndIf
		If protective_backup_acc_cost <= tokens
			If MouseHit(1)
				If protective_backup_unlocked = False
					If sounds = True 
						PlaySound button_click
					EndIf 
					tokens = tokens - protective_backup_acc_cost
					protective_backup_unlocked = True
				EndIf 
			EndIf 
		EndIf
		If protective_backup_acc_cost > tokens 
			If MouseHit(1)
				not_enough_tokens = 0 
			EndIf 
		EndIf 
		
	
	Else If MouseX() > 50 And MouseX() < 200 And MouseY() > 160 And MouseY() < 190; talent
		energy_split_mouse_over = True 
		name_buy$ = "Energy Split"
		line1_buy$ = "Buying this accessory will make your wide shot fire"
		line2_buy$ = "2 plasma bursts at 30 degree angles from the center."
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+energy_split_acc_cost+" token(s)."
		If energy_split_unlocked = True
			If MouseHit(1)
				already_full_counter = 0
			EndIf 
		EndIf
		If energy_split_acc_cost <= tokens
			If MouseHit(1)
				If energy_split_unlocked = False
					If sounds = True 
						PlaySound button_click
					EndIf 
					tokens = tokens - energy_split_acc_cost
					energy_split_unlocked = True
				EndIf 
			EndIf 
		EndIf
		If energy_split_acc_cost > tokens 
			If MouseHit(1)
				not_enough_tokens = 0 
			EndIf 
		EndIf 
	
	
			

			
			
	Else If MouseX() > 250 And MouseX() < 360 And MouseY() > 100 And MouseY() < 130;generator
		life_support_generator_mouse_over = True
		name_buy$ = "Emergency Life Support Generator I"
		line1_buy$ = "This is an item that can be equipped. It regenerates"
		line2_buy$ = "2% of your Life Support every 3 seconds (passive)"
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+life_support_generator_cost+" token(s) Each."
		
		If MouseHit(1)
			If tokens < life_support_generator_cost
				not_enough_tokens = 0 
			EndIf
			If life_support_generator_unlocked = True
				already_full_counter = 0
			EndIf 
			If tokens >= life_support_generator_cost And life_support_generator_unlocked = False 
				If sounds = True 
					PlaySound button_click
				EndIf 
				life_support_generator_unlocked = True
				tokens = tokens - life_support_generator_cost
			EndIf
		EndIf
		
			
			
			
	Else If MouseX() > 250 And MouseX() < 360 And MouseY() > 160 And MouseY() < 190;generator
		hull_generator_mouse_over = True
		name_buy$ = "Hull Generator I"
		line1_buy$ = "This is an item that can be equipped. It regenerates"
		line2_buy$ = "1% of your hull integrity every 3 seconds (passive)"
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+hull_generator_cost+" token(s) Each."
		If MouseHit(1)
			If tokens < hull_generator_cost
				not_enough_tokens = 0 
			EndIf
			If hull_generator_unlocked = True
				already_full_counter = 0
			EndIf 
			If tokens >= hull_generator_cost And hull_generator_unlocked = False 
				If sounds = True 
					PlaySound button_click
				EndIf 
				hull_generator_unlocked = True
				tokens = tokens - hull_generator_cost
			EndIf
		EndIf
		
		
	Else If MouseX() > 250 And MouseX() < 360 And MouseY() > 220 And MouseY() < 250;generator
		laser_generator_mouse_over = True
		name_buy$ = "Phaser Generator I"
		line1_buy$ = "This is an item that can be equipped. It re-charges"
		line2_buy$ = "1% of your phaser battery every 3 seconds (passive)"
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+laser_generator_cost+" token(s) Each."
		If MouseHit(1)
			If tokens < laser_generator_cost
				not_enough_tokens = 0 
			EndIf
			If laser_generator_unlocked = True
				already_full_counter = 0
			EndIf 
			If tokens >= laser_generator_cost And laser_generator_unlocked = False 
				If sounds = True 
					PlaySound button_click
				EndIf 
				laser_generator_unlocked = True
				tokens = tokens - laser_generator_cost
			EndIf
		EndIf
		
		
	Else If MouseX() > 250 And MouseX() < 360 And MouseY() > 280 And MouseY() < 310;generator
		shield_generator_mouse_over = True
		name_buy$ = "Shield Generator I"
		line1_buy$ = "This is an item that can be equipped. It re-charges"
		line2_buy$ = "1% of your shield battery every 3 seconds (passive)"
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+shield_generator_cost+" token(s) Each."
		If MouseHit(1)
			If tokens < shield_generator_cost
				not_enough_tokens = 0 
			EndIf
			If shield_generator_unlocked = True
				already_full_counter = 0
			EndIf 
			If tokens >= shield_generator_cost And shield_generator_unlocked = False 
				If sounds = True 
					PlaySound button_click
				EndIf 
				shield_generator_unlocked = True
				tokens = tokens - shield_generator_cost
			EndIf
		EndIf
		
		
	Else If MouseX() > 250 And MouseX() < 360 And MouseY() > 340 And MouseY() < 370;generator
		laser_capacitor_mouse_over = True
		name_buy$ = "Empowered Laser Capacitors I"
		line1_buy$ = "This is an item that can be equipped. It Gives you a"
		line2_buy$ = "10% chance to crit on standard laser shots. (passive)"
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+laser_capacitor_cost+" token(s) Each."
		If MouseHit(1)
			If tokens < laser_capacitor_cost
				not_enough_tokens = 0 
			EndIf
			If laser_capacitor_unlocked = True
				already_full_counter = 0
			EndIf 
			If tokens >= laser_capacitor_cost And laser_capacitor_unlocked = False 
				If sounds = True 
					PlaySound button_click
				EndIf 
				laser_capacitor_unlocked = True
				tokens = tokens - laser_capacitor_cost
			EndIf
		EndIf
		
		
	Else If MouseX() > 375 And MouseX() < 485 And MouseY() > 100 And MouseY() < 130;generator
		life_support_generator_2_mouse_over = True
		name_buy$ = "Emergency Life Support Generator II"
		line1_buy$ = "This is an item that can be equipped. It regenerates"
		line2_buy$ = "2% of your Life Support every 2 seconds (passive)"
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+life_support_generator_2_cost+" token(s) Each. Requires Rank I"
		If MouseHit(1)
			If tokens < life_support_generator_2_cost
				not_enough_tokens = 0 
			EndIf
			If life_support_generator_2_unlocked = True
				already_full_counter = 0
			EndIf 
			If life_support_generator_unlocked = False 
				not_unlocked = 0
			EndIf 
			If tokens >= life_support_generator_2_cost And life_support_generator_2_unlocked = False 
				If life_support_generator_unlocked = True
					If sounds = True 
						PlaySound button_click
					EndIf 
					life_support_generator_2_unlocked = True
					tokens = tokens - life_support_generator_2_cost
				EndIf 
			EndIf
		EndIf
		
	Else If MouseX() > 375 And MouseX() < 485 And MouseY() > 160 And MouseY() < 190;generator
		hull_generator_2_mouse_over = True
		name_buy$ = "Hull Generator II"
		line1_buy$ = "This is an item that can be equipped. It regenerates"
		line2_buy$ = "1% of your hull integrity every 2 seconds (passive)"
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+hull_generator_2_cost+" token(s) Each. Requires Rank I"
		If MouseHit(1)
			If tokens < hull_generator_2_cost
				not_enough_tokens = 0 
			EndIf
			If hull_generator_2_unlocked = True
				already_full_counter = 0
			EndIf 
			If hull_generator_unlocked = False 
				not_unlocked = 0
			EndIf 
			If tokens >= hull_generator_2_cost And hull_generator_2_unlocked = False 
				If hull_generator_unlocked = True
					If sounds = True 
						PlaySound button_click
					EndIf 
					hull_generator_2_unlocked = True
					tokens = tokens - hull_generator_2_cost
				EndIf 
			EndIf
		EndIf
		
	Else If MouseX() > 375 And MouseX() < 485 And MouseY() > 220 And MouseY() < 250;generator
		laser_generator_2_mouse_over = True
		name_buy$ = "Phaser Generator II"
		line1_buy$ = "This is an item that can be equipped. It re-charges"
		line2_buy$ = "1% of your phaser battery every 2 seconds (passive)"
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+laser_generator_2_cost+" token(s) Each. Requires Rank I"
		If MouseHit(1)
			If tokens < laser_generator_2_cost
				not_enough_tokens = 0 
			EndIf
			If laser_generator_2_unlocked = True
				already_full_counter = 0
			EndIf 
			If laser_generator_unlocked = False 
				not_unlocked = 0
			EndIf 
			If tokens >= laser_generator_2_cost And laser_generator_2_unlocked = False 
				If laser_generator_unlocked = True
					If sounds = True 
						PlaySound button_click
					EndIf 
					laser_generator_2_unlocked = True
					tokens = tokens - laser_generator_2_cost
				EndIf 
			EndIf
		EndIf
		
	Else If MouseX() > 375 And MouseX() < 485 And MouseY() > 280 And MouseY() < 310;generator
		shield_generator_2_mouse_over = True
		name_buy$ = "Shield Generator II"
		line1_buy$ = "This is an item that can be equipped. It re-charges"
		line2_buy$ = "1% of your shield battery every 2 seconds (passive)"
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+shield_generator_2_cost+" token(s) Each. Requires Rank I"
		If MouseHit(1)
			If tokens < shield_generator_2_cost
				not_enough_tokens = 0 
			EndIf
			If shield_generator_2_unlocked = True
				already_full_counter = 0
			EndIf 
			If shield_generator_unlocked = False 
				not_unlocked = 0
			EndIf 
			If tokens >= shield_generator_2_cost And shield_generator_2_unlocked = False 
				If shield_generator_unlocked = True
					If sounds = True 
						PlaySound button_click
					EndIf 
					shield_generator_2_unlocked = True
					tokens = tokens - shield_generator_2_cost
				EndIf 
			EndIf
		EndIf
		
	Else If MouseX() > 375 And MouseX() < 485 And MouseY() > 340 And MouseY() < 370;generator
		laser_capacitor_2_mouse_over = True
		name_buy$ = "Empowered Laser Capacitors II"
		line1_buy$ = "This is an item that can be equipped. It Gives you a"
		line2_buy$ = "20% chance to crit on standard laser shots. (passive)"
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+laser_capacitor_2_cost+" token(s) Each. Requires Rank I"
		If MouseHit(1)
			If tokens < laser_capacitor_2_cost
				not_enough_tokens = 0 
			EndIf
			If laser_capacitor_2_unlocked = True
				already_full_counter = 0
			EndIf 
			If laser_capacitor_unlocked = False 
				not_unlocked = 0
			EndIf 
			If tokens >= laser_capacitor_2_cost And laser_capacitor_2_unlocked = False 
				If laser_capacitor_unlocked = True
					If sounds = True 
						PlaySound button_click
					EndIf 
					laser_capacitor_2_unlocked = True
					tokens = tokens - laser_capacitor_2_cost
				EndIf 
			EndIf
		EndIf
		
		
	Else If MouseX() > 500 And MouseX() < 610 And MouseY() > 100 And MouseY() < 130;generator
		life_support_generator_3_mouse_over = True
		name_buy$ = "Emergency Life Support Generator III"
		line1_buy$ = "This is an item that can be equipped. It regenerates"
		line2_buy$ = "2% of your Life Support every second (passive)"
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+life_support_generator_3_cost+" token(s) Each. Requires Rank II"
		If MouseHit(1)
			If tokens < life_support_generator_3_cost
				not_enough_tokens = 0 
			EndIf
			If life_support_generator_3_unlocked = True
				already_full_counter = 0
			EndIf 
			If life_support_generator_2_unlocked = False 
				not_unlocked = 0
			EndIf 
			If tokens >= life_support_generator_3_cost And life_support_generator_3_unlocked = False 
				If life_support_generator_2_unlocked = True
					If sounds = True 
						PlaySound button_click
					EndIf 
					life_support_generator_3_unlocked = True
					tokens = tokens - life_support_generator_3_cost
				EndIf 
			EndIf
		EndIf
		
	Else If MouseX() > 500 And MouseX() < 610 And MouseY() > 160 And MouseY() < 190;generator
		hull_generator_3_mouse_over = True
		name_buy$ = "Hull Generator III"
		line1_buy$ = "This is an item that can be equipped. It regenerates"
		line2_buy$ = "1% of your hull integrity every second (passive)"
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+hull_generator_3_cost+" token(s) Each. Requires Rank II"
		If MouseHit(1)
			If tokens < hull_generator_3_cost
				not_enough_tokens = 0 
			EndIf
			If hull_generator_3_unlocked = True
				already_full_counter = 0
			EndIf 
			If hull_generator_2_unlocked = False 
				not_unlocked = 0
			EndIf 
			If tokens >= hull_generator_3_cost And hull_generator_3_unlocked = False 
				If hull_generator_2_unlocked = True
					If sounds = True 
						PlaySound button_click
					EndIf 
					hull_generator_3_unlocked = True
					tokens = tokens - hull_generator_3_cost
				EndIf 
			EndIf
		EndIf
		
	Else If MouseX() > 500 And MouseX() < 610 And MouseY() > 220 And MouseY() < 250;generator
		laser_generator_3_mouse_over = True
		name_buy$ = "Phaser Generator III"
		line1_buy$ = "This is an item that can be equipped. It re-charges"
		line2_buy$ = "1% of your phaser battery every second (passive)"
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+laser_generator_3_cost+" token(s) Each. Requires Rank II"
		If MouseHit(1)
			If tokens < laser_generator_3_cost
				not_enough_tokens = 0 
			EndIf
			If laser_generator_3_unlocked = True
				already_full_counter = 0
			EndIf 
			If laser_generator_2_unlocked = False 
				not_unlocked = 0
			EndIf 
			If tokens >= laser_generator_3_cost And laser_generator_3_unlocked = False 
				If laser_generator_2_unlocked = True
					If sounds = True 
						PlaySound button_click
					EndIf 
					laser_generator_3_unlocked = True
					tokens = tokens - laser_generator_3_cost
				EndIf 
			EndIf
		EndIf
		
	Else If MouseX() > 500 And MouseX() < 610 And MouseY() > 280 And MouseY() < 310;generator
		shield_generator_3_mouse_over = True
		name_buy$ = "Shield Generator III"
		line1_buy$ = "This is an item that can be equipped. It re-charges"
		line2_buy$ = "1% of your shield battery every second (passive)"
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+shield_generator_3_cost+" token(s) Each. Requires Rank II"
		If MouseHit(1)
			If tokens < shield_generator_3_cost
				not_enough_tokens = 0 
			EndIf
			If shield_generator_3_unlocked = True
				already_full_counter = 0
			EndIf 
			If shield_generator_2_unlocked = False 
				not_unlocked = 0
			EndIf 
			If tokens >= shield_generator_3_cost And shield_generator_3_unlocked = False 
				If shield_generator_2_unlocked = True
					If sounds = True 
						PlaySound button_click
					EndIf 
					shield_generator_3_unlocked = True
					tokens = tokens - shield_generator_3_cost
				EndIf 
			EndIf
		EndIf
		
	Else If MouseX() > 500 And MouseX() < 610 And MouseY() > 340 And MouseY() < 370;generator
		laser_capacitor_3_mouse_over = True
		name_buy$ = "Empowered Laser Capacitors III"
		line1_buy$ = "This is an item that can be equipped. It Gives you a"
		line2_buy$ = "30% chance to crit on standard laser shots. (passive)"
		line3_buy$ = ""
		line4_buy$ = ""
		line5_buy$ = ""
		line6_buy$ = ""
		line7_buy$ = "Costs "+laser_capacitor_3_cost+" token(s) Each. Requires Rank II"
		If MouseHit(1)
			If tokens < laser_capacitor_3_cost
				not_enough_tokens = 0 
			EndIf
			If laser_capacitor_3_unlocked = True
				already_full_counter = 0
			EndIf 
			If laser_capacitor_2_unlocked = False 
				not_unlocked = 0
			EndIf 
			If tokens >= laser_capacitor_3_cost And laser_capacitor_3_unlocked = False 
				If laser_capacitor_2_unlocked = True
					If sounds = True 
						PlaySound button_click
					EndIf 
					laser_capacitor_3_unlocked = True
					tokens = tokens - laser_capacitor_3_cost
				EndIf 
			EndIf
		EndIf
		
		
	Else 
		If done_hover_station = False 
			FlushKeys
			FlushMouse 
			talent_mouse_over = False 
			talents_mouse_over = False 
			life_support_generator_mouse_over = False 
			hull_generator_mouse_over = False 
			laser_generator_mouse_over = False 
			shield_generator_mouse_over = False 
			laser_capacitor_mouse_over = False 
			life_support_generator_2_mouse_over = False 
			hull_generator_2_mouse_over = False 
			laser_generator_2_mouse_over = False 
			shield_generator_2_mouse_over = False 
			laser_capacitor_2_mouse_over = False 
			life_support_generator_3_mouse_over = False 
			hull_generator_3_mouse_over = False 
			laser_generator_3_mouse_over = False 
			shield_generator_3_mouse_over = False 
			laser_capacitor_3_mouse_over = False 
			nuclear_fission_mouse_over = False
			reactive_shielding_mouse_over = False
			protective_backup_mouse_over = False
			energy_split_mouse_over = False
			partial_phase_mouse_over = False 
			name_buy$ = ""
			line1_buy$ = ""
			line2_buy$ = ""
			line3_buy$ = ""
			line4_buy$ = ""
			line5_buy$ = ""
			line6_buy$ = ""
			line7_buy$ = ""
		EndIf 
	EndIf  
	
	Color 255,255,255
	If tokens < talent_cost Then Color 122,122,122
	Text 125,115,"Buy Talent Point",True,True
	If talent_mouse_over = True Then Color 0,255,0
	Rect 50,100,150,30,False
	
	Color 255,255,255
	If tokens < energy_split_acc_cost Or energy_split_unlocked = True Then Color 122,122,122
	Text 125,175,"Energy Split",True,True
	If energy_split_mouse_over = True Then Color 0,255,0
	Rect 50,160,150,30,False
	
	Color 255,255,255
	If tokens < partial_phase_acc_cost Or partial_phase_unlocked = True Then Color 122,122,122
	Text 125,235,"Partial Phase",True,True
	If partial_phase_mouse_over = True Then Color 0,255,0
	Rect 50,220,150,30,False
	
	Color 255,255,255
	If tokens < reactive_shielding_acc_cost Or reactive_shielding_unlocked = True Then Color 122,122,122
	Text 125,295,"Reactive Shielding",True,True
	If reactive_shielding_mouse_over = True Then Color 0,255,0
	Rect 50,280,150,30,False
	
	Color 255,255,255
	If tokens < protective_backup_acc_cost Or protective_backup_unlocked = True Then Color 122,122,122
	Text 125,355,"Protective Backup",True,True
	If protective_backup_mouse_over = True Then Color 0,255,0
	Rect 50,340,150,30,False
	
	Color 255,255,255
	If tokens < nuclear_fission_acc_cost Or nuclear_fission_unlocked = True Then Color 122,122,122
	Text 125,415,"Nuclear Fission",True,True
	If nuclear_fission_mouse_over = True Then Color 0,255,0
	Rect 50,400,150,30,False
	
	If life_support_generator_unlocked = False Then Color 255,255,255
	If life_support_generator_unlocked = True Or tokens < life_support_generator_cost Then Color 122,122,122
	Text 305,115,"Life Support",True,True
	If life_support_generator_mouse_over = True Then Color 0,255,0
	Rect 250,100,110,30,False
	
	If hull_generator_unlocked = False Then Color 255,255,255
	If hull_generator_unlocked = True Or tokens < hull_generator_cost Then Color 122,122,122
	Text 305,175,"Hull Generator",True,True
	If hull_generator_mouse_over = True Then Color 0,255,0
	Rect 250,160,110,30,False
	
	If laser_generator_unlocked = False Then Color 255,255,255
	If laser_generator_unlocked = True Or tokens < laser_generator_cost Then Color 122,122,122
	Text 305,235,"Phaser Generator",True,True
	If laser_generator_mouse_over = True Then Color 0,255,0
	Rect 250,220,110,30,False
	
	If shield_generator_unlocked = False Then Color 255,255,255
	If shield_generator_unlocked = True Or tokens < shield_generator_cost Then Color 122,122,122
	Text 305,295,"Shield Generator",True,True
	If shield_generator_mouse_over = True Then Color 0,255,0
	Rect 250,280,110,30,False
	
	If laser_capacitor_unlocked = False Then Color 255,255,255
	If laser_capacitor_unlocked = True Or tokens < laser_capacitor_cost Then Color 122,122,122
	Text 305,355,"Capacitors",True,True
	If laser_capacitor_mouse_over = True Then Color 0,255,0
	Rect 250,340,110,30,False
	
	
	
	If life_support_generator_unlocked = True And tokens >= life_support_generator_cost Then Color 255,255,255
	If life_support_generator_unlocked = False Or tokens < life_support_generator_cost Or life_support_generator_2_unlocked = True Then Color 122,122,122
	Text 430,115,"Life Support II",True,True
	If life_support_generator_2_mouse_over = True Then Color 0,255,0
	Rect 375,100,110,30,False
	
	If hull_generator_unlocked = True And tokens >= hull_generator_cost Then Color 255,255,255
	If hull_generator_unlocked = False Or tokens < hull_generator_cost Or hull_generator_2_unlocked = True Then Color 122,122,122
	Text 430,175,"Hull Generator II",True,True
	If hull_generator_2_mouse_over = True Then Color 0,255,0
	Rect 375,160,110,30,False
	
	If laser_generator_unlocked = True And tokens >= laser_generator_cost Then Color 255,255,255
	If laser_generator_unlocked = False Or tokens < laser_generator_cost Or laser_generator_2_unlocked = True Then Color 122,122,122
	Text 430,235,"Phaser Generator II",True,True
	If laser_generator_2_mouse_over = True Then Color 0,255,0
	Rect 375,220,110,30,False
	
	If shield_generator_unlocked = True And tokens >= shield_generator_cost Then Color 255,255,255
	If shield_generator_unlocked = False Or tokens < shield_generator_cost Or shield_generator_2_unlocked = True Then Color 122,122,122
	Text 430,295,"Shield Generator II",True,True
	If shield_generator_2_mouse_over = True Then Color 0,255,0
	Rect 375,280,110,30,False
	
	If laser_capacitor_unlocked = True And tokens >= laser_capacitor_cost Then Color 255,255,255
	If laser_capacitor_unlocked = False Or tokens < laser_capacitor_cost Or laser_capacitor_2_unlocked = True Then Color 122,122,122
	Text 430,355,"Capacitors II",True,True
	If laser_capacitor_2_mouse_over = True Then Color 0,255,0
	Rect 375,340,110,30,False
	
	
	
	
	If life_support_generator_2_unlocked = True And tokens >= hull_generator_cost Then Color 255,255,255
	If life_support_generator_2_unlocked = False Or tokens < life_support_generator_cost Or life_support_generator_3_unlocked = True Then Color 122,122,122
	Text 555,115,"Life Support III",True,True
	If life_support_generator_3_mouse_over = True Then Color 0,255,0
	Rect 500,100,110,30,False
	
	If hull_generator_2_unlocked = True And tokens >= hull_generator_cost Then Color 255,255,255
	If hull_generator_2_unlocked = False Or tokens < hull_generator_cost Or hull_generator_3_unlocked = True Then Color 122,122,122
	Text 555,175,"Hull Generator III",True,True
	If hull_generator_3_mouse_over = True Then Color 0,255,0
	Rect 500,160,110,30,False
	
	If laser_generator_2_unlocked = True And tokens >= laser_generator_cost Then Color 255,255,255
	If laser_generator_2_unlocked = False Or tokens < laser_generator_cost Or laser_generator_3_unlocked = True Then Color 122,122,122
	Text 555,235,"Phaser Generator III",True,True
	If laser_generator_3_mouse_over = True Then Color 0,255,0
	Rect 500,220,110,30,False
	
	If shield_generator_2_unlocked = True And tokens >= shield_generator_cost Then Color 255,255,255
	If shield_generator_2_unlocked = False Or tokens < shield_generator_cost Or shield_generator_3_unlocked = True Then Color 122,122,122
	Text 555,295,"Shield Generator III",True,True
	If shield_generator_3_mouse_over = True Then Color 0,255,0
	Rect 500,280,110,30,False
	
	If laser_capacitor_2_unlocked = True And tokens >= laser_capacitor_cost Then Color 255,255,255
	If laser_capacitor_2_unlocked = False Or tokens < laser_capacitor_cost Or laser_capacitor_3_unlocked = True Then Color 122,122,122
	Text 555,355,"Capacitors III",True,True
	If laser_capacitor_3_mouse_over = True Then Color 0,255,0
	Rect 500,340,110,30,False
	
	;Text 512,300,not_unlocked,True,True 
End Function