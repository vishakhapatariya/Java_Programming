// Nested Inner class Exercise

// Outer class
class Outer
{
    static int x=10;
    Inner i=new Inner();

    // nested Inner class
    class Inner
    {
        int y=20;
        public void innerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }

    public void outerDisplay()
    {
        i.innerDisplay();
        System.out.println(i.y);
    }
}

public class NestedInnerClass {
    public static void main(String[] args) {
        // outer class object
        Outer o = new Outer();
        o.outerDisplay();

        // creating an object of inner class
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();
    }
}
