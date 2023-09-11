// Do's and don't's in interface
interface Tests
{
    final static int X=10;
    public abstract void meth1();
    public abstract void meth2();
    public static void meth3()
    {
        System.out.println("Meth3 of Test");
    }
}

interface Test2 extends Test
{
    void meth4();
}

class MyTests implements Test2
{
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
}
public class InterfaceExercise2 {
    public static void main(String[] args)
    {
        System.out.println(Tests.X);
        Tests.meth3();
        MyTests m = new MyTests();
        m.meth1();
        m.meth2();
    }
}
