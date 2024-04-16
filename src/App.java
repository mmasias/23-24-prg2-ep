public class App {
    public static void main(String[] args) {
        Asignatura progra2 = new Asignatura("Programación 2", "PRG-2", 6);
        Profesor masias = new Profesor("Manuel Masias", "999666xy", progra2);
        Pregunta pregunta1 = new Pregunta("Vista pública clases", 1);
        Pregunta pregunta2 new Pregunta("Vista publica objetos", 2);
        Pregunta pregunta3 = new Pregunta("Vista privada clases", 3);
        Profesor loyda = new Profesor("Loyda Alas", "433452A");
        Examen progra2 = new Examen("Examen parcial", loyda, pregunta1, pregunta2, pregunta3);
    }   
}
