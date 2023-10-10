// Tree Map

package TreeMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));

        tm.put(4, "E");
        tm.put(5, "F");

        Entry<Integer, String> e = tm.firstEntry();
        System.out.print("First entry : ");
        System.out.println(e.getKey() + " " + e.getValue());

        System.out.println(tm);
        System.out.println("Ceiling entry of 4 : " + tm.ceilingEntry(4));
        System.out.println("Value of 3 : " + tm.get(3));
        System.out.println("Contains key 2 : " + tm.containsKey(2));
        System.out.println("Contains value G : " + tm.containsValue("G"));
    }
}
