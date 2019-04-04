'''
Implementa la clase Terminal. Un terminal tiene asociado un número. Los
terminales se pueden llamar unos a otros y el tiempo de conversación corre
para ambos. A continuación se proporciona el contenido del main y el resultado
que debe aparecer por pantalla.

@author: d18lojij
'''

class Terminal():

#Constructor

	def __init__(self,numero):
		
		self.numero=numero
		self.tiempo=0

#Método llama, sirve para llamar a un terminal y sumar un tiempo de llamada a ambor terminales
	
	def llama(self,numeroALLamar,tiempo):
		
		self.tiempo=self.tiempo+tiempo
		numeroALLamar.tiempo=numeroALLamar.tiempo+tiempo

#Metodo toString para mostrar el estado del objeto.

	def __str__(self):
		
		cadena="Nº "+str(self.numero)+ " - "+ str(self.tiempo)+"s de conversación."
		return cadena
		
#Main
		
class Movil(Terminal):
	
	def __init__(self,numero,tarifa):
		
		Terminal.__init__(self, numero)
		if(tarifa=="rata" or tarifa=="mono" or tarifa=="bisonte"):
			self.tarifa=tarifa
		else:
			print("Esta tarifa no existe")
		self.coste=0
		
	def llama(self, numeroALLamar, tiempo):
		
		Terminal.llama(self, numeroALLamar, tiempo)
		self.coste=self.coste
		if(self.tarifa=="rata"):
			self.coste+=(tiempo*0.06)/60
			
		if(self.tarifa=="mono"):
			self.coste+=(tiempo*0.12)/60
			
		if(self.tarifa=="bisonte"):
			self.coste+=(tiempo*0.30)/60
	def __str__(self):
		
		cadena="Nº "+str(self.numero)+ " - "+ str(self.tiempo)+"s de conversación - tarificados "+str(self.coste)+" euros."
		
		return cadena

if __name__ == '__main__':
	
	t1 = Terminal("678 11 22 33")
	t2 = Terminal("644 74 44 69")
	t3 = Terminal("622 32 89 09")
	t4 = Terminal("664 73 98 18")
	print(t1);
	print(t2);
	t1.llama(t2, 320);
	t1.llama(t3, 200);
	print(t1);
	print(t2);
	print(t3);
	print(t4);
	
	m1 = Movil("678 11 22 33","rata")
	m2 = Movil("644 74 44 69","mono")
	m3 = Movil("622 32 89 09","bisonte")
	print(m1)
	print(m2)
	m1.llama(m2, 320)
	m1.llama(m3, 200)
	m2.llama(m3, 550)
	print(m1)
	print(m2)
	print(m3)
		