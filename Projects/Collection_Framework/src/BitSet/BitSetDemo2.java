// andNot method in Bitset

package BitSet;

import java.util.BitSet;

public class BitSetDemo2 {
    public static void main(String[] args) {
        BitSet bitset1 = new BitSet();

        bitset1.set(0);
        bitset1.set(1);
        bitset1.set(2);
        bitset1.set(3);
        bitset1.set(4);

        BitSet bitset2 = new BitSet();

        bitset2.set(1);
        bitset2.set(3);
        bitset2.set(5);
        bitset2.set(6);
        bitset2.set(7);

        // print the sets
        System.out.println("bitset1: " + bitset1);
        System.out.println("bitset2: " + bitset2);

        // perform andNot operation between two bitset
        bitset1.andNot(bitset2);
        // print the new bitset1
        System.out.println("result bitset after andNot: " + bitset1);
    }
}
