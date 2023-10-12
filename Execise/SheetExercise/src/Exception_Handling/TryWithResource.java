// 2) Make use of Try-With-Resource Statement

package Exception_Handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        // Using Try-With-Resources for FileOutputStream and FileInputStream
        try (FileOutputStream fo = new FileOutputStream("src/Exception_Handling/Test.txt");
             FileInputStream fi = new FileInputStream("src/Exception_Handling/Test.txt")) {

            // Storing a string into file
            String str = "Hello! Good Morning All!";
            fo.write(str.getBytes());

            // Reading a string from the file
            byte[] b = new byte[fi.available()];
            fi.read(b);
            // Converting byte Array to String and printing the result
            String result = new String(b);
            System.out.println(result);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
