// Checked and Unchecked exception

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedUnchecked {
    static void fun1() {
        // Unchecked Exception
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        // Checked Exception
        try {
            FileInputStream fi = new FileInputStream("MyText.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}
