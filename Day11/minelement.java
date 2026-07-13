package Day11;


import java.util.*;

public class minelement{
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 45, 8, 90, 23);

        int min = Collections.min(list);

        System.out.println("Minimum = " + min);
    }
}