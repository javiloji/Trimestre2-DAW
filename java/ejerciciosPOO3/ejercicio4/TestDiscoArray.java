package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;



public class TestDiscoArray {
public static void main(String[] args) {
	
	
	Scanner entrada = new Scanner(System.in);
	
	/**
	 * ArrayList de objetos de la clase DiscoArray
	 */
	ArrayList<DiscoArray> array = new ArrayList<DiscoArray>();
	
	
	int opcion;
	int codigoIntroducido=0;
  String autorIntroducido;
  String tituloIntroducido;
  String generoIntroducido;
  int duracionIntroducida;
  int i =0;
	
  do {
    mostrarMenu();
    
    opcion = entrada.nextInt();
    
    switch (opcion) {
    case 1:
    	
    	menuListado();
      
      opcion = entrada.nextInt();
      entrada.nextLine();
    	switch(opcion) {
    	case 1:
    		 listadoCompleto(array);
    		break;
    		
    	case 2:
    		System.out.println("¿Qué autor deseas buscar?");
    		autorIntroducido = entrada.nextLine();
    		
    		listadoAutor(array, autorIntroducido);
    		break;
    		
    	case 3:
    		System.out.println("¿Qué genero deseas buscar?");
    		generoIntroducido = entrada.nextLine();
    		
    		listadoGenero(array, generoIntroducido);
    		break;
    		
    	case 4:
    		System.out.println("¿Cuanto quieres que dure la canción?");
    		System.out.println("Tiempo mínimo");
    		int tiempoMinimo = entrada.nextInt();
    		
    		System.out.println("Tiempo máximo");
    		int tiempoMaximo = entrada.nextInt();
    		
    		listadoDuracion(array, tiempoMinimo, tiempoMaximo);
             		
    		break;
    	
    	default:
    	}  	  	
     
      break;
           
    case 2:
    	annadirNuevoDisco(entrada, array);
    	
      break;
    
    case 3:
      modificar(entrada, array);
      
      break;
      
      
    case 4:
      borrar(entrada, array);
      
      break;
      
    default:
    
    } // switch
  } while (opcion != 5);
   
	}

public static void borrar(Scanner entrada, ArrayList<DiscoArray> array) {
	int codigoIntroducido;
	System.out.println("\nBORRAR");
	System.out.println("======");
	
	System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
	try {
		codigoIntroducido = entrada.nextInt()-1;
		array.remove(codigoIntroducido);
		System.out.println("El disco se ha borrado correctamente");
	} catch (Exception e) {
		System.err.println("El código introducido no existe, por favor introduzca un código válido");
	}
}

public static void modificar(Scanner entrada, ArrayList<DiscoArray> array) {
	int codigoIntroducido;
	String autorIntroducido;
	String tituloIntroducido;
	String generoIntroducido;
	int duracionIntroducida;
	System.out.println("\nMODIFICAR");
	System.out.println("===========");
	
	System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
	codigoIntroducido = entrada.nextInt()-1;
	entrada.nextLine();
	System.out.println("Por favor, introduzca los datos del disco.");
	System.out.println("Autor");
	autorIntroducido = entrada.nextLine();
	System.out.println("Titulo");
	tituloIntroducido = entrada.nextLine();
	System.out.println("Género");
	generoIntroducido = entrada.nextLine();
	System.out.println("Duración");
	duracionIntroducida = entrada.nextInt();
	array.set((codigoIntroducido), new DiscoArray(      		
			autorIntroducido, 
			tituloIntroducido, 
			generoIntroducido,
			duracionIntroducida));
}

public static void annadirNuevoDisco(Scanner entrada, ArrayList<DiscoArray> array) {
	String autorIntroducido;
	String tituloIntroducido;
	String generoIntroducido;
	int duracionIntroducida;
	if(array.size()<5) {
	System.out.println("\nNUEVO DISCO");
	System.out.println("===========");
	entrada.nextLine();
	System.out.println("Por favor, introduzca los datos del disco.");
	System.out.println("Autor");
	autorIntroducido = entrada.nextLine();
	System.out.println("Titulo");
	tituloIntroducido = entrada.nextLine();
	System.out.println("Género");
	generoIntroducido = entrada.nextLine();
	System.out.println("Duración");
	duracionIntroducida = entrada.nextInt();
	
	array.add(new DiscoArray(      		
			autorIntroducido, 
			tituloIntroducido, 
			generoIntroducido,
			duracionIntroducida));
	}
	else {
		System.err.println("La lista de discos está llena, borra un disco para añadir otro");
	}
}

public static void listadoDuracion(ArrayList<DiscoArray> array, int tiempoMinimo, int tiempoMaximo) {
	for(DiscoArray x : array) {
	 	if(tiempoMinimo <= x.getDuracion() && tiempoMaximo >= x.getDuracion()) {
	 		System.out.println(x);
	 	}
	}
}

public static void listadoGenero(ArrayList<DiscoArray> array, String generoIntroducido) {
	for(DiscoArray x : array) {
	 	if(generoIntroducido.equals(x.getGenero())) {
	 		System.out.println(x);
	 	}       		
	 }
}

public static void listadoAutor(ArrayList<DiscoArray> array, String autorIntroducido) {
	for(DiscoArray x : array) {
	 	if(autorIntroducido.equals(x.getAutor())) {
	 		System.out.println(x);
	 	}       		
	 }
}

public static void listadoCompleto(ArrayList<DiscoArray> array) {
	int i;
	System.out.println("\nLISTADO COMPLETO");
	 System.out.println("=======");
	 for(DiscoArray x : array) {
	 	i = array.indexOf(x);
	 	System.out.println("Código: "+(i+1) );
	 	
	 	System.out.println(x);
	 }
}

public static void menuListado() {
	System.out.println("1. Listado completo");
	System.out.println("2. Listado por autor");
	System.out.println("3. Listado por genero");
	System.out.println("4. Listado por duración");
}

public static void mostrarMenu() {
	System.out.println("\n\nCOLECCIÓN DE DISCOS");
	System.out.println("TAMAÑO MÁXIMO DE LA COLECCIÓN: 5");
	System.out.println("===================");
	System.out.println("1. Listado");
	System.out.println("2. Nuevo disco");
	System.out.println("3. Modificar");
	System.out.println("4. Borrar");
	System.out.println("5. Salir");
	System.out.print("Introduzca una opción: ");
}
}