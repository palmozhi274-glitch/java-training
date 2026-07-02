package Day9;

class Employee {
    int id = 101;
    static String company = "ABC Ltd";

    void display() {
        int salary = 25000;
        System.out.println(id);
        System.out.println(company);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}
