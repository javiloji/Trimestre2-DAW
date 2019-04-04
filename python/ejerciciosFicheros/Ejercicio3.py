'''

Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
contenidas en un fichero de texto. El nombre del fichero que contiene las
palabras se debe pasar como argumento en la línea de comandos. El nombre
del fichero resultado debe ser el mismo que el original añadiendo la coletilla
sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
línea.

@author: d18lojij
'''

fichero=input("Introduce el nombre del fichero")

fLectura=open(fichero+".txt","r")

fEscritura=open(fichero+"_sort.txt","w")

lista=[]

for i in fLectura:
	lista.append(i)

lista.sort()

for i in lista:
	fEscritura.writelines(str(i)+"")

fLectura.close()
fEscritura.close()
