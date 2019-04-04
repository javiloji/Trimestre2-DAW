package ejerciciosPOO3;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;



public class TestAlmacen {
	public static void main(String[] args) {
		
		//creo el objeto Scanner y el ArrayList
		Scanner entrada = new Scanner(System.in);
		ArrayList<Almacen> arrayAlmacen = new ArrayList<Almacen>();
		
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
	    	System.out.println(arrayAlmacen);
	    	
	      break;
	           
	    case 2:
	    		    	
	    	System.out.println("\nNUEVO PRODUCTO");
	    	System.out.println("===========");
	    	entrada.nextLine();
	    	System.out.println("Por favor, introduzca los datos del producto.");
	    	//codigoIntroducido = entrada.nextInt();
	    	boolean compruebaCodigo;
        int codigo;
        do {
            compruebaCodigo = false;
            System.out.println("Introduzca el codigo del producto:");
            codigo = entrada.nextInt();
            entrada.nextLine();
            for(Almacen x: arrayAlmacen) {
                if(x.getCodigo() == codigo) {
                    compruebaCodigo = true;
                    System.err.println("El codigo introducido ya existe, introduzca otro:");
                }
            }
        }while(compruebaCodigo);
	    	System.out.println("Descripción");
	    	descripcionIntroducido = entrada.nextLine();
	    	System.out.println("Precio de Compra");
	    	precioCompraIntroducido = entrada.nextDouble();
	    	System.out.println("Precion de Venta");
	    	precioVentaIntroducido = entrada.nextDouble();
	    	System.out.println("Stock");
	    	stockIntroducido = entrada.nextInt();
	    		    	
	    	arrayAlmacen.add(new Almacen(codigo, descripcionIntroducido, 
	    			precioCompraIntroducido, precioVentaIntroducido, stockIntroducido));
	      break;
	    
	    case 3:
	    	
	    	boolean borrado = false;
            
	    	if(arrayAlmacen.isEmpty()) {
                System.err.println("El almacen está vacío, no hay nada que dar de baja");
            }
            else {
                System.out.println("Introduzca el código del producto que desea dar de baja");
                int codigoABorrar = entrada.nextInt();
                int indice=0;
               
                for(Almacen x : arrayAlmacen) {
                	
                	if(x.getCodigo() == codigoABorrar){
                		indice = arrayAlmacen.indexOf(x);
                        borrado = true;
                    }
                }
            
                
                if (borrado == true) {
                	arrayAlmacen.remove(indice);
                    System.out.println("El producto se ha borrado correctamente");
                }else {
                    System.err.println("No se ha podido borrar el producto, no existe el código dado");
                }
            }
	    	
          break;
	      
	      
	    case 4:
	      
	    	 if(!arrayAlmacen.isEmpty()) {
	 	     	System.out.println("Escriba el código del producto que desea modificar");
	 	      int codigoModificar = entrada.nextInt();
	 	      int indiceArray = 0;
	 	      boolean modificado = false;
	 	      
	 	      for(Almacen x : arrayAlmacen) {
	 	      	if(x.getCodigo() == codigoModificar) {
	 	      		indiceArray = arrayAlmacen.indexOf(x);
	 	      		modificado = true;
	 	      		}
	 	      }
	 	      
	 	      if(modificado == true) {
	 	      System.out.println("Por favor, introduzca los datos del producto.");
	 	    	
	 	  		do {
	 	  		    compruebaCodigo = false;
	 	  		    System.out.println("Introduzca el codigo del producto:");
	 	  		    codigo = entrada.nextInt();
	 	  		    entrada.nextLine();
	 	  		    for(Almacen x: arrayAlmacen) {
	 	  		        if(x.getCodigo() == codigo) {
	 	  		            compruebaCodigo = true;
	 	  		            System.err.println("El codigo introducido ya existe, introduzca otro:");
	 	  		        }
	 	  		    }
	 	  		}while(compruebaCodigo);
	 	  		
	 	    	System.out.println("Descripción");
	 	    	descripcionIntroducido = entrada.nextLine();
	 	    	System.out.println("Precio de Compra");
	 	    	precioCompraIntroducido = entrada.nextDouble();
	 	    	System.out.println("Precion de Venta");
	 	    	precioVentaIntroducido = entrada.nextDouble();
	 	    	System.out.println("Stock");
	 	    	stockIntroducido = entrada.nextInt();
	 	    		    	
	 	    	arrayAlmacen.set(indiceArray, new Almacen(codigo, descripcionIntroducido, 
	 	    			precioCompraIntroducido, precioVentaIntroducido, stockIntroducido));
	 	      }else {
	 	      	System.err.println("No se ha podido modificar ningun producto");
	 	      }
	 	      }else {
	 	      	System.err.println("El almacen está vacío");
	 	      }    
   	
	      break;
	     
	    case 5:
	    	if(!arrayAlmacen.isEmpty()) {
	    	System.out.println("Introduce el codigo del producto que quiere añadir:");
	    	codigoIntroducido = entrada.nextInt();
	      
	    	for(Almacen x : arrayAlmacen) {
	    	 	if(codigoIntroducido==x.getCodigo()) {
	    	 		x.setStock(x.getStock()+1);
	    	 	}
	    	 	else {
	    	 		System.err.println("No existe ningun producto con ese código.");
	    	 	}
	    	 }
	    	}
	    	else {
	    		System.err.println("El almacen esta vacio");
	    	}

	      break;
	      
	    case 6:
	    	if(!arrayAlmacen.isEmpty()) {
	    	System.out.println("Introduce el codigo del producto que quiere retirar:");
	    	codigoIntroducido = entrada.nextInt();
	      
	    	for(Almacen x : arrayAlmacen) {
	    	 	if(codigoIntroducido==x.getCodigo() && x.getStock()>0) {
	    	 		x.setStock(x.getStock()-1);
	    	 	}   
	    	 	else if(codigoIntroducido != x.getCodigo()) {
	    	 		System.err.println("No existe ningun producto con ese código.");
	    	 	}
	    	 	else {
	    	 		System.err.println("El stock esta en 0, no se puede retirar.");
	    	 	}
	    	 }
	    	}
	    	else {
	    		System.err.println("El almacen esta vacio");
	    	}
	      
	      break;
	    case 7:
	    	System.out.println("\n*****Fin del Programa*****");
	    	break;
	    default:
	    	System.err.println("Opcion Incorrecta, elija una opcion correcta.");
	    } // switch
	  } while (opcion != 7);
	}

	public static void mostrarMenu() {
		System.out.println("\n\nALAMCEN");
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
