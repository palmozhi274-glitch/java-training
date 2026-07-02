package Day9;

class Student {
    int roll;
    String name;

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println(roll + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Arun");
        Student s2 = new Student(2, "Bala");

        s1.display();
        s2.display();
    }
}
