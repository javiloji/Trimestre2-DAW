'''

Escribe un programa que ordene 10 números enteros introducidos por teclado
y almacenados en un objeto de la clase ArrayList.

@author: Javier Lopera Jimenez
'''

num=0

lista=[]
for i in range(10):
	num=int(input("Introcuce el numero:"))
	
	lista.append(num)


lista.sort()

print("\nLa lista ordenada seria la siguiente: \n\n", lista)
	