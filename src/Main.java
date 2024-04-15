public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Manuel Masias", "666999XY");
        Subject subject = new Subject("Programación 2", "PROGRAM", 6);

        Professor supervisor = new Professor("Loyda", "433452A");
        Exam exam = new Exam("Examen parcial", supervisor);
        System.out.print("Supervisora ");
        exam.responsable().show();
        professor.assign(subject);

        exam.add(1, "Vista pública clases");
        exam.add(2, "Vista pública de objectos");
        exam.add(3, "Vista privada de clases");

        professor.show();
        subject.show();
        exam.showQuestion();

    }
}
