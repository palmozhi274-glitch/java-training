package Day9;

class College {
    void collegeName() {
        System.out.println("ABC College");
    }
}

class Student extends College {
    void studentName() {
        System.out.println("Rahul");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.collegeName();
        s.studentName();
    }
}
