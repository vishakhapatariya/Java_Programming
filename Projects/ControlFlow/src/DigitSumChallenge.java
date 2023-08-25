public class DigitSumChallenge {
    public static void main(String[] args) {
        int result = (sumDigits(32123));
        System.out.println((result == -1) ? "Invalid Number" : "Sum is " + result);
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int remainder;
        while (number > 0) {
            remainder = number % 10;
            sum += remainder;
            number = number / 10;
        }
        return sum;
    }
}
