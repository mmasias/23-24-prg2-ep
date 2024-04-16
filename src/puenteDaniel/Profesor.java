package puenteDaniel;

public class Profesor {

private String nombre;
private String NIE;

    public Profesor(String nombre, String NIE) {
        this.nombre = nombre;
        this.NIE = NIE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIE() {
        return NIE;
    }

    public void setNIE(String NIE) {
        this.NIE = NIE;
    }
}