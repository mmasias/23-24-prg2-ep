public class Profesor{
    private String nombre;
    private String apellido;
    private String DNI;


    public Profesor (String nombre, String apellido, String DNI ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;

    }
    public String mostrarProfesor() {
        return "Nombre del profesor: " + nombre + " " + apellido + " DNI: " + DNI;
    }

}




   



