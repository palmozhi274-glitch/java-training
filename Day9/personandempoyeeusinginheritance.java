package Day9;

class Person {
    void display() {
        System.out.println("Person Details");
    }
}

class Employee extends Person {
    void work() {
        System.out.println("Employee Working");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
        e.work();
    }
}
