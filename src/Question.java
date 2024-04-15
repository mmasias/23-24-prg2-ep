class Question {

    private int number;
    private String instructions;

    public Question(int number, String instructions) {
        assert number > 0 && instructions != null;

        this.number = number;
        this.instructions = instructions;
    }

    public Question(int number) {
        this(number, "No se han indicado las instrucciones de la actividad");
    }

    public Question(String instructions) {
        this(0, instructions);
    }

    public Question() {
        this(0, "No se han indicado las instrucciones de la actividad");
    }

    public void editNumber(int number) {
        assert number > 0;

        this.number = number;
    }

    public void editInstruccions(String instructions) {
        assert instructions != null;

        this.instructions = instructions;
    }

    public String show() {
        return "Pregunta " + number + ": '" + instructions + "'";
    }
}
