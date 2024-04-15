public class Asignatura{
    private String nombre;
    private String siglas;
    private int creditos;
    
    public Asignatura(String nombre) {
        this.nombre = nombre;
    }
    public Asignatura(String siglas, int creditos) {
        this.siglas = siglas;
        this.creditos = creditos;
    }
}