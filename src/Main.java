public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Manuel Masias", "666999XY");
        Subject subject = new Subject("Programación 2", "PROGRAM", 6);
        Exam exam = new Exam("Examen parcial");

        Professor professor = new Professor("Loyda", "433452A");
        exam.responsable(professor);
        professor = professor.assign(Subject);

        exam.add(1, "Vista pública clases");
        exam.add(2, "Vista pública de objectos");
        exam.add(3, "Vista privada de clases");

        professor.show();
        subject.show();
        exam.showQuestion();

    }
}
