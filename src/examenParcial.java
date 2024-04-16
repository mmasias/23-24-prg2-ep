class Teacher {

    public Teacher (String name, String id){

        Teacher mMasias = new Teacher("Manuel Masías", "666999XY");
        Teacher lAlas = new Teacher("Loyda Alas", "433452A");
    }

}

class Subject {

    public Subject (String name, String id, int credits, Teacher teacher){

        Subject progra2 = new Subject("Programación 2","PRG2", 6, mMasias);
    }
}

class Test{

    public Test (String testType, Teacher surveyTeacher, int questions){

        Test test1 = new Test("Parcial", lAlas, 3)
    }
}