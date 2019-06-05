'''

Crea la clase Rectángulo de forma que:

•Un objeto de esta clase se construye pasándole el ancho y el alto. 
Ninguno de los dos atributos puede ser menor o igual a cero ni mayor que diez, 
en esos casos se debe lanzar la excepción ArithmeticException.

•Mediante getters y setters permite que se acceda y se modifique el 
ancho y el alto del rectángulo teniendo en cuenta las restricciones en
 cuanto a las dimensiones del apartado anterior.
 
 •Al imprimir en pantalla un objeto de la clase usando System.out.print se 
 debe dibujar el rectángulo por la pantalla (de manera similar a como se imprime 
 un cuadrado en la página 130 del libro Aprende Java con Ejercicios).
 
 •Crea la clase Cuadrado como subclase de Rectángulo. 
 Le debes añadir a su comportamiento la posibilidad de 
 comparar objetos cuadrados entre sí.
 
 •Crea los programas de test correspondientes a ambas clases. 
 Debes provocar que se lance la excepción y capturarla. 

@author: Javier Lopera Jimenez
'''
import sys

class Rectangulo():
    
    #COnstructor de Rectángulo
    
    def __init__(self,ancho,alto):
        
        
        self.ancho=ancho
        self.alto=alto
        
    

    # Getters y Setters
    
    @property
    def ancho(self):
        return self.__ancho
    
    @ancho.setter
    def ancho(self,ancho):
        
        if(ancho<0 or ancho >=10):
            raise TypeError
        self.__ancho=ancho
        
    @property
    def alto(self):
        return self.__alto
    @alto.setter
    def alto(self,alto):
        if((alto<0 or alto>=10)):
            raise TypeError
        self.__alto=alto
            
    """
    Metodo toString de la clase Rectangulo
    """
    
    def __str__(self):
        resultado=""
        for i in range(0,self.__ancho):
            i+=1
            resultado+="--"
            
        resultado+="\n"
        
        for i in range(0,self.__alto-1):
            i+=1
            resultado +="--"
            for espacios in range(1,self.__ancho-1):
                espacios+=1
                resultado+="  "
            resultado+="--\n"
        
        for i in range (0,self.__ancho):
            i+=1
            resultado+="--"
            
        resultado+="\n"

        return str(resultado)    
        
        
    
class Cuadrado(Rectangulo):    
    
    #Constructor de Cuadrado
    
    def __init__(self,lado):
        super().__init__(lado, lado)
    
    # Getters y Setters
    @property
    def lado(self):
        return super.alto
    
    @lado.setter
    def lado(self,lado):
        self.alto=lado
        self.ancho=lado
    
    """
    Metodo que compara dos cuadrados pasados por parametros e indica cual es mayor
    """
    
    def __eq__(self,other):
        return (self.alto==other.alto)

    def __le__(self,other):
        return (self.alto<=other.alto)
    
    def __gt__(self,other):
        return (self.alto>other.alto)
            
    """
    Metodo toString de la clase Cuadrado
    """    
        
    def __str__(self):
        return Rectangulo.__str__(self)
    
    # Main para hacer las pruebas
    
if __name__ == '__main__':
    
    try:
        r1 = Rectangulo(5,7)
        print("Mostramos el rectángulo")
        print(r1)
        
        c1 = Cuadrado(8)
        print("Mostramos el primer cuadrado")
        print(c1)
        c1.lado=3
        print(c1)
        c2 = Cuadrado(6)
        print("Mostramos el segundo cuadrado")
        print(c2)
        
        
        print(c1>c2)

    except:
        sys.stderr.write("Error")
            
    
    
