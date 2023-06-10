public class ForLoopChallenge {
    public static void main (String[] args) {
        ///System.out.println((isPrime(a)?"":"NOT ")+"prime number");
        int l = 0;
        for (int i=1; i<=1000; i++) {
            if (isPrime(i)) {
                l++;
                System.out.println(i + " is a prime number");
                if (l==50) {
                    System.out.println("Reached 3 prime numbers");
                    break;
                }
            }
        }

    }
    public static boolean isPrime(int a) {
        if ((a) <= 2) {
            return (a==2);
        }

        for (int divisor = 2; divisor <= a/2; divisor++) {
            if (a % divisor == 0) {
                return false;
            }
        }

        return true;
    }
    
}
