package examenParcial;

public class Profesor {
    
    private String nombre;
    private String apellidos;
    private String nie;
    private String dni;

   
    public Profesor() {
    }


    public Profesor(String nombre, String apellidos, String nie, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nie = nie;
        this.dni = dni;
    }

    public String mostrarProfesor(){
        return "Nombre del profesor: " + nombre + " " + apellidos + " - " + nie;
    }

    public String mostrarProfesorVigilante(){
        return nombre + " " + apellidos + " - " + dni;
    }
}

