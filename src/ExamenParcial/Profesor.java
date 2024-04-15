package ExamenParcial;

public class Profesor {
    private String nombre;
    private int nie;

    public Profesor(String nombre, int nie) {
        this.nombre = nombre;
        this.nie = nie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
