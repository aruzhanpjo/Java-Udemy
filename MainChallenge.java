public class MainChallenge {
    public static void main (String[] args) {
        int score = 10_000;
        int lvlCompleted = 8;
        int bonus = 200;
        boolean gameOver = true;
         if (gameOver) {
            int finalScore = score + (lvlCompleted * bonus);
            System.out.println("the final score is " + finalScore);
         }

    }
    
}
