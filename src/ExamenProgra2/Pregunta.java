public class Pregunta {
    private String enunciado;
    private String pregunta1;
    private String pregunta2;
    private String pregunta3;
   
    public Pregunta() {
    }

    public Pregunta(String enunciado, String pregunta1, String pregunta2, String pregunta3) {
        this.enunciado = enunciado;
        this.pregunta1 = pregunta1;
        this.pregunta2 = pregunta2;
        this.pregunta3 = pregunta3;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getPregunta1() {
        return pregunta1;
    }

    public void setPregunta1(String pregunta1) {
        this.pregunta1 = pregunta1;
    }

    public String getPregunta2() {
        return pregunta2;
    }

    public void setPregunta2(String pregunta2) {
        this.pregunta2 = pregunta2;
    }

    public String getPregunta3() {
        return pregunta3;
    }

    public void setPregunta3(String pregunta3) {
        this.pregunta3 = pregunta3;
    }
    
    public String mostrarPreguntas(){
        return pregunta1+"\n" + pregunta2 +"\n"+ pregunta3;
    }
    
}
