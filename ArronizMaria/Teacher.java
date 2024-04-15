class Teacher {
    
    private String name;
    private String dni;
    private Subject subject;
    private Exam exam;
    private Question question;
    private Teacher teacher;
    

    public Teacher(String name, String dni){
        this.name = name;
        this.dni = dni;
    }
    public Teacher(String name){
        this.name = name;
    }
    public Teacher(){

    }

    public void show(){

        System.out.println("Nombre del profesor: " + this.teacher);


    }
    
    public static void main(String[] args) {
        
        Teacher manuel = new Teacher("Manuel Masias", "666999XY");
        Teacher loyda = new Teacher("Loyda Alas", "433452A");

        Subject programacion = new Subject("Programacion II", "PRG2", 6);

        Exam parcialProgra = new Exam("Parcial", loyda, 0);

        Question pregunta1 = new Question("Vista publica clases");
        Question pregunta2 = new Question("Vista publica objetos");
        Question pregunta3 = new Question("Vista privada de clases");

        parcialProgra.addQuestion(pregunta1);
        parcialProgra.addQuestion(pregunta2);
        parcialProgra.addQuestion(pregunta3);

        manuel.addSubject(programacion);
        manuel.addExam(parcialProgra);
        manuel.show();

    }
}

class Subject{

    private String name;
    private String id;
    private int credits;

    public Subject(String name, String id, int credits){
        this.name = name;
        this.id=id;
        this.credits= credits;
    }
    public Subject(String name){
        this.name = name;
    }
    public Subject(){

    }

    public void addSubject(Subject subject){
        this.subject = subject;
        System.out.println("Asignatura: " + this.subject);

    }
}
class Exam{

    private String type;
    private Teacher teacher;
    private Question questions;

    public Exam(String type, Teacher teacher, Question questions){
        this.type = type;
        this.teacher = teacher;
        this.questions = questions;
    }

    public void addExam(){
        this.exam = exam;
        System.out.println("Examen: " + this.exam);
    }
}

class Question{

    private String enunciado;

    public Question(String enunciado){
        this.enunciado = enunciado;
    }

    public void addQuestion(Question question){
        this.question = question;
        System.out.println("Pregunta 1: " + this.question);
        System.out.println("Pregunta 2: " + this.question);
        System.out.println("Pregunta 3: " + this.question);
        

    }
}
