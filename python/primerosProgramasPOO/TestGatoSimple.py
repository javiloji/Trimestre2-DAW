'''
Created on 15 ene. 2019

@author: d18lojij
'''
from GatoSimple import *

garfield = GatoSimple("macho")
print("Hola gatito")
garfield.maulla()
print("Toma tarta")
garfield.come("tarta selva negra")
print("toma pescado, a ver si te gusta")
garfield.come("pescado")

tom = GatoSimple("macho")
print("Tom, toma sopita de verduras")
tom.come("sopa de verduras")

lisa = GatoSimple("hembra")

print("gatitos, a ver como maullais")
garfield.maulla()
tom.maulla()
lisa.maulla()

garfield.peleaCon(lisa)
lisa.peleaCon(tom)
tom.peleaCon(garfield)



