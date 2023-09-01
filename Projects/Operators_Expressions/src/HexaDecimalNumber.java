// Check whether number is Hexa-Decimal or not

public class HexaDecimalNumber {
    public static void main(String[] args) {
        String str= "B234";
        System.out.println("Binary number : "+str);

        String num=String.valueOf(str);

        boolean isBinary = num.matches("[0-9A-F]+");
        System.out.println(isBinary?"Valid Hexa-Decimal number":"Invalid Hexa-Decimal number");
    }
}
