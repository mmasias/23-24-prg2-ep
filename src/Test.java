class Test {

    private String type;
    private Teacher keeper;
    private Question[] questions;

    public Test(String type, Teacher keeper){
        assert type != null && keeper != null;

        this.type = type;
        this.keeper = keeper;
    }
    public Test(String type){
        this(type, null);
    }
    public Test(){
        this("Prueba", null);
    }
    public void editTyper(String type){
        assert type != null;

        this.type = type;
    }
    public void editKeeper(Teacher keeper){
        assert keeper != null;

        this.keeper = keeper;
    }
    public Question[] addQuestion(Question[] question){
    }
    public String show()
}
