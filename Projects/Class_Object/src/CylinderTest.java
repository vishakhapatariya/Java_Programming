// Lid area, Total surface area and Volume of Cylinder

class Cylinder {
    public double radius;
    public double height;

    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double totalSurfaceArea() {
        return 2 * lidArea() + circumference() * height;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double volume() {
        return lidArea() * height;
    }
}

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.height = 10;
        c.radius = 7;
        System.out.println("Lid Area : " + c.lidArea());
        System.out.println("Total Area : " + c.totalSurfaceArea());
        System.out.println("Volume : " + c.volume());
    }
}
