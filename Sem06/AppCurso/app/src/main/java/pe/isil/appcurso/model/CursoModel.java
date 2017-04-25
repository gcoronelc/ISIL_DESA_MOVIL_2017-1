package pe.isil.appcurso.model;

public class CursoModel {

    private String curso;
    private String nivel;
    private int vacantes;
    private double ingresos;
    private double gasPublicidad;
    private double gasLogistica;
    private double gasMateriales;
    private double pagoProfesor;
    private double utilidad;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getVacantes() {
        return vacantes;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getGasPublicidad() {
        return gasPublicidad;
    }

    public void setGasPublicidad(double gasPublicidad) {
        this.gasPublicidad = gasPublicidad;
    }

    public double getGasLogistica() {
        return gasLogistica;
    }

    public void setGasLogistica(double gasLogistica) {
        this.gasLogistica = gasLogistica;
    }

    public double getGasMateriales() {
        return gasMateriales;
    }

    public void setGasMateriales(double gasMateriales) {
        this.gasMateriales = gasMateriales;
    }

    public double getPagoProfesor() {
        return pagoProfesor;
    }

    public void setPagoProfesor(double pagoProfesor) {
        this.pagoProfesor = pagoProfesor;
    }

    public double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(double utilidad) {
        this.utilidad = utilidad;
    }
}
