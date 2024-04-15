public class Examen {
    
    String TipoExamen;
    String Subtituto;
    String DNI;
    int preguntas;
    
    Examen(String TipoExamen, String Subtituto, String DNI, int preguntas){
        
        this.TipoExamen=TipoExamen;
        this.Subtituto=Subtituto;
        this.DNI=DNI;
        this.preguntas=preguntas;
        
    }

    public static void main(String[] args) {
        
        Examen examen = new Examen("Examen parcial", "Loyda Alas", "433452A", 3);
        
    }
    
}
