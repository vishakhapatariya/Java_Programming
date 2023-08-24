public class ConvertToCentimeter {
    public static void main(String[] args) {
        System.out.println("60inch is " + convertToCentimeters(68) + " Centimeters");
        System.out.println("5ft 8inch is " + convertToCentimeters(5, 8) + " Centimeters");
    }

    public static double convertToCentimeters(int inch) {
        // 1 inch = 2.54 centimeters
        return inch * 2.54;
    }

    public static double convertToCentimeters(int foot, int inch) {
        // 1 foot = 12 inch
        return convertToCentimeters((foot * 12) + inch);
    }
}
