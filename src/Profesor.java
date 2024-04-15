class Profesor{
    private String nombre;
    private String dni;
    private Asignatura asignatura;

    public Profesor(String nombre, String dni, Asignatura asignatura){
        this.nombre=nombre;
        this.dni=dni;
        this.asignatura=asignatura;
    }

    public void establecerAsignatura(Asignatura asignatura){
        this.asignatura=asignatura;
    }
    public Profesor (String nombre, String dni){
        this(nombre, dni);
    }
    public Asignatura obtenerAsignatura(){
        return asignatura;
    }

    public String mostrarDatos(){
        return "Nombre del profesor: "+nombre+ "-DNI "+dni;
    }


}