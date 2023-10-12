/* 1) Write a java program to perform below operations
  - Read a text file
  - Filter words which length is less than 3.
  - Count number of words and numbers
  - Count number of distinct words and numbers
  - Print word length wise unique count
  - Create any suitable data structures to fulfil this task.  Count number of words
    which starts with A,B,a,b…zZ
     - A->500
     - a->300
     - B->250
     - C->350
     - D->100
     - Z->260
  - Print top N characters which have more words
  - Sort it based on number of words and print it in ascending and descending order
  - Ask user for any word input. Provide below statistics of input word
     - Total count of word
    - Unique count of word
    - Print Characters level statistics like total words of a character
 - Reverse all the words and generate character level count. Print all the characters which
 original count and reverse word characters count are same
 */

package Lambda;

import java.io.FileInputStream;
import java.util.HashMap;

public class Exercise1 {
    public static void main(String[] args) throws Exception {

        FileInputStream fi = new FileInputStream("src/Lambda/MyFile.txt");


        // Read a text file
        byte[] b = new byte[fi.available()];
        fi.read(b);
        String str = new String(b);
        System.out.println(str);


        // Filter words which length is less than 3.
        String w = "";
        System.out.print("\nWords which length is less than 3 : ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                // append this sub string in string w
                w = w + str.charAt(i);
            else {
                // if length of current substring length is less than 3, print the substring
                if (w.length() < 3)
                    System.out.print(w + " ");
                w = "";
            }
        }


        // Count number of words and numbers
        int noOfWords = 0, noOfDigits = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == ' ') || (str.charAt(i) == '\n') || (str.charAt(i) == '\t')) {
                noOfWords++;
            }

            if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
                noOfDigits++;
        }
        System.out.println("\nNo. of Words : " + noOfWords);
        System.out.println("No. of Digits : " + noOfDigits);


        // Count number of distinct words
        int temp, noOfCount = 0;
        String[] words = str.split("\\W");

        for (int i = 0; i < words.length; i++) {
            // Setting count of current word to one
            temp = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    // If word found later in array increment the count variable
                    temp++;
                    words[j] = "";
                }
            }

            // If count of current word is one print it
            if (temp == 1 && words[i] != "") {
                noOfCount++;
                //System.out.println(words[i]);
            }
        }
        System.out.println("No. of distinct words : " + noOfCount);


        // Print word length wise unique count
        String s = "";
        Boolean flag = false;
        HashMap<Integer, String> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == ' ') || (str.charAt(i) == '\n') || (str.charAt(i) == '\t')) {
                flag = true;
            } else {
                s = s + str.charAt(i);
            }
            if (flag == true) {
                hm.put(s.length(), s);
                System.out.println(s + " : " + s.length());
                s = "";
                flag = false;
            }
        }
        // Printing HashMap unique elements
        for (HashMap.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
