package ExamenParcial;

public class Temas {
    private int numeroTemas;
    private String titulo;

    public Temas(int numeroTemas, String titulo) {
        this.numeroTemas = numeroTemas;
        this.titulo = titulo;
    }

    public int getNumeroTemas() {
        return numeroTemas;
    }

    public void setNumeroTemas(int numeroTemas) {
        this.numeroTemas = numeroTemas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
