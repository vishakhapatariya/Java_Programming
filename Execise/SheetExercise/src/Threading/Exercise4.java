/* 4) Which integer between 1 and 10000 has the largest number of
 divisors, and how many divisors does it have? Write a program
 to find the answers and print out the results using multi threading */

package Threading;

public class Exercise4 {
    public static void main(String[] args) {
        // Number which has maximum divisors
        int maxDivisor = 1;
        // No. of maximum divisors
        int maxDivisorCount = 1;

        for (int i = 2; i <= 10000; i++) {
            // Counting no. of divisors
            int divCount = 0;
            for (int n = 1; n < i; n++) {
                if (i % n == 0) {
                    divCount++;
                }
            }

            // If current divisor count is maximum from maxDivisor count, Change the values
            if (divCount > maxDivisorCount) {
                maxDivisorCount = divCount;
                maxDivisor = i;
            }
        }

        System.out.println("Max divisor " + maxDivisor + " has " + maxDivisorCount + " Divisors");
    }
}
