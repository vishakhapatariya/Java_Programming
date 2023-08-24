public class MethodChallenge {

    public static void displayHighScorePosition(String name, int score) {
        int position = calculateHighScorePosition(score);
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }

    public static void main(String[] args) {
        displayHighScorePosition("Vishakha", 1500);
        displayHighScorePosition("Amika", 1000);
        displayHighScorePosition("Sakshi", 500);
        displayHighScorePosition("Nilam", 100);
        displayHighScorePosition("Dhruvi", 25);
    }
}
