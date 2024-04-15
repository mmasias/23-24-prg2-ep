class Examen {
    private String tipo;
    private Profesor profesor;

    public Examen(String tipo, Profesor profesor){
        this.tipo=tipo;
        this.profesor=profesor;
    }

    public Examen(String tipo){
        this.tipo=tipo;
    }

    public void establecerProfesor(Profesor profesor){
        this.profesor=profesor;
    }

    public void mostrarExamen(){
        String datos="Examen: "+tipo;
        if(profesor!=null){
            datos="/Vigilado por Profª.: "+profesor.mostrarDatos();
        }
        return datos;
    }
}
