public class Asignatura{

    private String name;
    private String code;
    private int credits;

    public Asignatura(String name, String code, int credits){
        assert name!=null && code.length()==4 && credits >=0;

        this.name = name;
        this.code = code.toUpperCase();
        this.credits = credits;

    }
    public Asignatura(String name){

        this(name, name.substring(0, 4).toUpperCase(), 6);

    }

    public String getName(){
        return name;
    }
    public String getCode(){
        return code;
    }
    public int getCredits(){
        return credits;
    }

}