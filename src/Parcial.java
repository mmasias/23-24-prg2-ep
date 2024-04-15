package Parcial;

 
class Subject {

    public Subject (String name, String code, int credits){
       
    }

    public void showInfo(){
      
    }

    public void deteleSubject(){
        
    }
}

class Teacher {

    public Teacher (String name, String id){
        
    }

    public void addSubject(Subject subject){
        
    }

    public Boolean isNie (String id){
        
    }

    public void showInfo(){
        
    }

}

class Exam {


    public Exam (String name, Teacher teacher){
        
    }

    public void addQuestion(Question question){
        
    }

    public void deleteQuestion(Question question){
        
    }



}

class Question{

    public Question (String name){
        
    }

     
    public String editQuestion (String name) {

    }
}

class Parcial {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Manuel Masias", "666999XY");
        Subject subject1 = new Subject("Programacion 2", "PRG2", 6);
        teacher1.addSubject(subject1);
        Teacher teacher2 = new Teacher("Loyda Alas", "433452A");
        Exam exam1 = new Exam("Examen Parcial", teacher2);
        Question question1 = new Question("Vista pública de una clase");
        Question question2 = new Question("Vista pública de objetos");
        Question question3 = new Question("Vista privada de clases");
        exam1.addQuestion(question1);
        exam1.addQuestion(question2);
        exam1.addQuestion(question3);

        
        
    }
}
