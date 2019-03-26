Global player=LoadImage("images/player2.bmp")
Global lose=LoadImage("images/lose.bmp")
Global empwave=LoadImage("images/empwave.jpg")
Global bullet1=LoadImage("images/laser2.bmp")
Global wideimage=LoadImage("images/laser4.bmp")
Global laserImage = LoadImage("images/laser3.bmp")
Global wideshotlaser = LoadImage("images/laser5.jpg")
Global healthpickup = LoadImage("images\heal.jpg")
Global armorpickup = LoadImage("images\armor.jpg")
Global emppickup = LoadImage("images\emp2.jpg")
Global shieldpickup = LoadImage("images\emp.jpg")
Global laserpickup = LoadImage("images\laser.jpg")
Global protimg = LoadImage("images/protection.jpg")
Global protection = LoadImage("images/summon.bmp")
Global speed = LoadImage("images/temp.bmp")
Global enemy = LoadImage("images/enemy.bmp")
Global enemy2 = LoadImage("images/enemy2.bmp")
Global enemy3 = LoadImage("images/enemy3.bmp")
Global boss = LoadImage("images/boss.bmp")
Global repelimage = LoadImage("images/repel.bmp")
Global win = LoadImage("images/win.bmp")
Global ballimage = LoadImage("images/ball.bmp")
Global boss3 = LoadImage("images/enemy.bmp")
;FONTS
Global font = LoadFont("Arial",45,True,False,True)
Global font2 = LoadFont("Arial",20,False,False,False)
Global font3 = LoadFont("Arial",15,False,False,False)
;HUD ITEMS
Global score=0
Global health=1000
;BOSS
Global boss_health# = 1000
Global boss_h_percent = 100
Global boss_timer = 3000
;BOSS 2
Global boss3_health# = 1000
Global boss3_h_percent = 100
Global boss3_energy# = 1000
Global boss3_e_percent = 100
Global regeneration = False 
Global regentimes = 0
Global count10 = 1

Global armor=750
Global nuke=1
Global emp=500
Global laser=500
Global killed=0
Global times_hit = 0
Global speed_left = 900
Global speedmod = 8
Global start2 = 0
Global bullet_frame = 15
Global bullet_mod = 0
;COUNTERS FOR ENEMIES FOR ITEM SPAWNS
Global hcounter=Rnd(3000,3500)
Global acounter=Rnd(2500,3000)
Global ncounter=Rnd(2000,2500)
Global mcounter=Rnd(1000,1500)
Global lcounter=Rnd(750,1250)
Global wcounter=Rnd(750,1250)
Global scounter=Rnd(750,1250)
Global scount = 0
Global frame2=0
Global bullettimer=0
Global bullettimer2=0
Global bullettimer3=0
Global nowtime#=0
Global loadplayercount=0
Global prcounter=Rnd(1000,1500)
Global prshow = 500
Global wideshow = 0
Global recounter = 0
Global summoningasteroids = 0
Global fontcount = 0
Global are = 0
Global bre = 1024
Global are2 = 0
Global bre2 = 1024
Global are3 = 0
Global bre3 = 1024
;POSITIONS
Global p_x=50,p_y=100
Global boss_x = 0, boss_y = 700
Global boss3_x = 6000, boss3_y = 6000
Global boss3_x_emp = 6000, boss3_y_emp = 6000
Global boss3_x_temp = 512, boss3_y_temp = 550
Global h_length=200 
Global enemyy,enemyx
Global open = 200
Global openmove = 2
Global lasermove = 3
Global lasermove2 = 3
Global lasermove3 = 3
;OPTIONS
Global mode=1
Global diff1 = 3
Global particles = True
Global particle_amount = 9
Global particle_count = 0
Global slowtime = False
Global slowframe# = 600
Global wideframe# = 1000
Global prframe#=0
Global staramt = 100
Global Repeat1 = 1
Global repeat2 = 1
Global recounter2 = 0
Global recounter3 = 0
Global recounter4 = 0
Global recounter5 = 0
Global recounter6 = 0
Global recounter7 = 0
Global recounter8 = 0
Global recounter9 = 0
Global count11 = 1
Global randcount = 0
Global invis_count1 = 0
Global switch_count = 0
Global ptop = 100
Global pbottom = 574
Global recount = 0
Global credits = False
Global impossible = False
Global debug = False
Global particle_limiter = True
Global repel = False
Global blastcounter = 0
Global alwaysdown = False
Global lunge = 0
Global lunge2 = 0
Global reverse_x = False
Global givepoints = True 
Global pause = False
Global pauseoff = 1
Global radius = 0
Global framespawn# = 0
Global framecount1 = 0
Global framecount2 = 0
Global back1 = 0

Global temp_num = 0
Global stagger = 0
Global reducer = 300
Global ballcount = 0
Global color1=0,color2=0,color3=0

Global god = False
Global debugrestrict = False
Global debugmode = False
Global inverse1 = 1
Global inverse2 = 1
Global inverse3 = 1

Global speedboost = 1000
Global fast = False
Global invuln = False
Global star_mod = 0