Include "variables.bb"

Function check_cheats()
	;asher cheat
	If KeyHit(30)
		a_key = True 
	EndIf 
	If a_key = True And KeyHit(31)
		s_key = True
	Else
		reset_keys()
	EndIf 
	If s_key = True And KeyHit(35)
		h_key = True
	Else
		reset_keys()
	EndIf 
	If h_key = True And KeyHit(18)
		e_key = True
	Else
		reset_keys()
	EndIf 
	If e_key = True And KeyHit(19)
		r_key = True
	Else
		reset_keys()
	EndIf 
	
	
	
	Text 512,100,a_key,True,True 
	
	
	If a_key = True And s_key = True And h_key = True And e_key = True And r_key = True 
		mode = 2
	EndIf 
End Function


Function reset_keys()
a_key = False 
b_key = False 
c_key = False 
d_key = False 
e_key = False 
f_key = False 
g_key = False 
h_key = False 
i_key = False 
j_key = False 
k_key = False 
l_key = False 
m_key = False 
n_key = False 
o_key = False 
p_key = False 
q_key = False 
r_key = False 
s_key = False 
t_key = False 
u_key = False 
v_key = False 
w_key = False 
x_key = False 
y_key = False 
z_key = False 
End Function