public class App{

    public static void main(String[] args) {
        
        Asignatura progra2 = new Asignatura("Programación 2", "prg2",6);
        Asignatura teo = new Asignatura("Tecnología y estructura de ordenadores", "teo ",6);

        Pregunta question1 = new Pregunta("Vista pública clases", 1);
        Pregunta question2 = new Pregunta("Vista publica objetos", 2);
        Pregunta question3 = new Pregunta("Vista privada clases", 3);

        Profesor loyda = new Profesor("Loyda Alas", "DNI 433452A", teo, null);

        Examen testPrg2 = new Examen("Examen parcial", loyda, question1, question2, question3);

        Profesor masias = new Profesor("Manuel Masias", "NIE 666999XY", progra2, testPrg2);

    }

}