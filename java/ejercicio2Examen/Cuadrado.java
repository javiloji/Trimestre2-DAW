package ejercicio2Examen;

/**
 * 
 * Crea la clase Rectángulo de forma que:

  Un objeto de esta clase se construye pasándole el ancho y el alto. 
  Ninguno de los dos atributospuede ser menor o igual a cero ni mayor que diez, 
  en esos casos se debe lanzar la excepción ArithmeticException.

  Mediante getters y setters permite que se acceda y se modifique el 
  ancho y el alto del rectángulo teniendo en cuenta las restricciones en
  cuanto a las dimensiones del apartado anterior.

 Al imprimir en pantalla un objeto de la clase usando System.out.print se 
 debe dibujar el rectángulo por la pantalla (de manera similar a como se imprime 
 un cuadrado en la página 130 del libro Aprende Java con Ejercicios).

 Crea la clase Cuadrado como subclase de Rectángulo. 
 Le debes añadir a su comportamiento la posibilidad de 
 comparar objetos cuadrados entre sí.

 Crea los programas de test correspondientes a ambas clases. 
 Debes provocar que se lance la excepción y capturarla. 
 * 
 * @author Javier Lopera Jimenez
 *
 */

public class Cuadrado extends Rectangulo implements Comparable<Cuadrado>{


  public Cuadrado(double lado) {
    super(lado,lado);
  }

  public double getLado() {
    return getAlto();
  }

  public void setLado(double lado) {
      setAlto(lado);
      setAncho(lado);
  }

  /**
   * 
   * El metodo compararCuadrado al que le pasamos dos cuadrados 
   * por parametro y nos indica cual es mayor.
   * 
   * @param c1
   * @param c2
   */

  /**
   * 
   * Creamos el metodo toString para dibujar los cuadrados.
   * 
   */

  @Override
  public String toString() {

    return super.toString();

  }	

  public int compareTo(Cuadrado cuadrado) {
    if (this.getLado() < cuadrado.getLado()) {
      return -1;
    }
    else if (this.getLado() > cuadrado.getLado()) {
      return 1;
    }
    else {
      return 0;
    }
    //return (int)(this.getAlto().compareTo());
  }
}

