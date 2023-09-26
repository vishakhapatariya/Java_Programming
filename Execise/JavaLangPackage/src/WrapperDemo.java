// Wrapper Classes
// Creating an object of wrapper classes

public class WrapperDemo {
    public static void main(String[] args) {
        // Integer
        // Integer i = new Integer(10);  --> 'Integer(int)' is deprecated and marked for removal
        Integer i1 = Integer.valueOf(10);
        Integer i2 = 20;

        // Byte
        Byte b1 = 25;
        Byte b2 = Byte.valueOf("25");
        byte bb=30;
        Byte b3 = Byte.valueOf(bb);

        // Short
        Short s1 = 23;
        Short s2 = Short.valueOf("123");

        // Long
        Long l1 = Long.valueOf("12345");
        Long l2 = 12345L;

        // Float
        Float f1 = 12.5f;
        Float f2 = Float.valueOf("12.5");

        // Double
        Double d1 = Double.valueOf(123.45);
        Double d2 = 34.67;

        // Character
        Character c1 = Character.valueOf('A');
        Character c2 = 'A';

        // Boolean
        Boolean bl1 = Boolean.valueOf(true);
        Boolean bl2 = Boolean.valueOf("true");
        Boolean bl3 = true;
    }
}
