package Day5;

import java.util.Scanner;

class Input7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.println("Character = " + ch);
        sc.close();
    }
}
