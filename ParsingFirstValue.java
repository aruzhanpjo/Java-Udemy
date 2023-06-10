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
        String dob = scanner.nextLine();
        int age = CurrentYear - Integer.parseInt(dob);
        return "Gotcha. So you're " + age + " years old. That's wassup. ";
        } finally {
            scanner.close();
        }
        
    }
}
