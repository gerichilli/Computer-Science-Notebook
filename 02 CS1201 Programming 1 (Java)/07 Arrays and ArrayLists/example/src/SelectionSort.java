import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] A) {
        // Start at the end of the array
        for(int lastLoc = A.length - 1; lastLoc > 0; lastLoc--) {
            // Find the largest item among A[0] -> A[lastLoc]
            // Swapping it with item that is in position lastLoc
            int maxLoc = 0;

            // Find the max item location
            for(int i = 1; i <= lastLoc; i++) {
                if(A[i] > A[maxLoc]) {
                    maxLoc = i;
                }
            }

            // Swap the largest item with A[lastLoc]
            int temp = A[lastLoc];
            A[lastLoc] = A[maxLoc];
            A[maxLoc] = temp;
        }
    }

    /**
     * @param A array to be sorted
     * @param high the index of last item in unsorted part of the array
     */
    public static void selectionSortRecursion(int[] A, int high) {
        if(high <= 0) {
            return;
        }

        int maxLoc = 0;
        // Find the max item location
        for (int i = 1; i <= high; i++) {
            if(A[i] > A[maxLoc]) {
                maxLoc = i;
            }
        }

        // Swap the largest item with the last item
        int temp = A[high];
        A[high] = A[maxLoc];
        A[maxLoc] = temp;

        // Doing the same thing with the rest of Array
        selectionSortRecursion(A, high - 1);
    }

    public static void main(String[] args) {
        int[] myArray1 = {1,2,5,8,7,6,2,4,2,5,8,0,6};
        int[] myArray2 = {1,2,5,8,7,6,2,4,2,5,8,0,6};
        selectionSort(myArray1);
        selectionSortRecursion(myArray2, myArray2.length - 1);

        System.out.println(Arrays.toString(myArray1));
        System.out.println(Arrays.toString(myArray2));
    }
}
