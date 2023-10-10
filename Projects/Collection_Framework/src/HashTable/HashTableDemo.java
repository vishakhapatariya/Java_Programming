// Hash Table

package HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(5, "E");

        System.out.println("Keys : ");
        Enumeration e = ht.keys();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        System.out.println("Values : ");
        Enumeration e2 = ht.elements();
        while (e2.hasMoreElements()) {
            System.out.println(e2.nextElement());
        }

        System.out.println("Key Values : ");
        Enumeration en1 = ht.keys();
        Enumeration en2 = ht.elements();
        while (en1.hasMoreElements()) {
            System.out.println(en1.nextElement() + " : " + en2.nextElement());
        }

        ht.computeIfAbsent(7, (k) -> "Z" + k);

        System.out.println(ht);


    }
}
