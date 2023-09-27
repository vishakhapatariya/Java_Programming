// Float class methods

public class FloatWrapper {
    public static void main(String[] args) {
        // equals() method
        float a = 12.5f;
        Float b = 12.5f;
        System.out.println(b.equals(a));

        // isInfinite() method
        Float c = 13.5f / 0;
        System.out.println(c.isInfinite());
        // static method
        System.out.println(c == Float.POSITIVE_INFINITY);
        c = -12.5f / 0;
        System.out.println(c == Float.NEGATIVE_INFINITY);

        // isNaN() method
        Float d = (float) Math.sqrt(-1);
        System.out.println(d.isNaN());
        // static method
        System.out.println(d != Float.NaN);
        System.out.println(Float.NaN != Float.NaN);
    }
}
