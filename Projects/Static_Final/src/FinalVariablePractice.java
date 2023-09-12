// Final variable exercise

public class FinalVariablePractice {
    // we can initialize the final variable inside block
//    final float PI;
//    {
//        PI=3.14f;
//    }

    // we can initialize the final variable inside the constructor
//    final float PI;
//    FinalPractice(){
//        PI=3.14f;
//    }

    // we can initialize the static final variable inside the static block
    static final float PI;

    static {
        PI = 3.14f;
    }


    public static void main(String[] args) {
        System.out.println(PI);
    }
}
