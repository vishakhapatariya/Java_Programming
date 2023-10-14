//n=5
//*****
// ****
//  ***
//   **
//    *

package Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer : ");
        int n = sc.nextInt();
        int x = n;
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(x));
            x--;
        }
    }
}
