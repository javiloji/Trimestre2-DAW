'''
Created on 22 ene. 2019

@author: d18lojij
'''
class Vehiculos():
	
	def __init__(self,marca,modelo):
		
		self.marca=marca
		self.modelo=modelo
		self.enMarcha=False
		self.acelera=False
		self.frena=False
		
	def arrancar(self):
		
		self.enMarcha=True
		
	def acelerar(self):
		
		self.acelera=True
		
	def frenar(self):
		
		self.frena=True
		
	def estado(self):
		
		print("Marca: ",self.marca, "\nModelo: ", self.modelo, "\nEn Marcha: ",self.enMarcha,"\nAcelerando:",
				self.acelera,"\nFrenando: ",self.frena)
		
class furgoneta(Vehiculos):
	
	def carga(self,cargar):
		self.cargado=cargar
		if(self.cargado):
			return "La furgoneta esta cargada"
		else:
			return "La furgoneta no esta cargada"


class Moto(Vehiculos):
	
	hCaballito=""
	
	def estado(self):
		
		print("Marca: ",self.marca, "\nModelo: ", self.modelo, "\nEn Marcha: ",self.enMarcha,"\nAcelerando:",
			self.acelera,"\nFrenando: ",self.frena,"\n",self.hCaballito)
	
	def caballito(self):
		self.hCaballito="Voy haciendo el caballito"

class VElectricos():
	def __init__(self):
		self.autonomia=100
		
	def cargarEnergia(self):
		self.cargando=True
		
class BicicletaElectrica(VElectricos,Vehiculos,Moto):
	
	pass

if __name__ == "__main__":
	
	moto1=Moto("seat","CBR")
			
	moto1.caballito()
	moto1.acelerar()
	moto1.estado()
	
	miFurgoneta=furgoneta("Renault","Kangoo")
	
	miFurgoneta.arrancar()
	miFurgoneta.estado()
	print(miFurgoneta.carga(True))
	
	miBici=BicicletaElectrica()
	miBici.estado()
	

	
	


	
	
	
	