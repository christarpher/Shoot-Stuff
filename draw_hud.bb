Include "variables.bb"

Function draw_hud()
	
	If level < 1 Then level = 1
	If level > 50 Then level = 50
	
	;Text 500,300, littleshots, True


	Color 0,0,0
		Rect 0,0,1024,60 ; so nothing shows through behind
	Color 255,255,255
		Line 0,60,1024,60 ; bottom line
		Line 200,60,200,0 ; left seperator
		
		;-------------- TEXT:
		
			;Text 165,45,"Level: "+level,True,True
			;Text 50,8,"Experience: ",True 
			Text 250,8,"Life Support: ",True 
			Text 250,38,"Hull Integrity: ",True 
			
		;Flush_keys = True 
			
		
		Color 255,255,255
		Rect 299,4,102,22,False ; Health Bar outline
			health_percent = health / 10
			If health_percent>50 Then Color 0,200,0
			If health_percent<=50 Then Color 255,255,0
			If health_percent<=20 Then Color 255,0,0
			Rect 300,5,health_percent,20,True
			
				
			
		Color 255,255,255
		Rect 299,34,102+(hull_integrity_increase#/10),22,False ; Armor Bar outline
			armor_percent = armor# / 10
			If armor_percent>50 Then Color 0,0,200
			If armor_percent<=50 Then Color 255,255,0
			If armor_percent<=20 Then Color 255,0,0
			Rect 300,35,armor_percent,20,True
			
			Color 255,255,255
			Rect 499,4,102,22,False ; first bar outline
			
			Color 255,255,255
			Rect 699,4,102,22,False ; Second bar outline
			
			Color 255,255,255
			Rect 899,4,102,22,False ; Third bar outline
			
			

			
			
		If a_laser = True
			If laser_spent > 0
				laser_percent = laser# / 10
				Color 20,85,245
				Rect 500,5,laser_percent,20,True
				Color 255,255,255
				Text 475,8,"Phaser: ",True 
				Text 550,15,laser_percent+" %",True,True 
			EndIf
		EndIf
		If a_shield = True
			If shield_spent > 0
				shield_percent = shield / 10
				Color 245,70,75
				Rect 500,5,shield_percent,20,True
				Color 255,255,255
				Text 475,8,"Shield: ",True 
				Text 550,15,shield_percent+" %",True,True 
			EndIf
			If shield_addition# > 0 Then
				shield_bar_length# = (shield_addition# / total_protection_shield_time#) * 100
				Color 50,20,200
				Rect 500,21,shield_bar_length#,4
			EndIf
		EndIf
		
		If a_protection = True
			If protection_spent > 0
				Color 100,215,220
				Rect 500,5,protection_percentage#,20,True
				Color 255,255,255
				Text 468,8,"Protection: ",True 
				Text 550,15,Floor(protection_charge)+" Charges",True,True 
			EndIf
		EndIf
		If a_wideshot = True
			Color 180,70,250
			Rect 500,5,wideshot_charge,20,True
			Color 255,255,255
			Text 468,8,"Wideshot: ",True 
			Text 550,15,wideshot_charge+" Charges",True,True 
		EndIf 
		If a_megashot = True
			If megashot_spent > 0
				Color 160,250,160
				Rect 500,5,megashot_charge*10,20,True
				Color 255,255,255
				Text 468,8,"Mega shot: ",True 
				Text 550,15,megashot_charge+" Charges",True,True 
			EndIf 
		EndIf 
		
		If a_phase_inverter = True
			If phase_inverter_spent > 0
				Color 115,190,200
				Rect 500,5,100/(1200+phase_inverter_time_added#)*phase_inverter_capacity#,20,True
				Color 255,255,255
				Text 455,8,"Phase Inverter",True 
				Text 550,15,Floor(phase_inverter_capacity#/60)+" Seconds",True,True 
			EndIf 
		EndIf 
			
			
			
			
		If s_laser = True
			If laser_spent > 0
				laser_percent = laser# / 10
				Color 20,85,245
				Rect 700,5,laser_percent,20,True
				Color 255,255,255
				Text 675,8,"Phaser: ",True 
				Text 750,15,laser_percent+" %",True,True 
			EndIf
		EndIf
		If s_shield = True
			If shield_spent > 0
				shield_percent = shield / 10
				Color 245,70,75
				Rect 700,5,shield_percent,20,True
				Color 255,255,255
				Text 675,8,"Shield: ",True 
				Text 750,15,shield_percent+" %",True,True 
			EndIf
			If shield_addition# > 0 Then
				shield_bar_length# = (shield_addition# / total_protection_shield_time#) * 100
				Color 50,20,200
				Rect 700,21,shield_bar_length#,4
			EndIf
		EndIf
		If s_protection = True
			If protection_spent > 0
				Color 100,215,220
				Rect 700,5,protection_percentage#,20,True
				Color 255,255,255
				Text 668,8,"Protection: ",True 
				Text 750,15,Floor(protection_charge)+" Charges",True,True 
			EndIf
		EndIf
		If s_wideshot = True
			Color 180,70,250
			Rect 700,5,wideshot_charge,20,True
			Color 255,255,255
			Text 668,8,"Wideshot: ",True 
			Text 750,15,wideshot_charge+" Charges",True,True 
		EndIf 
		If s_megashot = True
			If megashot_spent > 0
				Color 160,250,160
				Rect 700,5,megashot_charge*10,20,True
				Color 255,255,255
				Text 668,8,"Mega shot: ",True 
				Text 750,15,megashot_charge+" Charges",True,True
			EndIf 
		EndIf
		If s_phase_inverter = True
			If phase_inverter_spent > 0
				Color 115,190,200
				Rect 700,5,100/(1200+phase_inverter_time_added#)*phase_inverter_capacity#,20,True
				Color 255,255,255
				Text 655,8,"Phase Inverter",True 
				Text 750,15,Floor(phase_inverter_capacity#/60)+" Seconds",True,True 
			EndIf 
		EndIf 
			
			
			
		
		If d_laser = True
			If laser_spent > 0
				laser_percent = laser# / 10
				Color 20,85,245
				Rect 900,5,laser_percent,20,True
				Color 255,255,255
				Text 875,8,"Phaser: ",True 
				Text 950,15,laser_percent+" %",True,True 
			EndIf
		EndIf
		If d_shield = True
			If shield_spent > 0
				shield_percent = shield / 10
				Color 245,70,75
				Rect 900,5,shield_percent,20,True
				Color 255,255,255
				Text 875,8,"Shield: ",True 
				Text 950,15,shield_percent+" %",True,True 
			EndIf
			If shield_addition# > 0 Then
				shield_bar_length# = (shield_addition# / total_protection_shield_time#) * 100
				Color 50,20,200
				Rect 900,21,shield_bar_length#,4
			EndIf
		EndIf
		If d_protection = True
			If protection_spent > 0
				Color 100,215,220
				Rect 900,5,protection_percentage#,20,True
				Color 255,255,255
				Text 868,8,"Protection: ",True
				Text 950,15,Floor(protection_charge)+" Charges",True,True 
			EndIf
		EndIf
		If d_wideshot = True
			Color 180,70,250
			Rect 900,5,wideshot_charge,20,True
			Color 255,255,255
			Text 868,8,"Wideshot: ",True 
			Text 950,15,wideshot_charge+" Charges",True,True 
		EndIf 
		If d_megashot = True
			If megashot_spent > 0
				Color 160,250,160
				Rect 900,5,megashot_charge*10,20,True
				Color 255,255,255
				Text 868,8,"Mega shot: ",True 
				Text 950,15,megashot_charge+" Charges",True,True 
			EndIf
		EndIf 
		If d_phase_inverter = True
			If phase_inverter_spent > 0
				Color 115,190,200
				Rect 900,5,100/(1200+phase_inverter_time_added#)*phase_inverter_capacity#,20,True
				Color 255,255,255
				Text 855,8,"Phase Inverter",True 
				Text 950,15,Floor(phase_inverter_capacity#/60)+" Seconds",True,True 
			EndIf 
		EndIf 
		
		Text 350,15,health_percent+" %",True,True 
		Text 350+(hull_integrity_increase#/20),45,armor_percent+" %",True,True 
		





End Function