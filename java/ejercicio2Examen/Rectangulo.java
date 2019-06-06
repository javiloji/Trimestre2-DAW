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

public class Rectangulo {

  // Declaramos las variables de instancia
  
  private double ancho;
  private double alto;

  
  public Rectangulo(double ancho, double alto) {

    setAncho(ancho);
    setAlto(alto);

  }

  // Getters y Setters

  public double getAncho() {
    return ancho;
  }

  protected void setAncho(double ancho) {
    if(ancho>0 && ancho <=10) {
      this.ancho = ancho;
    }
    else {
      throw new ArithmeticException();
    }
  }

  public double getAlto() {
    return alto;
  }

  protected void setAlto(double alto) {
    if(alto>0 && alto<=10) {
      this.alto = alto;
    }
    else {
      throw new ArithmeticException();
    }
  }

  /**
   * 
   * Creamos el método toString que nos permite dibujar nuestro rectangulo.
   * 
   */

  public String toString() {
    int i;
    int espacios;
    String resultado="";
    for(i=0;i<getAncho();i++) {
      resultado +="--";
    }
    resultado +="\n";
    for(i=1;i<getAlto() -1;i++) {
      resultado +="--";
      for (espacios = 1; espacios<getAncho() -1;espacios++) {
        resultado+="  ";
      }
      resultado +="--\n";
    }
    for(i=0;i<getAncho();i++) {
      resultado+="--";
    }
    resultado+="\n";
    return resultado;
  }
}
