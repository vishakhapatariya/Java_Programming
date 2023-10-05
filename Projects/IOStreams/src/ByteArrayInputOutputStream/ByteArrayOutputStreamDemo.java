// ByteArrayOutputStream

package ByteArrayInputOutputStream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        byte b[] = bos.toByteArray();
        for (byte x : b) {
            System.out.print((char) x);
        }

        bos.writeTo(new FileOutputStream("/home/pp-8/Desktop/vishakha/Java/Java_Programming/Projects/IOStreams/src/ByteArrayInputOutputStream/test.txt"));

        bos.close();
    }
}
