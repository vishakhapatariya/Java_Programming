// Hash Map

package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));

        hm.put(4, "E");
        hm.put(5, "F");

        System.out.println(hm);
        System.out.println("Value of 4 : " + hm.get(4));
        System.out.println("Contains key 1 : " + hm.containsKey(1));
        System.out.println("Contains value H : " + hm.containsValue("H"));
        System.out.println("Entry set : " + hm.entrySet());
        System.out.println("isEmpty : " + hm.isEmpty());
        System.out.println("Size : " + hm.size());
    }
}
