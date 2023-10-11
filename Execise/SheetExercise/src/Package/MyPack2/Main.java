package Package.MyPack2;

import Package.MyPack1.PackageEx1;

class MyClass extends PackageEx1 {
    public void myMethod() {
        // Accessing variable and method of MyPack1 package
        System.out.println(name);
        printName();
    }

    public int calculate() {
        // Accessing two variables from MyPack1 package and performing Addition
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.myMethod();

        System.out.println("a + b : " + mc.calculate());
    }
}
