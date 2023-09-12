// Final method exercise

class Test3 {
    public static final void show() {
        System.out.println("Hello");
    }
}

class TestCase extends Test3 {
    // We can not override final methods
    // By making the method as final, we can restrict overriding or runtime polymorphism
//    public void show(){}

}

public class FinalMethodPractice {
    public static void main(String[] args) {
        Test3.show();
    }
}
