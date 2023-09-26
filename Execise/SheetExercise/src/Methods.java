/* 1) Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:
 - If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine = 0.
 - If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, fine = 15 Hackos x (the number of days late).
 - If the book is returned after the expected return month but still within the same calendar year as the expected return date, the fine = 500 Hackos x (the number of days late)..
 - If the book is returned after the calendar year in which it was expected, there is a fixed fine of  10000 hackos
Input Format
 - The first line contains 3 space-separated integers denoting the respective day, month, and year on which the book was actually returned.
 - The second line contains  space-separated integers denoting the respective day, month, and year on which the book was expected to be returned (due date).
 - Put all on day, month and year. Print message if it's not proper   */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Methods {
    public static void main(String args[]) {
        long fine = 0;
        String dueDay, returnDay;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Due date(xx/yy/zzzz) : ");
        dueDay = sc.nextLine();


        System.out.println("Enter Return date(xx/yy/zzzz) : ");
        returnDay = sc.nextLine();

        int dueYear, returnYear;
        int dueMonth, returnMonth;
        int dueDate, returnDate;

        try {
            dueYear = Integer.parseInt(dueDay.substring(6));
            returnYear = Integer.parseInt(returnDay.substring(6));

            dueMonth = Integer.parseInt(dueDay.substring(3, 5));
            returnMonth = Integer.parseInt(returnDay.substring(3, 5));

            dueDate = Integer.parseInt(dueDay.substring(0, 2));
            returnDate = Integer.parseInt(returnDay.substring(0, 2));


            LocalDate start = LocalDate.of(dueYear, dueMonth, dueDate);
            LocalDate end = LocalDate.of(returnYear, returnMonth, returnDate);
            long days = ChronoUnit.DAYS.between(start, end);

            if (days > 0) {
                if (dueYear < returnYear) {
                    fine = 10000;
                } else if (dueMonth < returnMonth) {
                    fine = days * 50;
                } else {
                    fine = days * 15;
                }
            }

            System.out.println("Fine is : " + fine);
        } catch (Exception e) {
            System.out.println("Invalid Date");
        }
    }
}
