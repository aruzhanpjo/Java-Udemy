// challenge: use recursion to implement insertion sort

package DataStructures.SortAlgorithms;

public class InsertionSortChallenge {

    public static void main(String[] args) {
        int[] theArray = {20, 35, -15, 7, 55, 1, -22};

        theInsertionSort(theArray, theArray.length);
    }

    public static void theInsertionSort(int[] input, int num) {
        if (num<2) {
            return;
        }

        theInsertionSort(input, num-1);

        int newElement = input[num-1];

        int i;
        for (i=num; i>0 && input[i-1]>newElement; i--) {
            input[i] = input[i-1];
        }
        input[i] = newElement;


    }
    
}
