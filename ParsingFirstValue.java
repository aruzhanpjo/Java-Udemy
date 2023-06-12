import java.util.Scanner;

public class ParsingFirstValue {
    public static void main(String[] args) {
        int currentYear = 2023;
        
        /* 
        try {
            ///System.out.println(getInputConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputScanner(currentYear));
        }
        */
        System.out.println(getInputScanner(currentYear));
    }
    
    //uses terminal input
    /*
    public static String getInputConsole(int CurrentYear) {
        String name = System.console().readLine("Wassup. What's your name? ");
        System.out.println("Oh, ok. Hello, " + name + ". That's wassup. ");

        String dob = System.console().readLine("What year were you born? ");
        int age = CurrentYear - Integer.parseInt(dob);
        System.out.println("Gotcha. So you're " + age + " years old. That's wassup. ");
        return "";
    }
    */

    //uses scanner input
    // don't forget to close the scanner & use "try" AND "finally" blocks!
    public static String getInputScanner(int CurrentYear) {
        Scanner scanner = new Scanner(System.in);
        try {

        System.out.println("Heyyy. What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Oh, ok. Hello, " + name + ". That's wassup. ");

        System.out.println("What year were you born? ");
        //String dob = scanner.nextLine();
        //int age = CurrentYear - Integer.parseInt(dob);

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter your year of birth that is bigger than or equal to "
            + (CurrentYear-130));

            /*
            instead put these lines already inside & just call a method

            String dob = scanner.nextLine();
            age = CurrentYear - Integer.parseInt(dob);
             */



            // trying "try & catch" block

            try {
                age = checkData(CurrentYear, scanner.nextLine());
                validDOB = age<0?false:true;
            } catch (NumberFormatException useOfChar) {
                System.out.println("Please, no characters. Only numbers. ");
            }
            
        } while (!validDOB);


        return "Gotcha. So you're " + age + " years old. That's wassup. ";
        } finally {
            scanner.close();
        }


        
    }

    public static int checkData(int currentYear, String dob) {
        int dob1 = Integer.parseInt(dob);
        int minYear = currentYear - 130;

        if ((dob1 < minYear) || (dob1 > currentYear)) {
            return -1;
        }

        return (currentYear - dob1);
    }
}
