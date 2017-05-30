package ventaapp.service;

import java.util.ArrayList;
import java.util.List;
import ventaapp.model.Venta;

public class VentaService {

  private static List<Venta> datos;

  static {
    datos = new ArrayList<>();
  }

  public static void add(Venta venta) {
    venta.setTotal(venta.getPrecio() + venta.getCant());
    datos.add(venta);
  }

  public static List<Venta> getVentas(){
    return datos;
  }
  
  public static List<String> getStrVentas(){
    List<String> lista = new ArrayList<>();
    for (int index = 0; index < datos.size(); index++) {
      Venta v = datos.get(index);
      lista.add( index + ".- " +  v.toString());
    }
    return lista;
  }
  
  public static void remove(int index){
    datos.remove(index);
  }
  
  public static void remove(Venta venta){
    datos.remove(venta);
  }
  
  public static Venta get(int index){
    return datos.get(index);
  }
  
  
}
