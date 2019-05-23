package ejercicio2Examen;

/**
 * 
 * Crea la clase Rectángulo de forma que:

Un objeto de esta clase se construye pas�ndole el ancho y el alto. 
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

public class TestCuadrado {

  public static void main(String[] args) {


    try {

      Cuadrado c = new Cuadrado(5);
      Cuadrado c2= new Cuadrado (7);
      System.out.println(c);
      System.out.println(c2);

      c.compararCuadrado(c, c2);

      System.out.println(c2.compareTo(c));

    }catch(ArithmeticException e) {
      System.err.println("El cuadrado debe tener el lado mayor que cero y menor o igual que 10.");
    }
  }

}
