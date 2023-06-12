public class NestedLoopPrint {
    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);
        printSquareStar(10);
        printSquareStar(2);
    }
    public static void printSquareStar(int number) {
        if (number<5) {
            System.out.println("Invalid Value");
        } else {
            //int rowCount = number;
            //int columnCount = number;
            
            for (int row = 0; row< number; row++) {
                int currentRow = row;
                for (int column = 0; column< number; column++) {
                    if ((row==0) || (column==0) || (row==number-1) || (column==number-1) || (row==column) || (column == (number - currentRow-1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
    }
}