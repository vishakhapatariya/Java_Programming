// FileWriter

package FileInputOutputStream;

import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) throws Exception {
        try (FileWriter fw = new FileWriter("/home/pp-8/Desktop/" +
                "vishakha/Java/Java_Programming/Projects/IOStreams/" +
                "src/FileInputOutputStream/test2.txt")) {

            String s = "My File Reader Program";

            // method 1
            fw.write(s);

            // Method 2
            byte[] b = s.getBytes();
            for (byte x : b) {
                fw.write(x);
            }
        }
    }
}
