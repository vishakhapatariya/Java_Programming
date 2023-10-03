/* 1) Write a program to generate below output. N=9. Put validation like user input should be odd number. If user entered even number then program should display proper message to the user.
        *           * * * * *
        *         * * * *
        *       * * *
        *    * *
        *  *
        *    * *
        *       * * *
        *         * * * *
        *          * * * * *  */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pattern {
    public static void main(String args[]) {
        int n = 0;
        while (n % 2 == 0) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Odd Integer : ");
                n = sc.nextInt();
            }catch (InputMismatchException e){}
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0) {
                    System.out.print("*");
                }

                if (i <= n / 2) {
                    if (j >= (n / 2) - i) {
                        System.out.print("*".repeat((n / 2) - i + 1));
                        break;
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j < i - (n / 2)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*".repeat(i - (n / 2) + 1));
                        break;
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
