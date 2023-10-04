// FileReader

package FileInputOutputStream;

import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) throws Exception {
        try (FileReader fr = new FileReader("/home/pp-8/Desktop/" +
                "vishakha/Java/Java_Programming/Projects/IOStreams/" +
                "src/FileInputOutputStream/test.txt")) {

            int a;
            while ((a = fr.read()) != -1) {
                System.out.print((char) a);
            }
        }
    }
}
