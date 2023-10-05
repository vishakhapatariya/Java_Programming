// ByteArrayInputStream

package ByteArrayInputOutputStream;


import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws Exception {
        byte b[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        // method 1
        int x;
        while ((x = bis.read()) != -1) {
            System.out.print((char) x);
        }

        // method 2
        String str = new String(bis.readAllBytes());
        System.out.println(str);

        // Checking whether the  mark is supported or not
        System.out.print(bis.markSupported());

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
