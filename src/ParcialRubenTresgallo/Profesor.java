public class Profesor{
    private String nombre;
    private String documentación;
    public Profesor(String nombre, String documentación){
        this.nombre = nombre;
        this.documentación = documentación;

    }
    public String mostrarProfesor(){
      return "Nombre del profesor: " + nombre + " - " + documentación;


    }
 }