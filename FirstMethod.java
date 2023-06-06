public class FirstMethod {
    public static void main (String[] args) {
        myFirstMethod(true, 10_000, 8, 100);
    }
    
    public static void myFirstMethod(boolean gameOver, int score, int lvlCompleted, int bonus){
        if (gameOver) {
            int finalScore = score + (lvlCompleted * bonus);
            System.out.println("the final score is " + finalScore);
         }
         
    }

}
