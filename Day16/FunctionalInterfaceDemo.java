package Day16;

@FunctionalInterface

interface Message {

    void display();
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        Message obj = () -> System.out.println("Welcome to Java 8");

        obj.display();
    }
}