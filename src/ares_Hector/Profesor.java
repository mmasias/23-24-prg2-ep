public class Profesor{
    private String nombre;
    private String numeroIdentidad;

    public Profesor(String nombre, String numeroIdentidad) {
        this.nombre = nombre;
        this.numeroIdentidad = numeroIdentidad;
    }

public String mostrarProfesor(){
return "Nombre del profesor:"+nombre+ "-"+ numeroIdentidad;
    }
}

