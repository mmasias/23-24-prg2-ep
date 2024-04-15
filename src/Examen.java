public class Examen {

    private Profesor[] profesores;
    private Asignatura asignaturaExamen;
    private char tipoExamen;
    private Pregunta[] preguntas;
    private Indicaciones indicaciones;

    public Examen(Profesor[] profesores, Asignatura asignaturaDeExamen, char tipoExamen, Pregunta[] preguntas, Indicaciones indicaciones) {
        this.profesores = profesores;
        this.asignaturaExamen = asignaturaDeExamen;
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

    public void mostrarExamen() {
       
       profesores[0].mostrarDatos();

        String tipo = (tipoExamen == 'p') ? "Parcial" : ((tipoExamen == 's') ? "Semestral" : "Tipo no definido");
    
        System.out.println("Examen: " + tipo + " / Vigilado por Profª.: " );
        profesores[1].mostrarDatos();
        System.out.println("Indicaciones: "+ indicaciones.obtenerEnunciado());
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println(" Pregunta " + (i + 1) + ": \"" + preguntas[i].obtenerTitulo() + "\" - " + preguntas[i].obtenerEnunciado());
        }
        System.out.println("Reglas: "+ indicaciones.obtenerReglas());
    }
}

