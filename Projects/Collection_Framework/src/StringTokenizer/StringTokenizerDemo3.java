// String Tokenizer
// Reading from txt file, tokens are separated by ',' and add token into a ArrayList

package StringTokenizer;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenizerDemo3 {
    public static void main(String[] args) throws Exception {
        // Reading data from txt file
        FileInputStream fi = new FileInputStream("src/StringTokenizer/data2.txt");

        // Storing data in byte array
        byte[] b = new byte[fi.available()];
        fi.read(b);

        // Converting byte array to String
        String data = new String(b);

        // Creating String Tokenizer, tokens are separated by ','
        StringTokenizer st = new StringTokenizer(data, ",");
        // Creating ArrayList
        ArrayList<Integer> al = new ArrayList<>();

        while (st.hasMoreTokens()) {
            // Adding token in ArrayList
            al.add(Integer.valueOf(st.nextToken()));
        }
        // Printing ArrayList
        System.out.println(al);

        fi.close();
    }
}
