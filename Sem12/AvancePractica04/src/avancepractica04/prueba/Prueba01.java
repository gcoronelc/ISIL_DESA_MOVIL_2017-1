package avancepractica04.prueba;

import pe.egcc.app.model.Estudiante;
import pe.egcc.app.service.NotaService;

public class Prueba01 {

  public static void main(String[] args) {
    
    // Agregar estudiantes
    NotaService.agregar(new Estudiante("Gustavo", 20));
    NotaService.agregar(new Estudiante("Marjorit", 20));
    NotaService.agregar(new Estudiante("Bruno", 12));
    NotaService.agregar(new Estudiante("Hans", 18));
    NotaService.agregar(new Estudiante("Karla", 10));
    NotaService.agregar(new Estudiante("José", 13));
    NotaService.agregar(new Estudiante("Pedro", 10));
    NotaService.agregar(new Estudiante("Sebastian", 25));
    
    // Listado General
    System.out.println("LISTADO GENERAL");
    for(Estudiante est: NotaService.getLista()){
      System.out.println(est.toString());
    }
    
    // Listado con filtro 1.nota 10
    NotaService.setFilter(1, 10);
    System.out.println("\nLOS QUE TIENEN 10");
    for(Estudiante est: NotaService.getLista()){
      System.out.println(est.toString());
    }
    
    // Listado con filtro 1.nota 20
    NotaService.setFilter(1, 20);
    System.out.println("\nLOS QUE TIENEN 20");
    for(Estudiante est: NotaService.getLista()){
      System.out.println(est.toString());
    }
    
    // Listado General
    System.out.println("\nLISTADO GENERAL");
    NotaService.setFilter(0);
    for(Estudiante est: NotaService.getLista()){
      System.out.println(est.toString());
    }
    
  }
  
}
