package Day11;

import java.util.*;

public class Copylist {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(10,20,30);

        List<Integer> list2 = new ArrayList<>(list1);

        System.out.println(list2);
    }
}
