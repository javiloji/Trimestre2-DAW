
'''

1. Implementa en Python las clases GatoSimple, Cubo y Cuadrado vistas en el libro "Aprende Java con Ejercicios" y sus respectivos programas de prueba.

Definición de la clase Cuadrado

@author: Javier Lopera Jimenez
'''
class Cuadrado():
    def __init__(self,la):
        self.__lado = la
        
    def toString(self):
        resultado = ""
        for i in range (1,self.__lado):
            resultado +="❏"  
        for i in range (1,self.__lado):
            resultado += "❏❏\n"
            
        for i in range (1,self.__lado) :
            resultado += "❏"
        for i in range (2,self.__lado - 1):
            resultado += "❏❏\n"
        return resultado