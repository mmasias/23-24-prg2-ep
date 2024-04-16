class Asignatura {

    private String nombre;
    private String codigo;
    private int creditos;

    public Asignatura(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public Asignatura(Asignatura asignatura) {
        this(asignatura.nombre, asignatura.codigo, asignatura.creditos);
    }

    public String mostrar() {
        return "Asignatura: " + nombre + "-" + codigo + "-" + creditos + "créditos";
    }

    public static void main(String[] args) {

        Asignatura programacion;
        programacion = new Asignatura("Programacion 2", "PGR2", "6");
        System.out.println(programacion.mostrar());

    }

}
