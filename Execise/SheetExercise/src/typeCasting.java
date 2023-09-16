// 1) Make example of every kind of typecasting
public class typeCasting {
    public static void main(String[] args) {
        byte myByte = 100;  // -128 to 127
        short myShort = 15000; // -32768 to 32767
        int myInt = 500000;  // -2147483648 to 2147483647
        long myLong = 10000000;  // -9223372036854775808 to 9223372036854775807

        float myFloat = 100.5f;  // 1.4E-45 to 3.4E+38
        double myDouble = 550.9d;  // 4.9E-324 to 1.7E308

        char myChar = 'A';
        boolean myBoolean = true;

        // Byte to short, int, long, float, double, char
        myShort = myByte;
        myInt = myByte;
        myLong = myByte;
        myFloat = myByte;
        myDouble = myByte;
        myChar = (char)myByte;

        // Short to byte, int, long, float, double, char
        myByte = (byte) myShort;
        myInt = myShort;
        myLong = myShort;
        myFloat = myShort;
        myDouble = myShort;
        myChar = (char)myShort;

        // Int to byte, short, long, float, double, char
        myByte = (byte)myInt;
        myShort = (short) myInt;
        myLong = myInt;
        myFloat = myInt;
        myDouble = myInt;
        myChar = (char)myInt;

        // long to byte, short, int, float, double, char
        myByte = (byte)myLong;
        myShort = (short) myLong;
        myInt = (int) myLong;
        myFloat = myLong;
        myDouble = myLong;
        myChar = (char)myLong;

        // float to byte, short, int, long, double, char
        myByte = (byte)myFloat;
        myShort = (short) myFloat;
        myInt = (int) myFloat;
        myLong = (long) myFloat;
        myDouble = myFloat;
        myChar = (char)myFloat;

        // double to byte, short, int, long, float, char
        myByte = (byte)myDouble;
        myShort = (short) myDouble;
        myInt = (int) myDouble;
        myLong = (long) myDouble;
        myFloat = (float) myDouble;
        myChar = (char)myDouble;

        // char to byte, short, int, long, float, double
        myByte = (byte)myChar;
        myShort = (short) myChar;
        myInt = myChar;
        myLong = myChar;
        myFloat = myChar;
        myDouble = myChar;
    }
}
