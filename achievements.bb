Include "variables.bb"
Include "draw.bb"


Function draw_achievements()

	SetFont font1 
	Text 320,40,"Achievements",True,True
	SetFont font3
	Color 255,255,255
	Rect 680,20,310,30,False 
	Rect 680,60,310,110,False 
	Text 685,35,achievement_name$,False,True 
	Text 685,75,achievement_line_1$,False,True 
	Text 685,95,achievement_line_2$,False,True 
	Text 685,115,achievement_line_3$,False,True 
	Text 685,135,achievement_line_4$,False,True 
	Text 685,155,achievement_line_5$,False,True 
	


	If MouseX() > 50 And MouseX() < 250 And MouseY() > 100 And MouseY() < 130
		achievement_name$ = "Hardcore: The asteroid Belt"
		achievement_line_1$ = "Beat the Delta 6.3 B Asteroid Belt level on hardcore"
		achievement_line_2$ = "mode."
		achievement_line_3$ = ""
		achievement_line_4$ = "Restrictions: Must have under 1 talent spent"
		achievement_line_5$ = "at time of completion. "
			
	Else If MouseX() > 50 And MouseX() < 250 And MouseY() > 160 And MouseY() < 190
		achievement_name$ = "Hardcore:  The Neutral Zone"
		achievement_line_1$ = "Beat The Neutral Zone boss on hardcore mode."
		achievement_line_2$ = ""
		achievement_line_3$ = ""
		achievement_line_4$ = "Restrictions: Must have under 7 talents spent"
		achievement_line_5$ = "at time of completion. "
		
	Else If MouseX() > 50 And MouseX() < 250 And MouseY() > 220 And MouseY() < 250
		achievement_name$ = "Hardcore: Neptunian Region"
		achievement_line_1$ = "Beat the Neptunian Region on hardcore mode."
		achievement_line_2$ = ""
		achievement_line_3$ = ""
		achievement_line_4$ = "Restrictions: Must have under 13 talents spent"
		achievement_line_5$ = "at time of completion. "
		
	Else If MouseX() > 50 And MouseX() < 250 And MouseY() > 280 And MouseY() < 310 
		achievement_name$ = "Hardcore: The Supercluster"
		achievement_line_1$ = "Beat the two bosses located in the Supercluster"
		achievement_line_2$ = "in hardcore mode."
		achievement_line_3$ = ""
		achievement_line_4$ = "Restrictions: Must have under 19 talents spent"
		achievement_line_5$ = "at time of completion. "
				 
	Else If MouseX() > 50 And MouseX() < 250 And MouseY() > 340 And MouseY() < 370
		achievement_name$ = "Hardcore: Interstellar Space"
		achievement_line_1$ = "Destroy all the enemy forces in Interstellar Space"
		achievement_line_2$ = "on hardcore mode."
		achievement_line_3$ = ""
		achievement_line_4$ = "Restrictions: Must have under 25 talents spent"
		achievement_line_5$ = "at time of completion. "
				 
	Else If MouseX() > 50 And MouseX() < 250 And MouseY() > 400 And MouseY() < 430
		achievement_name$ = "Hardcore: The Solar System"
		achievement_line_1$ = ""
		achievement_line_2$ = ""
		achievement_line_3$ = ""
		achievement_line_4$ = ""
		achievement_line_5$ = ""
				
	Else If MouseX() > 50 And MouseX() < 250 And MouseY() > 460 And MouseY() < 490
		achievement_name$ = "Hardcore: Outside the Core"
		achievement_line_1$ = ""
		achievement_line_2$ = ""
		achievement_line_3$ = ""
		achievement_line_4$ = ""
		achievement_line_5$ = ""
				
	Else If MouseX() > 50 And MouseX() < 250 And MouseY() > 520 And MouseY() < 550
		achievement_name$ = "Hardcore: Galactic Core"
		achievement_line_1$ = ""
		achievement_line_2$ = ""
		achievement_line_3$ = ""
		achievement_line_4$ = ""
		achievement_line_5$ = ""
		
	;SET TWO TWO TWO TWO TWO**************************************************************************
		
	Else If MouseX() > 300 And MouseX() < 500 And MouseY() > 100 And MouseY() < 130
		achievement_name$ = "Must collect more tokens!"
		achievement_line_1$ = "Collect every token that spawns in the Asteroid"
		achievement_line_2$ = "belt level."
		achievement_line_3$ = ""
		achievement_line_4$ = ""
		achievement_line_5$ = ""
			
	Else If MouseX() > 300 And MouseX() < 500 And MouseY() > 160 And MouseY() < 190
		achievement_name$ = "Can't touch this!"
		achievement_line_1$ = "Destroy 140 asteroids and don't get hit by any"
		achievement_line_2$ = "of the asteroids in the Asteroid Belt level."
		achievement_line_3$ = ""
		achievement_line_4$ = "Restrictions: Must have under 1 talent spent"
		achievement_line_5$ = "at time of completion. "
		
	Else If MouseX() > 300 And MouseX() < 500 And MouseY() > 220 And MouseY() < 250
		achievement_name$ = "Shutout"
		achievement_line_1$ = "Beat the First boss in the Neutral Zone without"
		achievement_line_2$ = "getting hit by anything."
		achievement_line_3$ = ""
		achievement_line_4$ = "Restrictions: Must have under 7 talents spent"
		achievement_line_5$ = "at time of completion. "
		
	Else If MouseX() > 300 And MouseX() < 500 And MouseY() > 280 And MouseY() < 310
		achievement_name$ = "Hardcore: I can dance all day."
		achievement_line_1$ = "Beat the first boss in the Neutral Zone without"
		achievement_line_2$ = "having any talents spent on hardcore difficulty."
		achievement_line_3$ = ""
		achievement_line_4$ = "Restrictions: Must have no talents spent"
		achievement_line_5$ = "at time of completion. "
				 
	Else If MouseX() > 300 And MouseX() < 500 And MouseY() > 340 And MouseY() < 370
		achievement_name$ = "No harm done."
		achievement_line_1$ = "Take no damage from the first 5 waves of"
		achievement_line_2$ = "enemy ships and continue to finish the level."
		achievement_line_3$ = ""
		achievement_line_4$ = "Restrictions: Must have under 13 talents spent"
		achievement_line_5$ = "at time of completion. "
				 
	Else If MouseX() > 300 And MouseX() < 500 And MouseY() > 400 And MouseY() < 430
		achievement_name$ = "I have no need for phasers."
		achievement_line_1$ = "Defeat the two bosses located in the Phoenix"
		achievement_line_2$ = "Supercluster without using your phaser."
		achievement_line_3$ = ""
		achievement_line_4$ = "Restrictions: Must have under 19 talents spent"
		achievement_line_5$ = "at time of completion. "
				
	Else If MouseX() > 300 And MouseX() < 500 And MouseY() > 460 And MouseY() < 490
		achievement_name$ = "I have no need for shields."
		achievement_line_1$ = "Defeat the two bosses located in the Phoenix"
		achievement_line_2$ = "Supercluster without using your shield."
		achievement_line_3$ = ""
		achievement_line_4$ = "Restrictions: Must have under 19 talents spent"
		achievement_line_5$ = "at time of completion. "
				
	Else If MouseX() > 300 And MouseX() < 500 And MouseY() > 520 And MouseY() < 550
		achievement_name$ = "Hardcore: I got nothing!"
		achievement_line_1$ = "Defeat the two bosses located in the Phoenix"
		achievement_line_2$ = "Supercluster without using your phaser"
		achievement_line_3$ = "or shield. (shield activation with talents is OK)"
		achievement_line_4$ = "Restrictions: Must have under 25 talents spent"
		achievement_line_5$ = "at time of completion. "
		
		
	;SET THREE THREE THREE THREE **************************************************************************
		
		
	Else If MouseX() > 550 And MouseX() < 750 And MouseY() > 220 And MouseY() < 250
		achievement_name$ = "I love those guys."
		achievement_line_1$ = "Destroy all of the enemy forces in Interstellar Space"
		achievement_line_2$ = "and keep at least 1 set of factions alive."
		achievement_line_3$ = ""
		achievement_line_4$ = "Restrictions: Must have under 25 talents spent"
		achievement_line_5$ = "at time of completion. "
		
	Else If MouseX() > 550 And MouseX() < 750 And MouseY() > 280 And MouseY() < 310
		achievement_name$ = "Hardcore: Don't go below 20"
		achievement_line_1$ = "Destroy all of the enemy forces in Interstellar Space"
		achievement_line_2$ = "and never go below 20% Hull Integrity."
		achievement_line_3$ = ""
		achievement_line_4$ = "Restrictions: Must have under 25 talents spent"
		achievement_line_5$ = "at time of completion. "
				 
	Else If MouseX() > 550 And MouseX() < 750 And MouseY() > 340 And MouseY() < 370
		achievement_name$ = ""
		achievement_line_1$ = ""
		achievement_line_2$ = ""
		achievement_line_3$ = ""
		achievement_line_4$ = ""
		achievement_line_5$ = ""
				 
	Else If MouseX() > 550 And MouseX() < 750 And MouseY() > 400 And MouseY() < 430
		achievement_name$ = ""
		achievement_line_1$ = ""
		achievement_line_2$ = ""
		achievement_line_3$ = ""
		achievement_line_4$ = ""
		achievement_line_5$ = ""
				
	Else If MouseX() > 550 And MouseX() < 750 And MouseY() > 460 And MouseY() < 490
		achievement_name$ = ""
		achievement_line_1$ = ""
		achievement_line_2$ = ""
		achievement_line_3$ = ""
		achievement_line_4$ = ""
		achievement_line_5$ = ""
				
	Else If MouseX() > 550 And MouseX() < 750 And MouseY() > 520 And MouseY() < 550
		achievement_name$ = ""
		achievement_line_1$ = ""
		achievement_line_2$ = ""
		achievement_line_3$ = ""
		achievement_line_4$ = ""
		achievement_line_5$ = ""
				
	Else 
		If done_hover_achievement = False 
			FlushKeys
			FlushMouse 
			achievement_name$ = ""
			achievement_line_1$ = ""
			achievement_line_2$ = ""
			achievement_line_3$ = ""
			achievement_line_4$ = ""
			achievement_line_5$ = ""
		EndIf 
		
	EndIf  
	
	Color 255,255,255
	Rect 50,100,200,30,False
	Line 80,100,80,129
	Text 165,115,"Hardcore: The Asteroid Belt",True,True 
	If achievement_1_unlocked = True 
		place_x(65,115)
	EndIf 
	
	Color 255,255,255
	Rect 50,160,200,30,False
	Line 80,160,80,189
	Text 165,175,"Hardcore: The Neutral Zone",True,True 
	If achievement_2_unlocked = True 	
		place_x(65,175)
	EndIf
	
	Color 255,255,255
	Rect 50,220,200,30,False
	Line 80,220,80,249
	Text 165,235,"Hardcore: Neptunian Region",True,True 
	If achievement_3_unlocked = True 
		place_x(65,235)
	EndIf
	
	Color 255,255,255
	Rect 50,280,200,30,False
	Line 80,280,80,309
	Text 165,295,"Hardcore: The Supercluster",True,True 
	If achievement_4_unlocked = True 
		place_x(65,295)
	EndIf
	
	Color 255,255,255
	Rect 50,340,200,30,False
	Line 80,340,80,369
	Text 165,355,"Hardcore: Interstellar Space",True,True 
	If achievement_5_unlocked = True 	
		place_x(65,355)
	EndIf
	
	Color 255,255,255
	Rect 50,400,200,30,False
	Line 80,400,80,429
	Text 165,415,"Hardcore: The Solar System",True,True 
	If achievement_6_unlocked = True 	
		place_x(65,415)
	EndIf
	
	Color 255,255,255
	Rect 50,460,200,30,False
	Line 80,460,80,489
	Text 165,475,"Hardcore: Outside the Core",True,True 
	If achievement_7_unlocked = True 	
		place_x(65,475)
	EndIf
	
	Color 255,255,255
	Rect 50,520,200,30,False	
	Line 80,520,80,549
	Text 165,535,"Hardcore: Galactic Core",True,True 
	If achievement_8_unlocked = True 	
		place_x(65,535)
	EndIf
	
	;set 2
	
	Color 255,255,255
	Rect 300,100,200,30,False
	Line 330,100,330,129
	Text 415,115,"Must collect more tokens!",True,True 
	If achievement_9_unlocked = True 
		place_x(315,115)
	EndIf	
		 
	Color 255,255,255
	Rect 300,160,200,30,False
	Line 330,160,330,189
	Text 415,175,"Can't touch this!",True,True 
	If achievement_10_unlocked = True 
		place_x(315,175)
	EndIf
	
	Color 255,255,255
	Rect 300,220,200,30,False
	Line 330,220,330,249
	Text 415,235,"Shutout",True,True 
	If achievement_11_unlocked = True 
		place_x(315,235)
	EndIf
	
	Color 255,255,255
	Rect 300,280,200,30,False
	Line 330,280,330,309
	Text 415,295,"Hardcore: I can dance all day.",True,True 
	If achievement_12_unlocked = True 
		place_x(315,295)
	EndIf
	
	Color 255,255,255
	Rect 300,340,200,30,False
	Line 330,340,330,369
	Text 415,355,"No harm done.",True,True 
	If achievement_13_unlocked = True 
		place_x(315,355)
	EndIf
	
	Color 255,255,255
	Rect 300,400,200,30,False
	Line 330,400,330,429
	Text 415,415,"I have no need for lasers.",True,True 
	If achievement_14_unlocked = True 
		place_x(315,415)
	EndIf
	
	Color 255,255,255
	Rect 300,460,200,30,False
	Line 330,460,330,489
	Text 415,475,"I have no need for shields.",True,True 
	If achievement_15_unlocked = True 	
		place_x(315,475)
	EndIf
	
	Color 255,255,255
	Rect 300,520,200,30,False	
	Line 330,520,330,549
	Text 415,535,"Hardcore: I got nothing!",True,True 
	If achievement_16_unlocked = True 
		place_x(315,535)	
	EndIf
	
	;set 3
	
	
	Color 255,255,255
	Rect 550,220,200,30,False
	Line 580,220,580,249
	Text 665,235,"I love those guys.",True,True 
	If achievement_17_unlocked = True 
		place_x(565,235)
	EndIf
	
	Color 255,255,255
	Rect 550,280,200,30,False
	Line 580,280,580,309
	Text 665,295,"Hardcore: Don't go below 20%",True,True 
	If achievement_18_unlocked = True 
		place_x(565,295)
	EndIf
	
	Color 255,255,255
	Rect 550,340,200,30,False
	Line 580,340,580,369
	Text 665,355,"",True,True 
	
	Color 255,255,255
	Rect 550,400,200,30,False
	Line 580,400,580,429
	Text 665,415,"",True,True 
	
	Color 255,255,255
	Rect 550,460,200,30,False
	Line 580,460,580,489
	Text 665,475,"",True,True 
	
	Color 255,255,255
	Rect 550,520,200,30,False	
	Line 580,520,580,549
	Text 665,535,"",True,True 
	
	
	
	;set 4
	
	
	Color 255,255,255
	Rect 800,220,200,30,False
	Line 830,220,830,249
	Text 915,235,"",True,True 
	
	Color 255,255,255
	Rect 800,280,200,30,False
	Line 830,280,830,309
	Text 915,295,"",True,True 
	
	Color 255,255,255
	Rect 800,340,200,30,False
	Line 830,340,830,369
	Text 915,355,"",True,True 
	
	Color 255,255,255
	Rect 800,400,200,30,False
	Line 830,400,830,429
	Text 915,415,"",True,True 
	
	Color 255,255,255
	Rect 800,460,200,30,False
	Line 830,460,830,489
	Text 915,475,"",True,True 
	
	Color 255,255,255
	Rect 800,520,200,30,False	
	Line 830,520,830,549
	Text 915,535,"",True,True 
	
End Function