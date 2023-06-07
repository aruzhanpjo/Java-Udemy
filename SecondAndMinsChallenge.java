public class SecondAndMinsChallenge {
    public static void main (String[] args) {

        System.out.println(getDuratioString(70));

    }

    public static String getDuratioString(int sec) {
        if (sec < 0) {
            return "Invalid Value";
        }

        return getDurationString(sec / 60, sec % 60);
    }

    public static String getDurationString(int min, int sec) {
        if (min < 0) {
            return "Invalid Value";
        } else if ((sec < 0) || (sec > 59)) {
            return "Invalid Value";
        } else {
            int hr = min / 60;
            int remainingMin = min % 60;
            return hr + "h " + remainingMin + "m " + sec + "s";
        }

    }
    
}
