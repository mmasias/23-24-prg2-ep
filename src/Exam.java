public class Exam {
    private String header;
    private String[] questions;

    public Exam(String header) {
        this.header = header;
        this.questions = new String[3];
    }

    public String header() {
        return this.header;
    }

    public Question[] add(int number, String question) {
        questions[number - 1] = question;
        return null;
    }

    public int number() {
        return this.questions.length;
    }

    public String question() {
        return this.questions.toString();
    }

    public Professor responsable() {
        return null;
    }

    public String showQuestion() {
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Pregunta" + i + " " + questions[i]);
        }
        return null;
    }
}
