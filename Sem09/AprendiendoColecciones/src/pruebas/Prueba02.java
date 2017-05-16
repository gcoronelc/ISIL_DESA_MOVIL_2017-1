package pruebas;

import java.util.ArrayList;
import java.util.List;

public class Prueba02 {

  public static void main(String[] args) {
    
    List<String> ciudades = new ArrayList<>();
    
    System.out.println("Tamaño de la lista: " + ciudades.size());
    
    // Agregar elementos
    ciudades.add("Chiclayo");
    ciudades.add("Trujillo");
    ciudades.add("Arequipa");
    ciudades.add("Cuzco");
    System.out.println("Nuevo Tamaño de la lista: " + ciudades.size());
    
    // Recorrido indexado de la lista
    System.out.println("Recorrido indexado");
    for( int i = 0; i < ciudades.size(); i++ ){
      System.out.println("Elemento " + i + ": " + ciudades.get(i));
    }
    
    // Modificar el elemento 0
    ciudades.set(0, "Piura");
    
    // Insertar elemento en la posición 2
    ciudades.add(2,"Huancayo");
    System.out.println("Nuevo Tamaño de la lista: " + ciudades.size());
    
        
    // Recorrido tipo coleccion
    System.out.println("Recorrido tipo colección");
    for (String ciudad : ciudades) {
      System.out.println("Elemento: " + ciudad);
    }
    
    // Eliminar elementos 3 y 4
    ciudades.remove(3);
    ciudades.remove(3);
    System.out.println("\nNueva lista");
    for (String ciudad : ciudades) {
      System.out.println("Elemento: " + ciudad);
    }
    
    
  }
  
}
