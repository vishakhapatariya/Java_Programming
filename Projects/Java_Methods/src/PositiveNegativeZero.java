public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-2);
        checkNumber(0);
        checkNumber(10);
    }

    private static void checkNumber(int num) {
//        if (num < 0) {
//            System.out.println("Number is less than 0.");
//        } else if (num > 0) {
//            System.out.println("Number is greater than 0.");
//        } else {
//            System.out.println("Number is equal to 0.");
//        }

        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(num + " is " + result);
    }
}
