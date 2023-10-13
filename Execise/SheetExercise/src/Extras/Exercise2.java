/* 2) Write a program to perform searching on int array. Implement searching method like
Binary search, Linear search and Hashing. Evaluate complexity of all these searching methodologies.
 - Ask user to enter valid array size
 */

package Extras;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter key for searching : ");
        int key = sc.nextInt();
        System.out.println("Found using Binary search");
        binarySearch(arr, key);
        System.out.println("Found using Linear search");
        linearSearch(arr, key);
    }

    public static void binarySearch(int arr[], int key) {

        int first = 0;
        int last = arr.length - 1;

        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element " + key + " is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element not found!");
        }
    }

    public static void linearSearch(int[] arr, int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at index : " + i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Element not found!");
        }
    }
}
