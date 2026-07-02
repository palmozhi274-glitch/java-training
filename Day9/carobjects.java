package Day9;

class Car {
    String name;

    Car(String n) {
        name = n;
    }

    void display() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW");
        Car c2 = new Car("Audi");
        Car c3 = new Car("Tesla");

        c1.display();
        c2.display();
        c3.display();
    }
}
