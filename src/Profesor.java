public class Profesor{

    private String name;
    private String identification;
    private Asignatura subject;
    private Examen test;

    public Profesor(String name, String identification, Asignatura subject, Examen test){
        assert name!=null && identification!=null && subject!=null;

        this.name = name;
        this.identification = identification;
        this.subject = subject;
        this.test = test;

    }

    public String getName(){
        return name;
    }
    public String getIdentification(){
        return identification;
    }
    public Examen getTest(){
        return test;
    }

}