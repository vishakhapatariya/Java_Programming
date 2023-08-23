public class LogicalAND {
    public static void main(String[] args) {

        int topScore = 80;
        if(topScore < 100){
            System.out.println("Top Score is : " + topScore);
        }

        int secondTopScore = 60;
        if(topScore>secondTopScore && topScore<100){
            System.out.println("Second score is : " + secondTopScore);
            System.out.println("TopScore is greater than the SecondScore and less than 100");
        }
    }
}
