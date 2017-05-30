package pe.isil.egcc.tarea03;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<String> nombres;

    static {
        nombres = new ArrayList<>();
    }

    public static void agregar(String nombre){
        nombres.add(nombre);
    }
    public static void eliminar(String nombre){
        nombres.remove(nombre);
    }

}
