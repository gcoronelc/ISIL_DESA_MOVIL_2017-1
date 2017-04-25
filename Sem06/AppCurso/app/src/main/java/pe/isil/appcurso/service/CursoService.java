package pe.isil.appcurso.service;


import pe.isil.appcurso.model.CursoModel;

public class CursoService {

    /**
     * Realiza el calculo de la programación de un curso.
     *
     * @param curso Nombre del curso.
     * @param nivel Nivel del curso, puede ser B:Basico I:Intermedio A:Avanzado
     * @param vacantes Cantidad de vacantes a programar.
     * @return Retorna un bean con todos los datos obtenidos.
     */
    public CursoModel procesarCurso(String curso, String nivel, int vacantes){
        CursoModel model = new CursoModel();
        //--------------------------------------------------------------------------
        model.setCurso(curso);
        model.setNivel(nombreNivel(nivel));
        double precio = obtenerPrecio(nivel);
        double pagoHora = obtenerPagoHora(nivel);
        model.setIngresos(precio * vacantes);
        model.setGasPublicidad(model.getIngresos() * 0.07);
        model.setGasLogistica(model.getIngresos() * 0.08);
        model.setGasMateriales(model.getIngresos() * 0.06);
        model.setPagoProfesor(pagoHora * 30);
        double gastos = model.getGasLogistica() + model.getGasMateriales() +
                model.getGasPublicidad() + model.getPagoProfesor();
        model.setUtilidad(model.getIngresos() - gastos);
        //--------------------------------------------------------------------------
        return model;
    }

    private double obtenerPagoHora(String nivel) {
        double pagoHora = 0.0;
        switch (nivel){
            case "B":
                pagoHora = 50.0;
                break;
            case "I":
                pagoHora = 80.0;
                break;
            case "A":
                pagoHora = 100.0;
                break;
        }
        return pagoHora;
    }

    private double obtenerPrecio(String nivel) {
        double precio = 0.0;
        switch (nivel){
            case "B":
                precio = 500.0;
                break;
            case "I":
                precio = 700.0;
                break;
            case "A":
                precio = 900.0;
                break;
        }
        return precio;
    }

    private String nombreNivel(String nivel) {
        String texto = "";
        switch (nivel){
            case "B":
                texto = "Basico";
                break;
            case "I":
                texto = "Intermedio";
                break;
            case "A":
                texto = "Avanzado";
                break;
        }
        return texto;
    }


}
