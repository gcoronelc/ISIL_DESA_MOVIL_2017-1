/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo02;

import java.util.Arrays;
import java.util.List;


/**
 *
 * @author Fam. Velazco
 */
public class Ejemplo02 {


    public static void main(String[] args) {
        List<Integer> lista =
          Arrays.asList(34, 76, 23, 78, 15, 80, 45, 67);
        
        lista.stream()
                .filter( n -> n > 50)
                .sorted()
                .forEach( n -> System.out.println(n));
        
    }

    
}
