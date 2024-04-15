public class Examen{

    private String type;
    private Profesor supervisor;
    private Pregunta question1;
    private Pregunta question2;
    private Pregunta question3;

    public Examen(String type, Profesor supervisor, Pregunta question1, Pregunta question2, Pregunta question3){
        assert type!=null && supervisor!=null && question1!=null && question2!=null && question3!=null;

        this.type = type;
        this.supervisor = supervisor;
        this.question1 = question1;
        this.question2 = question2;
        this.question3 = question3;

    }

    public String getType(){
        return type;
    }
    public Profesor getSupervisor(){
        return supervisor;
    }
    public Pregunta getQuestion1(){
        return question1;
    }
    public Pregunta getQuestion2(){
        return question2;
    }
    public Pregunta getQuestion3(){
        return question3;
    }

}