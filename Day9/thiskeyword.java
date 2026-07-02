package Day9;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student s = new Student("Kumar");
        s.display();
    }
}
