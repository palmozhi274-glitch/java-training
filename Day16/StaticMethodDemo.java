package Day16;

interface Demo {

    static void message() {

        System.out.println("Static Method");
    }
}

public class StaticMethodDemo {

    public static void main(String[] args) {

        Demo.message();
    }
}