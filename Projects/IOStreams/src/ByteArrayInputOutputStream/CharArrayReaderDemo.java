// CharArrayReader

package ByteArrayInputOutputStream;

import java.io.CharArrayReader;

public class CharArrayReaderDemo {
    public static void main(String[] args) throws Exception {
        char b[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        CharArrayReader cr = new CharArrayReader(b);

        // method 1
        int x;
        while ((x = cr.read()) != -1) {
            System.out.print((char) x);
        }

        cr.close();
    }
}
