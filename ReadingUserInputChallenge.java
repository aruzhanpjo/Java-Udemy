import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
        int sum = 0;
        int counter = 1;

        while (counter<=5) {
            System.out.println("Enter number #" + counter + ":");
            String nextN = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextN);
                counter++;
                sum+=number;
            } catch (NumberFormatException noCharacters) {
                System.out.println("Please, no characters. Only numbers!");
            }
        }
        System.out.println("The sum of the numbers is " + sum);
    } finally {
        scanner.close();
    }
    }
}
