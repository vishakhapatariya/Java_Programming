/* 1) Create two different package and use methods of one class for one package to another package
2) Use Variable from one class of one package and do any kind of calculation in another package */

package Package.MyPack1;

public class PackageEx1 {
    // Defining two variables in MyPack1 package
    protected int a = 10;
    protected int b = 20;

    // Defining variable and method in MyPack1 package
    protected String name = "Vishakha";

    protected void printName() {
        System.out.println("Name : " + name);
    }
}
