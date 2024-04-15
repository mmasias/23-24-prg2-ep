public class Main {
    public static void main(String[] args) {

        Profesor profesor1 = new Profesor("Manuel", "Masias", "12345678A");
        Profesor profesor2 = new Profesor("Loyda", "Alas", "433452A");
        
     
        Asignatura asignatura = new Asignatura("Programacion 2", 6);
        
        
        Pregunta pregunta1 = new Pregunta("Vista pública clases", "Diseño");
        Pregunta pregunta2 = new Pregunta("Vista pública de objetos", "Diseño de la conversación");
        Pregunta pregunta3 = new Pregunta("Vista privada de clases", "Codificación");
        
        
        Indicaciones indicaciones = new Indicaciones("Instrucciones del examen", "Reglas del examen");
        
        
        Profesor[] profesoresExamen = {profesor1, profesor2};
        Pregunta[] preguntasExamen = {pregunta1, pregunta2, pregunta3};
        Examen examen = new Examen(profesoresExamen, asignatura, 'p', preguntasExamen, indicaciones);
        
        examen.mostrarExamen();
    }
}