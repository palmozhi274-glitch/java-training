package Day5;

import java.util.Scanner;

class Input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.println("Hello " + name);
        sc.close();
    }
}
