// String Tokenizer

package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {

        // String Separated with '=' and ';'
        String data = "Name=Vishakha;Surname=Patariya;Address=XYZ;City=Rajkot";

        StringTokenizer st = new StringTokenizer(data, "=;");
        System.out.println("Separate with '=' and ';'");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        // String Separated with '=' and '\n'
        String data2 = "Name=Vishakha\nSurname=Patariya\nAddress=XYZ\nCity=Rajkot";

        StringTokenizer st2 = new StringTokenizer(data2, "=");
        System.out.println("\nSeparate with '=' and '\\n'");
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

        // String Separated with '=' and 'space'
        String data3 = "Name=Vishakha Surname=Patariya Address=XYZ City=Rajkot";

        StringTokenizer st3 = new StringTokenizer(data3, "= ");

        System.out.println("\nSeparate with '=' and 'space' ");
        System.out.println("Count of Tokens in String : " + st3.countTokens());
        while (st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());
        }
    }
}
