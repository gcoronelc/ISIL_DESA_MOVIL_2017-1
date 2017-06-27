/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

/**
 *
 * @author La Marjorit
 */
public class metodo {
    
    public String clasificacion(String tipo){
        String clasificacion = "";
        
        if (tipo.equals("niños")){
            clasificacion = "E todo publico";
        }else if (tipo.equals("jovenes")){
            clasificacion = "T adolescentes";
        }else if (tipo.equals("mayores de edad")){
            clasificacion = "M maduro";
        }else if (tipo.equals("adultos")){
            clasificacion = "A adultos";
        }else{
            clasificacion = "RP pendiente";
    }
        return clasificacion;
    }
    public double precioenvio(double precio){
        double costo, impuesto, ganancia;
        impuesto = precio * 0.12;
        ganancia = precio * 0.21;
        
        costo = precio + impuesto + ganancia;
        return costo;
    }
    
}
