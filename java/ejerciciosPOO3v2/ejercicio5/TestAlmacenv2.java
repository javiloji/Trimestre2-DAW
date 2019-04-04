package ejercicio5;
import java.util.ArrayList;
import java.util.Scanner;


public class TestAlmacenv2 {
	
	static Almacenv2 almacen = new Almacenv2();
	
	public static void main(String[] args) {
		
		almacen.pruebas();
		
		//Creo el objeto Scanner y el ArrayList
		Scanner entrada = new Scanner(System.in);
		
		
		int  codigoIntroducido;
  	String descripcionIntroducido;
  	double precioCompraIntroducido;
  	double precioVentaIntroducido;
  	int stockIntroducido;
		int opcion =0;
		


		do {
	    mostrarMenu();
	    
	    opcion = entrada.nextInt();
	    
	    switch (opcion) {
	    case 1:
	    	//listado();	
	    	System.out.println(almacen);
	    	
	    break;
	    
	    case 2:
	    	//alta();
	    	System.out.println(almacen);
	    	System.out.println("\nNUEVO PRODUCTO");
	    	System.out.println("===========");
	    	entrada.nextLine();
	    	System.out.println("Por favor, introduzca los datos del producto.");
	    	System.out.println("Descripción");
	    	descripcionIntroducido = entrada.nextLine();
	    	System.out.println("Precio de Compra");
	    	precioCompraIntroducido = entrada.nextDouble();
	    	System.out.println("Precion de Venta");
	    	precioVentaIntroducido = entrada.nextDouble();
	    	System.out.println("Stock");
	    	stockIntroducido = entrada.nextInt();
	    	try {
					almacen.alta(descripcionIntroducido, precioCompraIntroducido, precioVentaIntroducido, stockIntroducido);
					System.out.println("Artículo añadido con exito");
				} catch (Exception e) {
					System.err.println(e.getMessage()+"No se ha podido añadir el artículo");
				}
	    	
	    break;
	    
	    case 3:
	    	//baja();
	    	System.out.println(almacen);
	    	System.out.println("Introduzca el código del artículo que desea dar de baja");
	    	codigoIntroducido = entrada.nextInt();
	    
	    	try {
					almacen.baja(codigoIntroducido);
				} catch (CodigoNoExiteException e1) {
					System.err.println(e1.getMessage());
				}
	    	
	    	break;
	      
	    case 4:
	    	System.out.println(almacen);
	    	System.out.println("Introduzca el código del artículo que desea modificar");
	    	codigoIntroducido = entrada.nextInt();
	    	try {
					almacen.comprobarCodigo(codigoIntroducido);
				} catch (CodigoNoExiteException e1) {
					System.err.println(e1.getMessage());
					break;
				}
	    	
	    	Articulo articulo = almacen.get(codigoIntroducido);
				System.out.println(articulo);
	    	
	    	System.out.println("\nMODIFICACIÓN DE PRODUCTO");
	    	System.out.println("===========");
	    	entrada.nextLine();
	    	System.out.println("Por favor, introduzca los datos del producto.");
	    	System.out.println("Descripción");
	    	descripcionIntroducido = entrada.nextLine();
	    	System.out.println("Precio de Compra");
	    	precioCompraIntroducido = entrada.nextDouble();
	    	System.out.println("Precion de Venta");
	    	precioVentaIntroducido = entrada.nextDouble();
	    	System.out.println("Stock");
	    	stockIntroducido = entrada.nextInt();
	    	
	    	try {
					almacen.modificar(articulo, descripcionIntroducido, precioCompraIntroducido, precioVentaIntroducido, stockIntroducido);
				} catch (CodigoNoExiteException | StockNegativoException e) {
					System.err.println(e.getMessage());
				}
	    	
	      //modificar();    
	      
	    break;
	      
	    case 5:
	    	System.out.println(almacen);
	    	System.out.println("Introduzca el código del artículo que desea aumentar su stock");
	    	codigoIntroducido = entrada.nextInt();
	    	try {
					almacen.comprobarCodigo(codigoIntroducido);
				} catch (CodigoNoExiteException e) {
					System.err.println(e.getMessage());
					break;
				}
	    	try {
					almacen.entrarMercancia(codigoIntroducido);
				} catch (StockNegativoException e) {
					System.err.println(e.getMessage());
				}
	    	
	    	//entrarMercancia();
      break;

	    case 6:
	    	System.out.println(almacen);
	    	System.out.println("Introduzca el código del artículo que desea disminuir su stock");
	    	codigoIntroducido = entrada.nextInt();
	    	try {
					almacen.comprobarCodigo(codigoIntroducido);
				} catch (CodigoNoExiteException e) {
					System.err.println(e.getMessage());
					break;
				}
	    	try {
					almacen.salirMercancia(codigoIntroducido);
				} catch (StockNegativoException e) {
					System.err.println(e.getMessage());
				}
	    	//salirMercancia();
      break;
	      
	    default:
	    	System.out.println("Fin del programa");
	    } // switch
	  } while (opcion != 7);
	}

	public static void mostrarMenu() {
		System.out.println("\n\nALMACEN");
		System.out.println("===================");
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificación");
		System.out.println("5. Entrada de mercancía");
		System.out.println("6. Salida de mercancía");
		System.out.println("7. Salir");
		System.out.print("Introduzca una opción: ");
	}
}
