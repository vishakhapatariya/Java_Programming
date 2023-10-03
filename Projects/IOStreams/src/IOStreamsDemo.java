import java.io.IOException;

public class IOStreamsDemo {
    public static void main(String[] args) throws IOException {
        /*In Java, 3 streams are created for us automatically.
        All these streams are attached with the console.

        1) System.out: standard output stream
        2) System.in: standard input stream
        3) System.err: standard error stream */

        // System.out
        System.out.println("simple message");

        // System.in is used to take input from user, It can read only one character
        System.out.println("Enter a character or string : ");
        int i=System.in.read();//returns ASCII code of 1st character
        System.out.println((char)i);//will print the character

        // System.err
        System.err.println("error message");
    }
}
