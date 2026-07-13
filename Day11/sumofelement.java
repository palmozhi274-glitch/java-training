package Day11;

import java.util.*;

public class sumofelement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);

        int sum = 0;

        for (int x : list)
            sum += x;

        System.out.println("Sum = " + sum);
    }
}
