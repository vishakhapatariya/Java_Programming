// Arrays

package Arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int a[] = {2, 3, 4, 5, 6, 7, 8, 1, 9};
        int b[] = {2, 3, 4, 5, 6, 7, 8, 1};

        // Printing Array a
        System.out.print("Array a : ");
        for (int x : a)
            System.out.print(x + " ");

        // Printing Array b
        System.out.print("\nArray b : ");
        for (int x : b)
            System.out.print(x + " ");

        // Comparing Array a and b
        System.out.print("\nComparing a and b : ");
        System.out.println(Arrays.compare(a, b));

        // Copy Array a in Array c
        System.out.print("Copy of a : ");
        int c[] = Arrays.copyOf(a, a.length);
        for (int x : c)
            System.out.print(x + " ");

        // Filling all elements with same value
        Arrays.fill(c, 10);
        System.out.print("\nFilling array c with 10 : ");
        for (int x : c)
            System.out.print(x + " ");

        // Finding mismatch index in two arrays
        System.out.println("\nArray a and b are Mismatch at index : " + Arrays.mismatch(a, b));

        // Sorting an Array
        System.out.print("Sorting array a : ");
        Arrays.sort(a);
        for (int x : a)
            System.out.print(x + " ");

        // Searching an element using BinarySearch
        System.out.println("\nSearching element 2 in sorted array a");
        System.out.print("2 is at index : " + Arrays.binarySearch(a, 2));
    }
}
