'''

El ejercicio 6 anterior te pide que crees una clase "Tiempo" y un programa de prueba. 
Investiga si ya existe en Java y Python una clase similar y adapta tus programas de 
prueba para trabajar con esas clases.

@author: d18lojij
'''

from datetime import datetime,timedelta

def restar(hora1,hora2):

	"""
	
	En este metodo restamos las dos horas que pasamos por parámetros, 
	para ello utilizamos la clase datetime y el metodo strptime, 
	al que hay que pasarle la hora y el formato que utilizamos para esa hora.
			
	"""

	formato="%H:%M:%S"
	
	h1=datetime.strptime(hora1,formato)
	h2=datetime.strptime(hora2,formato)

	total=h1-h2
	return "Horas restadas: "+ str(total)


def sumar(hora1,hora2):
	
	"""

	En este metodo sumamos las dos horas que pasamos por parámetros, 
	para ello utilizamos la el metodo split para separar la segunda hora,
	despues le vamos sumando a la primera hora las horas, los minutos y los segundos de 
	la segunda hora y mostramos el resultado con el metodo strftime pasandole por parametro el
	formato que hemos dado anteriormente.
		
	"""
	
	formato = "%H:%M:%S"
	
	lista = hora2.split(":")
	
	hora=int(lista[0])
	minuto=int(lista[1])
	segundo=int(lista[2])
	
	h1 = datetime.strptime(hora1, formato)
	
	dh = timedelta(hours=hora) 
	dm = timedelta(minutes=minuto)          
	ds = timedelta(seconds=segundo) 
	
	resultado1 = h1 + ds
	resultado2 = resultado1 + dm
	resultado = resultado2 + dh
	resultado= resultado.strftime(formato)
	
	return "Horas sumadas: " + str(resultado)

print(sumar("21:30:50","04:20:30"))

print(restar("15:29:35","12:02:45"))


