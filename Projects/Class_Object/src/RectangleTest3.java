// Parameterised and non-parameterised constructors in rectangle class

class Rectangle3 {
    private double length;
    private double breadth;

    public Rectangle3() {
        length = 1;
        breadth = 1;
    }

    public Rectangle3(double l, double b) {
        setLength(l);
        setBreadth(b);
    }

    public Rectangle3(double s) {
        setLength(s);
        setBreadth(s);
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength(double l) {
        if (l >= 0)
            length = l;
        else
            length = 0;
    }

    public void setBreadth(double b) {
        if (b >= 0)
            breadth = b;
        else
            breadth = 0;
    }

    public double area() {
        return getLength() * getBreadth();
    }
}

public class RectangleTest3 {
    public static void main(String[] args) {
        Rectangle3 r1 = new Rectangle3();
        System.out.println("Area : " + r1.area());
        Rectangle3 r2 = new Rectangle3(10, 5);
        System.out.println("Area : " + r2.area());
        Rectangle3 r3 = new Rectangle3(20);
        System.out.println("Area : " + r3.area());
    }
}
