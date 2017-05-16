package pruebas;

public class Prueba01 {

  public static void main(String[] args) {
    
    int[] notas = new int[5];
    
    System.out.println("Tamaño del arreglo: " + notas.length);
    
    System.out.println("Recorrido indexado del arreglo");
    for (int i = 0; i < notas.length; i++) {
      int nota = notas[i];
      System.out.println("notas[" + i + "] = " + nota);
    }
    
    // Cambiar algunos valores
    notas[1] = 15;
    notas[2] = 20;
    notas[3] = (notas[1] + notas[2]) / 2;
    
    // Mostrar nuevamente el arreglo
    System.out.println("Recorrido tipo colección: FOREACH");
    for (int nota : notas) {
      System.out.println(nota);
    }
    
  }
  
}
