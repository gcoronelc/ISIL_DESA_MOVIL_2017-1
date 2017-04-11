package pe.isil.sueldotrabajador.service;

import pe.isil.sueldotrabajador.model.PagoModel;

/**
 * Created by Alumno-JG on 11/04/2017.
 */

public class PagoService {


    public PagoModel procesarPago(PagoModel model){
        // Variables
        double ingreso, renta, neto;
        // Proceso
        ingreso = model.getHorasDia()*model.getDias()*model.getPagoHora();
        renta = 0.0;
        if(ingreso>1500.0){
            renta = ingreso * 0.08;
        }
        neto = ingreso - renta;
        // Reporte
        model.setIngreso(ingreso);
        model.setRenta(renta);
        model.setNeto(neto);
        // Retorno
        return model;
    }
}
