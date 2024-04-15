public class Examen {

    private Profesor[] profesores;
    private Asignatura asignaturaExamen;
    private char tipoExamen;
    private Pregunta[] preguntas;
    private Indicaciones indicaciones;

    public Examen(Profesor[] profesores, Asignatura asignaturaExamen, char tipoExamen, Pregunta[] preguntas, Indicaciones indicaciones) {
        this.profesores = profesores;
        this.asignaturaExamen = asignaturaExamen;
        this.tipoExamen = tipoExamen;
        this.preguntas = preguntas;
        this.indicaciones = indicaciones;
    }

    
    public void modificarindicaciones(Indicaciones nuevaIndicacion) {
        this.indicaciones=nuevaIndicacion;
        
    }

   
    public void modificarProfesores(Profesor[] nuevosProfesores) {
        this.profesores = nuevosProfesores;
    }

    public void modificarAsignatura(Asignatura nuevaAsignatura) {
        this.asignaturaExamen = nuevaAsignatura;
    }

    
    public void modificarTipoExamen(char nuevoTipoExamen) {
        this.tipoExamen = nuevoTipoExamen;
    }
}

