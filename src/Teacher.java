public class Teacher {
    
    private String name;
    private String id;
    private Subject subject;

    public Teacher(String name, String id){
        this.name = name;
        this.id = id;
    }
    public Teacher(String name){
        this(name, "");
    }

    public void show(){
        System.out.println("Profesor: " + name + "- Id: " + id); 
       if (subject != null) {
            subject.show();
       } else{
            
       }
        
    }

    public void editName(String newName){
        String tempName = newName;
        this.name = tempName;
        
    }
    public void editId(String newId){
        String tempId = newId;
        this.id = tempId;

    }

    public void addSubject(Subject subject){
        this.subject = subject;
    }

    public static void main(String[] args) {
        
        Teacher profesor1 = new Teacher("Bryan Baquedano", "Z0996961P");
        profesor1.addSubject(new Subject("Filosofía", "FIL", 3));
        profesor1.show();
    }
}
