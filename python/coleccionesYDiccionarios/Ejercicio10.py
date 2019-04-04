'''

Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
(con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
almacenar las parejas de palabras. El programa pedirá una palabra en español
y dará la correspondiente traducción en inglés.

@author: Javier Lopera Jimenez
'''

dic = {'gato':'cat','perro':'dog','mesa':'table','puerta':'door','ventana':'window','agua':'water','aceite':'oil'
	,'pizza':'pizza','sofa':'sofa','pelicula':'film','hola':'hello','adios':'bye','salud':'health','ganar':'win'
	,'perder':'lose','cabeza':'head','menos':'less','noche':'nicht','palabra':'word','mundo':'world'}

palabra=""

palabra=input("Introduce la palabra que desea traducir: \n\n")

if(dic.__contains__(palabra)):
	print("La traducción de", palabra , "es:",dic.get(palabra))
else:
	print("Error, esa palabra no esta en el diccionario.")