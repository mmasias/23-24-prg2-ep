package examenParcial;

public class Asignatura {
    
    private String asignatura;
    private String codigo;
    private int creditos;

    public Asignatura(String asignatura, String codigo, int creditos) {
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public String mostrarAsignatura(){
        return "Asignatura: " + asignatura + " - " + codigo + " - " + creditos + " créditos"; 
    }
}
