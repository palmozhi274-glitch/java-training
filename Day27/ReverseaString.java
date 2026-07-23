package Day27;

import java.util.Scanner;

public class ReverseaString {

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Reversed String: " + reverse(str));

        sc.close();
    }
}
