package pe.egcc.app.service;

public class DemoService {

  /**
   * Constructor por defecto
   */
  public DemoService() {
    System.out.println("Objeto creado.");
  }
  
  /**
   * Constructor adicional.
   * 
   * @param nombre 
   */
  public DemoService(String nombre) {
    System.out.println("Objeto creado.");
    System.out.println("Hola " + nombre);
  }

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau objeto");
  }
  
  
  
  
  
  
  
}
