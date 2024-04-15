public class Question{

    private String question;
    private String[] options;

    public Question(String question){
        this.question = question;
        this.options = new String[0];
    }

    public Question(String question, String[] options){
        this.question = question;
        this.options = options;
    }

    public void show() {
        System.out.println("Pregunta: " + question);
        
        if (options.length > 0) {
            System.out.println("Opciones:");
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
        } else {
            System.out.println("No hay opciones disponibles.");
        }
    }

    public void edit(String newQuestion) {
        String tempQuestion = newQuestion;
        this.question = tempQuestion;
    }


    public void editOptions(String question, String[] options){}

}