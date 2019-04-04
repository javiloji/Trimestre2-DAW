'''

Realiza un programa que escoja al azar 5 palabras en español del minidiccionario
del ejercicio anterior. El programa irá pidiendo que el usuario
teclee la traducción al inglés de cada una de las palabras y comprobará si
son correctas. Al final, el programa deberá mostrar cuántas respuestas son
válidas y cuántas erróneas.

@author: Javier Lopera Jimenez
'''
import random
dic = {'gato':'cat','perro':'dog','mesa':'table','puerta':'door','ventana':'window','agua':'water','aceite':'oil'
	,'pizza':'pizza','sofa':'sofa','pelicula':'film','hola':'hello','adios':'bye','salud':'health','ganar':'win'
	,'perder':'lose','cabeza':'head','menos':'less','noche':'nicht','palabra':'word','mundo':'world'}

lista=[]

listaDesordenada=[]

aciertos=0

errores=0

for i in dic:
	lista.append(i)
	
"""

Desordenamos la lista con shuffle, despues añadimos las 5 palabras aleatorias a la nueva 
lista y por ultimo preguntamos la traduccion de estas palabras.

"""

random.shuffle(lista)

for i in range(5):
	
	listaDesordenada.append(lista.pop(0))

for i in listaDesordenada:
	
	respuesta=input("\nIntroduca la traduccion de "+i + ":\n")
	
	if(respuesta==dic.get(i)):
		aciertos+=1
	else:
		errores+=1

print("Has acertado",aciertos,"palabras")
print("Has fallado",errores,"palabras")	
	
	