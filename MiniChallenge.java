public class MiniChallenge {
    public static void main(String[] args) {
        double a = 20.00;
        double b = 80.00;
        double c = (a + b) * 100.00;
        double d = c % 40.00;
        boolean e = (d==0) ? true : false;
        if (e==true) {
            System.out.println("there is no remainder");
        }
    }
}