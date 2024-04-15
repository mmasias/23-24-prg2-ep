class Profesor {

  private String nombre;
  private String dni;
  private Asignatura asignatura;

  public Profesor(String nombre, String dni, Asignatura asignatura) {
    this.nombre = nombre;
    this.asignatura = asignatura;
    this.dni = dni;
  }

  public Profesor(String nombre, String dni) {
    this(nombre, dni, null);
  }

  public void establecerAsignatura(Asignatura asignatura) {
    this.asignatura = asignatura;
  }

  public Asignatura obtenerAsignatura() {
    return asignatura;
  }

  public String mostrarDatos() {
    return "Nombre del profesor: " + nombre + " - DNI " + dni;
  }
}
