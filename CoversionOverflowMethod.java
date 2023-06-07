public class CoversionOverflowMethod {
    public static void main (String[] args) {
        convertToCentimeters(6, 0);
        convertToCentimeters(157);
    }

    public static double convertToCentimeters(int height) {
        double a = (double) height * 2.54;
        System.out.println(a);
        return a;
    }

    public static double convertToCentimeters(int height, int inches) {
        inches = (height * 12);
        double a = (double) (inches * 2.54);
        System.out.println(a);
        return a;
    }
    
}
