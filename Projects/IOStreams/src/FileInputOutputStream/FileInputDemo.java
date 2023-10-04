// FileInputStream

package FileInputOutputStream;

import java.io.FileInputStream;

public class FileInputDemo {
    public static void main(String[] args) throws Exception {
        try (FileInputStream fis = new FileInputStream("/home/pp-8/Desktop/" +
                "vishakha/Java/Java_Programming/Projects/IOStreams/" +
                "src/FileInputOutputStream/test.txt")) {

            byte[] b = new byte[fis.available()];

            // Method 1
            fis.read(b);
            String s = new String(b);
            System.out.print(s);

            int a;

            // Method 2
            do {
                a = fis.read();
                if (a != -1)
                    System.out.print((char) a);
            } while (a != -1);

            // Method 3
            while ((a = fis.read()) != -1) {
                System.out.print((char) a);
            }
        }
    }
}
