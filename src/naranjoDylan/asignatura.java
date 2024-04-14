package naranjoDylan;

public class asignatura {
    private String nameasignatura;
    private String id;
    private int credits;

    public asignatura(String nameasignatura, String id, int credits) {
        this.nameasignatura = nameasignatura;
        this.id = id;
        this.credits = credits;
    }

    public void mostrarasignaturas() {
        System.out.println("Asignatura: " + nameasignatura + " - " + id + " - " + credits + " créditos");
    }

    public static void main(String[] args) {
        asignatura asignatura = new asignatura("Programación 2", "PRG2", 6);
        asignatura.mostrarasignaturas();
    }
}
