/* 2) Write a java program to perform below operation on a file
 o Creation of a new file
 o Opening an existing file
 o Reading from file
 o Writing to a file
 o Moving to a specific location in a file
 o Closing a file
 */

package FilesIO.Exercise2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Operations {
    public static void main(String[] args) throws Exception{
        // Creation of a new file
        FileOutputStream fo = new FileOutputStream("src/FilesIO/Exercise2/Demo.txt");

        // Writing to a file
        String str = "Hello! \nGood Morning! \nI'm Vishakha \nBye!";
        fo.write(str.getBytes());

        // Opening an existing file
        FileInputStream fi = new FileInputStream("src/FilesIO/Exercise2/Demo.txt");

        // Reading from a file
        byte[] b = new byte[fi.available()];
        fi.read(b);
        String s = new String(b);
        System.out.println(s);

        // Moving to a specific location in a file
        String line1 = Files.readAllLines(Path.of("src/FilesIO/Exercise2/Demo.txt")).get(2);
        System.out.println("Text on line 3 : "+line1);

        // Closing a file
        fi.close();
        fo.close();
    }
}
