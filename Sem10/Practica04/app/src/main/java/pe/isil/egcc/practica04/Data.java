package pe.isil.egcc.practica04;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alumno-JG on 23/05/2017.
 */

public class Data {

    public static List<String> nombres;

    static {
        nombres = new ArrayList<>();
    }

    public static void agregar(String nombre){
        nombres.add(nombre);
    }

}
