// String, StringBuffer and StringBuilder

public class StringBufferBuilderDemo {
    public static void main(String[] args) {
        // String
        String s1 = new String("Hello");
        // StringBuffer
        StringBuffer s2 = new StringBuffer("Hello");
        //StringBuilder
        StringBuilder s3 = new StringBuilder("Hello");

        s1.concat(" World");
        s2.append(" World");
        s3.append(" WOrld");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
