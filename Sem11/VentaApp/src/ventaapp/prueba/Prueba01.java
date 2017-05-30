package ventaapp.prueba;

import ventaapp.model.Venta;
import ventaapp.service.VentaService;

public class Prueba01 {

  public static void main(String[] args) {
    
    // Agregar 5 ventas
    VentaService.add(new Venta("Televisor", 2300.0, 3));
    VentaService.add(new Venta("Cafe", 4.0, 130));
    VentaService.add(new Venta("Chavata de Pollo", 5.0, 200));
    VentaService.add(new Venta("Pan con pollo", 6.0, 300));
    VentaService.add(new Venta("Desayuno Continental", 13.0, 100));
    
    // Listado
    System.out.println("Listado 1");
    for(String row: VentaService.getStrVentas()){
      System.out.println(row);
    }
    
    VentaService.remove(2);
    
    // Listado 2
    System.out.println("Listado 2");
    for(String row: VentaService.getStrVentas()){
      System.out.println(row);
    }
    
    
  }
  
}
