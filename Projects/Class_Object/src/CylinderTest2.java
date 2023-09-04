// Constructor Exercise

class Cylinder2{
    private double radius;
    private double height;
    public Cylinder2(){
        radius=0;
        height=0;
    }
    public Cylinder2(double r){
        height=1;
        setRadius(r);
    }
    public Cylinder2(double r,double h){
        setDimentions(r,h);
    }
    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double r) {
        if(r>=0)
            radius=r;
        else
            radius=0;
    }

    public void setHeight(double h) {
        if(h>=0)
            height=h;
        else
            height=0;
    }

    public void setDimentions(double r, double h){
        setRadius(r);
        setHeight(h);
    }
}

public class CylinderTest2 {
    public static void main(String[] args) {
        Cylinder2 c1 = new Cylinder2();
        System.out.println("c1 : "+c1.getRadius());
        System.out.println("c1 : "+c1.getHeight());
        Cylinder2 c2 = new Cylinder2(25);
        System.out.println("c2 : "+c2.getRadius());
        System.out.println("c2 : "+c2.getHeight());
        Cylinder2 c3 = new Cylinder2(25,40);
        System.out.println("c3 : "+c3.getRadius());
        System.out.println("c3 : "+c3.getHeight());
    }
}
