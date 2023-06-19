package DataStructures.Arrays;

public class ReviewOfArrays {
    public static void main(String[] args) {
        int[] intArray = new int[7];
        
        // Array is NOT dynamic, so you have to specify the size of the array
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;
        
        //you don't have to fill an array fully

        for (int i: intArray) {
            System.out.println(i);
        }
    }
}
