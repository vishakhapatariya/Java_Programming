// Math class

public class MathClass {
    public static void main(String[] args) {

        // Absolute -> Gives positive value
        System.out.print("Absolute : ");
        System.out.println(Math.abs(-123));

        System.out.print("Absolute : ");
        System.out.println(StrictMath.abs(-123));

        // Cube root
        System.out.print("Cube Root : ");
        System.out.println(Math.cbrt(27));

        // Decrement Exact
        System.out.print("Exact Decrement : ");
        //System.out.println(Math.decrementExact(Integer.MIN_VALUE));
        int i = Integer.MIN_VALUE;
        i--;
        System.out.println(i);

        // Exponent value
        System.out.print("Exponent value in Floating point representation : ");
        System.out.println(Math.getExponent(12.456));

        // Floor Division
        System.out.print("Round Division : ");
        System.out.println(Math.floorDiv(50, 9));

        // exponent
        System.out.print("e power x : ");
        System.out.println(Math.exp(1));

        System.out.print("e power x : ");
        System.out.println(StrictMath.exp(1));

        // log base 10
        System.out.print("Log Base 10 : ");
        System.out.println(Math.log10(100));

        // log base e
        System.out.print("Log Base e : ");
        System.out.println(Math.log(100));

        // Maximum of numbers
        System.out.print("Maximum : ");
        System.out.println(Math.max(100, 50));

        // trigonometry tan
        System.out.print("tan : ");
        System.out.println(Math.tan(45 * Math.PI / 180));

        // convert into radians
        System.out.print("Convert to radians : ");
        System.out.println(Math.toRadians(90));

        // Arc tan
        System.out.print("Arc tan : ");
        System.out.println(Math.atan(1));

        // convert into degree
        System.out.print("Convert to degree : ");
        System.out.println(Math.toDegrees(Math.atan(1)));

        // hyperbolic tan
        System.out.print("Convert to degree : ");
        System.out.println(Math.toDegrees(Math.tanh(1)));

        // random
        System.out.print("Random : ");
        System.out.println(Math.random() * 1000);

        // power
        System.out.print("Power : ");
        System.out.println(Math.pow(2, 3));

        // multiply exact
        System.out.print("Exact product : ");
        System.out.println(Math.multiplyExact(200, 300));

        // nextAfter
        System.out.print("Next float value : ");
        System.out.println(Math.nextAfter(12.5, 12));
        System.out.print("Next float value : ");
        System.out.println(Math.nextAfter(12.5, 13));

    }
}
