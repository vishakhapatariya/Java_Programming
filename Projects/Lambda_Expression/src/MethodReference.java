// Method Reference

// Reference to println method
@FunctionalInterface
interface MyLambdaEx {
    public void display(String str);
}

public class MethodReference {
    public static void main(String[] args) {
        MyLambdaEx ml = System.out::println;
        ml.display("Hello");
    }
}
