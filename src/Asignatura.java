class Asignatura {
    private String nombre;
    private String nomenglatura;
    private int creditos;
    private Examen examen;

    public Asignatura(String nombre, String nomenglatura, int creditos){
        this.nombre=nombre;
        this.nomenglatura=nomenglatura;
        this.creditos=creditos;
    }

    public void establecerExamen(Examen examen){
        this.examen=examen;
    }

    public Examen obtenerExamen(){
        return examen;
    }

    public String mostrarDatos(){
        return "Asignatura: "+nombre+"-"+nomenglatura+"-"+creditos+"creditos";
    }


}
