// 1) Create Custom exception which will be thrown when salary is more than 87000

package Exception_Handling;

import java.util.Scanner;

// Custom Exception
class MyException extends Exception {
    @Override
    public String toString() {
        return "Salary is more than 87000!";
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input
        System.out.print("Enter Salary amount less then 87000 : ");
        float salary = sc.nextFloat();

        // Throw a custom Exception and catch that Exception
        try {
            if (salary > 87000) {
                throw new MyException();
            } else {
                System.out.println("Thanks for Response!");
            }
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
