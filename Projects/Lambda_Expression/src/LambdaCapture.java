// Capture in Lambda Expression
@FunctionalInterface
interface MyLambdaExp {
    public void display();
}

class Demo {
    int temp = 10;

    public void method1() {
        int count = 0;
        MyLambdaExp m = () -> {
            int x = 0;
            System.out.println("x : " + x);
            x++;
            System.out.println("Count : " + count);
            System.out.println("Temp : " + (temp++));
        };

        m.display();
    }
}

public class LambdaCapture {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
    }
}
