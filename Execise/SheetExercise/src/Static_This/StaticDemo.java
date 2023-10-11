/* 2) Make static method and also use variable from that same class in that method
and execute that method ,also call that method from another class's method.
 */

package Static_This;

class MyClass {
    static int a = 10;
    static int b = 20;

    // Method for Add two Integers
    public static void Addition() {
        System.out.println(a + b);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        System.out.print("Addition : ");
        // Calling static method from another class using Class name
        MyClass.Addition();
    }
}
