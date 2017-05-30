package ventaapp.model;

public class Venta {

  private String producto;
  private double precio;
  private int cant;
  private double total;

  public Venta() {
  }

  public Venta(String producto, double precio, int cant) {
    this.producto = producto;
    this.precio = precio;
    this.cant = cant;
  }
  
  public Venta(String producto, double precio, int cant, double total) {
    this.producto = producto;
    this.precio = precio;
    this.cant = cant;
    this.total = total;
  }

  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getCant() {
    return cant;
  }

  public void setCant(int cant) {
    this.cant = cant;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  @Override
  public String toString() {
    return producto + " | " + precio + " | " + cant + " | " + total;
  }

  
}
