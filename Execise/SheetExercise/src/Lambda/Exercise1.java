/* 1) Write a java program to perform below operations
  - Read a text file
  - Filter words which length is less than 3.
  - Count number of words and numbers
  - Count number of distinct words and numbers
  - Print word length wise unique count
  - Create any suitable data structures to fulfil this task.  Count number of words which starts with A,B,a,b…zZ
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
 - Reverse all the words and generate character level count. Print all the characters which original count and reverse word characters count are same
2) Making your own interfaces for which lambdas can be used. Your eventual goal is to make a
method called betterString that takes two Strings and a lambda that says whether the first
of the two is “better”.
The method should return that better String; i.e., if the function given by the lambda returns
true, the betterString method should return the first String, otherwise betterString should
return the second String.
Here are two examples of how your code should work when it is finished (the first lambda
example returns whichever of string1 and string2 is longer, and the second lambda example
always returns string1).
 - String string1 = ...;
 - String string2 = ...;
 - String longer = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
 - String first = StringUtils.betterString(string1, string2, (s1, s2) -> true);
Accomplishing all of this requires you to do three things:
 - Define the TwoStringPredicate interface. It will specify a method that takes 2 strings and
 returns a boolean. This interface is normal Java 7 code.
 - Define the static method betterString. That method will take 2 strings and an instance of
 your interface. It returns string1 if the method in interface returns true, string2 otherwise.
 - Call betterString. You can now use lambdas for the 3rd argument, as in the examples above
3) Write a program to perform below operations
 - Create new arrayList, add custom objects of ProminentTrainee class. Class has TraineeId, TraineeName, TraineeAge, TraineeDOB properties
 - Iterate through the arrayList and print it using for loop, foreach loop and lambda expression.
 - Count element of a list using lambda expression
 - Insert element into the array list at the second position
 - Retrieve an element of 3rd index and print it
 - Print element whose TraineeId is 5 with the help of lambda
 - Convert list to set and count total element of set
 - Sort list based on all the four properties. Use lambda expression and functional interface
 - Convert list to map using lambda expression. Keep TraineeId as Map key and ProminentTrainee as a map value
 - Write all the records into plain text files. Record separator should be new line and field separator tab.
 - Read above created file. store all the records as a ProminentPixel and store it in list
Write all the records into binary files and read it back to list.
 */

package Lambda;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
        System.out.println("\nPrinting words with length : ");
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
                // Printing all the words with the length
                System.out.println(s + " : " + s.length());
                s = "";
                flag = false;
            }
        }
        // Print word length wise unique count
        System.out.println("\nPrint word length wise with unique count : ");
        for (HashMap.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Count number of words which starts with A,B,a,b…zZ
        String[] string  = str.split("\\W");
        System.out.println("\nNo. of Words starts with Capital Characters : ");
        // Number starts with A-Z
        for(int i=65;i<=90;i++) {
            int count = 0;
            for(String a : string){
                if(a!="") {
                    char c = a.charAt(0);
                    if (c == i) {
                        count++;
                    }
                }
            }
            System.out.println((char) i +" : "+count);
        }
        // Number starts with a-z
        System.out.println("\nNo. of Words starts with Small Characters : ");
        for(int i=97;i<=122;i++) {
            int count = 0;
            for(String a : string){
                if(a!="") {
                    char c = a.charAt(0);
                    if (c == i) {
                        count++;
                    }
                }
            }
            System.out.println((char) i +" : "+count);
        }

        // Print top N characters which have more words
        System.out.println("----------------------------------------");
        TreeMap<Integer, Character> treeMap = new TreeMap<>();
        System.out.println("No. of words which have the character : ");
        for(int i=97;i<=122;i++) {
            int count = 0;
            for(String a : string){
                String y = Character.valueOf((char)i).toString();
                if(a.contains(y)){
                    count++;
                }
            }
            System.out.println((char) i +" : "+count);
            treeMap.put(count,(char)i);
        }
        //System.out.println(treeMap.descendingMap());

        Set<Map.Entry<Integer, Character> > entrySet
                = treeMap.descendingMap().entrySet();

        // Convert entrySet to Array using toArray method
        Map.Entry<Integer, String>[] entryArray
                = entrySet.toArray(
                new Map.Entry[entrySet.size()]);

        System.out.println("\nTop 5 Characters used in words : ");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(entryArray[i]);
        }

        // Sort it based on number of words and print it in ascending and descending order
        System.out.println("Ascending order : "+treeMap);
        System.out.println("Descending order : "+treeMap.descendingMap());

    }
}
