package Day5;

import java.util.Scanner;

class Input10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        sc.close();
    }
}
