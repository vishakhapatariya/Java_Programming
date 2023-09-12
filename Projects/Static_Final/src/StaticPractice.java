// Static exercise

class Test{
    static int x=10;
    int y=20;

    // non-static method can access static as well as non-static members
    void show(){
        System.out.println(x+" "+y);
    }

    // static method can access only static members
    static void display(){
        System.out.println(x);
    }
}

public class StaticPractice {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.show();
        // changing the values of x and y in t1 object
        t1.x=50;
        t1.y=100;
        t1.show();

        Test t2 = new Test();
        // x will be changed to 50 because it is a static member, and it is shared by all the objects
        // y will be remained same
        t2.show();
    }
}
