 class Teacher {
    private String name;
    private String id;
    private Subject subject;
    private Exam exam;


    public Teacher(String name, String id, Subject subject, Exam exam) {
        this.name = name;
        this.id = id;
        this.exam = exam;
        this.subject = subject;
    }

    public Teacher(String name, String id, Subject subject) {
        this.name = name;
        this.id = id;
        this.subject = subject;
    }

    public Teacher(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void assignSubject(Subject subject) {
        this.subject = subject;
    }

    public void addExam(Exam exam) {
        this.exam = exam;
    }

    public void show() {
        System.out.println("Profesor: " + name + " - " + id);

        if (subject != null) {
            subject.show();
        }

        if (exam != null) {
            exam.show();
        }
    }
}

