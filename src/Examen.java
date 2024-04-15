class Examen {
  private String nombre;
  private Profesor profesor;
  private String[] preguntas = new String[0];

  public Examen(String nombre, Profesor profesor) {
    this.nombre = nombre;
    this.profesor = profesor;
  }

  public Examen(String nombre) {
    this.nombre = nombre;
  }

  public void establecerProfesor(Profesor profesor) {
    this.profesor = profesor;
  }

  public void añadirPregunta(String nuevaPregunta) {
    String[] preguntas = new String[this.preguntas.length + 1];
    if (preguntas.length > 0) {
      for (int pregunta = 0; pregunta < preguntas.length - 1; pregunta++) {
        preguntas[pregunta] = this.preguntas[pregunta];
      }
    }
    preguntas[this.preguntas.length] = nuevaPregunta;
    this.preguntas = preguntas;
  }

  public String mostrarDatos() {
    String datos = "Examen: " + nombre;
    if (profesor != null) {
      datos += " / Vigilado por Prof .: " + profesor.mostrarDatos();
    }
    for (int pregunta = 0; pregunta < preguntas.length; pregunta++) {
      datos += "\nPregunta " + (pregunta + 1) + ": " + preguntas[pregunta];
    }
    return datos;
  }

}
