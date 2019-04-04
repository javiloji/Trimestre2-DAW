/**
 * 
 */
package ejercicio2;

/**
 * 
 * Crea la clase Vehiculo, as� como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
 * kilometrosTotales, as� como el atributo de instancia kilometrosRecorridos. Crea
 * tambi�n alg�n m�todo espec�fico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un men� como el que se muestra
 * a continuaci�n:
 * VEH�CULOS
 * =========
 * 1. Anda con la bicicleta
 * 2. Haz el caballito con la bicicleta
 * 3. Anda con el coche
 * 4. Quema rueda con el coche
 * 5. Ver kilometraje de la bicicleta
 * 6. Ver kilometraje del coche
 * 7. Ver kilometraje total
 * 8. Salir

 * Elige una opci�n (1-8):
 * 
 * @author d18lojij
 *
 */

	
	public class Vehiculo{
		
		 private static int vehiculosCreados=0;
		
		 /**
		  * 
		  * Constructor de la clase Vehiculo que a�ade 1 a vehiculosCreados cada vez que se utiliza.
		  * 
		  * */
		 
		 public Vehiculo() {
			 
			 this.vehiculosCreados+=1;		 
			 
		 }
		 
		  public static int getVehiculosCreados() {
		    return Vehiculo.vehiculosCreados;
		  }
	}
	

	
