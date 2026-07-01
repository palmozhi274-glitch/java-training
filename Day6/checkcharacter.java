package Day6;

import java.util.Scanner;

class UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase");
        else
            System.out.println("Lowercase");
        sc.close();
    }
}
