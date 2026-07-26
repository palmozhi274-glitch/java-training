package Day14;
import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int arr[] = {10,20,30,10,20,40};

        HashSet<Integer> set = new HashSet<>();

        for(int x : arr){

            set.add(x);
        }

        System.out.println(set);
    }
}