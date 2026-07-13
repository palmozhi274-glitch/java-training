package Day11;

import java.util.*;

public class Countevennum {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,5,8,11,14);

        int count = 0;

        for(int x : list)
            if(x % 2 == 0)
                count++;

        System.out.println("Even Count = " + count);
    }
}