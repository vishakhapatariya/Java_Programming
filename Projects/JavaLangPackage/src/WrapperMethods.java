// Wrapper class methods

public class WrapperMethods {
    public static void main(String args[]){

        // equals() method
        int m1 = 10;
        Integer m2 = m1;
        Integer m3 = 10;

        System.out.println(m2.equals(m1));
        System.out.println(m2.equals(m3));
        System.out.println(m3.equals(m1));

        // valueOf() method
        Integer a = Integer.valueOf(10);
        Integer b = Integer.valueOf("10");

        // Radix in valueOf() method
        Integer i1 = Integer.valueOf("1111",2);
        Integer i2 = Integer.valueOf("550",8);
        Integer i3 = Integer.valueOf("A5",16);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        // CompareTo() method
        System.out.println(i1.compareTo(14));
        System.out.println(i1.compareTo(16));

        // bitCount() method
        System.out.println(Integer.bitCount(i1));

        // xxxValue() method
        int in1 = a.intValue();
        System.out.println(in1);

        // parseXxx() method -> it converts string to primitives
        int x = Integer.parseInt("10");
        Double d = Double.parseDouble("10.5");

        // toString() method
        Integer i4 = Integer.valueOf(10);
        String s1 = i4.toString();
        System.out.println(s1);

        String s2 = Integer.toString(10);
        System.out.println(s2);

        // radix in toString() method
        // Integer and Long classes contains this method
        String s3 = Integer.toString(15,2);
        String s4 = Long.toString(1010011,2);

        // decode() method
        // Hexadecimal
        System.out.println(Integer.decode("0xA7"));  // 167
        System.out.println(Integer.decode("0XA7"));
        // Octal
        Integer a1 = Integer.decode("01010"); // 520
        System.out.println(a1);

        // toBinaryString() method
        System.out.println(Integer.toBinaryString(12));
    }
}
