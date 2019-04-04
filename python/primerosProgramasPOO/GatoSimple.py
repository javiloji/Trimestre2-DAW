'''
Implementa en Python las clases GatoSimple, Cubo y Cuadrado vistas en el libro 
"Aprende Java con Ejercicios" y sus respectivos programas de prueba.

@author: d18lojij
'''

class GatoSimple():
	
	# Constructor
	
	def __init__(self,sexo):
		
		self.__sexo=sexo
		self.color="Negro"
		self.raza="Siamés"
		self.edad=3
		self.peso=10
	
	# Getter	zx
		
	def getSexo(self):
		return self.__sexo
	    
	def maulla(self):
		print("Miauu")
		
	def ronronea(self):
		print("Mmrrr")
	
	def come(self,comida):
		if(comida=="pescado" or comida=="Pescado"):
			print("Mmmm, gracias")
			
		else:
			print("Lo siento, yo solo como pescado.")
			
	def peleaCon(self,contrincante):
		if(self.__sexo=="hembra"or self.__sexo=="Hembra"):
			print("No me gusta pelear.")
			
		else:
			if(contrincante.getSexo()=="hembra" or contrincante.getSexo()=="Hembra"):
				print("No peleo contra gatitas.")
				
			else:
				print("Ven aqui que te vas a enterar.")
				
	
		
	
	
	