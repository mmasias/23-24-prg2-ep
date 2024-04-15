class Subject {

    private String name;
    private String code;
    private int credits;
    private Teacher teacher;
    private Test test;

    public Subject(String name, String code, int credits) {
        assert name != null && code.length() == 4 && credits >= 0;

        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    public Subject(String name, String code) {
        this(name, code, 0);
    }

    public Subject(String name) {
        this(name, name.substring(0, 3).toUpperCase(), 0);
    }

    public Subject() {
        this("Subject", "EDIT", 0);
    }

    public void editName(String name) {
        assert name != null;

        this.name = name;
    }

    public void editCode(String code) {
        assert code.length() == 4;

        this.code = code.toUpperCase();
    }

    public void editCredits(int credits) {
        assert credits >= 0;

        this.credits = credits;
    }

    public Teacher addTeacher(Teacher teacher) {
        assert teacher != null;

        this.teacher = teacher;
        return teacher;
    }

    public Test addTest(Test test) {
        assert test != null;

        this.test = test;
        return test;
    }

    public String show() {
        return "Asignatura: " + name + " - " + code + " - " + credits + " creditos";
    }
}
