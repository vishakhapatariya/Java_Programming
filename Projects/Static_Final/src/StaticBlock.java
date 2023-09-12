// Static block exercise

class Test2{
    static{
        System.out.println("Block1");
    }
    static{
        System.out.println("Block2");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main method");
        Test2 t = new Test2();
    }
    static{
        System.out.println("Main block");
    }
}
