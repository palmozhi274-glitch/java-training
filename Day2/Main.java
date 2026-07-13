package Day2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("hi");
        list.add("hello");

        list.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}
