public class Test{

    private String type;
    private String percentageScore;
    private Teacher teacher;

    public Test( String type, String percentageScore){
        this.type = type;
        this.percentageScore = percentageScore;
    }
    public Test( String type, String percentageScore, Teacher teacher){
        this.type = type;
        this.percentageScore = percentageScore;
        this.teacher = teacher;
    }

    public void show(){
        System.out.println("Examen: " + type + "- Valor en la nota final: " + percentageScore + " / Vigilado por Prof." + teacher);
    }
    public void editPercentageScore(String newPercentageScore){
        String tempScore = newPercentageScore;
        this.percentageScore = tempScore;
    }
    public void editTeacher(Teacher newTeacher){
        Teacher tempTeacher = newTeacher;
        this.teacher = tempTeacher;
    }
    public void addQuestion(Question question){}
}