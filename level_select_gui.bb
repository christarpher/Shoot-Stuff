Include "variables.bb"
Function level_select_gui()

	Rect 20,50,225,185,False ; description box
	Text 25,55,zone_line1$,False
	Text 25,75,zone_line2$,False
	Text 25,95,zone_line3$,False
	Text 25,115,zone_line4$,False
	Text 25,135,zone_line5$,False
	Text 25,155,zone_line6$,False
	Text 25,175,zone_line7$,False
	Text 25,195,zone_line8$,False
	Text 25,215,zone_line9$,False
	Rect 20,20,225,20,False ; level select name box
	Text 130,30,zone_name$,True,True 
	Text 833,80,"Start Here",True,True
	Text 840,205,"Black Market",True,True
	Text 940,205,"Tutorial Quadrant",True,True
	
	If level_select_done = True 
		Color 0,255,0
	EndIf 
	If level_select_done = False 
		Color 255,255,255
	EndIf 
	Rect 20,560,75,20,False
		Color 255,255,255
	Text 57,562,"Menu",True
	
	If zone_1_mouse_over = True 
		Color 0,255,0
	EndIf 
	If zone_1_mouse_over = False 
		Color 255,255,255
	EndIf 
	Rect 833-zone_1_x/2,118-zone_1_y/2,zone_1_x,zone_1_y,False ;zone 1
	
	
	If level_completed >= 1
		If zone_2_mouse_over = True 
			Color 0,255,0
		EndIf 
		If zone_2_mouse_over = False 
			Color 255,255,255
		EndIf 
		Rect 518-zone_2_x/2,108-zone_2_y/2,zone_2_x,zone_2_y,False ;zone 2
	EndIf 
	
	If level_completed >= 2
		If zone_3_mouse_over = True 
			Color 0,255,0
		EndIf 
		If zone_3_mouse_over = False 
			Color 255,255,255
		EndIf 
		Rect 333-zone_3_x/2,183-zone_3_y/2,zone_3_x,zone_3_y,False ;zone 3
	EndIf 
	
	If level_completed >= 3
		If zone_4_mouse_over = True 
			Color 0,255,0
		EndIf 
		If zone_4_mouse_over = False 
			Color 255,255,255
		EndIf 
		Rect 361-zone_4_x/2,361-zone_4_y/2,zone_4_x,zone_4_y,False ;zone 4
	EndIf 
	
	If level_completed >= 4
		If zone_5_mouse_over = True 
			Color 0,255,0
		EndIf 
		If zone_5_mouse_over = False 
			Color 255,255,255
		EndIf 
		Rect 458-zone_5_x/2,479-zone_5_y/2,zone_5_x,zone_5_y,False ;zone 5
	EndIf 
	
	If level_completed >= 5
		If zone_6_mouse_over = True 
			Color 0,255,0
		EndIf 
		If zone_6_mouse_over = False 
			Color 255,255,255
		EndIf 
		Rect 980-zone_6_x/2,568-zone_6_y/2,zone_6_x,zone_6_y,False ;zone 6
	EndIf 
	
	If level_completed >= 6
		If zone_7_mouse_over = True 
			Color 0,255,0
		EndIf 
		If zone_7_mouse_over = False 
			Color 255,255,255
		EndIf 
		Rect 613-zone_7_x/2,393-zone_7_y/2,zone_7_x,zone_7_y,False ;zone 7
	EndIf 
	
	If level_completed >= 7
		If zone_8_mouse_over = True 
			Color 0,255,0
		EndIf 
		If zone_8_mouse_over = False 
			Color 255,255,255
		EndIf 
		Rect 513-zone_8_x/2,306-zone_8_y/2,zone_8_x,zone_8_y,False ;zone 8
	EndIf 



	If zone_9_mouse_over = True 
		Color 0,255,0
	EndIf 
	If zone_9_mouse_over = False 
		Color 255,0,0
	EndIf 
	Rect 840-zone_9_x/2,240-zone_9_y/2,zone_9_x,zone_9_y,False ;zone 9
	
	If zone_10_mouse_over = True 
		Color 0,255,0
	EndIf 
	If zone_10_mouse_over = False 
		Color 255,0,0
	EndIf 
	Rect 940-zone_10_x/2,240-zone_10_y/2,zone_10_x,zone_10_y,False ;zone 9
	
	Color 255,255,255

	
		
	;Text 55,535,MouseX()+", "+MouseY(),True
	
		

	
End Function