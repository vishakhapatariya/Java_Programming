// BitSet

package BitSet;

import java.util.BitSet;

public class BitSetDemo {
    public static void main(String[] args) {

        // Creating BitSet 1
        BitSet bs1 = new BitSet();
        bs1.set(0);
        bs1.set(2);
        bs1.set(4);
        bs1.set(6);
        bs1.set(8);

        System.out.println("Bit 1 : " + bs1.get(1));
        System.out.println("BitSet 1 : " + bs1);

        // Creating BitSet 2
        BitSet bs2 = new BitSet();
        bs2.set(0);
        bs2.set(1);
        bs2.set(2);
        bs2.set(3);
        bs2.set(4);
        bs2.set(5);
        bs2.set(7);

        System.out.println("BitSet 2 : " + bs2);

        // Performing AND on Bitset 1
        bs1.and(bs2);
        System.out.println("Performing AND on Bitset 1 : " + bs1);

        // Performing OR on Bitset 1
        bs1.or(bs2);
        System.out.println("Performing OR on Bitset 1 : " + bs1);

        // Performing flip on Bitset 2
        bs2.flip(0, bs2.length());
        System.out.println("Performing flip on Bitset 2 : " + bs2);
    }
}
