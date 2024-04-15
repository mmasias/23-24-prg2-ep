public class Main {
    public static void main(String[] args) {

        Profesor mMasias = new Profesor("666999XY", "Manuel Masias");
        Profesor lAlas = new Profesor("433452A", "Loyda Alas");

        Pregunta pregunta1 = new Pregunta(1, "Vista publica clases");
        Pregunta pregunta2 = new Pregunta(2, "Vista publica objetos");
        Pregunta pregunta3 = new Pregunta(3, "Vista privada clases");
        Pregunta[] preguntas = new Pregunta[]{pregunta1, pregunta2};

        Examen parcial1 = new Examen("Parcial", lAlas, preguntas);
        Examen examenFinal = new Examen("Final", mMasias, preguntas);
        
        Examen[] examenes = new Examen[]{parcial1};
        
        Asignatura progra1 = new Asignatura("Programacion 2", mMasias, examenes, "PRG2", 6);
        
        progra1.anadirExamen(examenFinal);

        parcial1.anadirPregunta(pregunta3);
        
        System.out.println(progra1.mostrar());
    }
}
