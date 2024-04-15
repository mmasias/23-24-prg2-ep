public class Professor {
    private String name;
    private String id;

    public Professor(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String name() {
        return this.name;
    }

    public String id() {
        return this.id;
    }

    public void show() {
        System.out.println(this.name + " " + this.id);
    }

    public Subject assign() {
        return null;
    }
}
