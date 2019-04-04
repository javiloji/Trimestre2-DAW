package ejercicio2;

/**
 * 2. Crea la clase Vehiculo , así como las clases Bicicleta y Coche
 *    como subclases de la primera. Para la clase Vehiculo , crea los
 *    atributos de clase vehiculosCreados y kilometrosTotales , así como
 *    el atributo de instancia kilometrosRecorridos . Crea también algún
 *    método específico para cada una de las subclases. Prueba las
 *    clases creadas mediante un programa con un menú como el que se
 *    muestra a continuación:
 *    VEHÍCULOS
 *    =========
 *    1. Anda con la bicicleta
 *    2. Haz el caballito con la bicicleta
 *    3. Anda con el coche
 *    4. Quema rueda con el coche
 *    5. Ver kilometraje de la bicicleta
 *    6. Ver kilometraje del coche
 *    7. Ver kilometraje total
 *    8. Salir
 *    Elige una opción (1-8):
 * 
 * @author Javier Lopera Jimenez
 */

public class TestVehiculos {

	public static void main(String[] args) {

		int opcion = 0;
    
    
    Bicicleta bici = new Bicicleta();
    Coche coche = new Coche();

    while (opcion != 8) {
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opción (1-8): ");
      
      opcion = Teclado.nextInt();
      
      switch (opcion) {
        case 1:
          bici.andar();
          break;
        case 2:
          System.out.println("\n" + bici.hazCaballito() + "\n");
          break;
        case 3:
          coche.andar();
          break;
        case 4:
          System.out.println("\n" + coche.quemarRueda() + "\n");
          break;
        case 5:
          System.out.println("\nLa bicicleta lleva recorridos ");
          System.out.println(bici.getKilometrosTotalesBici() + " Km\n");
          break;
        case 6:
          System.out.println("\nEl coche lleva recorridos ");
          System.out.println(coche.getKilometrosTotalesCoche() + " Km\n");
          break;
        case 7:
        	float kmTotales= bici.getKilometrosTotalesBici() + coche.getKilometrosTotalesCoche();
          System.out.println("\nLos vehículos llevan recorridos ");
          System.out.println(kmTotales + " Km");
        case 8:
        	System.out.println("\n***Fin del programa***\n");
        default:
      } // switch
    }
	}
}
