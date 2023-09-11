// Static Inner class exercise

class Outer2{
    int x=10;
    static int y=20;

    static class My2{
        public void show(){
            // static inner class can access only static members of outer class
            System.out.println(y);
        }
    }

}
public class StaticInnerClass {
    public static void main(String[] args) {
        // we can create an object of static inner class directly without creating an object of outer class
        Outer2.My2 m = new Outer2.My2();
        m.show();
    }
}
