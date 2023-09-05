// Inheritance
// Count cylinder volume with using super class method

// Base Class
class Circle{
    public double radius;
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}

// Derived Class
class Cylinder extends Circle{
    public double height;
    public double volume(){
        // Calling base class method
        return area()*height;
    }
}

public class CircleMain {
    public static void main(String[] args) {
        // Creating the object of derived class
        Cylinder c = new Cylinder();
        c.radius = 10;
        c.height=15;
        System.out.println("Area of circle : "+c.area());
        System.out.println("Volume of cylinder : "+c.volume());
    }
}
