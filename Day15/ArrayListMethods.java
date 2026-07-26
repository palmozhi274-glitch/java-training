package Day15;

import java.util.*;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println(list);

        System.out.println("Contains Java : " + list.contains("Java"));

        System.out.println("Index : " + list.indexOf("Python"));

        list.set(1, "JavaScript");

        System.out.println(list);

        list.remove("C++");

        System.out.println(list);

        System.out.println("Size : " + list.size());

        list.clear();

        System.out.println(list);
    }
}