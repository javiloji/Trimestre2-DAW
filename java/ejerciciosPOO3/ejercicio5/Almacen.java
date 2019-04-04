package ejercicio5;
/**
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de ALmacén) para llevar el control de los artículos
 * de un almacén. De cada artículo se debe saber el código, la descripción, el precio de compra, el precio de venta y 
 * el stock (número de unidades). El menú del programa debe tener, al menos, las siguientes opciones:
 *  
 * 1. Listado 
 * 2. Alta 
 * 3. Baja 
 * 4. Modificación 
 * 5. Entrada de mercancía 
 * 6. Salida de mercancía 
 * 7. Salir
 * La entrada y salida de mercancía supone respectivamente el incremento y 
 * decremento de stock de un determinado artículo.Hay que controlar que no se pueda sacar más mercancía de la que 
 * hay en el almacén.
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
					 "\nDescripción: " + getDescripcion()+
					 "\nPrecio de Compra: " + getPrecioCompra()+
					 "\nPrecio de Venta: " + getPrecioVenta()+
					 "\nStock: " + getStock()+					 
					 "\n------------------------------------------"
					 ;
	}	
	
}
