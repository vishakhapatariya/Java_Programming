// BufferedInputStream

package Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("/home/pp-8/Desktop/vishakha/Java/Java_Programming/Projects/IOStreams/src/FileInputOutputStream/File1.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

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
        bis.close();
    }
}
