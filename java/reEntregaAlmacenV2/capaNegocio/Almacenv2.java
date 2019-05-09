package capaNegocio;
/**
 * 
 * A�ade el tipo de IVA a la clase Art�culo usada en la clase Almac�n 
 * hecha en clase y modifica el c�digo necesario para poder aplicarlo:
 * 
 * �Recuerda que hay tres tipos de IVA: general, reducido y super reducido. 
 * 
 * �Solicita el tipo de IVA mediante un men�. Al objeto lo llamar�s menuIva.
 * 
 * �A�ade el IVA tanto a la opci�n de alta como a la de modificaci�n de art�culo en 
 * la clase Almac�n y en aquellos otras clases que sea necesario.
 * 
 * �En la clase Art�culo, en caso de que el iva sea null lanzar�s una excepci�n 
 * IvaInvalidoException.�Actualiza el estado/comportamiento de la(s) clase(s) afectada(s). 
 * 
 * @author Javier Lopera Jimenez
 *
 */

import java.io.IOException;
import java.util.ArrayList;
import excepciones.*;
import capaNegocio.*;
import utiles.*;

public class Almacenv2 {

	private ArrayList<Articulo> almacen = new ArrayList<Articulo>();


	public boolean comprobarCodigo(int codigo) throws CodigoNoExiteException {
    boolean codigoEncontrado = false;

    for (Articulo x : almacen) {
      if (x.getCodigo() == codigo) {
        codigoEncontrado = true;
      }
    }
    if (codigoEncontrado == false) {
      throw new CodigoNoExiteException("El código introducido no existe");
    }
    return codigoEncontrado;
  }
	
	public void alta(String descripcionIntroducido,Iva iva, double precioCompra, double precioVenta,
			int stock) throws IvaInvalidoException,Exception {

		Articulo articulo = new Articulo(descripcionIntroducido,iva, precioCompra, precioVenta,
				stock);

		if (!almacen.contains(articulo)) {
			almacen.add(articulo);
		} else {
			throw new ArticuloYaExisteException("El artículo que deseas crear ya existe. ");
		}

	}

	public void baja(int codigo) throws CodigoNoExiteException {
		
		almacen.remove(new Articulo(codigo));

	}

	public void modificar(Articulo articulo,Iva iva, String descripcionIntroducido, double precioCompraIntroducido,
			double precioVentaIntroducido, int stockIntroducido) throws CodigoNoExiteException, StockNegativoException, IvaInvalidoException {
		int indice = 0;
		/*
		for (Articulo x : almacen) {
			if (x.getCodigo() == codigo) {
				indice = almacen.indexOf(x);
			}
		}*/

			articulo.set(descripcionIntroducido,iva, precioCompraIntroducido, precioVentaIntroducido, stockIntroducido);
			/*almacen.set(indice,
					articulo(descripcionIntroducido, precioCompraIntroducido, precioVentaIntroducido, stockIntroducido));
		*/
	}

	
	
	public void entrarMercancia(int codigo) throws StockNegativoException {
		for(Articulo x : almacen) {
			if(x.getCodigo() == codigo) {
					x.entraMercancia();
			}
		}
	}

	@Override
	public String toString() {
		return "" + almacen;
	}

	public void salirMercancia(int codigo) throws StockNegativoException {
		for(Articulo x : almacen) {
			if(x.getCodigo() == codigo) {
					x.saleMercancia();
			}
		}
	}

	public Articulo get(int codigoIntroducido) {
			Articulo articulo = almacen.get(almacen.indexOf(new Articulo(codigoIntroducido)));
		return articulo;
	}

}
