// 1) Take firstName,lastName and surName as input from command-line

import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        // Reading Input with scanner
        String firstName, middleName, surName;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name : ");
        firstName = sc.nextLine();
        System.out.println("Enter last name : ");
        middleName = sc.nextLine();
        System.out.println("Enter surname name : ");
        surName = sc.nextLine();

        System.out.println("Hello, "+firstName+ " "+middleName+" "+surName);

    }
}
