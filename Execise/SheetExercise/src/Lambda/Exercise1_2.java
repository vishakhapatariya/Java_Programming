/* - Ask user for any word input. Provide below statistics of input word
     - Total count of word
    - Unique count of word
    - Print Characters level statistics like total words of a character
 - Reverse all the words and generate character level count. Print all the
 characters which original count and reverse word characters count are same
 */

package Lambda;

import java.util.*;

public class Exercise1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String string = sc.nextLine();


        // Total count of word
        String[] arr = string.split("\\W");
        System.out.println("No. of words in provided string : " + arr.length);

        // Unique count of word
        ArrayList<String> al = new ArrayList<>();
        for (String a : arr) {
            if (!al.contains(a)) {
                al.add(a);
            }
        }
        System.out.println(al.size());

        // Print Characters level statistics like total words of a character
        System.out.println("Total words of a character : ");
        for (int i = 97; i <= 122; i++) {
            int count = 0;
            for (String a : arr) {
                String y = Character.valueOf((char) i).toString();
                if (a.contains(y)) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println((char) i + " : " + count);
            }
        }
    }
}