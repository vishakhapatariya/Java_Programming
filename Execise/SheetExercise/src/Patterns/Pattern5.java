//n=5
//    *
//   ***
//  *****
// *******
//*********

package Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer : ");
        int n = sc.nextInt();
        int x = n;
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(x - 1));
            System.out.println("*".repeat(i * 2 + 1));
            x--;
        }
    }
}
