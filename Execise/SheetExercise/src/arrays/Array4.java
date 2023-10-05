/* 4)  Write a program to dynamic generate NXN matrix.
Program should ask matrix length from the user.
It should print first row of the matrix, last column of the matrix,
horizontal diagonal top-left to right-bottom,
horizontal diagonal top-right to bottom-left.

1        6        11        17        22
2        7        12        18        23
3        8        13        19        24
4        9        14        20        25
5        10        15        21        26

 - Print first row
  1,6,11,17,22
 - Print second column
  6,7,8,9,10
 - horizontal diagonal bottom-right to top-left
 26,20,13,7,1
 - horizontal diagonal top-right to bottom-left
 22,18,13,9,5*/

package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creating Random class object
        Random ran = new Random();

        // Taking length of matrix from user
        System.out.print("Enter the length of matrix : ");
        int n = sc.nextInt();

        // Declaration of dynamic array
        int arr[][] = new int[n][n];
        int i, j;

        // Creating dynamic array
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = ran.nextInt(100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");


        // Printing First Row of the  Matrix
        System.out.print("First Row of matrix : ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[0][i] + " ");
        }
        System.out.print("\n");

        // Printing Last Column of the Matrix
        System.out.print("Last Column of matrix : ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i][n - 1] + " ");
        }
        System.out.print("\n");

        // Printing Horizontal diagonal Top-left to Bottom right
        System.out.print("Top-left to Bottom right : ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.print("\n");

        // Printing Horizontal diagonal Bottom-right to Top-left
        System.out.print("Bottom-right to Top-left : ");
        for (i = n - 1; i >= 0; i--) {
            for (j = n - 1; j >= 0; j--) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.print("\n");

        // Printing Horizontal diagonal Bottom-left to Top-right
        System.out.print("Bottom-left to Top-right : ");
        for (i = n - 1; i >= 0; i--) {
            for (j = 0; j < n; j++) {
                if (n - i - 1 == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.print("\n");

        // Printing Horizontal diagonal Top-right to Bottom-left
        System.out.print("Top-right to Bottom-left : ");
        for (i = 0; i < n; i++) {
            for (j = n - 1; j >= 0; j--) {
                if (n - j - 1 == i) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
