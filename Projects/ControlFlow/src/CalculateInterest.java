public class CalculateInterest {
    public static void main(String[] args) {
        for (double rate=2.0;rate<=5.0;rate++){
            System.out.println("10,000 at " + rate + "% interest is = "+calculateInterest(10000.0,rate));
        }
        for (double i=7.5;i<=10.0;i+=0.25){
            double interestAmount = calculateInterest(100.0,i);
            if(interestAmount>8.5){
                break;
            }
            System.out.println("$100 at " + i + "% interest is = $"+interestAmount);
        }
    }
    public static double calculateInterest(double amount,double interestRate) {
        return (amount*(interestRate/100));
    }
}
