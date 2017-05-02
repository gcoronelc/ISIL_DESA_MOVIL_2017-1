package apppractica.service;

import apppractica.model.ModelPractica;

public class ServicePractica {

  public static ModelPractica calcProcesos(int duracion, double pagoHoras, int vacantes, double rentabilidad) {
    ModelPractica model = new ModelPractica();
    // ---------------------------------------------------------------------------------
    double pagoProf;
    double ingresoBruto;
    double gastAdministrativos;
    double gastPublicidad;
    double gastLogistica;
    double utilidad;
    double pagoAlumno;    

    pagoProf = pagoHoras * duracion;
    ingresoBruto = pagoProf / (0.88 - rentabilidad);
    pagoAlumno = ingresoBruto / vacantes;
    gastAdministrativos = ingresoBruto * 0.03;
    gastLogistica = ingresoBruto * 0.04;
    gastPublicidad = ingresoBruto * 0.05;
    utilidad = ingresoBruto * rentabilidad;
    // Reporte
    model.setDuracion(duracion);
    model.setPagoxhora(pagoHoras);
    model.setRentabilidad(rentabilidad);
    model.setVacantes(vacantes);
    model.setIngresoBruto(ingresoBruto);
    model.setPagoProf(pagoProf);
    model.setGastAdministrativos(gastAdministrativos);
    model.setGastLogistica(gastLogistica);
    model.setGastPublicidad(gastPublicidad);
    model.setUtilidad(utilidad);
    model.setPagoAlumno(pagoAlumno);

    // --------------------------------------------------------
    return model;
  }

  
}
