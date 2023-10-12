// 3) Make example of every way to handle exception

package Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {
    public static void main(String[] args) {
        try {
            // code that generates Divide by zero exception
            int divideByZero = 5 / 0;

            // code that generates Null Pointer exception
            String s = null;
            System.out.println(s.length());

            // code that generates Number Format exception
            int a = Integer.parseInt("1a");
            System.out.println(a);

            // code that generates Array IndexOut Of Bounds exception
            int[] arr = {0, 1, 2, 3, 4};
            System.out.println(arr[5]);

            // code that generates String Index Out Of Bounds exception
            String str = "Hi";
            System.out.println(str.charAt(2));

            // code that generates File Not Found exception
            FileInputStream fi = new FileInputStream("src/Exception_Handling/Test2.txt");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException : " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception : " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Numer Format Exception : " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
            System.out.println("Exception : " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("FileNot Found Exception : " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
