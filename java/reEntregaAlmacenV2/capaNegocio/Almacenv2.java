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
import capaNegocio.*;
import utiles.*;

public class Almacenv2 {

	private ArrayList<Articulo> almacen = new ArrayList<Articulo>();
	
	public void alta(String descripcionIntroducido,Iva iva, double precioCompra, double precioVenta,
			int stock) throws IvaInvalidoException,Exception {
	  
			almacen.add(new Articulo(descripcionIntroducido,iva, precioCompra, precioVenta,stock));
	}

	public void baja(int codigo) {
		
	  toString();
		if(!almacen.remove(new Articulo(codigo)))
		  System.err.println("Error, el código introducido no existe.");;

	}

	public void modificar(Articulo articulo,Iva iva, String descripcionIntroducido, double precioCompraIntroducido,
			double precioVentaIntroducido, int stockIntroducido) throws CodigoNoExiteException, StockNegativoException, IvaInvalidoException {

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
