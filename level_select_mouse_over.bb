Include "variables.bb"
Include "functions.bb"


Function level_mouse_over()
zone_mouse_over = False 


;*************************************************
;           THIS IS THE MOUSE OVER ZONE 1
If MouseX() > 820 And MouseX() < 845 And MouseY() > 105 And MouseY() < 130
	zone_name$ = "Delta 6.3 B Asteroid Belt"
	zone_line1$ = "Where your journey begins."
	zone_line2$ = "Mission: Make your way through the"
	zone_line3$ = "Asteroid belt."
	zone_line4$ = ""
	zone_line5$ = ""
	zone_line6$ = ""
	zone_line7$ = ""
	zone_line8$ = ""
	zone_line9$ = "Difficulty: Easy"
	zone_1_mouse_over = True
	zone_mouse_over = True
	If zone_1_x_ Or zone_1_y < 50
		zone_1_x = zone_1_x + 4
		zone_1_y = zone_1_y + 4
	EndIf
	If MouseHit(1) = True
		If sounds = True 
			PlaySound button_click
		EndIf 
		SetFont font3 
		clear_levels()
		mode = 4
		start_music()
	EndIf 
EndIf 

;*************************************************
;           THIS IS THE MOUSE OVER ZONE 2
If level_completed >= 1
	If MouseX() > 505 And MouseX() < 530 And MouseY() > 95 And MouseY() < 120
		
		zone_name$ = "The Neutral Zone"
		zone_line1$ = "The location of the first boss."
		zone_line2$ = "Watch out for the laser Barrage, "
		zone_line3$ = "and don't touch him or the "
		zone_line4$ = "asteroids, they will kill you in"
		zone_line5$ = "one hit. The Boss has a shield in"
		zone_line6$ = "front that reduces damage taken,"
		zone_line7$ = "try to get behind him for extra"
		zone_line8$ = "damage!"
		zone_line9$ = "Difficulty: Normal"
		zone_2_mouse_over = True
		zone_mouse_over = True
		If zone_2_x_ Or zone_2_y < 50
			zone_2_x = zone_2_x + 4
			zone_2_y = zone_2_y + 4
		EndIf
		If MouseHit(1) = True
			If levels_available >= 2 	
				If sounds = True 
					PlaySound button_click
				EndIf 
				SetFont font3 
				clear_levels()
				mode = 5
				start_music()
			EndIf 
		EndIf
	EndIf 
EndIf 
;*************************************************
;           THIS IS THE MOUSE OVER ZONE 3
If level_completed >= 2
	If MouseX() > 320 And MouseX() < 345 And MouseY() > 170 And MouseY() < 195
		zone_name$ = "The Neptunian Region"
		zone_line1$ = "Mission: Destroy the enemies."
		zone_line2$ = "They're building an army and we"
		zone_line3$ = "can't let that happen."
		zone_line4$ = ""
		zone_line5$ = ""
		zone_line6$ = ""
		zone_line7$ = ""
		zone_line8$ = ""
		zone_line9$ = "Difficulty: Normal"
		zone_3_mouse_over = True
		zone_mouse_over = True
		If zone_3_x_ Or zone_3_y < 50
			zone_3_x = zone_3_x + 4
			zone_3_y = zone_3_y + 4
		EndIf
		If MouseHit(1) = True
			If levels_available >= 3
				If sounds = True 
					PlaySound button_click
				EndIf 
				SetFont font3 
				clear_levels()
				mode = 6
				start_music()
			EndIf 
		EndIf
	EndIf 
EndIf 
;*************************************************
;           THIS IS THE MOUSE OVER ZONE 4
If level_completed >= 3
	If MouseX() > 348 And MouseX() < 373 And MouseY() > 348 And MouseY() < 373
		zone_name$ = "Phoenix Supercluster"
		zone_line1$ = "There's 2 bosses here, and they"
		zone_line2$ = "work together. Use the shields to"
		zone_line3$ = "your advantage, getting a colored "
		zone_line4$ = "shield will reduce damage taken"
		zone_line5$ = "and dealt from / to that color"
		zone_line6$ = "of boss. The little ones don't"
		zone_line7$ = "hurt much, but in mass they are"
		zone_line8$ = "dangerous."
		zone_line9$ = "Difficulty: Hard"
		zone_4_mouse_over = True
		zone_mouse_over = True
		If zone_4_x_ Or zone_4_y < 50
			zone_4_x = zone_4_x + 4
			zone_4_y = zone_4_y + 4
		EndIf
		If MouseHit(1) = True
			If levels_available >= 4
				If sounds = True 
					PlaySound button_click
				EndIf 
				SetFont font3 
				clear_levels()
				mode = 7
				start_music()
			EndIf 
		EndIf
	EndIf 
EndIf 

;*************************************************
;           THIS IS THE MOUSE OVER ZONE 5
If level_completed >= 4
	If MouseX() > 445 And MouseX() < 470 And MouseY() > 466 And MouseY() < 491
		zone_name$ = "Interstellar Space"
		zone_line1$ = "Mission: Destroy all the enemies."
		zone_line2$ = "There's a lot of enemies here, and"
		zone_line3$ = "we don't think you can do it alone"
		zone_line4$ = "so we decided to send in some"
		zone_line5$ = "reinforcements to help. Be careful"
		zone_line6$ = ""
		zone_line7$ = ""
		zone_line8$ = ""
		zone_line9$ = "Difficulty: Hard"
		zone_5_mouse_over = True
		zone_mouse_over = True
		If zone_5_x_ Or zone_5_y < 50
			zone_5_x = zone_5_x + 4
			zone_5_y = zone_5_y + 4
		EndIf
		If MouseHit(1) = True
			If levels_available >= 5 
				If sounds = True 
					PlaySound button_click
				EndIf 
				SetFont font3 
				clear_levels()
				mode = 8
				start_music()
			EndIf 
		EndIf
	
	EndIf 
EndIf 
;*************************************************
;           THIS IS THE MOUSE OVER ZONE 6
If level_completed >= 5
	If MouseX() > 967 And MouseX() < 992 And MouseY() > 555 And MouseY() < 580
		zone_name$ = "Outer Solar System 8.1 C"
		zone_line1$ = "NYI"
		zone_line2$ = ""
		zone_line3$ = ""
		zone_line4$ = ""
		zone_line5$ = ""
		zone_line6$ = ""
		zone_line7$ = ""
		zone_line8$ = ""
		zone_line9$ = ""
		zone_6_mouse_over = True
		zone_mouse_over = True
		If zone_6_x_ Or zone_6_y < 50
			zone_6_x = zone_6_x + 4
			zone_6_y = zone_6_y + 4
		EndIf
		If MouseHit(1) = True
			If levels_available >= 6 
				If sounds = True 
					PlaySound button_click
				EndIf 
				SetFont font3 
				clear_levels()
				mode = 9
				start_music()
			EndIf 
		EndIf
	
	EndIf 
EndIf 
;*************************************************
;           THIS IS THE MOUSE OVER ZONE 7
If level_completed >= 6
	If MouseX() > 600 And MouseX() < 625 And MouseY() > 380 And MouseY() < 405
		zone_name$ = "Boundaries of the Core"
		zone_line1$ = ""
		zone_line2$ = ""
		zone_line3$ = ""
		zone_line4$ = ""
		zone_line5$ = ""
		zone_line6$ = ""
		zone_line7$ = ""
		zone_line8$ = ""
		zone_line9$ = ""
		zone_7_mouse_over = True
		zone_mouse_over = True
		If zone_7_x_ Or zone_7_y < 50
			zone_7_x = zone_7_x + 4
			zone_7_y = zone_7_y + 4
		EndIf
	EndIf 
EndIf 

;*************************************************
;           THIS IS THE MOUSE OVER ZONE 8
If level_completed >= 7
	If MouseX() > 500 And MouseX() < 525 And MouseY() > 293 And MouseY() < 318
		zone_name$ = "Galactic Core"
		zone_line1$ = "The source of all destruction"
		zone_line2$ = "as well as being the location"
		zone_line3$ = "Of the final boss."
		zone_line4$ = ""
		zone_line5$ = ""
		zone_line6$ = ""
		zone_line7$ = ""
		zone_line8$ = ""
		zone_line9$ = ""
		zone_8_mouse_over = True
		zone_mouse_over = True
		If zone_8_x_ Or zone_8_y < 50
			zone_8_x = zone_8_x + 4
			zone_8_y = zone_8_y + 4
		EndIf
	EndIf 
EndIf 

;*************************************************
;           THIS IS THE MOUSE OVER ZONE 9 (REFUELING STATION)
If MouseX() > 828 And MouseX() < 853 And MouseY() > 228 And MouseY() < 253
	zone_name$ = "Black Market"
	zone_line1$ = "Spend tokens here to buy accessories"
	zone_line2$ = "that you can attach to your ship to "
	zone_line3$ = "increase its capabilities. You can also"
	zone_line4$ = "spent tokens here to buy more talent"
	zone_line5$ = "points."
	zone_line6$ = ""
	zone_line7$ = ""
	zone_line8$ = ""
	zone_line9$ = ""
	zone_9_mouse_over = True
	zone_mouse_over = True
	If zone_9_x_ Or zone_9_y < 50
		zone_9_x = zone_9_x + 4
		zone_9_y = zone_9_y + 4
	EndIf
	If MouseHit(1) = True
		If sounds = True 
			PlaySound button_click
		EndIf 
		SetFont font3 
		clear_levels()
		mode = 98
	EndIf
EndIf 



;*************************************************
;           THIS IS THE MOUSE OVER ZONE 10 (Tutorial quadrant)
If MouseX() > 928 And MouseX() < 953 And MouseY() > 228 And MouseY() < 253
	zone_name$ = "Tutorial Quadrant"
	zone_line1$ = "New players can go here to learn some"
	zone_line2$ = "basic controls of the ship, and how "
	zone_line3$ = "certain boss encounters can work. "
	zone_line4$ = "It's where many new players learn the"
	zone_line5$ = "ins and outs of the game."
	zone_line6$ = ""
	zone_line7$ = ""
	zone_line8$ = ""
	zone_line9$ = ""
	zone_10_mouse_over = True
	zone_mouse_over = True
	If zone_10_x_ Or zone_10_y < 50
		zone_10_x = zone_10_x + 4
		zone_10_y = zone_10_y + 4
	EndIf
	If MouseHit(1) = True
		If sounds = True 
			PlaySound button_click
		EndIf 
		SetFont font3 
		clear_levels()
		mode = 97
		start_music()
	EndIf
EndIf 



;*************************************************
;                  DONE BUTTON
	level_select_done = False 
If MouseX() > 20 And MouseX() < 95 And MouseY() > 560 And MouseY() < 580
	level_select_done = True 
	zone_mouse_over = True 
	If MouseHit(1) = True
		If sounds = True 
			PlaySound button_click
		EndIf 
		mode = 1
	EndIf 
EndIf 




If zone_mouse_over = False 
	zone_name$ = ""
	zone_line1$ = ""
	zone_line2$ = ""
	zone_line3$ = ""
	zone_line4$ = ""
	zone_line5$ = ""
	zone_line6$ = ""
	zone_line7$ = ""
	zone_line8$ = ""
	zone_line9$ = ""
	
	If zone_1_x_ Or zone_1_y > 25
		zone_1_x = zone_1_x - 4
		zone_1_y = zone_1_y - 4
	EndIf
	If zone_2_x_ Or zone_2_y > 25
		zone_2_x = zone_2_x - 4
		zone_2_y = zone_2_y - 4
	EndIf
	If zone_3_x_ Or zone_3_y > 25
		zone_3_x = zone_3_x - 4
		zone_3_y = zone_3_y - 4
	EndIf
	If zone_4_x_ Or zone_4_y > 25
		zone_4_x = zone_4_x - 4
		zone_4_y = zone_4_y - 4
	EndIf
	If zone_5_x_ Or zone_5_y > 25
		zone_5_x = zone_5_x - 4
		zone_5_y = zone_5_y - 4
	EndIf
	If zone_6_x_ Or zone_6_y > 25
		zone_6_x = zone_6_x - 4
		zone_6_y = zone_6_y - 4
	EndIf
	If zone_7_x_ Or zone_7_y > 25
		zone_7_x = zone_7_x - 4
		zone_7_y = zone_7_y - 4
	EndIf
	If zone_8_x_ Or zone_8_y > 25
		zone_8_x = zone_8_x - 4
		zone_8_y = zone_8_y - 4
	EndIf
	If zone_9_x_ Or zone_9_y > 25
		zone_9_x = zone_9_x - 4
		zone_9_y = zone_9_y - 4
	EndIf
	If zone_10_x_ Or zone_10_y > 25
		zone_10_x = zone_10_x - 4
		zone_10_y = zone_10_y - 4
	EndIf
	
	zone_1_mouse_over = False
	zone_2_mouse_over = False
	zone_3_mouse_over = False
	zone_4_mouse_over = False
	zone_5_mouse_over = False
	zone_6_mouse_over = False
	zone_7_mouse_over = False
	zone_8_mouse_over = False
	zone_9_mouse_over = False
	zone_10_mouse_over = False
	;level_select_done = False 
	FlushMouse
	FlushKeys
	level_select_roll_over_repeat = 0
EndIf 

If zone_mouse_over = True 
	If level_select_roll_over_repeat = 0
		If sounds = True 
			PlaySound button_roll_over
		EndIf 
		level_select_roll_over_repeat = 1
	EndIf 
EndIf 

End Function