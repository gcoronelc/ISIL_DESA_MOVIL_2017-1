/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.util.Scanner;

/**
 *
 * @author La Marjorit
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juegos_de_video();
    }
    
    public static void Juegos_de_video(){
        Scanner in = new Scanner(System.in);
        String nombre,publico,clasificacion;
        double precio,total;
        System.out.println("Clasificacion de Juegos de Video");
        System.out.println("Ingrese el titulo del juego");
        nombre = in.next();
        System.out.println("Ingrese quienes pueden jugarlo: niños, jovenes, mayores de edad, adultos o blanco si no sabe");
        precio = in.nextDouble();
        metodo net = new metodo();
        clasificacion = net.clasificacion("publico");
        total = net.precioenvio(precio);
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("Los datos de sus juego son:");
        
        System.out.println("titulo: "+nombre);
        System.out.println("Clasificacion: "+clasificacion);
        System.out.println("precio total: "+total);
        System.out.println("------------------------------------");
    }
    
}
