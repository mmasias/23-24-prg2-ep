public class Exam {
    private String header;
    private String[] questions;
    private Professor professor;

    public Exam(String header, Professor professor) {
        this.header = header;
        this.questions = new String[3];
        this.professor = professor;
    }

    public String header() {
        return this.header;
    }

    public void add(int number, String question) {
        questions[number - 1] = question;
    }

    public int number() {
        return this.questions.length;
    }

    public String question() {
        return this.questions.toString();
    }

    public Professor responsable() {
        return this.professor;
    }

    public String showQuestion() {
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Pregunta" + i + " " + questions[i]);
        }
        return null;
    }
}
