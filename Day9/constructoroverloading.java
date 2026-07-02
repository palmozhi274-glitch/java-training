package Day9;

class Box {
    Box() {
        System.out.println("Default Constructor");
    }

    Box(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        new Box();
        new Box(10);
    }
}
