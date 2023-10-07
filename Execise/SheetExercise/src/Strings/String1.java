// 1) Change charcter at 5th position of string using string builder and buffer.

package Strings;

public class String1 {
    public static void main(String[] args) {

        // Replacing an element of Index 5 , using String Builder
        StringBuilder stringBuilder = new StringBuilder("Vishasha Patariya");
        stringBuilder.replace(5,6,"k");
        System.out.println(stringBuilder);

        // Replacing an element of Index 5 , using String Buffer
        StringBuffer stringBuffer =  new StringBuffer("Vishasha Patariya");
        stringBuffer.replace(5,6,"k");
        System.out.println(stringBuffer);

    }
}
