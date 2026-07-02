package Day9;

class Laptop {
    String brand;
    int price;

    Laptop(String b, int p) {
        brand = b;
        price = p;
    }

    void display() {
        System.out.println(brand + " " + price);
    }

    public static void main(String[] args) {
        Laptop l = new Laptop("Dell", 50000);
        l.display();
    }
}
