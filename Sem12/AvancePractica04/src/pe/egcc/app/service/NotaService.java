package pe.egcc.app.service;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.app.model.Estudiante;

public final class NotaService {
  
  private static List<Estudiante> lista;
  private static int filtro = 0; // 0: Sin filtro, 1: Filtro 1, 2 Filtro 2
  private static int nota = 0;
  private static int nota1 = 0;
  private static int nota2 = 0;
  
  static {
    lista = new ArrayList<>();
  }
  
  /**
   * Agrega un estudiante.
   * 
   * @param bean
   * @return 1 : ok, -1: Nota fuera de rango
   */
  public static int agregar(Estudiante bean){
    int rpta = -1;
    if(bean.getNota() >= 0 && bean.getNota() <= 20){
      rpta = 1;
      lista.add(bean);
    }
    return rpta;
  } 
  
  public static void setFilter(int caso, int ... notas){
    switch(caso){
      case 0:
        filtro = caso;
        break;
      case 1:
        filtro = caso;
        nota = notas[0];
        break;
      case 2:
        filtro = caso;
        nota1 = notas[0];
        nota2 = notas[1];
        break;
    }
  }
  
  public static List<Estudiante> getLista(){
    List<Estudiante> listaNueva = null;
    switch(filtro){
      case 0:
        listaNueva = lista;
        break;
      case 1:
        listaNueva = getListaFiltro1();
        break;
      case 2:
        listaNueva = getListaFiltro2();
        break;        
    }
    return listaNueva;
  }

  private static List<Estudiante> getListaFiltro1() {
    List<Estudiante> listaNueva = new ArrayList<>();
    for(Estudiante bean: lista){
      if(bean.getNota() == nota){
        listaNueva.add(bean);
      }
    }
    return listaNueva;
  }

  private static List<Estudiante> getListaFiltro2() {
    return null; // Lo cambias tú
  }
  
  
}
