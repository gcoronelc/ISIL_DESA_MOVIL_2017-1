/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author Fam. Velazco
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Persona>lista=new ArrayList<>();
        lista.add(new Persona("Ann", 18, Persona.Sexo.MUJER));
        lista.add(new Persona("Bob", 18, Persona.Sexo.HOMBRE));
        lista.add(new Persona("Carl", 18, Persona.Sexo.HOMBRE));
        lista.add(new Persona("David", 18, Persona.Sexo.HOMBRE));
        lista.add(new Persona("Eva", 18, Persona.Sexo.MUJER));
        
        imprimirSeleccionados(lista, (p) -> (p.getEdad()>=18 && p.getEdad()<=30),p->p.getNombre(),
                nombre->System.out.println(nombre));
        System.out.println("--- usando expresion completa:");
        lista
                .stream()
                .filter(p ->p.getEdad()>=18 && p.getEdad()<=30)
                .map( p -> p.getNombre())
                .forEach(nombre -> System.out.println(nombre));
    }
    static void imprimirSeleccionados(List<Persona> lista,Predicate<Persona> teater) {
        for (Persona p: lista) {
            if (teater.test(p))
                System.out.println(p);
        }
    }
    static void imprimirSeleccionados(List<Persona> lista,Predicate<Persona> teater,
            Function<Persona,String> mapper,
            Consumer<String> block) {
        System.out.println("--- usando function ---");
        lista.stream().filter((p) -> (teater.test(p))).forEachOrdered((p) -> {
            String data=mapper.apply(p);
            block.accept(data);
        });
    }
    static void imprimirSeleccionados(List<Persona> lista,Predicate<Persona> teater,
             Consumer<Persona> block) {
        System.out.println("----Usando Consumer----");
        for (Persona p: lista) {
            if (teater.test(p))
                block.accept(p);
        }
    }
}
class Persona {
    static enum Sexo{HOMBRE,MUJER}
    private String nombre;
    private int edad;
    private Sexo sexo;

    public Persona(String nombre, int edad, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    public void imprimir() {
        System.out.println(this);
    }
}
