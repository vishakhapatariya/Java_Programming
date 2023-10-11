// Comparator Interface
// Sorting an Array in reverse order

package Arrays;

import java.util.Arrays;
import java.util.Comparator;

// Implementing Comparable Interface
class My implements Comparator<Integer> {
    // Overriding compare method
    @Override
    public int compare(Integer i1, Integer i2) {
        if (i1 < i2)
            return 1;
        else if (i1 > i2)
            return -1;
        return 0;
    }
}

public class ComparatorInterfaceDemo {
    public static void main(String[] args) {
        Integer a[] = {3, 2, 1, 9, 8, 5, 6, 7, 4};

        // Sorting an Array in reverse order with our own comparator
        Arrays.sort(a, new My());
        // Printing sorted array
        System.out.println("Reverse Sorted Array : ");
        for (Integer x : a)
            System.out.print(x + " ");
    }
}
