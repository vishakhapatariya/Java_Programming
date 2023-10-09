// LinkedList

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> al1 = new LinkedList<>();
        LinkedList<Integer> al2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));

        al1.add(20);
        al1.add(0, 10);
        al1.addAll(al2);
        al1.addAll(1, al2);
        al1.addFirst(3);
        al1.addLast(200);

        System.out.println(al1);

        System.out.println(al1.contains(50));
        System.out.println(al1.contains(25));

        System.out.println(al1.get(5));
        System.out.println(al1.getFirst());
        System.out.println(al1.getLast());

        System.out.println(al1.indexOf(50));
        System.out.println(al1.lastIndexOf(50));

        // Changing the value of index 7
        al1.set(7, 100);
        System.out.println(al1);

        System.out.println("First element : " + al1.element());
        System.out.println("Peek : " + al1.peek());
        System.out.println("Peek First : " + al1.peekFirst());
        System.out.println("Peek Last : " + al1.peekLast());

        // Printing all elements
        // method 1
        System.out.print("Printing all elements");
        System.out.print("\nMethod 1 : ");
        for (int i = 0; i < al1.size(); i++)
            System.out.print(al1.get(i) + " ");

        // method 2
        System.out.print("\nMethod 2 : ");
        for (Integer x : al1)
            System.out.print(x + " ");

        // method 3
        System.out.print("\nMethod 3 : ");
        for (var x : al1)
            System.out.print(x + " ");

        // Iterator
        // method 1
        System.out.print("\nIterator : ");
        Iterator<Integer> it = al1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // Printing elements in descending order
        System.out.print("\nDescending Iterator : ");
        Iterator<Integer> itd = al1.descendingIterator();
        while (itd.hasNext()) {
            System.out.print(itd.next() + " ");
        }

        // method 2
        System.out.print("\nForEach Iterator : ");
        for (Iterator<Integer> it2 = al1.iterator(); it2.hasNext(); ) {
            System.out.print(it2.next() + " ");
        }

        // List Iterator
        System.out.println("\nList Iterator : ");
        ListIterator<Integer> lit = al1.listIterator();
        while (lit.hasNext()) {
            System.out.print("next : ");
            System.out.println(lit.next());
        }

        // Printing all the elements using forEach loop
        // method 1
        System.out.print("Printing elements using forEach loop");
        System.out.print("\nMethod 1 : ");
        al1.forEach(n -> System.out.print(n + " "));

        // method 2
        System.out.println("\nMethod 2 : ");
        al1.forEach(System.out::println);

        // method 3
        System.out.print("Method 3 : ");
        al1.forEach(n -> show(n));
    }

    static void show(int n) {
        if (n > 60) {
            System.out.print(n + " ");
        }
    }
}
