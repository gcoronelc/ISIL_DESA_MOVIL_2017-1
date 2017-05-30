package appalumnos.prueba;

import appalumnos.model.Alumno;
import appalumnos.service.CursoService;

public class Prueba02 {

  public static void main(String[] args) {
    
    // Datos
    CursoService.add(new Alumno("Velazco Hans", 15, 18, 17, 10));
    CursoService.add(new Alumno("Rivera Marjorit", 15, 16, 17, 14));
    CursoService.add(new Alumno("Coronel Gustavo", 15, 12, 11, 17));
    CursoService.add(new Alumno("Sandoval Enrique", 15, 14, 17, 16));
    CursoService.add(new Alumno("Palá Marcelo", 14, 16, 18, 20));
    CursoService.add(new Alumno("Maldonado Bruno", 15, 16, 18, 14));
    
    for (String s : CursoService.getStrLista()) {
      System.out.println(s);
    }
    
  }

}
