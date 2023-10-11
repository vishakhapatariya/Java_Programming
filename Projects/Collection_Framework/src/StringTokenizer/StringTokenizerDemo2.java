// String Tokenizer
// Reading from a txt file, tokens are separated by '=' and '\n'

package StringTokenizer;

import java.io.FileInputStream;
import java.util.StringTokenizer;

public class StringTokenizerDemo2 {
    public static void main(String[] args) throws Exception {
        // Reading data from txt file
        FileInputStream fi = new FileInputStream("src/StringTokenizer/data.txt");

        // Storing data in byte array
        byte[] b = new byte[fi.available()];
        fi.read(b);

        // Converting byte array to String
        String data = new String(b);

        // Creating String Tokenizer, tokens are separated by '='
        StringTokenizer st = new StringTokenizer(data, "=");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        fi.close();
    }
}
