'''
Created on 22 ene. 2019

@author: d18lojij
'''

class Fraccion:
	def __init__(self,n,d):
		self.n=n
		self.d=d
		
	def setNumerador(self,n):
		self.n=n
		return n
	
	def setDenominador(self,d):
		self.d=d
		return d
	
	def modificarFraccion(self,n,d):
		self.n=n
		self.d=d
		return str(self.n)+"/"+str(self.d)
	
	def resultadoFraccion(self):
		total=self.n/self.d
		return total
	
	def multiplicar(self,numero):
		self.n=self.n*numero
		return str(self.n)+"/"+str(self.d)
	
	def multiplicarPorFraccion(self,fraccion):
		
		return Fraccion(self.n*fraccion.n,self.d*fraccion.d)
	
	
		
	
	def __str__(self):
		return str(self.n)+"/"+str(self.d)
	

if __name__ == '__main__':
	
	f1=Fraccion(2.5,3)
	f2=Fraccion(3,4)
	
	print("La fraccion inicial es : " , f1)
	print("Resultado de la fraccion : " , f1.resultadoFraccion())
	f1.modificarFraccion(2,5)
	print("Modificamos la fraccion: " , f1)
	print("Obtenemos el numerador: " , f1.n)
	print("Obtenemos el denominador: " , f1.d)
	print("Resultado de la nueva fraccion : " , f1.resultadoFraccion())
	print("Multiplicamos la fraccion por 8: " , f1.multiplicar(8))
	
	f3=f1.multiplicarPorFraccion(f2)
	
	print("La fraccion producto de las dos primeras es: " , f3)
	
	
	
	
	
	
	
	
	