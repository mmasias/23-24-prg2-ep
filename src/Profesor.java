public class Profesor {

    private String id;
    private String nombre;

    public Profesor(String id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public String mostrar(){
        return nombre + " - ID " + id;
    }
}
