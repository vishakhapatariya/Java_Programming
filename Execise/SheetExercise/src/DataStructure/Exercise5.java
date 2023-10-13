/* 5) Write a java program to perform below operations
 - HashMap
 */

package DataStructure;

import java.util.HashMap;

public class Exercise5 {
    public static void main(String[] args) {
        // Creating HashMap
        HashMap<Integer, String> hm = new HashMap<>();

        // Adding elements to HashMap
        hm.put(1, "A");
        hm.put(3, "C");
        hm.put(7, "D");
        hm.put(5, "U");
        hm.put(2, "Z");

        // Printing HashMap elements
        System.out.println(hm);
    }
}
