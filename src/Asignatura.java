class Asignatura {
  private String nombre;
  private String codigo;
  private int creditos;
  private Examen examen;

  public Asignatura(String nombre, String codigo, int creditos) {
    this.nombre = nombre;
    this.codigo = codigo;
    this.creditos = creditos;
  }

  public void establecerExamen(Examen examen) {
    this.examen = examen;
  }

  public Examen obtenerExamen() {
    return examen;
  }

  public String mostarDatos() {
    return "Asignatura: " + nombre + " - " + codigo + " - " + creditos + " creditos";
  }
}
