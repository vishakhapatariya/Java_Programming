// Copy a file in small letters

package FileInputOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTask {
    public static void main(String[] args) throws Exception {
        try(FileOutputStream fos1 = new FileOutputStream("/home/pp-8/Desktop/vishakha/Java/Java_Programming/Projects/IOStreams/src/FileInputOutputStream/File1.txt");
            FileInputStream fis1 = new FileInputStream("/home/pp-8/Desktop/vishakha/Java/Java_Programming/Projects/IOStreams/src/FileInputOutputStream/File1.txt");
            FileOutputStream fos2 = new FileOutputStream("/home/pp-8/Desktop/vishakha/Java/Java_Programming/Projects/IOStreams/src/FileInputOutputStream/File2.txt");
            FileInputStream fis2 = new FileInputStream("/home/pp-8/Desktop/vishakha/Java/Java_Programming/Projects/IOStreams/src/FileInputOutputStream/File2.txt");
        )
        {

            // Writing in File1
            String str = "MYNAME IS VISHAKHA \nAND THIS IS MY JAVA PROGRAM!";
            fos1.write(str.getBytes());

            // Reading from File1
            byte[] b1 = new byte[fis1.available()];
            fis1.read(b1);
            String str1 = new String(b1);
            System.out.print(str1);

            // Writing in File2
            fos2.write(str1.toLowerCase().getBytes());

            // Reading from File2
            byte[] b2 = new byte[fis2.available()];
            fis2.read(b2);
            String copiedString = new String(b2);
            System.out.print("\n"+copiedString);
        }
    }
}
