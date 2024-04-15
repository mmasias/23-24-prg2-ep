package src.garciaLydia;

public class Profesor {
    private String nombre;
    private String nie;

    public Profesor(String nombre, String nie) {
        this.nombre = nombre;
        this.nie = nie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNie() {
        return nie;
    }

    public void setNie(String nie) {
        this.nie = nie;
    }
}
