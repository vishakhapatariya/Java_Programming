package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {
    public static void main(String args[]) {
        //Creating HashMap
        HashMap<Integer, String> map = new HashMap<>();

        //Put elements in Map
        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");

        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
