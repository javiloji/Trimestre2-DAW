'''

Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
fichero. Tanto el nombre del fichero como la palabra se deben pasar como
argumentos en la línea de comandos.

@author: Javier Lopera Jiménez
'''

f=open("palabras.txt","r")

lista=[]

ficheroLeido = f.read()

"""

Usamos los split para quitar los \n que hay al final de cada linea.

"""
	
lista = ficheroLeido.split()

f.close()

palabra = input("Introduce la palabra que buscas:")

contador=0

for i in lista:
	
	if(i == palabra):
		contador+=1
	
print("La palabra " + palabra + " tiene " + str(contador) + " ocurrencias.")
		
	


