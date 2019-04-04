"""
Escribe un programa que guarde en un fichero con nombre primos.dat los
números primos que hay entre 1 y 500.

"""

def esPrimo(num):
	
	if(num<=1):
		
		return False
	
	elif(num==2):
		
		return True
	
	else:
		for i in range(2,num):
			if(num%i==0):
				return False
		return True

f=open("primos.dat","w")
	
for i in range (500):
	if(esPrimo(i)):
		f.writelines(str(i)+"\n")
f.close()
		