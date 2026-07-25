package Day12;

public class WrapperDemo {

    public static void main(String[] args) {

        int num = 100;

        Integer obj = num;

        int value = obj;

        System.out.println("Object : " + obj);
        System.out.println("Primitive : " + value);
    }
}