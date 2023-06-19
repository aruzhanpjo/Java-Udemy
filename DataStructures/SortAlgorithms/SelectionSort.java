package DataStructures.SortAlgorithms;

// unsorted partition, time comp;exity=O(n^2), in-place algorithm

public class SelectionSort {
    public static void main(String[] args) {
        int[] theArray = {20, 35, -15, 7, 55, 1, -22};
        for (int LastUnsortedIndex=theArray.length-1; LastUnsortedIndex>0; LastUnsortedIndex--) {
            int largest = 0;
            
            for (int i=1; i<=LastUnsortedIndex; i++) {
                if (theArray[i] > theArray[largest]) {
                    largest = i;
                }
            }
            swap(theArray, largest, LastUnsortedIndex);
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
