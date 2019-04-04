'''


Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
y 20 elementos ambos inclusive.

@author: Javier Lopera Jimenez
'''
from random import random

lista=[]

suma=0

media=0

maximo=0

minimo=0

"""

Agregamos todos los elementos en la lista con el append y un for.

"""
for i in range(20):
	lista.append(int(random()*100))

"""

Realizamos la suma con un for, la media dividiendo la suma entre la 
longitud de la lista, el minimo con min y el maximo con max.

"""

for i in range(20):	
	suma+=lista[i]
	
media=suma/lista.__len__()	

print("Esta es la lista completa:\n\n",lista,"\n")

print("La suma total es :",suma)	

print("La media total es :",media)
	
print("El número mínimo de la lista es: ",min(lista))
	
print("El número máximo de la lista es: ",max(lista))	
	
	
	