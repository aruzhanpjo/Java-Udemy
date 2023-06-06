public class MethodChallenge {

    public static void main(String[] args) {
        int plPosition = calculateHighScorePosition(1500);
        firstChallenge("Tim", plPosition);
    }
    
    public static void firstChallenge(String plName, int plPosition){
        System.out.println("Player " + plName + " managed to get into position " + plPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int plScore){
        int position = 4;

        if (plScore >= 1000){
            position = 1;
        } else if (plScore >= 500){
            position = 2;
        } else if (plScore >= 100){
            position = 3;
        }
            return position;
    
    }
}
