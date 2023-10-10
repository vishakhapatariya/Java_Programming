// Arranging elements by Student Roll No. in TreeMap

package TreeMap;

import java.util.TreeMap;

class Student implements Comparable {

    // Attributes of a student
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name, String address) {

        // This keyword refers to current object itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // To print student details
    public String toString() {
        return this.rollno + " " + this.name + " "
                + this.address;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        if (this.rollno < s.rollno)
            return -1;
        else if (this.rollno > s.rollno)
            return 1;
        else {
            if (this.rollno < s.rollno)
                return -1;
            else if (this.rollno > s.rollno)
                return 1;
            else
                return 0;
        }
    }
}

public class TreeMapDemo3 {
    public static void main(String[] args) {
        System.out.println("TreeMap using TreeMap(Comparator) constructor:");

        // Creating an empty TreeMap
        TreeMap<Student, String> tree_map = new TreeMap<Student, String>();

        // Mapping string values to int keys
        tree_map.put(new Student(1, "Vishakha", "london"), "PASS");
        tree_map.put(new Student(3, "Amika", "Rajkot"), "PASS");
        tree_map.put(new Student(2, "Patariya", "jaipur"), "FAIL");

        // Printing the elements of TreeMap
        System.out.print("TreeMap: " + tree_map);
    }
}
