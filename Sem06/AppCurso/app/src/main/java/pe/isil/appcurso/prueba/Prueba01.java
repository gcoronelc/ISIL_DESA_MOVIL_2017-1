package pe.isil.appcurso.prueba;

import pe.isil.appcurso.model.CursoModel;
import pe.isil.appcurso.service.CursoService;

public class Prueba01 {

    public static void main(String[] args) {
        // Datos
        String curso = "Java Orientado a Objetos";
        String nivel = "A";
        int vacantes = 15;

        // Proceso
        CursoService cursoService = new CursoService();
        CursoModel model = cursoService.procesarCurso(curso,nivel,vacantes);


        // Reporte 2
        String repo = "";
        repo += "Curso: " + model.getCurso() + "\n";
        repo += "Nivel: " + model.getNivel() + "\n";
        repo += "Ingresos: " + model.getIngresos() + "\n";
        repo += "Gas. Publicidad: " + model.getGasPublicidad() + "\n";
        repo += "Gas. Logistica: " + model.getGasLogistica() + "\n";
        repo += "Gas. Materiales: " + model.getGasMateriales() + "\n";
        repo += "Pago Profesor: " + model.getPagoProfesor() + "\n";
        repo += "Utilidad: " + model.getUtilidad() + "\n";

        System.out.println(repo);


    }

}
