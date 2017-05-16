package pruebas;

import java.util.ArrayList;
import java.util.List;
import model.Persona;

public class Prueba03 {

  public static void main(String[] args) {
    
    List<Persona> estudiantes = new ArrayList<>();
    
    estudiantes.add(new Persona("Gustavo", "Los Olivos", "555-5555"));
    estudiantes.add(new Persona("Claudia", "Lince", "666-5555"));
    estudiantes.add(new Persona("Ricardo", "San Borja", "666-6666"));
    estudiantes.add(new Persona("Ricardo", "Alejandra", "777-6666"));
    
    for (Persona estu : estudiantes) {
      System.out.println(estu.getNombre() + " - " + estu.getDireccion());
    }
    
    System.out.println("------------------------");
    for (Persona estu : estudiantes) {
      System.out.println(estu.toString());
    }
    
  }
  
}
