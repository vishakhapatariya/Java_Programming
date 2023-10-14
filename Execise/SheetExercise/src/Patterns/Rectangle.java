/*
  n=5
  *****
  *   *
  *   *
  *   *
  *****
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        int n = 0;
        Boolean flag = true;

        while (flag == true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter only Integer value : ");
                n = sc.nextInt();
                flag = false;
            } catch (InputMismatchException e) {
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
