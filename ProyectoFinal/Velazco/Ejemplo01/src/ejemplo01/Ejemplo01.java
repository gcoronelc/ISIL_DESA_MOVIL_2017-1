/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Fam. Velazco
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<String> lista = Arrays.asList("Hans","Marcelo","Enrique");
        System.out.println(lista);
        
        Collections.sort(lista, (o1, o2) -> o2.compareTo(o1));
        System.out.println(lista);
        
    }
    
}
