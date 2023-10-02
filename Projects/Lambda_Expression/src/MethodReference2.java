// Method Expression

// Reference to Static and Non-static(Instance) methods
@FunctionalInterface
interface MyLambdaEx2 {
    public void display(String str);
}

public class MethodReference2 {
    public static void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public void reverse2(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        // Reference to static method
        MyLambdaEx2 ml = MethodReference2::reverse;
        ml.display("Hello");

        // Reference to Instance method
        MethodReference2 mr = new MethodReference2();
        MyLambdaEx2 ml2 = mr::reverse2;
        ml2.display("Hello");
    }
}
