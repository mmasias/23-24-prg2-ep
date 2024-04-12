class Teacher{

    private String name;
    private String id;

    public Teacher(String name, String id){
        assert name!=null && id!=null;

        this.name = name;
        this.id = id;
    }
    public Teacher(String name){
        this(name, name.substring(0,2) + " XXXXXXX");
    }
    public Teacher(){
        this("Teacher", "Ids missing");
    }
    public void editName(String name){
        assert name!=null;

        this.name = name;
    }
    public void editId(String id){
        assert id!=null;

        this.id = id;
    }
    public String show(){
        return "Nombre del profesor: " + name +  " - " + id;
    }
}