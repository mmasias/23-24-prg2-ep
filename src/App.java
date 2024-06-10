class App{
    public static void main(String[] args){

        Profesor profesor = new Profesor("Manuel");

        Asignatura programacion = new Asignatura("Programacion 2", "PRG2", 6);

        Examen examen = new Examen("Examen parcial");

        examen.asociarPregunta(new Pregunta("Vista pública clases"));
        examen.asociarPregunta(new Pregunta("Vista pública objetos"));
        examen.asociarPregunta(new Pregunta("Vista privada clases"));

        Profesor vigilante = new Profesor("Loyda", "XXX666999");

        examen.asociarProfesorVigilante(vigilante);
        programacion.asociarExamen(examen);
        profesor.asociarAsignatura(programacion);

        profesor.mostrar();
    }
}