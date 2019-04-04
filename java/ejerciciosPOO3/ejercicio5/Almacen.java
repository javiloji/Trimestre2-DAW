package ejercicio5;
/**
 * Crea el programa GESTISIMAL (GESTI�n SIMplificada de ALmac�n) para llevar el control de los art�culos
 * de un almac�n. De cada art�culo se debe saber el c�digo, la descripci�n, el precio de compra, el precio de venta y 
 * el stock (n�mero de unidades). El men� del programa debe tener, al menos, las siguientes opciones:
 *  
 * 1. Listado 
 * 2. Alta 
 * 3. Baja 
 * 4. Modificaci�n 
 * 5. Entrada de mercanc�a 
 * 6. Salida de mercanc�a 
 * 7. Salir
 * La entrada y salida de mercanc�a supone respectivamente el incremento y 
 * decremento de stock de un determinado art�culo.Hay que controlar que no se pueda sacar m�s mercanc�a de la que 
 * hay en el almac�n.
 * @author Javier Lopera Jimenez
 *
 */
public class Almacen {

	//atributos de la clase almacen
	private int codigo;
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;
	
	
	public Almacen(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		setCodigo(codigo);
		setDescripcion(descripcion);
		setPrecioCompra(precioCompra);
		setPrecioVenta(precioVenta);
		setStock(stock);
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecioCompra() {
		return precioCompra;
	}


	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}


	public double getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "\nCodigo: " + getCodigo()+
					 "\nDescripci�n: " + getDescripcion()+
					 "\nPrecio de Compra: " + getPrecioCompra()+
					 "\nPrecio de Venta: " + getPrecioVenta()+
					 "\nStock: " + getStock()+					 
					 "\n------------------------------------------"
					 ;
	}	
	
}
