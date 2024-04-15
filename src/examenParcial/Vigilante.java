public class Vigilante {
    private String nombre;
    private String ID;

    public Vigilante(String nombre, String ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(){
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(){
        this.ID = ID;
    }

    @Override
    public String toString() {
        return nombre + "ID: " + ID;
    }
}
