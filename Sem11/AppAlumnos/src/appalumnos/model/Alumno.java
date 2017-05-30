package appalumnos.model;

public class Alumno {

  private String nombre;
  private int nota1;
  private int nota2;
  private int nota3;
  private int nota4;
  private int promedio;

  public Alumno() {
  }

  public Alumno(String nombre, int nota1, int nota2, int nota3, int nota4) {
    this.nombre = nombre;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
    this.nota4 = nota4;
  }

  public Alumno(String nombre, int nota1, int nota2, int nota3, int nota4, int promedio) {
    this.nombre = nombre;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
    this.nota4 = nota4;
    this.promedio = promedio;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getNota1() {
    return nota1;
  }

  public void setNota1(int nota1) {
    this.nota1 = nota1;
  }

  public int getNota2() {
    return nota2;
  }

  public void setNota2(int nota2) {
    this.nota2 = nota2;
  }

  public int getNota3() {
    return nota3;
  }

  public void setNota3(int nota3) {
    this.nota3 = nota3;
  }

  public int getNota4() {
    return nota4;
  }

  public void setNota4(int nota4) {
    this.nota4 = nota4;
  }

  public int getPromedio() {
    return promedio;
  }

  public void setPromedio(int promedio) {
    this.promedio = promedio;
  }

  @Override
  public String toString() {
    String row = nombre + " | " + nota1 + " | " + nota2 
            + " | " + nota3 + " | " + nota4 + " | " + promedio;
    return row;
  }

  
}
