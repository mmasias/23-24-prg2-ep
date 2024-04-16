package examenParcial;

public class Examen {
    
    private String examen;
    private Profesor profesorVigilante;
    private Pregunta preguntas;
    
    public Examen() {
    }

    public Examen(String examen, Profesor profesorVigilante, Pregunta preguntas) {
        this.examen = examen;
        this.profesorVigilante = profesorVigilante;
        this.preguntas = preguntas;
    }



    public String mostrarExamen(){
        return "Examen:" + examen + " / Vigilado por Profª.: " + profesorVigilante.mostrarProfesorVigilante() + "\n" + preguntas.mostrarPreguntas(); 
    }
}

