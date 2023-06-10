public class ForLoopOne {
    public static void main(String[] args) {
        for (double rate = 7.5; rate <=10; rate+=0.25) {
            double interestAmount = calculateInterest(rate, 100);
            System.out.println("100 at " + rate + "% interest = " + interestAmount);
        }
    }


    public static double calculateInterest (double rate, double dollar) {
        double interest = (dollar * (rate / 100));
        return interest;
    }
}