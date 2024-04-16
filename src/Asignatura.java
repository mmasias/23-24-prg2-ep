public class Asignatura {
    private String nombreAsignatura;
    private String codigo;
    private int creditos;

    public Asignatura() {
        this.nombreAsignatura = "";
        this.codigo = "";
        this.creditos = 0;
    }

    public Asignatura(String nombreAsignatura, String codigo, int creditos) {
        assert nombreAsignatura!=null && codigo.length()==4 && creditos >=0;

        this.nombreAsignatura = nombreAsignatura;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public Asignatura(String nombreAsignatura) {
        this(nombreAsignatura,nombreAsignatura.substring(0, 4),0);

    }

    public Asignatura(String nombreAsignatura, String codigo) {
        this.nombreAsignatura = nombreAsignatura;
        this.codigo = codigo;
        this.creditos = 0;
    }

    public void cambiar(String nombreAsignatura, String codigo, int creditos) {
        this.nombreAsignatura = nombreAsignatura;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public void verificarCreditos(int creditos) {
        if (creditos > 0) {
            this.creditos = creditos;
        } else {
            System.out.println("Número de créditos no válido.");
        }
    }

    public void validar() {
        if (nombreAsignatura.isEmpty() || codigo.isEmpty() || creditos < 1) {
            System.out.println("Asignatura no válida, verifique los datos.");
        } else {
            System.out.println("Asignatura válida.");
        }
    }
