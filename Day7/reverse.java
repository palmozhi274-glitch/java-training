package Day7;

import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        while(n > 0) {
            System.out.print(n % 10);
            n /= 10;
        }

        sc.close();
    }
}
