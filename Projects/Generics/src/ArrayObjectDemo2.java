// Creating an Array Object of different type

public class ArrayObjectDemo2 {
    public static void main(String[] args) {
        Object obj[] = new Object[3];

        obj[0] = "Hii";
        obj[1] = "Hello";
        obj[2] = 10;

        String str;
        for (int i = 0; i < 3; i++) {
            // We must have to do type casting and this will cause Runtime error
            str = (String) obj[i];
            System.out.println(str);
        }
    }
}
