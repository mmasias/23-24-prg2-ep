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
        this.name = name;
        this.code = createCode(name);
        this.credits = credits;
        
    }
    public Subject(String name){
        this.name = name;
        this.code = createCode(name);
        this.credits = 0;
    }

    
    public String createCode(String name){
        assert name != null && !name.isEmpty() : "El nombre no puede ser nulo o vacío";
        String code = name.substring(0, Math.min(name.length(), 4));
        code = code.toUpperCase();
        this.code = code;
        return code;
    }

    public void show(){}
    public void editName(String name){}
    public void editCredits(int credits){}
    
}
