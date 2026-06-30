package Day5;

import java.util.Scanner;

class Input9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double avg = (a + b + c) / 3.0;

        System.out.println("Average = " + avg);
        sc.close();
    }
}
