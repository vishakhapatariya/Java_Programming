// Copy from two files
package FileInputOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class CopyTwoFileTask {
    public static void main(String[] args) throws Exception {
        try (
                FileInputStream fis1 = new FileInputStream("/home/pp-8/Desktop/vishakha/Java/Java_Programming/Projects/IOStreams/src/FileInputOutputStream/File1.txt");
                FileInputStream fis2 = new FileInputStream("/home/pp-8/Desktop/vishakha/Java/Java_Programming/Projects/IOStreams/src/FileInputOutputStream/File2.txt");

                FileOutputStream fos = new FileOutputStream("/home/pp-8/Desktop/vishakha/Java/Java_Programming/Projects/IOStreams/src/FileInputOutputStream/MyNew.txt");
        ) {

            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

            int a;
            while ((a = sis.read()) != -1) {
                fos.write(a);
            }
        }
    }
}
