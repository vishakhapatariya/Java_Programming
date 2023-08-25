public class Sum3and5Challenge {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        for (int i = 1; i <= 1000 && count < 5; i++) {
            if ((i % 3 == 0) & (i % 5 == 0)) {
                System.out.println(i + " is divisible by 3 & 5");
                sum += i;
                count++;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
