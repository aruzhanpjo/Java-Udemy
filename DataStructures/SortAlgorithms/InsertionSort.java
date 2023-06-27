public class InsertionSort {

    public static void main(String[] args) {
        int[] theArray = {20, 35, -15, 7, 55, 1, -22};


        for (int unsortedIndex=1; unsortedIndex<theArray.length; unsortedIndex++) {
            int newElement = theArray[unsortedIndex];

            int i;
            for (i=unsortedIndex; i>0 && theArray[i-1]>newElement; i--) {
                theArray[i] = theArray[i-1];
            }
             theArray[i] = newElement;
        }

        for (int i: theArray) {
            System.out.print(i+ " -> ");
        }
        
    }


}
    

