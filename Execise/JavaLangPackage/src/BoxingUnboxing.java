// Boxing, Unboxing, Autoboxing and autoUnboxing

public class BoxingUnboxing {
    public static void main(String[] args) {

        // Boxing
        int i1 = 10;
        Integer i2 = Integer.valueOf(i1);

        // Autoboxing
        Integer i3 = i1;

        // Unboxing
        Integer i4 = Integer.valueOf(123);
        int i5 = i4.intValue();

        // AutoUnboxing
        int i6 = i4;
    }
}
