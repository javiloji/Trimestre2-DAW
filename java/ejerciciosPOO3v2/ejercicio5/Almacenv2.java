package ejercicio5;
/**
 * Clase que almacena el ArrayList de objetos Articulo
 * @author juanbu97
 *
 */

import java.util.ArrayList;

import ejercicio5.Articulo;

public class Almacenv2 {

	private ArrayList<Articulo> almacen = new ArrayList<Articulo>();

	Articulo pipas = new Articulo("pipas", 2, 3, 5);
	Articulo agua = new Articulo("agua", 2, 3, 5);
	Articulo cocacola = new Articulo("cocacola", 2, 3, 5);
	Articulo pan = new Articulo("pan", 2, 3, 5);

	public void pruebas() {
		almacen.add(agua);
		almacen.add(cocacola);
		almacen.add(pan);
		almacen.add(pipas);
	}

	public void alta(String descripcionIntroducido, double precioCompraIntroducido, double precioVentaIntroducido,
			int stockIntroducido) throws Exception {

		Articulo articulo = new Articulo(descripcionIntroducido, precioCompraIntroducido, precioVentaIntroducido,
				stockIntroducido);

		if (!almacen.contains(articulo)) {
			almacen.add(articulo);
		} else {
			throw new ArticuloYaExisteException("El artículo que deseas crear ya existe. ");
		}

	}

	public void baja(int codigo) throws CodigoNoExiteException {
		
		almacen.remove(new Articulo(codigo));

	}

	public void modificar(Articulo articulo, String descripcionIntroducido, double precioCompraIntroducido,
			double precioVentaIntroducido, int stockIntroducido) throws CodigoNoExiteException, StockNegativoException {
		int indice = 0;
		/*
		for (Articulo x : almacen) {
			if (x.getCodigo() == codigo) {
				indice = almacen.indexOf(x);
			}
		}*/

			articulo.set(descripcionIntroducido, precioCompraIntroducido, precioVentaIntroducido, stockIntroducido);
			/*almacen.set(indice,
					articulo(descripcionIntroducido, precioCompraIntroducido, precioVentaIntroducido, stockIntroducido));
		*/
	}

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

	// @Override
	// public String toString() {
	// return super.toString();
	// }

}
