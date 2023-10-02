// Capture in Lambda Expression
@FunctionalInterface
interface MyLambdaExpre {
    public void display();
}

class UseLambda {
    public void callLambda(MyLambdaExpre ml) {
        ml.display();
    }
}

class MyDemo {
    public void method1() {
        UseLambda ul = new UseLambda();
        ul.callLambda(() -> System.out.println("Hello"));
    }
}

public class LambdaCapture2 {
    public static void main(String[] args) {
        MyDemo m = new MyDemo();
        m.method1();
    }
}
