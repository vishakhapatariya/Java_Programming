// Do's and don's in overriding

// Return type doesn't matter in overriding
// Can not override final and static methods
// Can not write the more strict access modifier than super class
class A{}
class B extends A{}

class SuperClass{
    static public A display(){
        System.out.println("Super display");
        return new A();
    }
}

class SubClass extends SuperClass{
    static public B display(){
        System.out.println("Sub Display");
        return new B();
    }
}

public class Overriding5 {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.display();
    }
}
