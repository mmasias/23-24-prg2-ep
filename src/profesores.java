public class profesores {
    private String nameProfesores;
    private String nie;

    public profesores(String nameProfesores, String nie) {
        this.nameProfesores = nameProfesores;
        this.nie = nie;
    }

    public void mostrarProfesor() {
        System.out.println("Nombre del profesor: " + nameProfesores + " - NIE " + nie);
    }

    public static void main(String[] args) {
        profesores profesor1 = new profesores("Manuel Masias", "666999XY");
        profesor1.mostrarProfesor();
    }
}
