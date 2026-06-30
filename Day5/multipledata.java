package Day5;

import java.util.Scanner;

class Input15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int a = sc.nextInt();

        System.out.print("Enter decimal: ");
        double d = sc.nextDouble();

        System.out.print("Enter word: ");
        String s = sc.next();

        System.out.print("Enter character: ");
        char c = sc.next().charAt(0);

        System.out.println("Integer = " + a);
        System.out.println("Double = " + d);
        System.out.println("String = " + s);
        System.out.println("Character = " + c);
        sc.close();
    }
}