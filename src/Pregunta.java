public class Pregunta {
    private String titulo;
    private String enunciado;

    public Pregunta(String titulo, String enunciado) {
        this.titulo = titulo;
        this.enunciado = enunciado;
    }

    public void modificarTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void modificarEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String obtenerEnunciado() {
        return this.enunciado;
    }

    public String obtenerTitulo() {
        return this.titulo;
    }
}