public class Pregunta{

    private String explanation;
    private int number;

    public Pregunta(String explanation, int number){
        assert explanation!= null && number>0;

        this.explanation = explanation;
        this.number = number;

    }
    public String getExplanation(){
        return explanation;
    }
    public int getNumber(){
        return number;
    }
}