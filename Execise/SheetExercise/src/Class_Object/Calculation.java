/* 1) A abstract class named ArithmeticOperation with a method "perform" that takes integers
as parameters. Four classes Addition, Subtraction, Multiplication, Division that inherits
ArithmeticOperation class and implements perform method.program should be give options to user
for the various operations and take two integers as a command line arguments. based on the
user choice perform operations and display result.
*/

package Class_Object;

import java.util.Scanner;

abstract class ArithmeticOperation {
    abstract float perform(float a, float b);
}

class Addition extends ArithmeticOperation {
    @Override
    float perform(float a, float b) {
        return a + b;
    }
}

class Subtraction extends ArithmeticOperation {
    @Override
    float perform(float a, float b) {
        return a - b;
    }
}

class Multiplication extends ArithmeticOperation {
    @Override
    float perform(float a, float b) {
        return a * b;
    }
}

class Division extends ArithmeticOperation {
    @Override
    float perform(float a, float b) {
        return a / b;
    }
}

public class Calculation {
    public static void main(String[] args) {
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();

        Scanner sc = new Scanner(System.in);
        System.out.println("Operations");
        System.out.println("1 : Addition");
        System.out.println("2 : Subtraction");
        System.out.println("3 : Multiplication");
        System.out.println("4 : Division");

        int n = 0, count = 0;
        float a = 0, b = 0;

        while (count != 1 && !(n > 0 && n < 5)) {
            try {
                Scanner sc2 = new Scanner(System.in);
                System.out.print("Enter your choice : ");
                n = sc2.nextInt();
                if (n > 0 && n < 5)
                    count = 1;
                else System.out.println("Invalid Input!");

            } catch (Exception e) {
                System.out.println("Invalid Input!");
                count = 0;
            }
        }

        try {
            System.out.print("Enter First Value : ");
            a = sc.nextFloat();
            System.out.print("Enter Second Value : ");
            b = sc.nextFloat();

            switch (n) {
                case 1:
                    System.out.println("Addition is : " + add.perform(a, b));
                    break;
                case 2:
                    System.out.println("Subtraction is : " + sub.perform(a, b));
                    break;
                case 3:
                    System.out.println("Multiplication is : " + mul.perform(a, b));
                    break;
                case 4:
                    System.out.println("Division is : " + div.perform(a, b));
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid Input!");
        }
    }
}
