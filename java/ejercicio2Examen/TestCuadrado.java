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

public class TestCuadrado {

  public static void main(String[] args) {


    try {

      Cuadrado c = new Cuadrado(5);
      Cuadrado c2= new Cuadrado (2);
      System.out.println(c);
      System.out.println(c2);
      

      System.out.println(c.equals(c2));
      System.out.println(c2.compareTo(c));

    }catch(ArithmeticException e) {
      System.err.println("El cuadrado debe tener el lado mayor que cero y menor o igual que 10.");
    }
  }

}
