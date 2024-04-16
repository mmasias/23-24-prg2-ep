package puenteDaniel;

public class Vigilante {
    private String nombre;
    private String DNI;

    public Vigilante(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
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
