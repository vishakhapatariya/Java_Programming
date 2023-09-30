// 1) Perform metrics multiplication using arrays.

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        int x, y, m, n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows of matrix 1 : ");
        x = sc.nextInt();

        System.out.print("Enter no. of columns of matrix 1 : ");
        y = sc.nextInt();

        System.out.print("Enter no. of rows of matrix 2 : ");
        m = sc.nextInt();

        System.out.print("Enter no. of columns of matrix 2 : ");
        n = sc.nextInt();

        if (x == n && y == m) {
            float arr1[][] = new float[x][y];
            float arr2[][] = new float[m][n];
            float resul[][] = new float[x][n];

            // Taking input of matrix 1
            System.out.println("Enter the elements of Matrix 1 : ");

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    arr1[i][j] = sc.nextFloat();
                }
            }

            // Taking input of matrix 2
            System.out.println("Enter the elements of Matrix 2 : ");

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr2[i][j] = sc.nextFloat();
                }
            }

            // multiplication of matrix
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    resul[i][j] = 0;
                    for (int k = 0; k < y; k++) {
                        resul[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

            // Printing the result matrix
            System.out.println("Matrix : ");
            for (int p = 0; p < x; p++) {
                for (int q = 0; q < x; q++) {
                    System.out.print(resul[p][q] + " ");
                }
                System.out.println("\n");
            }
        } else {
            System.out.println("This matrix can not be multiplied!");
        }
    }
}
