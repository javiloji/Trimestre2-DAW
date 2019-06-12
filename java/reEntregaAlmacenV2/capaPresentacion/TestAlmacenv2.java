package capaPresentacion;

/**
 * 
 * Javier Lopera Jimenez
 * 
 */

import capaNegocio.Almacenv2;
import capaNegocio.Articulo;
import capaNegocio.CodigoNoExiteException;
import capaNegocio.Iva;
import capaNegocio.IvaInvalidoException;
import capaNegocio.PrecioNegativoException;
import capaNegocio.StockNegativoException;
import utiles.*;

public class TestAlmacenv2 {

  static Almacenv2 almacen = new Almacenv2();
  static Menu menuIva = new Menu("Elija el tipo de iva:", new String[] { "General", "Reducido", "Superreducido" });
  static Menu menuGeneral = new Menu("ALMACEN",
      new String[] { "Listado", "Alta", "Baja", "Modificación", "Entrada de mercancía", "Salida de mercancía" });

  public static void main(String[] args) {

    int opcion;

    do {
      
      opcion = menuGeneral.gestionar();
      System.out.println(almacen);
      gestionar(opcion);
      
    } while (opcion != 7);
  }

  private static void gestionar(int opcion) {
    
    switch (opcion) {
    case 1:
      break;

    case 2:
      try {
        alta();
      } catch (Exception e) {
        System.err.println(e.getMessage() + " Este articulo no se ha podido añadir.");
      }
      break;

    case 3:
      
      baja();

      break;

    case 4:

      try {
        modificar();
      } catch (Exception e1) {
        // TODO Auto-generated catch block
        System.err.println("Este articulo no se ha podido añadir.");
      }

      break;

    case 5:

      try {
        entrarMercancia();
      } catch (CodigoNoExiteException e) {
        // TODO Auto-generated catch block
        System.err.println(e.getMessage());
      }

      break;

    case 6:

      try {
        salirMercancia();
      } catch (CodigoNoExiteException e) {
        // TODO Auto-generated catch block
        System.err.println("Este articulo no se ha podido añadir.");
      }

      break;

    default:
      System.out.println("Fin del programa");
    }
  }

  public static void alta() throws IvaInvalidoException, Exception {
    try {
      System.out.println("\nNUEVO PRODUCTO");
      System.out.println("===========");
      System.out.println("Por favor, introduzca los datos del producto.");

      almacen.alta(Teclado.leerCadena("Introduzca la descripcion del producto"), elegirIva(),
          Teclado.leerDecimal("Introduzca el precio de compra"), Teclado.leerDecimal("Introduzca el precio de venta"),
          Teclado.leerEntero("Stock"));
    } catch (PrecioNegativoException e) {
      System.err.println(e.getMessage());
    }
  }

  public static void baja() {

    if (!almacen.baja(Teclado.leerEntero("Introduzca el código del artículo que desea dar de baja")))
      System.err.println("\nError en la baja del artículo. El código no existe");

  }

  public static void modificar() throws IvaInvalidoException, Exception {
    
    try {
      
      Articulo articulo = almacen.get(Teclado.leerEntero("Introduzca el código del artículo que desea modificar"));
      System.out.println(articulo);

      System.out.println("\nMODIFICACIÓN DE PRODUCTO");
      System.out.println("===========");
      System.out.println("Por favor, introduzca los datos del producto.");
      
      almacen.modificar(Teclado.leerEntero("Introduzca el código del artículo que desea modificar"), elegirIva(), Teclado.leerCadena("Introduzca la descripcion del producto"),
          Teclado.leerDecimal("Introduzca el precio de compra"), Teclado.leerDecimal("Introduzca el precio de venta"),
          Teclado.leerEntero(" el stock"));
    } catch (CodigoNoExiteException | StockNegativoException | IvaInvalidoException e) {
      System.err.println(e.getMessage());
    }
  }

  public static void entrarMercancia() throws CodigoNoExiteException {

    try {
      almacen.entrarMercancia(Teclado.leerEntero("Introduzca el código del artículo que desea aumentar su stock"));
    } catch (StockNegativoException e) {
      System.err.println(e.getMessage());
    }

  }

  public static void salirMercancia() throws CodigoNoExiteException {
    
    try {
      almacen.salirMercancia(Teclado.leerEntero("Introduzca el código del artículo que desea disminuir su stock"));
    } catch (StockNegativoException e) {
      System.err.println(e.getMessage());
    }
  }

  public static Iva elegirIva() {
    
    switch (menuIva.gestionar()) {
    case 1:
      return Iva.GENERAL;
    case 2:
      return Iva.REDUCIDO;
    default:
      return Iva.SUPERREDUCIDO;
    }
  }
}
