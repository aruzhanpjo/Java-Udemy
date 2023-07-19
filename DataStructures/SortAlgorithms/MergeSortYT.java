public class MergeSortYT {

    public static void main(String[] args) {
        int[] theArray = {20, 35, -15, 7, 55, 1, -22};


        mergeSort(theArray);

        for (int i: theArray) {
            System.out.print(i+ " -> ");
        }
    }

    public static void mergeSort(int inputArray[]){

        int inputLenght = inputArray.length;

        if (inputLenght < 2) {
            return;
        }

        int mid[] = new int[inputLenght/2];
        int leftHalf[] = new int[mid.length];
        int rightHalf[] = new int[inputLenght- mid.length];

        // copying the array into two halves:
        for (int i=0; i<mid.length; i++) {
            leftHalf[i] = inputArray[i];
        }

        for (int i=mid.length; i<inputLenght; i++) {
            rightHalf[i] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);

    }

    public static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i=0, j=0, k=0;


// adding already sorted 2 arrays into one big one until we finish 1 or 2 array
        while (i<leftSize && j<rightSize) {
            if (leftHalf[i]<rightHalf[j]){
                inputArray[k++] = leftHalf[i++];
            }

            else{
                inputArray[k++] = rightHalf[j++];
            }
        }


// after we added one of the arrays from the above loop, if there are int left, we add the to the InputArray

        while (i<leftSize){
        inputArray[k++] = leftHalf[i++];
        }

        while (j<rightSize){
        inputArray[k++] = rightHalf[j++];
        }
    }


}