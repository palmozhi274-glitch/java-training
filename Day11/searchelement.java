package Day11;

import java.util.*;

public class searchelement {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40);

        if (list.contains(30))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
