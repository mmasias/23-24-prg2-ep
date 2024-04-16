public class Asignatura{
    private String nombre;
    private int creditos;
    private Profesor profesorEncargado;

    public Asignatura() {
    }

    public Asignatura(String nombre, int creditos, Profesor profesorEncargado) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesorEncargado = profesorEncargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Profesor getProfesorEncargado() {
        return profesorEncargado;
    }

    public void setProfesorEncargado(Profesor profesorEncargado) {
        this.profesorEncargado = profesorEncargado;
    }

    
}