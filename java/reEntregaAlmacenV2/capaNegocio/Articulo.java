package capaNegocio;

/**
 * 
 * @author Javier Lopera Jimenez
 * 
 */

import utiles.*;

/**
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el control de los artículos
 * de un almacén. De cada art�culo se debe saber el código, la descripción, el precio de compra, el precio de venta y 
 * el stock (número de unidades). El menú del programa debe tener, al menos, las siguientesopciones:
 *  
 * 1. Listado 
 * 2. Alta 
 * 3. Baja 
 * 4. Modificación 
 * 5. Entrada de mercancía 
 * 6. Salida de mercancía 
 * 7. Salir
 * La entrada y salida de mercancía supone respectivamente el incremento y 
 * decrementodestockdeundeterminadoartículo.Hay que controlar que no se pueda sacar más mercancía del aque hay en el almacén.
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
   * @throws StockNegativoException 
   * @throws PrecioNegativoException 
   */

  // Añadimos la enumeracion Iva al constructor

  public Articulo(String descripcion,Iva iva, double precioCompra, double precioVenta, int stock) throws IvaInvalidoException, StockNegativoException, PrecioNegativoException {
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

  private void setPrecioCompra(double precioCompra) throws PrecioNegativoException {
    if(precioCompra<0)
      throw new PrecioNegativoException("El precio de compra no puede ser negativo.");
    this.precioCompra = precioCompra;
  }

  public double getPrecioVenta() {
    return precioVenta;
  }

  private void setPrecioVenta(double precioVenta) throws PrecioNegativoException {
    if(precioVenta<0)
      throw new PrecioNegativoException("El precio de venta no puede ser negativo.");
    this.precioVenta = precioVenta;
  }

  public int getStock() {
    return stock;
  }

  private void setStock(int stock) throws StockNegativoException {
    if(stock<0)
      throw new StockNegativoException("El stock no puede ser negativo");
    this.stock = stock;
  }

  public void entraMercancia() throws StockNegativoException{
    setStock(getStock()+1);
  }

  public void saleMercancia() throws StockNegativoException{
    setStock(getStock()-1);
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
      int stockIntroducido) throws StockNegativoException, IvaInvalidoException, PrecioNegativoException {
    setDescripcion(descripcionIntroducido);
    setPrecioCompra(precioCompraIntroducido);
    setPrecioVenta(precioVentaIntroducido);
    setStock(stockIntroducido);
    setIva(iva);
  }	

}
