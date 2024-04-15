public class Professor {
    private String name;
    private String id;
    private Subject subject;

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

    public void assign(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return this.subject;
    }
}
