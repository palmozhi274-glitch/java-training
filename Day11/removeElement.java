package Day11;

import java.util.*;

public class removeElement {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(Integer.valueOf(20));

        System.out.println(list);
    }
}
