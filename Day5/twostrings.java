package Day5;

import java.util.Scanner;

class Input12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First name: ");
        String first = sc.next();

        System.out.print("Last name: ");
        String last = sc.next();

        System.out.println("Full Name: " + first + " " + last);
        sc.close();
    }
}
