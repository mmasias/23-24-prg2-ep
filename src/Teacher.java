public class Teacher {
    
    private String name;
    private String id;

    public Teacher(String name, String id){
        this.name = name;
        this.id = id;
    }
    public Teacher(String name){
        this(name, "");
    }

    public void show(){
        System.out.println("Profesor: " + name + "- Id: " + id);
    }
    public void editName(String name){}
    public void editId(String id){}
    public void addSubject(Subject subject){}
}
