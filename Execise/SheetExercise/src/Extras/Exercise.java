/* 1) Create runtime exception ArrayIsFullException which is thrown when array length is grater than 10
2) Also handle that exception and remove element when above exception is thrown
 */

package Extras;

class ArrayIsFullException extends Exception {
    @Override
    public String toString() {
        return "Array is full!";
    }
}

public class Exercise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        // Printing array
        System.out.println("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

        // Throw exception when array length is greater than 10
        if (arr.length > 10) {
            try {
                throw new ArrayIsFullException();
            } catch (ArrayIsFullException e) {
                System.out.println("Exception : " + e);
            }

            // Remove extra elements
            int[] newArr = new int[10];
            System.out.println("After removing element : ");
            for (int i = 0; i < 10; i++) {
                newArr[i] = arr[i];
                System.out.print(newArr[i] + " ");
            }


        }

    }
}
