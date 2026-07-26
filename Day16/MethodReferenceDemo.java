package Day16;

interface Print {

    void display();
}

public class MethodReferenceDemo {

    public static void show() {

        System.out.println("Method Reference");
    }

    public static void main(String[] args) {

        Print obj = MethodReferenceDemo::show;

        obj.display();
    }
}