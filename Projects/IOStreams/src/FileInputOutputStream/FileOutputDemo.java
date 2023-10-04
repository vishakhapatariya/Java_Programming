// FileOutputStream
// Creating a file writing a string into it

package FileInputOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("/home/pp-8/Desktop/" +
                    "vishakha/Java/Java_Programming/Projects/IOStreams/" +
                    "src/FileInputOutputStream/test.txt");

            String str = "My Java Program";

            // Writing one byte at a time
            byte b[] = str.getBytes();
            for (byte x : b) {
                fos.write(x);
            }
            fos.write("\n".getBytes());

            // Writing all the bytes at a time
            fos.write(str.getBytes());
            fos.write("\n".getBytes());

            // Writing with giving offset and lenth
            fos.write(b, 3, str.length() - 3);

            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
