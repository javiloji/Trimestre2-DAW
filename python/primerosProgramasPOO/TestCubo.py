'''
Created on 18 ene. 2019

@author: d18lojij
'''

# coding=utf8
'''
Created on 17 ene. 2019
Programa que prueba la clase Cubo
@author: d18momoa
'''
from Cubo import Cubo

#main:

cubito = Cubo(2)
cubote = Cubo(7)
print("Cubito: \n")
cubito.pinta()
print("\nCubote: \n")
cubote.pinta()
print("\nLleno el cubito: \n")
cubito.llena()
cubito.pinta()
print("\nEl cubote sigue vacío: \n")
cubote.pinta()
print("\nAhora vuelco lo que tiene el cubito en el cubote.\n")
cubito.vuelcaEn(cubote)
print("Cubito: \n")
cubito.pinta()
print("\nCubote: \n")
cubote.pinta()
print("\nAhora vuelco lo que tiene el cubote en el cubito.\n")
cubote.vuelcaEn(cubito)
print("Cubito: \n")
cubito.pinta()
print("\nCubote: \n")
cubote.pinta()
