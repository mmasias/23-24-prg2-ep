public class Profesor {

    private String nombre;
    private String id;
    private String tipoId;

    private Asignatura[] asignaturas;

    public Profesor(String nombre, String id, String tipoId){
        this.nombre = nombre;
        this.id = id;
        this.tipoId = tipoId;
        this.asignaturas = new Asignatura[10];
    }

    public void addAsignatura(Asignatura asignatura) {
        for (int i = 0; i < asignaturas.length; i++) {
            if  (asignaturas[i] == null) {
                asignaturas[i] = asignatura;
            }
        }
    }
}
