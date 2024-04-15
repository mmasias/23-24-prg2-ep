public class Test{

    private String type;
    private String percentageScore;
    private Teacher teacher;

    public Test( String type, String percentageScore){}
    public Test( String type, String percentageScore, Teacher teacher){}

    public void show(){
        System.out.println("Examen: " + type + "- Valor en la nota final: " + percentageScore + " / " + teacher);
    }
    public void editPercentageScore(String percentageScore){}
    public void editTeacher(Teacher teacher){}
    public void addQuestion(Question question){}
}