// Creating an object of String class with Object class reference

public class ArrayObjectDemo {
    public static void main(String[] args) {
        Object obj = new String("Hello");
        obj = Integer.valueOf(10);

        // This will give Runtime error Integer class cannot be cast to class String
        String str = (String) obj;
    }
}
