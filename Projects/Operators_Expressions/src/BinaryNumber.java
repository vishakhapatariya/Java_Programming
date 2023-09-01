// Check whether number is binary or not

public class BinaryNumber {
    public static void main(String[] args) {

        int n= 1110101000;
        System.out.println("Binary number : "+n);

        String str=String.valueOf(n);

        boolean isBinary = str.matches("[01]+");
        System.out.println(isBinary?"Valid binary number":"Invalid binary number");
    }
}
