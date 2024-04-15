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
public static void main(String[] args) {
    Asignatura asignatura = new Asignatura("Programación 2");    
}