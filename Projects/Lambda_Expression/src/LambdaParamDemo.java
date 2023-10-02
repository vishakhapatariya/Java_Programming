// Parameters in Lambda Expression

@FunctionalInterface
interface MyLambdaWithParam {
    public void show(String s);
}

@FunctionalInterface
interface MyLambdaWithParam2 {
    public int display(int x, int y);
}

public class LambdaParamDemo {
    public static void main(String[] args) {
        MyLambdaWithParam m1 = (s) -> {
            System.out.println(s);
        };
        m1.show("Hello");

        MyLambdaWithParam2 m2 = (a, b) -> a + b;   // This will automatically return a+b
        System.out.println(m2.display(20, 20));
    }
}
