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
        }
    }

    public void edit(String newQuestion) {
        String tempQuestion = newQuestion;
        this.question = tempQuestion;
    }


    public void editOptions(String newQuestion, String[] newOptions) {
        String[] tempOptions = newOptions;
        this.question = newQuestion;
        this.options = tempOptions;
    }

    public static void main(String[] args) {

        Question pregunta1 = new Question("¿Que opinas de la muerte?");
        pregunta1.show();
        
        Question pregunta2 = new Question("¿Quien eres?");
        pregunta2.show();
        pregunta2.edit("¿Quien quieres llegar a ser?");
        pregunta2.show();

        Question pregunta3 = new Question("¿Quién escribió Humano, Demasiado Humano", new String[]{"Nietzsche", "Descartes", "Shoppenhauer", "Kant"});
        pregunta3.editOptions("¿Quién escribió Humano, Demasiado Humano", new String[]{"Nietzsche", "Hume", "Shoppenhauer", "Kant"});
        pregunta3.show();
    }

}