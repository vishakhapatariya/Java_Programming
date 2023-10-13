/* 4) Write a java program to perform below operations
 - TreeSet
 */

package DataStructure;

import java.util.TreeSet;

public class Exercise4 {
    public static void main(String[] args) {
        // Creating TreeSet
        TreeSet<Integer> ts = new TreeSet<>();

        // Adding elements to TreeSet
        ts.add(10);
        ts.add(50);
        ts.add(25);
        ts.add(7);
        ts.add(15);
        ts.add(10);

        // Printing TreeSet elements
        System.out.println(ts);
    }
}
