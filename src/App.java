public class App {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Bryan Baquedano", "Z0996961P");
        Teacher teacher2 = new Teacher("Ángel Romero", "X02433450P");
        Subject subject = new Subject("Filosofía", "FILO", 6);
        teacher.addSubject(subject);

        Test examen = new Test("Examen Parcial", "25%", teacher2);

        Question pregunta1 = new Question("¿Qué opinas de la muerte?");
        Question pregunta2 = new Question("¿Quién quieres llegar a ser?");
        Question pregunta3 = new Question("¿Quién escribió Humano, Demasiado Humano?");
        
        examen.addQuestion(pregunta1);
        examen.addQuestion(pregunta2);
        examen.addQuestion(pregunta3);


        teacher.show();
        examen.show();
    }
}