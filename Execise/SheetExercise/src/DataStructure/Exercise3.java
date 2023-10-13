/* 3) Write a java program to use suitable data structure which preserve insertion order
and only store unique values
 */

package DataStructure;

import java.util.LinkedHashSet;

public class Exercise3 {
    public static void main(String[] args) {
        // Creating LinkedHashSet
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        // Adding elements to LinkedHashSet
        lhs.add(1);
        lhs.add(5);
        lhs.add(10);
        lhs.add(2);
        lhs.add(7);
        lhs.add(10);
        lhs.add(15);

        // Printing LinkedHashSet elements
        System.out.println(lhs);
    }
}
