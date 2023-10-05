// CharArrayWriter

package ByteArrayInputOutputStream;

import java.io.CharArrayWriter;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter cw = new CharArrayWriter();

        cw.write('a');
        cw.write('b');
        cw.write('c');
        cw.write('d');

        char str[] = cw.toCharArray();
        System.out.print(str);
    }
}
