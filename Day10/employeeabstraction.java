package Day10;

abstract class Employee {
    abstract void work();
}

class Developer extends Employee {
    void work() {
        System.out.println("Coding");
    }
}

public class employeeabstraction {
    public static void main(String[] args) {
        Employee e = new Developer();
        e.work();
    }
}
