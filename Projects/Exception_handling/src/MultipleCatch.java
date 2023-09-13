// Multiple catch block exercise
// Divide by 0 and array out of bound exception

public class MultipleCatch {
    public static void main(String[] args) {
        int A[] = {20, 10, 30, 0, 40};

        try {
            int c = A[0] / A[1];
            System.out.println("Division is : " + c);

            System.out.println(A[5]);
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }

        System.out.println("Finish");
    }
}
