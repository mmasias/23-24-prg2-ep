package Parcial1;
import java.util.Scanner;

class App {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);        

        Teacher manuel = new Teacher("Manuel", "Masias", "666999XY");
        Subject progra2 = new Subject("Programación 2", "PRG-2", 6, manuel);

        Teacher loyda = new Teacher("Loyda", "Alas", "433452A");
        Exam exam = new Exam("Parcial", progra2, loyda, 3);

        exam.addQuestion(0, "Vista Pública de Clases");
        exam.addQuestion(1, "Vista Pública de Objetos");
        exam.addQuestion(2, "Vista Privada de Clases");

        System.out.println("Nombre del profesor: " + manuel.showName() + " " + manuel.showSurname() + " - NIE " + manuel.showId());

        System.out.println("Asignatura: " + progra2.showName() + " - " + progra2.showId() + " - " + progra2.showCredits() + " créditos");

        System.out.println("Exámen: Exámen " + exam.showType() + " / Vigilado por Prof.: " + exam.showSupervisor().showName() + exam.showSupervisor().showSurname() + " - NIE " + exam.showSupervisor().showId());

        for(int i=0;i < exam.getQuestionsQty(); i++){
            System.out.println("Pregunta " + (i+1) + ": " + exam.showQuestion(i));
        }
        
    }    

}
