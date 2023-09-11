// Interface Exercise

interface Test{
    void meth1();
    void meth2();
}

// class implements interface
class MyTest implements Test{
    public void meth1() {
        System.out.println("Meth1");
    }
    public void meth2() {
        System.out.println("Meth2");
    }
    public void meth3(){
        System.out.println("Meth3");
    }
}

public class InterfacePractice {
    public static void main(String[] args) {
        Test t = new MyTest();
        t.meth1();
        t.meth2();
    }
}
