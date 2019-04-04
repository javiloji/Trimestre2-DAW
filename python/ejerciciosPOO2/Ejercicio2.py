'''
Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
también algún método específico para cada una de las subclases. Prueba las
clases creadas mediante un programa con un menú como el que se muestra
a continuación:
VEHÍCULOS
=========
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir

Elige una opción (1-8):


@author: d18lojij

'''

class Vehiculo():
	
	vehiculosCreados=0
	kilometrosTotales=0
	
	def __init__(self):
		
		self.kilometrosRecorridos=0
		self.vehiculosCreados+=1
		
	

class Bicicleta(Vehiculo):
	
	kilometrosTotalesBici=0
	
	def __init__(self):
		
		self.kilometrosTotalesBici=0
		
	def andar(self):
		self.kilometrosRecorridos= int(input("¿Cuántos kilómetros quieres andar con la bici?"))
		self.kilometrosTotalesBici +=self.kilometrosRecorridos
		
	def hacerCaballito(self):
		
		print("Voy haciendo el caballito.")
		
	def kmBici(self):
		print("Kilometros totales de la bici: " , str(self.kilometrosTotalesBici))
		
class Coche(Vehiculo):
	
	kilometrosTotalesCoche=0
	
	def __init__(self):
		
		self.kilometrosTotalesCoche=0
		
	def andar(self):
		
		self.kilometrosRecorridos=int(input("¿Cuantos kilometros quieres andar con el coche?"))
		self.kilometrosTotalesCoche+=self.kilometrosRecorridos
	
	def quemarRueda(self):
		print("Voy quemando rueda...")
		
	def kmCoche(self):
		
		print("Kilometros totales del coche: " , str(self.kilometrosTotalesCoche))	
		
if __name__ == '__main__':
	
	joseLuis=Bicicleta()
	juanbu=Coche()
	
	
	
	
	while(True):
		
		print("\n*********Menu*********\n1. Anda con la bicicleta\n2. Haz el caballito con la bicicleta"
			"\n3. Anda con el coche\n4. Quema rueda con el coche"
			"\n5. Ver kilometraje de la bicicleta\n6. Ver kilometraje del coche"
			"\n7. Ver kilometraje total\n8. Salir\n")
		
		respuesta=int(input("Elige una opción:\n"))
		
		if(respuesta==1):
			joseLuis.andar()
		elif(respuesta==2):
			joseLuis.hacerCaballito()
		elif(respuesta==3):
			juanbu.andar()
		elif(respuesta==4):
			juanbu.quemarRueda()
		elif(respuesta==5):
			joseLuis.kmBici()
		elif(respuesta==6):
			juanbu.kmCoche()
		elif(respuesta==7):
			Vehiculo.kilometrosTotales=joseLuis.kilometrosTotalesBici+juanbu.kilometrosTotalesCoche
			print("El kilometraje total es de: ",str(Vehiculo.kilometrosTotales))
		elif(respuesta==8):
			print("***Fin del programa***")
			break
		else:
			print("Respuesta incorrecta.")
		
	
	