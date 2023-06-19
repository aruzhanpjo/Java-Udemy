package DataStructures.SortAlgorithms;

//performance degrades as number of items increases: O(n^2) time complexity 
//it is an IN-PLACE algorithm


public class BubbleSort {
    public static void main(String[] args) {
        int[] theArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = theArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--) {
            for (int i=0; i<lastUnsortedIndex; i++) {
                if (theArray[i] > theArray[i+1]) {
                    swap(theArray, i, i+1);
                }
            }
        }

        for (int i: theArray) {
            System.out.print(i+ " -> ");
        }
    }

    public static void swap(int[] array, int a, int b) {
        if (a == b) {
            return;
        }

        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
