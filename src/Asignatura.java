
public class Asignatura {

    private String nombre;
    private Examen examen;
    private int creditos;
    private String codigo;

    public Asignatura(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public void asociarExamen(Examen examen) {
        this.examen = examen;
    }

    public String mostrar() {
        return this.nombre + " ("+this.codigo+","+this.creditos+") que tiene asociado " + examen.mostrar();
    }
}
