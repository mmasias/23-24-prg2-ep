package puenteDaniel;

public class Asignatura {
    private String nombre;
    private String abreviatura;
    private int creditos;

    public Asignatura(String nombre, String abreviatura, int creditos) {
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }
}
