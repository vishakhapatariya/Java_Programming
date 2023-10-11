// Sorting Integer type Array

package Arrays;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        Integer[] a = {3, 2, 1, 9, 8, 5, 6, 7, 4};

        // Sorting an Integer type Array
        Arrays.sort(a);
        // Printing sorted array
        System.out.println("Sorted Array : ");
        for (Integer x : a)
            System.out.print(x + " ");
    }
}
