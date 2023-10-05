// BufferedReader

package Buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws Exception{
        FileReader fis = new FileReader("/home/pp-8/Desktop/vishakha/Java/Java_Programming/Projects/IOStreams/src/FileInputOutputStream/File1.txt");
        BufferedReader bis = new BufferedReader(fis);

        int x;
        while ((x=bis.read())!=-1){
            System.out.print((char) x);
        }

        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.mark(10);
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.reset();
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        System.out.print("\nRemaining string : "+bis.readLine());
        bis.close();
    }
}
