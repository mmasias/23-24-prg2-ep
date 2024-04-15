public class Main {
    public static void main(String[] args) {
    Profesor profesor1=new Profesor("Manuel Masias", "888777XY");
    Asignatura a=new Asignatura("programacion2", "PRG2", 6, profesor1);
    Preguntas preguntas=new Preguntas("1:Vista publica de clases\n2:Vista publica de objetos\n3:Vista privada de clases");
    Profesor vigilante=new Profesor("Loyda Alas", "82188864x");
    Examen examen=new Examen(vigilante, a, preguntas, "0.6", "12/4/2024");
    examen.mostrarInformacion();
    }
    
   

    
}
