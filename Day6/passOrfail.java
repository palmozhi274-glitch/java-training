package Day6;

import java.util.Scanner;

class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mark = sc.nextInt();

        if (mark >= 35)
            System.out.println("Pass");
        else
            System.out.println("Fail");
        sc.close();
    }
}
