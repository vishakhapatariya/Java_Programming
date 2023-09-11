// Abstract Challenge

// super abstract class
abstract class Shape
{
    abstract public double perimeter();
    abstract public double area();
}

// concrete subclass
class Circle extends Shape
{
    double radius;

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }

}

// concrete subclass
class Rectangle extends Shape
{
    double length;
    double breadth;

    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public double area()
    {
        return length*breadth;
    }

}

public class AbstractChallenge {
    public static void main(String[] args)
    {
        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=5;

        Shape s=r;

        System.out.println("Area of rectangle : "+s.area());
        System.out.println("Perimeter of rectangle : "+s.perimeter());

        Circle c = new Circle();
        c.radius = 10;
        System.out.println("Area of circle : "+c.area());
        System.out.println("Perimeter of circle : "+c.perimeter());
    }
}
