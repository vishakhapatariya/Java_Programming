package HashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo2 {
    public static void main(String args[]) {
        Hashtable<Integer, String> student = new Hashtable<>();
        student.put(Integer.valueOf(101), "Emma");
        student.put(Integer.valueOf(102), "Adele");
        student.put(Integer.valueOf(103), "Aria");
        student.put(Integer.valueOf(104), "Ally");

        Set dataset = student.entrySet();

        Iterator iterate = dataset.iterator();
        while (iterate.hasNext()) {
            Map.Entry map = (Map.Entry) iterate.next();
            System.out.println(map.getKey() + " : " + map.getValue());
        }
    }
}
