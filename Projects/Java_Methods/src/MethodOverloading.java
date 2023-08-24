public class MethodOverloading {
    public static void main(String[] args) {
//        int newScore=calculateScore("Vishakha",95);
//        System.out.println("New score is : "+newScore);
//        calculateScore(80);
//        calculateScore();

        System.out.println("New score is "+calculateScore("Vishakha",78));
        System.out.println("New score is "+calculateScore(89));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " ponts");
        return score * 1000;
    }
    public static int calculateScore(int score) {
//        System.out.println("Unknown player scored " + score + " ponts");
//        return score * 1000;
        return calculateScore("Unknown",score);
    }
    public static int calculateScore() {
        System.out.println("No player, no score!");
        return 0;
    }
}
