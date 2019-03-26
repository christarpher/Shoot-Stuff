Function create_enemy(image)
	e.enemy = New enemy
	e\image = CopyImage(image)
	e\x = enemyx
	e\y = 700                   
	e\yspeed# = 0-Rnd(7,13)
	If frame > 2000
		If diff1 > 3 Then e\xspeed = Rnd(-1,1)
	EndIf 
	If frame < 2000
		If diff1 < 4 Then e\xspeed = 0
	EndIf 
	e\dead = False
	e\notExplode = False
End Function
;-------------
Function create_health(image)
	h.h_pickup = New h_pickup
	h\h_image = CopyImage(image)
	h\h_x = Rnd(1,1024)
	h\h_y = 768
	If slowtime = True
		h\h_yspeed = -1
	ElseIf slowtime = False
		h\h_yspeed = Rnd(-3,-10)
	EndIf 
End Function
;-------------
Function create_speed(image)
	s.s_pickup = New s_pickup
	s\s_image = CopyImage(image)
	s\s_x = Rnd(1,1024)
	s\s_y = 768
	If slowtime = True
		s\s_yspeed = -1
	ElseIf slowtime = False
		s\s_yspeed = Rnd(-3,-10)
	EndIf 
End Function
;-------------
Function create_protpickup(image)
	pr.pr_pickup = New pr_pickup
	pr\pr_image = CopyImage(image)
	pr\pr_x = Rnd(1,1024)
	pr\pr_y = 768
	If slowtime = True
		pr\pr_yspeed = -2
	ElseIf slowtime = False
		pr\pr_yspeed = Rnd(-3,-10)
	EndIf 
End Function
;-------------
Function create_bosspickup(image)
	bpr.bpr_pickup = New bpr_pickup
	bpr\bpr_image = CopyImage(image)
	bpr\bpr_x = Rnd(1,1024)
	bpr\bpr_y = 768
	If slowtime = True
		bpr\bpr_yspeed = -1
	ElseIf slowtime = False
		bpr\bpr_yspeed = Rnd(-1,-4)
	EndIf 
End Function
;------------
Function create_bulletprot(image)
	bp.bp_bullet = New bp_bullet
	bp\bp_image = CopyImage(image)
	bp\bp_x = (p_x-60)
	bp\bp_y = (p_y)
	bp\bp_yspeed = 8
	bp\bp_dead = False
End Function
;------------
Function create_bulletprot2(image)
	bp.bp_bullet = New bp_bullet
	bp\bp_image = CopyImage(image)
	bp\bp_x = (p_x+60)
	bp\bp_y = (p_y)
	bp\bp_yspeed = 8
	bp\bp_dead = False
End Function
;-------------
Function create_wide(image)
	w.w_pickup = New w_pickup
	w\w_image = CopyImage(image)
	w\w_x = Rnd(1,1024)
	w\w_y = 768
	If slowtime = True
		w\w_yspeed = -1
	ElseIf slowtime = False
		w\w_yspeed = Rnd(-3,-10)
	EndIf 
End Function
;-------------
Function create_armor(image)
	a.a_pickup = New a_pickup
	a\a_image = CopyImage(image)
	a\a_x = Rnd(1,1024)
	a\a_y = 768
	If slowtime = True
		a\a_yspeed = -1
	ElseIf slowtime = False
		a\a_yspeed = Rnd(-3,-10)
	EndIf 
End Function
;-------------
Function create_bullet(image)
	b.b_bullet = New b_bullet
	b\b_image = CopyImage(image)
	b\b_x = (p_x-1)
	b\b_y = (p_y+25)
	If image = laserimage Then b\b_yspeed = 5
	If image = wideimage Then b\b_yspeed = 8
	If image = bullet1 Then b\b_yspeed = 8
	b\b_dead = False
End Function
;-------------
Function create_ball(x_v#,y_v#,x_pos#,y_pos#)
	ba.ba_ball = New ba_ball
	ba\ba_image = CopyImage(ballimage)
	ba\ba_x# = x_pos#
	ba\ba_y# = y_pos#
	ba\ba_yspeed# = y_v#/100
	ba\ba_xspeed# = x_v#/100
	ba\ba_dead = False
	ballcount = ballcount + 1
	boss3_energy# = boss3_energy# - 2
	If debug = True
		If regentimes < 4
			boss3_energy# = boss3_energy# - 100
		EndIf
	EndIf 
	If regentimes >= 4
		ba\ba_yspeed# = y_v#/5
		ba\ba_xspeed# = x_v#/5
	EndIf 
End Function

;-------------
Function create_nuke(image)
	n.n_nuke = New n_nuke
	n\n_image = CopyImage(image)
	n\n_x = Rnd(1,1024)
	n\n_y = 768
	If slowtime = True
		n\n_yspeed = -1
	ElseIf slowtime = False
		n\n_yspeed = Rnd(-3,-10)
	EndIf 
End Function
;-------------
Function create_emp(image)
	m.m_emp = New m_emp
	m\m_image = CopyImage(image)
	m\m_x = Rnd(1,1024)
	m\m_y = 768
	If slowtime = True
		m\m_yspeed = -1
	ElseIf slowtime = False
		m\m_yspeed = Rnd(-3,-10)
	EndIf 
End Function
;-------------
Function create_laser(image)
	l.l_laser = New l_laser
	l\l_image = CopyImage(image)
	l\l_x = Rnd(1,1024)
	l\l_y = 768
	If slowtime = True
		l\l_yspeed = -1
	ElseIf slowtime = False
		l\l_yspeed = Rnd(-3,-10)
	EndIf 
End Function





















Function draw_enemy(p_x,p_y)
	For e.enemy = Each enemy
	
	curspeed# = e\yspeed#
	
	If slowtime = True Then 
		curspeed# = e\yspeed#/5
	EndIf
	If fast = True
		curspeed# = e\yspeed#*(1+star_mod/300)
	EndIf 
		e\y = e\y + curspeed#
		;e\xspeed = Sin(Float(MilliSecs()/10.00))
		e\x = e\x + e\xspeed
		DrawImage e\image,e\x,e\y
		
 
		;ShowPointer()
		
		;If Abs(e\x-MouseX()) < 100 And Abs(e\y-MouseY()) < 100 Then
			;If (e\x-MouseX()) > 0 e\x = e\x - 3
			;If (e\x-MouseX()) < 0 e\x = e\x + 3
			;If (e\y-MouseY()) > 0 
			;e\y = (e\y - 3)
			;e\yspeed=0
			;EndIf 
			;If (e\y-MouseY()) < 0 
			;e\y = (e\y + 3)
			;e\yspeed=0
			;EndIf
			
			
			;If Abs(e\x + e\xspeed-MouseX()) < 5 Then
			;	e\x = 0; MouseX()
			;ElseIf Abs(e\y + e\yspeed)-MouseY() < 5 Then
			;	e\y = -1000;MouseY()
			;EndIf 
		;EndIf 
		
		If e\y < 70 Then
			e\dead = True
			e\notExplode = True
		Else If ImagesCollide(player,p_x,p_y,0,e\image,e\x,e\y,0)
			If invuln = False
			If curspeed# < 0
			    If armor>0 Then
					armor=armor-30
					score = score - 2
					times_hit = times_hit + 1
			    	e\dead = True
				Else If armor<=0 Then
				player=LoadImage("images/player.bmp")
				    health=health-70
					score = score - 4
					times_hit = times_hit + 1
			    	e\dead = True 
				EndIf 
			EndIf 
			EndIf 			
		EndIf
		
		If ImagesCollide(boss,boss_x,boss_y,0,e\image,e\x,e\y,0)
			If e\yspeed > 0 
				boss_health# = boss_health# - 20
				e\dead = True
			EndIf
		EndIf 
		If ImagesCollide(boss,boss2_x,boss2_y,0,e\image,e\x,e\y,0)
			If e\yspeed > 0 
				e\dead = True
			EndIf
		EndIf 
		If impossible = True And frame < 2000
			If frame < 2000
				If e\x > open And e\x < open+75
					e\dead = True
					e\notExplode = True 
				EndIf 
			EndIf 
		EndIf 	
		
		If e\dead = True
			If particles = True 
				If e\notExplode = False Then
					For n = 1 To particle_amount
						create_particle(e\x,e\y)
					Next
				EndIf 
			EndIf
			If e\y > 70
				If impossible = True And e\x > open And e\x < open+75
					killed = killed - 1
					score = score - 4
				EndIf 
				killed=killed+1
				score=score+4
			EndIf
			FreeImage e\image
			Delete e
		EndIf 
	Next
End Function
;-----------
Function draw_health(p_x,p_y)
	For h.h_pickup = Each h_pickup
		h\h_y = h\h_y + h\h_yspeed
		DrawImage h\h_image,h\h_x,h\h_y
		
		If h\h_y < 0 Then
			FreeImage h\h_image
			Delete h
		Else If ImagesCollide(player,p_x,p_y,0,h\h_image,h\h_x,h\h_y,0)
		    If health < 1000 Then
			     health=health+600
			EndIf 
		    FreeImage h\h_image
			Delete h 
		EndIf
	Next
End Function
;-----------
Function draw_speed(p_x,p_y)
	For s.s_pickup = Each s_pickup
		s\s_y = s\s_y + s\s_yspeed
		DrawImage s\s_image,s\s_x,s\s_y
		
		If s\s_y < 0 Then
			FreeImage s\s_image
			Delete s
		Else If ImagesCollide(player,p_x,p_y,0,s\s_image,s\s_x,s\s_y,0)
		    If speed_left < 900 Then
			     speed_left=speed_left+900
			EndIf 
		    FreeImage s\s_image
			Delete s 
		EndIf
	Next
End Function
;-----------
Function draw_wide(p_x,p_y)
	For w.w_pickup = Each w_pickup
		w\w_y = w\w_y + w\w_yspeed
		DrawImage w\w_image,w\w_x,w\w_y
		
		If w\w_y < 0 Then
			FreeImage w\w_image
			Delete w
		Else If ImagesCollide(player,p_x,p_y,0,w\w_image,w\w_x,w\w_y,0)
		    wideframe#=1000
		    FreeImage w\w_image
			Delete w 
		EndIf
	Next
End Function
;------------
Function draw_armor(p_x,p_y)
	For a.a_pickup = Each a_pickup
		a\a_y = a\a_y + a\a_yspeed
		DrawImage a\a_image,a\a_x,a\a_y
		
		If a\a_y < 0 Then
			FreeImage a\a_image
			Delete a
		Else If ImagesCollide(player,p_x,p_y,0,a\a_image,a\a_x,a\a_y,0)
		    If armor < 1000 Then 
				armor=armor+1000
				player=LoadImage("images/player2.bmp")
			EndIf
		    FreeImage a\a_image
			Delete a 
		EndIf
	Next
End Function
;------------
Function draw_bullet(p_x,p_y)
	For b.b_bullet = Each b_bullet
		b\b_y = b\b_y + b\b_yspeed
		DrawImage b\b_image,b\b_x,b\b_y
			If b\b_y > 768 Then
				b\b_dead = True
			EndIf 
		
		For e.enemy = Each enemy	
			If ImagesCollide(b\b_image,b\b_x,b\b_y,0,e\image,e\x,e\y,0) Then 
				e\dead = True
				b\b_dead = True
			EndIf 
		Next 
		
		If ImagesCollide(b\b_image,b\b_x,b\b_y,0,boss,boss_x,boss_y,0)
			boss_health# = boss_health# - 1
			If invis_count1 > 120 And invis_count1 < 180
				DrawImage boss, boss_x, boss_y
			EndIf 
			b\b_dead = True
		EndIf
		
		If boss3_health# > 1
			If ImagesCollide(b\b_image,b\b_x,b\b_y,0,empwave,boss3_x_emp,boss3_y_emp,0)
				b\b_dead = True
			EndIf 
			If ImagesCollide(b\b_image,b\b_x,b\b_y,0,boss3,boss3_x,boss3_y,0)
				b\b_dead = True
				boss3_health# = boss3_health# - 5
			EndIf 
		EndIf 
		
		If b\b_dead = True Then
			FreeImage b\b_image
			Delete b
		EndIf 
	Next 
End Function
;------------
Function draw_ball(p_x,p_y)
	For ba.ba_ball = Each ba_ball
		ba\ba_y# = ba\ba_y# + ba\ba_yspeed#
		ba\ba_x# = ba\ba_x# + ba\ba_xspeed#
		DrawImage ba\ba_image,ba\ba_x#,ba\ba_y#
			If ba\ba_y < -20 Then
				ba\ba_dead = True
			EndIf
			If ba\ba_x < -20 Then
				ba\ba_dead = True
			EndIf
			If ba\ba_y > 1044 Then
				ba\ba_dead = True
			EndIf 
			
			If ImagesCollide(ba\ba_image,ba\ba_x,ba\ba_y,0,player,p_x,p_y,0) Then 
				ba\ba_dead = True
				armor = 0
				health = 0
			EndIf
		
		If ba\ba_dead = True Then
			FreeImage ba\ba_image
			Delete ba
			ballcount = ballcount - 1
		EndIf 
	Next 
End Function
;------------
Function draw_ball2(p_x,p_y)
	For ba2.ba2_ball = Each ba2_ball
		DrawImage ba2\ba2_image,ba2\ba2_x#,ba2\ba2_y# 
			
			If ImagesCollide(ba2\ba2_image,ba2\ba2_x,ba2\ba2_y,0,player,p_x,p_y,0) Then 
				ba2\ba2_dead = True
				armor = 0
				health = 0
			EndIf
		
		ba2\ba2_time = ba2\ba2_time + 1
		
		If ba2\ba2_time > 60
			ba2\ba2_dead = True
		EndIf
		
		If ba2\ba2_dead = True
			FreeImage ba2\ba2_image
			Delete ba2
			ballcount = ballcount - 1
		EndIf  
	Next 
End Function
;------------

Function draw_nuke(p_x,p_y)
	For n.n_nuke = Each n_nuke
		n\n_y = n\n_y + n\n_yspeed
		DrawImage n\n_image,n\n_x,n\n_y
		
		If n\n_y < 0 Then
			FreeImage n\n_image
			Delete n
		Else If ImagesCollide(player,p_x,p_y,0,n\n_image,n\n_x,n\n_y,0)
		    nuke=nuke+1
			FreeImage n\n_image
			Delete n 
		EndIf
	Next
End Function
;------------
Function draw_emp(p_x,p_y)
	For m.m_emp = Each m_emp
		m\m_y = m\m_y + m\m_yspeed
		DrawImage m\m_image,m\m_x,m\m_y
		
		If m\m_y < 0 Then
			FreeImage m\m_image
			Delete m
		Else If ImagesCollide(player,p_x,p_y,0,m\m_image,m\m_x,m\m_y,0)
		    emp=emp+500
			FreeImage m\m_image
			Delete m 
		EndIf
	Next
End Function
;------------
Function draw_laser(p_x,p_y)
	For l.l_laser = Each l_laser
		l\l_y = l\l_y + l\l_yspeed
		DrawImage l\l_image,l\l_x,l\l_y
		
		If l\l_y < 0 Then
			FreeImage l\l_image
			Delete l
		Else If ImagesCollide(player,p_x,p_y,0,l\l_image,l\l_x,l\l_y,0)
		    laser=laser+500
			FreeImage l\l_image
			Delete l 
		EndIf
	Next
End Function
;-----------
Function draw_protpickup(p_x,p_y)
	For pr.pr_pickup = Each pr_pickup
		pr\pr_y = pr\pr_y + pr\pr_yspeed
		DrawImage pr\pr_image,pr\pr_x,pr\pr_y
		
		If pr\pr_y < 0 Then
			FreeImage pr\pr_image
			Delete pr
		Else If ImagesCollide(player,p_x,p_y,0,pr\pr_image,pr\pr_x,pr\pr_y,0)
		    prframe#=1000
		    FreeImage pr\pr_image
			Delete pr
		EndIf
	Next
End Function
;-----------
Function draw_bosspickup(p_x,p_y)
	For bpr.bpr_pickup = Each bpr_pickup
		bpr\bpr_y = bpr\bpr_y + bpr\bpr_yspeed
		DrawImage bpr\bpr_image,bpr\bpr_x,bpr\bpr_y
		
		If bpr\bpr_y < 0 Then
			FreeImage bpr\bpr_image
			Delete bpr
		Else If ImagesCollide(player,p_x,p_y,0,bpr\bpr_image,bpr\bpr_x,bpr\bpr_y,0)
		    repel = True 
			emp = 1000
		    FreeImage bpr\bpr_image
			Delete bpr
		EndIf
	Next
End Function
;------------
Function draw_bulletprot(p_x,p_y)
	For bp.bp_bullet = Each bp_bullet
		bp\bp_y = bp\bp_y + bp\bp_yspeed
		DrawImage bp\bp_image,bp\bp_x,bp\bp_y
			If bp\bp_y > 768 Then
				bp\bp_dead = True
			EndIf 
		
		For e.enemy = Each enemy	
			If ImagesCollide(bp\bp_image,bp\bp_x,bp\bp_y,0,e\image,e\x,e\y,0) Then 
				e\dead = True
				;If e\dead = True Then killed=killed+1
				bp\bp_dead = True
			EndIf 
		Next 
		
		If ImagesCollide(bp\bp_image,bp\bp_x,bp\bp_y,0,boss,boss_x,boss_y,0) Then 
				;If e\dead = True Then killed=killed+1
				boss_health# = boss_health# - 1
				bp\bp_dead = True
			EndIf 
		
		
		If bp\bp_dead = True Then
			FreeImage bp\bp_image
			Delete bp
		EndIf 
	Next 
End Function
;-------------------
Function create_particle(x#,y#)
If particles = True
	p.particle = New particle
	p\x# = x#
	p\y# = y#
            p\xv# = Rnd(-3.00,3.00)
	p\yv# = Rnd(-3.00,3.00)
	p\colour = Rnd(1,3)
	p\time = 0
	particle_count = particle_count + 1
EndIf 
End Function 
;-------------------
Function update_particle()

If particles = True
	For p.particle = Each particle
		p\x# = p\x# + p\xv#
		p\y# = p\y# + p\yv#
		
		If p\colour = 1 Color 155,155,155
		If p\colour = 2 Color 200,150,60
		If p\colour = 3 Color 200,180,110
		
		Oval p\x#,p\y#,1,1,1
		
		p\time = p\time + 1
		
		If p\time > 100
			Delete p
			particle_count = particle_count - 1
		EndIf
		
		If particle_count < 0 Then particle_count = 0
		
		If particle_limiter = True And particle_count > 800
			Delete p
			particle_count = particle_count - 1
		EndIf
		
		
	Next
EndIf 
End Function
