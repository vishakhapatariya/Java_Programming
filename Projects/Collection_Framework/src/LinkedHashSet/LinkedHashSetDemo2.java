package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo2 {
    public static void main(String args[]) {
        //Creating HashSet and adding elements
        LinkedHashSet<String> set = new LinkedHashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        // Iterating all the values
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // since the element "Four" is present, therefore, the method remove() returns true
        System.out.println("Removing Four : " + set.remove("Four"));
        // since the element "Six" is present, therefore, the method remove() returns false
        System.out.println("Removing Six : " + set.remove("Six"));
        System.out.println(set);
    }
}
