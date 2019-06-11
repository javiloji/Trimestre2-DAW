package capaNegocio;
/**
 * 
 * Añade el tipo de IVA a la clase Artículo usada en la clase Almacén 
 * hecha en clase y modifica el código necesario para poder aplicarlo:
 * 
 * Recuerda que hay tres tipos de IVA: general, reducido y super reducido. 
 * 
 * Solicita el tipo de IVA mediante un menú. Al objeto lo llamarás menuIva.
 * 
 * Añade el IVA tanto a la opción de alta como a la de modificación de artículo en 
 * la clase Almacén y en aquellos otras clases que sea necesario.
 * 
 * En la clase Artículo, en caso de que el iva sea null lanzarás una excepción 
 * IvaInvalidoException.Actualiza el estado/comportamiento de la(s) clase(s) afectada(s). 
 * 
 * @author Javier Lopera Jimenez
 *
 */


import java.util.ArrayList;
import capaNegocio.*;
import utiles.*;

public class Almacenv2 {

  private ArrayList<Articulo> almacen = new ArrayList<Articulo>();

  public void alta(String descripcionIntroducido,Iva iva, double precioCompra, double precioVenta,
      int stock) throws IvaInvalidoException,Exception {

    almacen.add(new Articulo(descripcionIntroducido,iva, precioCompra, precioVenta,stock));
  }

  public void baja(int codigo) throws CodigoNoExiteException {

    if(!almacen.remove(new Articulo(codigo)))
      //System.err.println("Error, el código introducido no existe.");
      throw new CodigoNoExiteException("Error, el código introducido no existe.");
  }

  public void modificar(Articulo articulo,Iva iva, String descripcionIntroducido, double precioCompraIntroducido,
      double precioVentaIntroducido, int stockIntroducido) throws CodigoNoExiteException, StockNegativoException, IvaInvalidoException, PrecioNegativoException {

    articulo.set(descripcionIntroducido,iva, precioCompraIntroducido, precioVentaIntroducido, stockIntroducido);
  }



  public void entrarMercancia(int codigo) throws StockNegativoException, CodigoNoExiteException {
    get(codigo).entraMercancia();
  }

  @Override
  public String toString() {
    return "" + almacen;
  }

  public void salirMercancia(int codigo) throws StockNegativoException, CodigoNoExiteException {
    get(codigo).saleMercancia();
  }

  public Articulo get(int codigoIntroducido) throws CodigoNoExiteException {

    try {

      return almacen.get(almacen.indexOf(new Articulo(codigoIntroducido)));
    }catch(IndexOutOfBoundsException  e){
      throw new CodigoNoExiteException("El codigo introducido no existe.");
    }


  }

}
