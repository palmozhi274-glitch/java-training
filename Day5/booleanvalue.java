package Day5;

import java.util.Scanner;

class Input8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter true or false: ");
        boolean b = sc.nextBoolean();

        System.out.println("Boolean = " + b);
        sc.close();
    }
}
