package appalumnos.service;

import appalumnos.model.Alumno;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CursoService {

  private static List<Alumno> datos;

  static {
    datos = new ArrayList<>();
  }

  public static void add(Alumno alumno) {
    alumno.setPromedio(calcPromedio(alumno.getNota1(), alumno.getNota2(),
            alumno.getNota3(), alumno.getNota4()));
    datos.add(alumno);
  }

  private static int calcPromedio(int nota1, int nota2, int nota3, int nota4) {
    int menor = calMenor(nota1, nota2, nota3, nota4);
    int pr = (nota1 + nota2 + nota3 + nota4 - menor)/3;
    return pr;
  }

  private static int calMenor(int ... notas) {
    Arrays.sort(notas);
    return notas[0];
  }
  
  public static List<Alumno> getLista(){
    return datos;
  }
  
  public static List<String> getStrLista(){
    List<String> lista = new ArrayList<>();
    for (int index = 0; index < datos.size(); index++) {
      String row = index + ".- " + datos.get(index).toString();
      lista.add(row);
    }
    return lista;
  }
  
  public static int getMayor(){
    int mayor = datos.get(0).getPromedio();
    for(Alumno a: datos){
      if(mayor < a.getPromedio()){
        mayor = a.getPromedio();
      }
    }
    return mayor;
  }
  
  public static int getMenor(){
    int menor = datos.get(0).getPromedio();
    for(Alumno a: datos){
      if(menor > a.getPromedio()){
        menor = a.getPromedio();
      }
    }
    return menor;
  }
  
  public static int getPromedio(){
    int suma = 0;
    for(Alumno a: datos){
      suma += a.getPromedio();
    }
    return (suma / datos.size());
  }
  
   public static List<Alumno> getLosMejores(){
     List<Alumno> lista = new ArrayList<>();
     int mayor = getMayor();
     for (Alumno a : datos) {
       if(a.getPromedio() == mayor){
         lista.add(a);
       }
     }
    return lista;
  }
  
}
