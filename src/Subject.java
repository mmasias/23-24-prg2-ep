public class Subject {
    private String name;
    private String code;
    private int credits;

    public Subject(String name, String code, int credits) {
        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    public Subject(String name) {
        this(name, name.substring(0, 4), 6);
    }

    public int setCredits(int credits) {
        this.credits = credits;
        return this.credits;
    }

    public void show() {
        System.out.println(this.name + " - " + this.code + " - " + this.credits);
    }

    public String name() {
        return this.name;
    }

    public String code() {
        return this.code;
    }

}