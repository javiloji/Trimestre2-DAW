package ejercicio2Examen;

/**
 * 
  Clase Rectángulo que crea: 

 •Un objeto de esta clase se construye pasándole el ancho y el alto. 
 Ninguno de los dos atributos puede ser menor o igual a cero ni mayor que diez, 
 en esos casos se lanza la excepción ArithmeticException.

 •Mediante getters y setters se permite que se acceda y se modifique el 
 ancho y el alto del rectángulo teniendo en cuenta las restricciones en
 cuanto a las dimensiones del apartado anterior.
 
 •Al imprimir en pantalla un objeto de la clase usando System.out.print se 
  dibuja el rectángulo por la pantalla.
 
 •Crea la clase Cuadrado como subclase de Rectángulo. 
 Además, añade a su comportamiento la posibilidad de 
 comparar objetos cuadrados entre sí.
 
 •Los programas de test correspondientes a ambas clases,
 provocando la excepcion y capturandola. 
 * 
 * @author Javier Lopera Jimenez
 *
 */

public class Cuadrado extends Rectangulo implements Comparable<Cuadrado>{

  public Cuadrado(double lado) {
    super(lado,lado);
  }

  // Getters y Setters del lado
  
  public double getLado() {
    return getAlto();
  }

  public void setLado(double lado) {
      setAlto(lado);
      setAncho(lado);
  }
  
  /**
   * 
   * Método compareTo que permite comparar dos cuadrados, de forma que si un cuadrado es menor que el otro, 
   * devuelve un número negativo, si es igual, devuelve un 0 y si es mayor, un número positivo.
   * 
   * */

  public int compareTo(Cuadrado cuadrado) {
    int resultado;
    if (this.getLado() < cuadrado.getLado()) {
      resultado= -1;
    }
    else if (this.getLado() > cuadrado.getLado()) {
      resultado= 1;
    }
    else {
      resultado= 0;
    }
    return resultado;
  }
  
  /**
   * 
   * Creamos el metodo equals, que permite igualar dos cuadrados, de forma que si 
   * son iguales devuelve true y si son distintos devuelve false.
   * 
   * */
  
  public boolean equals(Cuadrado cuadrado) {
    boolean resultado;
    if(this.getLado()==cuadrado.getLado()) {
      resultado= true;
    }
    else {
      resultado= false;
    }
    return resultado;
  }
}

