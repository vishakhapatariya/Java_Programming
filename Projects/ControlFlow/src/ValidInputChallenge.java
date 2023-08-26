// Take 5 input from user with validation and print sum.

import java.util.Scanner;

public class ValidInputChallenge {

    public static void main(String[] args) {
        System.out.println(sumOfNumbers());
    }

    public static String sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        double sum = 0, newNum;
        String number;
        do {
            System.out.println("Enter num #" + count + " : ");
            number = scanner.nextLine();
            try {
                newNum = Double.parseDouble(number);
                sum += newNum;
                count++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid Number!");
            }
        } while (count <= 5);

        return "Sum of the 5 numbers = " + sum;
    }
}
