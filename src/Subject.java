public class Subject {
    
    private String name;
    private String code;
    private int credits;

    public Subject(String name, String code, int credits){
        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    public Subject(String name, String code){
        this(name, code, 0);
    }
    
    public Subject(String name, int credits){
        this(name, "", credits);
    }
    public Subject(String name){
        this(name, "", 0);
    }

    public void show(){}
    public String createCode(String name){
        return "a";
    }
    public void editName(String name){}
    public void editCredits(int credits){}
    
}
