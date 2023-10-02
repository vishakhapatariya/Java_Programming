// Method Reference

// Reference to Constructor
@FunctionalInterface
interface MyLambdaEx3 {
    public void display(String str);
}

public class MethodReference3 {
    public MethodReference3(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args) {
        MyLambdaEx3 ml3 = MethodReference3::new;
        ml3.display("hello");
    }
}
