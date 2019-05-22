package capaNegocio;

/**
 * 
 * @author Javier Lopera Jimenez
 * 
 */

import utiles.*;

/**
 * Crea el programa GESTISIMAL (GESTI�n SIMplificada de Almac�n) para llevar el control de los art�culos
 * de un almac�n. De cada art�culo se debe saber el c�digo, la descripci�n, el precio de compra, el precio de venta y 
 * el stock (n�mero de unidades). El men� del programa debe tener, al menos, las siguientesopciones:
 *  
 * 1. Listado 
 * 2. Alta 
 * 3. Baja 
 * 4. Modificaci�n 
 * 5. Entrada de mercanc�a 
 * 6. Salida de mercanc�a 
 * 7. Salir
 * La entrada y salida de mercanc�a supone respectivamente el incremento y 
 * decrementodestockdeundeterminadoart�culo.Hay que controlar que no se pueda sacar m�s mercanc�a del aque hay en el almac�n.
 * @author Javier Lopera Jimenez
 *
 */
public class Articulo{

	//atributos de la clase almacen
	static private int contador=1;
	private int codigo;
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;
	private Iva iva;
	
	// Creamos la Enumeracion Iva, que utilizaremos para controlar el tipo de Iva
	
	/**
	 * 
	 * A�adimos al constructor de articulo el tipo de iva.
	 * 
	 * @param descripcion
	 * @param tipoIva
	 * @param precioCompra
	 * @param precioVenta
	 * @param stock
	 * @throws IvaInvalidoException 
	 */
	
	// Añadimos la enumeracion Iva al constructor
	
	public Articulo(String descripcion,Iva iva, double precioCompra, double precioVenta, int stock) throws IvaInvalidoException {
		setDescripcion(descripcion);
		setPrecioCompra(precioCompra);
		setPrecioVenta(precioVenta);
		setIva(iva);
		setStock(stock);
	  setCodigo();
	}


	Articulo(int codigoIntroducido) {
		setCodigo(codigoIntroducido);
	}


	// Creamos la Enumeracion Iva, que utilizaremos para controlar el tipo de Iva
  
  /**
   * 
   * A�adimos al constructor de articulo el tipo de iva.
   * 
   * @param descripcion
   * @param tipoIva
   * @param precioCompra
   * @param precioVenta
   * @param stock
   * @throws IvaInvalidoException 
   */
  
  // Añadimos la enumeracion Iva al constructor
  
//  public Articulo(String descripcion,Iva iva, double precioCompra, double precioVenta, int stock) throws IvaInvalidoException {
//  	setCodigo();
//  	setDescripcion(descripcion);
//  	setPrecioCompra(precioCompra);
//  	setPrecioVenta(precioVenta);
//  	setIva(iva);
//  	try {
//  		setStock(stock);
//  	} catch (StockNegativoException e) {
//  		System.err.println(e.getMessage()+" se le asignar� el valor por defecto 0");
//  	}
//  }


  private void setCodigo(int codigoIntroducido) {
		this.codigo = codigoIntroducido;
	}

	public int getCodigo() {
		return codigo;
	}


	private void setCodigo() {
		this.codigo = Articulo.contador++;
	}

	// Creamos getters y setters de Iva, teniendo 
	// en cuenta que el iva no puede ser null para el setter
	
	public Iva getIva() {
    return iva;
  }

  public void setIva(Iva iva) throws IvaInvalidoException {
    if (iva == null) {
      throw new IvaInvalidoException("Error, el iva no puede ser null");
    } 
    this.iva = iva;
  }

	public String getDescripcion() {
		return descripcion;
	}


	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getPrecioCompra() {
		return precioCompra;
	}


	private void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}


	public double getPrecioVenta() {
		return precioVenta;
	}


	private void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}


	public int getStock() {
		return stock;
	}


	private void setStock(int stock) {
			this.stock = stock;
	}
	
	public void entraMercancia(){
		setStock(getStock()+1);
	}
	
	public void saleMercancia() throws StockNegativoException {
	  if(stock>0) {
	    setStock(getStock()-1);
	  }
    throw new StockNegativoException("El Stock de un producto no puede ser negativo");
      
    
	}
	
//Añadimos la enumeracion Iva al toString
	
	@Override
	public String toString() {
		return "\nCodigo: " + getCodigo()+
					 "\nDescripción: " + getDescripcion()+
					 "\nPrecio de Compra: " + getPrecioCompra()+
					 "\nPrecio de Venta: " + getPrecioVenta()+
					 "\nStock: " + getStock()+	
					 "\nIva: " + getIva()+  
					 "\n------------------------------------------"
					 ;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}


	void set(String descripcionIntroducido,Iva iva, double precioCompraIntroducido, double precioVentaIntroducido,
		int stockIntroducido) throws StockNegativoException, IvaInvalidoException {
			setDescripcion(descripcionIntroducido);
			setPrecioCompra(precioCompraIntroducido);
			setPrecioVenta(precioVentaIntroducido);
			setStock(stockIntroducido);
			setIva(iva);
	}	
	
}
