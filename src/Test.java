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
        System.out.println("Examen: " + type + "- Valor en la nota final: " + percentageScore + " / Vigilado por Prof." + teacher);
        System.out.println("Preguntas: ");
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
}