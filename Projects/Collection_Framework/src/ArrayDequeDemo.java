// Array Deque

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        // Adding element at last
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        // Adding element at first
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);

        // Printing all the elements
        dq.forEach((x) -> System.out.print(x + " "));

        // Deleting elements from first & last
        System.out.println("\nDeleting : " + dq.pollFirst());
        System.out.println("Deleting : " + dq.pollLast());

        // Printing all the elements after deletion
        System.out.println("After Deleting element");
        dq.forEach((x) -> System.out.print(x + " "));

        // Using iterator()
        System.out.print("\nArrayDeque in order: ");
        Iterator<Integer> iterate = dq.iterator();
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        System.out.print("\nArrayDeque in reverse order: ");
        // Using descendingIterator()
        Iterator<Integer> desIterate = dq.descendingIterator();
        while (desIterate.hasNext()) {
            System.out.print(desIterate.next());
            System.out.print(", ");
        }
    }
}
