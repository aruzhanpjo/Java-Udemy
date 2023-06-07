public class TraditionalSwitch {
    public static void main (String[] args) {
        char val = 'D';
        switch (val) {
            case 'A':
                System.out.println("A is Able");
                break;
            case 'B':
                System.out.println("B is Baker");
                break;  
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':   
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
