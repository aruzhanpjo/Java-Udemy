import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        int min = 0;
        int max = 0;
        int NumLoop = 0;

        boolean valid = false;

        

        while(!valid) {
            System.out.println("Enter a number: ");
            try {
                String number = scanner.nextLine();
                int theNumber = Integer.parseInt(number);
                if ((theNumber>max) || (NumLoop==0)) {
                    max = theNumber;
                } if ((theNumber<min) || (NumLoop==0)) {
                    min = theNumber;
                }
                NumLoop++;
            } catch (NumberFormatException noCharacters) {
                //valid = true;
                break;
            }
            
        }
        System.out.println("The minimum number is " + min + " and the maximum number is " + max);
    } finally {
        scanner.close();
    }
    }
}
