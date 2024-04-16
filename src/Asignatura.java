public class Asignatura {

    String nombre;
    String id;
    int creditos;

    public Asignatura(String nombre, String id, int creditos) {
        this.nombre = nombre;
        this.id = id;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public int getCreditos() {
        return creditos;
    }
}
