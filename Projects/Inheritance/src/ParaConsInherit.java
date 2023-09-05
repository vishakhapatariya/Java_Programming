// Calling parameterised constructor in Inheritance

class Parent2
{
    Parent2()
    {
        System.out.println("Non-Param of parent");
    }
    Parent2(int x)
    {
        System.out.println("Param of parent "+x);
    }
}

class Child2 extends Parent2
{
    Child2()
    {
        System.out.println("Non-Param of child");
    }
    Child2(int y)
    {
        System.out.println("Param of child");
    }
    Child2(int x,int y)
    {
        super(x);
        System.out.println("2 param of child "+y);
    }
}

public class ParaConsInherit {
    public static void main(String[] args) {
        Child2 c1=new Child2();
        System.out.println("\n");
        Child2 c2=new Child2(20);
        System.out.println("\n");
        Child2 c3=new Child2(10,20);
    }
}
