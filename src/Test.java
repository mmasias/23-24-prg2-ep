class Test {

    private String type;
    private Teacher keeper;
    private Question[] questions;
    private int questionCount;
    private int questionCapacity;

    public Test(String type, Teacher keeper) {
        assert type != null && keeper != null;

        this.type = type;
        this.keeper = keeper;
        this.questionCapacity = 10;
        this.questionCount = 0;
        this.questions = new Question[questionCapacity];

    }

    public Test(String type) {
        this(type, null);
    }

    public Test() {
        this("Prueba", null);
    }

    public void editTyper(String type) {
        assert type != null;

        this.type = type;
    }

    public void editKeeper(Teacher keeper) {
        assert keeper != null;

        this.keeper = keeper;
    }

    public Question[] addQuestion(Question question) {
        assert question != null;

        questions[questionCount] = question;
        questionCount++;

        return questions;
    }

    public String show() {
        String test = "";

        for (int quantityOfQuestions = 0; quantityOfQuestions < questionCount; quantityOfQuestions++) {
            test = test + "\n      " + questions[quantityOfQuestions].show();
        }

        String toPrint = "    Examen: Examen " + type + " / Viilado por prof.: " + keeper.show() +
                test;
        return toPrint;
    }
}
