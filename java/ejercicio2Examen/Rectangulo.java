package ejercicio2Examen;


/**
 * 
 * Crea la clase Rectángulo de forma que:

•Un objeto de esta clase se construye pasándole el ancho y el alto. 
Ninguno de los dos atributospuede ser menor o igual a cero ni mayor que diez, 
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
 * 
 * @author Javier Lopera Jimenez
 *
 */
public class Rectangulo {

	private double ancho;
	private double alto;


	/**
	 * 
	 * Creo el constructor que voy a utilizar posteriormente en la clase Cuadrado.
	 * 
	 * @param lado
	 */
	
	
	
	//Constructor de Rectangulo
	
	public Rectangulo(double ancho, double alto) {

		setAncho(ancho);
		setAlto(alto);

	}

	//Getters y Setters
	
	
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
	 * Modificamos el método toString que nos permite dibujar nuestro rectangulo.
	 * 
	 */
	
	@Override
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


