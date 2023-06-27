//modify the merge sort algorithm so that it sorts in descending order 

public class MergeSortChallenge {
    public static void main(String[] args) {
        int[] theArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(theArray, 0, theArray.length);

        for (int i: theArray) {
            System.out.print(i+ " -> ");
        }
        
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end-start<2) {
            return;
        }

        int mid=(start+end)/2;
        //sorts the left array fully
        mergeSort(input, start, mid);

        //sorts the right array fully
        mergeSort(input, mid, end);

        //merge the two arrays
        merge(input, start, mid, end);

    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid] <= input[mid-1]) {
            return;
        }

        int i=start;
        int j=mid;
        int tempIndex=0;

        int[] temp = new int[end-start];

        while (i<mid && j<end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[j++] : input[i++];
        }

        System.arraycopy(input, i, input, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, input, start, tempIndex);

    }
}

    
