// Method Reference

// Reference to compareTo method of String class
@FunctionalInterface
interface MyLambdaEx4{
    public int display(String str1, String str2);
}

public class MethodReference4 {
    public static void main(String[] args) {
        MyLambdaEx4 ml =String::compareTo;
        System.out.println(ml.display("zello","welcome"));
    }
}
