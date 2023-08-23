public class RemainderExercise {
    public static void main(String[] args) {

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;

        double myResult = (myFirstValue+mySecondValue) * 100.00d;
        System.out.println("myResult : " + myResult);

        double theRemainder = myResult % 40.00;
        System.out.println("theRemainder : " + theRemainder);

        boolean isRemainderZero = (theRemainder == 0.00) ? true : false;
        System.out.println("isRemainderZero : " + isRemainderZero);
        String remainderResult = isRemainderZero ? "Remainder is zero." : "Reamainder is not zero.";
        System.out.println(remainderResult);
    }
}
