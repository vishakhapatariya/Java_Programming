// Abstraction

//super abstract class
abstract class Super
{
    Super()
    {
        System.out.println("Super constructor");
    }
    void meth1()
    {
        System.out.println("meth1 of super");
    }
    abstract void meth2();
}
//concrete class
class sub extends Super
{
    void meth2()
    {
        System.out.println("meth2 of sub");
    }
}
class test
{
    public static void main(String[] args)
    {
        Super s1; // reference of abstract is allowed
        sub s2 =new sub(); // object of subclass
        s2.meth1();
        s2.meth2();
    }
}