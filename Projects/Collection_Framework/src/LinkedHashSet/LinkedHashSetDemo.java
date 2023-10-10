// Linked Hash Set

package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(5);

        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("G");
        lhs.add("B");

        Iterator<String> itr = lhs.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
