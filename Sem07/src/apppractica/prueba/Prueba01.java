package apppractica.prueba;

import apppractica.model.ModelPractica;
import apppractica.service.ServicePractica;

public class Prueba01 {

    public static void main(String[] args) {
        //datos
        int vacantes = 24;
        int duracion = 30;
        double pagoxH = 100.00;
        double rentabilidad =0.80;
        String Nombre = "Programación con Spring FrameWork";

        //procesar datos
        ModelPractica model = ServicePractica.calcProcesos(duracion, pagoxH, vacantes, rentabilidad);

        System.out.println("Pago Profesor: " + model.getPagoProf());
        System.out.println("Ingreso Bruto: " + model.getIngresoBruto());
        System.out.println("Publicidad: " + model.getGastPublicidad());
        System.out.println("Utilidad: " + model.getUtilidad());
        System.out.println("Pago Alumno: " + model.getPagoAlumno());        
        
    }
}
