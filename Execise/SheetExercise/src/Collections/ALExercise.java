/* 1) Write a java program to perform below operations
    o Create two arrayLists, insert 5 records into both.
    o Swap elements
    o Join arraylists into another arraylist. Check how many are duplicate
      elements and how many are distinct.
    o Remove all the duplicate elements  */

package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ALExercise {
    public static void main(String[] args) {
        // Create two arrayLists
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        // insert 5 records into al1
        al1.add(53);
        al1.add(78);
        al1.add(50);
        al1.add(24);
        al1.add(13);

        // insert 5 records into al2
        al2.add(45);
        al2.add(13);
        al2.add(24);
        al2.add(13);
        al2.add(42);

        System.out.println("Before Swapping : ");
        System.out.println("ArrayList 1 : "+al1);
        System.out.println("ArrayList 2 : "+al2);

        // Swapping the elements in ArrayList 1
        Collections.swap(al1,1,3);
        // Swapping the elements in ArrayList 2
        Collections.swap(al2,0,4);

        System.out.println("After Swapping : ");
        System.out.println("ArrayList 1 : "+al1);
        System.out.println("ArrayList 2 : "+al2);

        // Joining ArrayList 2 into ArrayList 1
        al1.addAll(al2);
        System.out.println("\nAfter joining ArrayList 2 elements in ArrayList 1");
        System.out.println("ArrayList 1 : "+al1);

        ArrayList<Integer> newAl1 = new ArrayList<>();
        int duplicate=0;

        // Counting duplicate elements
        for(Integer i:al1){
            if(!newAl1.contains(i)){
                newAl1.add(i);
            }else{
                duplicate++;
            }
        }

        // Counting distinct elements
        long distinct = al1.stream().distinct().count();

        System.out.println("\nThere are "+duplicate+" Duplicate and "+distinct+" Distinct elements in ArrayList 1");

        // Removing Duplicate elements from ArrayList 1
        System.out.println("\nAfter removing Duplicate elements in ArrayList 1\nArrayList 1 : "+newAl1);
    }
}
