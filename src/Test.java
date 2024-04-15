public class Test{

    private String type;
    private String percentageScore;
    private Teacher teacher;
    private Question[] questions; 
    private int numQuestions; 

    public Test( String type, String percentageScore){
        this.type = type;
        this.percentageScore = percentageScore;
        this.questions = new Question[3]; 
        this.numQuestions = 0;
    }
    public Test( String type, String percentageScore, Teacher teacher){
        this.type = type;
        this.percentageScore = percentageScore;
        this.teacher = teacher;
        this.questions = new Question[3]; 
        this.numQuestions = 0;
    }

    public void show(){
        System.out.println("Examen: " + type + "- Valor en la nota final: " + percentageScore + " / Vigilado por Prof."); teacher.show();
        System.out.println("Preguntas: ");
        for (int i = 0; i < numQuestions; i++) {
            System.out.print((i + 1) + ". ");
            questions[i].show();
        }
    }
    public void editPercentageScore(String newPercentageScore){
        String tempScore = newPercentageScore;
        this.percentageScore = tempScore;
    }
    public void editTeacher(Teacher newTeacher){
        Teacher tempTeacher = newTeacher;
        this.teacher = tempTeacher;
    }
    public void addQuestion(Question question){
        if (numQuestions < questions.length) {
            questions[numQuestions] = question; 
            numQuestions++; 
        } 
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Bryan Baquedano");
        Test examen1 = new Test("Examen Parcial", "25%", teacher);
        
        Question pregunta1 = new Question("¿Que opinas de la muerte?");
        Question pregunta2 = new Question("¿Quien quieres llegar a ser?");
        Question pregunta3 = new Question("¿Quién escribió Humano, Demasiado Humano", new String[]{"Nietzsche", "Descartes", "Shoppenhauer", "Kant"});
        
        examen1.addQuestion(pregunta1);
        examen1.addQuestion(pregunta2);
        examen1.addQuestion(pregunta3);
    
        examen1.show();
    }
}