

public class EnhancedSwitchChallenge {
    public static void main(String[] args) {

        printDayOfTheWeek(0);
        printDayOfTheWeek(4);
        printDayOfTheWeek(9);

    }
    public static void printDayOfTheWeek(int day) {
        String printDay = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(printDay);
    }
    
    
}
