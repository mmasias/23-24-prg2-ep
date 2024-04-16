public class Asignatura {
    private String nombre;
    private String codigo;
    private int creditos;

    private Examen[] examenes;

    public Asignatura(String nombre, String codigo, int creditos){
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.examenes = new Examen[10];
    }

    public void addExamen(Examen examen){
        for (int i = 0; i < this.examenes.length; i++) {
            if(this.examenes[i] == null){
                this.examenes[i] = examen;
            }
        }
    }
}
