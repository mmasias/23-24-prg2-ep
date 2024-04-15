public class App {
    public static void main(String[] args) {
        Teacher masias = new Teacher("Manuel Masias", "NIE 666999XY");
        Teacher loyda = new Teacher("Loyda Alas", "DNI 433452A");
        Subject prograDos = new Subject("Programacion 2", "PRG2", 6);
        Test parcial = new Test("Parcial", loyda);
        Question first = new Question(1, "Vista publica clases");
        Question second = new Question(2, "Vista publica de objetos");
        Question third = new Question(3, "Vista privada de clases");
        parcial.addQuestion(first);
        parcial.addQuestion(second);
        parcial.addQuestion(third);
        prograDos.addTeacher(masias);
        prograDos.addTest(parcial);
        System.out.println(prograDos.show());
    }
}
