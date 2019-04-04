'''

Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
30) donde los parámetros que se le pasan al constructor son las horas, los
minutos y los segundos respectivamente. Crea el método toString para ver los
intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y
35m 20s el resultado debería ser 1h 6m 0s. Realiza un programa de prueba para
comprobar que la clase funciona bien.

@author: Javier Lopera Jimenez

'''

class Tiempo():
	
	"""
	
	Creamos la clase tiempo.
	
	"""
	
	def __init__(self, horas,minutos,segundos):
		
		"""
		
		Creamos el constructor, pasandole por parámetro
		horas, minutos y segundos.
		
		"""
		
		self.horas=horas
		self.minutos=minutos
		self.segundos=segundos		
	
	def __str__(self):
		
		"""
	
		Creamos el metodo __str__ que nos permitira ver el estado
		de nuestros objetos.
	
		"""	
		
		cadena=str(self.horas)+"h "+str(self.minutos)+"m "+str(self.segundos)+"s"
		return cadena
	
	def sumar(self,tiempo2):
		
		"""
	
		Creamos el metodo sumar , al que le pasamos el segundo objeto tiempo
		por parámetro , en este metodo sumamos el primer objeto tiempo al segundo,
		constrolando que lo maximo son 59 segundos y 59 minutos.
	
		"""
		
		self.horas=self.horas+tiempo2.horas
		self.minutos=self.minutos+tiempo2.minutos
		self.segundos=self.segundos+tiempo2.segundos
	
		if(self.segundos>=60):
			self.minutos+=1
			self.segundos-=60
		
		if(self.minutos>=60):
			self.horas+=1
			self.minutos-=60
		
	def restar(self,tiempo3):
		
		"""
	
		Creamos el metodo restar , al que le pasamos el segundo objeto tiempo
		por parámetro , en este metodo restamos el primer objeto tiempo al segundo,
		constrolando que lo maximo son 59 segundos y 59 minutos.
	
		"""
		
		self.horas=self.horas-tiempo3.horas
		self.minutos=self.minutos-tiempo3.minutos
		self.segundos=self.segundos-tiempo3.segundos
		
		if(self.segundos<=0):
			self.minutos-=1
			self.segundos+=60
		
		if(self.minutos<=0):
			self.horas-=1
			self.minutos+=60
			
if __name__ == '__main__':
	
	tiempo = Tiempo(19,22,30)
	t2 = Tiempo(2,56,40)
	t3 = Tiempo(4,29,45)
	
	tiempo.sumar(t2)
	
	print(tiempo)
		
	t3.restar(t2)
	
	print(t3)