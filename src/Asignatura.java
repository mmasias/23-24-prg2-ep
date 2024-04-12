public class Asignatura {
    
    String nombre;
    int creditos;
    String acronimo;

    public Asignatura(String nombre, int creditos){
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public Asignatura(String nombre, int creditos, String acronimo){
        this.nombre = nombre;
        this.creditos = creditos;
        this.acronimo = acronimo;
    }

    public void mostrarAsignatura(){
        System.out.println("- Nombre: " + nombre);
        System.out.println("- Creditos: " + creditos);
        System.out.println("- Acronimo: " + acronimo);
    }


}
