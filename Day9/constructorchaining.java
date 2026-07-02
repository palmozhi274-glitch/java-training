package Day9;

class Test {
    Test() {
        this(100);
        System.out.println("Default Constructor");
    }

    Test(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        new Test();
    }
}
