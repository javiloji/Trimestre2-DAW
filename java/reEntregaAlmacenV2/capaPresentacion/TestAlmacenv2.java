package capaPresentacion;

/**
 * 
 * Javier Lopera Jimenez
 * 
 */

import java.io.IOException;

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
  static Menu menuGeneral = new Menu("ALMACEN", new String[] { "Listado", "Alta", "Baja","Modificación","Entrada de mercancía"
      ,"Salida de mercancía" });

  public static void main(String[] args) {

    // Creo el objeto Scanner y el ArrayList

    int opcion = 0;

    do {
      try {
        opcion = menuGeneral.gestionar();
      } catch (NumberFormatException | IOException e) {
        e.printStackTrace();
      }


      try {
        gestionar(opcion);
      } catch (NumberFormatException | IOException e) {
        e.printStackTrace();
      }

      // switch
    } while (opcion != 7);
  }

  private static void gestionar(int opcion)throws NumberFormatException, IOException{
    int codigoIntroducido;
    String descripcionIntroducido;
    double precioCompraIntroducido;
    double precioVentaIntroducido;
    int stockIntroducido;
    switch (opcion) {
    case 1:
      // listado();
      System.out.println(almacen);

      break;

    case 2:
      try {
        alta();
      }catch(Exception e) {
        System.err.println(e.getMessage()+ " Este articulo no se ha podido añadir.");
      }
      break;

    case 3:
      // baja();

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

  public static void alta() throws IvaInvalidoException,NumberFormatException, IOException, Exception {
    
    System.out.println(almacen);
    System.out.println("\nNUEVO PRODUCTO");
    System.out.println("===========");
    System.out.println("Por favor, introduzca los datos del producto.");

    try {

    almacen.alta(Teclado.leerCadena("Introduzca la descripcion del producto"),elegirIva(),
        Teclado.leerDecimal("Introduzca el precio de compra"),Teclado.leerDecimal("Introduzca el precio de venta"),
        Teclado.leerEntero("Stock"));
    }catch (PrecioNegativoException e) {
      System.err.println(e.getMessage());
    };
  }

  public static void baja() {
    int codigoIntroducido = 0;
    System.out.println(almacen);
    System.out.println("Introduzca el código del artículo que desea dar de baja");

    try {
      codigoIntroducido = Teclado.leerEntero();
    } catch (NumberFormatException e) {
      System.err.println("Debes introducir un numero");
    }
    try {
      almacen.baja(codigoIntroducido);
    } catch (CodigoNoExiteException e) {
      System.err.println(e.getMessage());
    }
  }

  public static void modificar() throws IvaInvalidoException, Exception {
    int codigoIntroducido = 0;
    System.out.println(almacen);
    System.out.println("Introduzca el código del artículo que desea modificar");
    try {
      codigoIntroducido = Teclado.leerEntero();
    } catch (NumberFormatException e2) {
      System.err.println("Debes introducir un numero");
    }

    Articulo articulo = almacen.get(codigoIntroducido);
    System.out.println(articulo);

    System.out.println("\nMODIFICACIÓN DE PRODUCTO");
    System.out.println("===========");
    System.out.println("Por favor, introduzca los datos del producto.");


    /**
     * 
     * Antes, tenia todos los parametros de modificar en variables, las cuales las pedia con scanner,
     * ahora uso la clase Teclado y ahorro mucho codigo sin necesitar ni Scanner ni las variables.
     * 
     * */

    try {
      almacen.modificar(articulo,elegirIva(), Teclado.leerCadena("Introduzca la descripcion del producto"),
          Teclado.leerDecimal("Introduzca el precio de compra"),Teclado.leerDecimal("Introduzca el precio de venta"),
          Teclado.leerEntero(" el stock"));
    } catch (CodigoNoExiteException | StockNegativoException | IvaInvalidoException e) {
      System.err.println(e.getMessage());
    }
  }

  public static void entrarMercancia() throws NumberFormatException, IOException, CodigoNoExiteException {
    System.out.println(almacen);
    System.out.println("Introduzca el código del artículo que desea aumentar su stock");
    int codigoIntroducido = Teclado.leerEntero();
    try {
      almacen.entrarMercancia(codigoIntroducido);
    } catch (StockNegativoException e) {
      System.err.println(e.getMessage());
    }

  }

  public static void salirMercancia() throws NumberFormatException, IOException , CodigoNoExiteException {
    System.out.println(almacen);
    System.out.println("Introduzca el código del artículo que desea disminuir su stock");
    int codigoIntroducido = Teclado.leerEntero();
    try {
      almacen.salirMercancia(codigoIntroducido);
    } catch (StockNegativoException e) {
      System.err.println(e.getMessage());
    }
  }

  public static Iva elegirIva() throws NumberFormatException, IOException {

    Iva ivaElegido = null;

    //   int  opcion = menuIva.gestionar(); // Pide al usuario introducir un numero para escoger la opcion

    switch (menuIva.gestionar()) {
    case 1:
      return Iva.GENERAL;
      // break;
    case 2:
      return Iva.REDUCIDO;
      // break;
    case 3:
      return Iva.SUPERREDUCIDO;
    default:// case 3:
      return null;
    }
  }
}
