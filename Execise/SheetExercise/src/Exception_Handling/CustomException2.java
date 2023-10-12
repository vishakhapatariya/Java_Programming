/* 4) Write a java program of custom exception. Whenever user input failed to parse in integer
value or integer value more than 65000 it will throw custom exception with message like
“Invalid Elasticsearch port configuration” with complete stack trace */

package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyCustomException extends Exception {
    @Override
    public String toString() {
        return "Invalid elastic search port configuration";
    }
}

public class CustomException2 {
    public static void myFun() {
        Scanner sc = new Scanner(System.in);
        try {
            int value = sc.nextInt();
            if (value > 65000) {
                throw new MyCustomException();
            }
        } catch (MyCustomException e) {
            System.out.println(e);
            System.out.println("Stack trace");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Failed to parse integer value!");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter less than 65000 value : ");
        myFun();
    }
}
