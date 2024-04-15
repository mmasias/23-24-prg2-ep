public class Examen {
    private String tipoExamen;
    private String preguntasExamen;
    private int duracion;

    public Examen(String tipoExamen, String preguntasExamen, int duracion) {
        this.tipoExamen = tipoExamen;
        this.preguntasExamen = preguntasExamen;
        this.duracion = duracion;
    }

    public String getTipoExamen() {
        return tipoExamen;
    }

    public String getPreguntasExamen() {
        return preguntasExamen;
    }

    public int getDuracion() {
        return duracion;
    }
}
