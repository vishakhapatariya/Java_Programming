// Nested try and catch block exercise

public class NestedTryCatch {
    public static void main(String[] args) {
        int A[] = {20, 10, 30, 0, 40};

        try {
            int c = A[0] / A[1];
            System.out.println("Division is : " + c);
            // Nested try block
            try {
                System.out.println(A[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index");
            }
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0");
        }

        System.out.println("Finish");
    }
}
