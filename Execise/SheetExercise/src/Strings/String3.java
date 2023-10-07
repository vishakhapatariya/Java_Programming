// 3) Reverse string without using string builder and buffer

package Strings;

public class String3 {
    public static void main(String[] args) {
        String str = "Hello World!";
        char[] arr = str.toCharArray();
        char[] res = new char[str.length()];

        int i=0;
        for (int j = str.length() - 1; j >= 0; j--) {
            res[i] = arr[j];
            i++;
        }

        System.out.print(res);
    }
}
