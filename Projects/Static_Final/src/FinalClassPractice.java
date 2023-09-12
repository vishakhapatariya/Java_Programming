// Final class exercise

final class Test4 {
    public static void show() {
        System.out.println("Hello");
    }
}

// Final class can not be inherited or extended
// Final class is use to restrict method overriding and class inheritance
// It is also use to define constant values

//class MyTest extends Test4{
//}

public class FinalClassPractice {
    public static void main(String[] args) {
        Test4.show();
    }
}
