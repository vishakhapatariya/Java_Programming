import java.util.InputMismatchException;
import java.util.Scanner;

public class Cross {
    public static void main(String[] args) {

        int n = 1;
        while (n % 2 != 0) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter an Even Integer : ");
                n = sc.nextInt();
            } catch (InputMismatchException e) {
            }
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == j || n - i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
