import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public void quickSort(int[] A) {
        quickSort(A, 0, A.length - 1);
    }

    private void quickSort(int[] A, int low, int high) {
        if(low < high + 1) {
            int pivotPosition = partition(A, low, high);
            quickSort(A, low, pivotPosition-1);
            quickSort(A, pivotPosition + 1, high);
        }
    }

    private void swap(int[] A, int index1, int index2) {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }

    /**
     * @return random integer between low and high inclusive
     */
    private int getPivot(int[] A, int low, int high) {
        Random rand = new Random();
        return rand.nextInt((high - low) + 1 ) + low;
    }

    /**
     * Move all n < pivot to the left of pivot
     * and all n > pivot to the right of pivot
     * @return pivot index
     */
    private int partition(int[] A, int low, int high) {
        // Get pivot within the range
        int pivot = getPivot(A, low, high);
        // Swap pivot value into the last left position
        swap(A, low, pivot);
        // Set the border which is left corner (right after pivot location)
        int border = low + 1;
        // Loop the array of items
        for(int i = border; i <= high; i++) {
            // Comparing each item to the pivot
            if(A[i] < A[low]) {
                // Swap it with the border value
                swap(A, i, border);
                // Increase the border
                border++;
            }
        }

        // Put the pivot into the right position
        swap(A, low, border - 1);
        // Return the pivot index
        return border - 1;
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] A = {1,5,4,3,1,0,5,7,8,2,4,5,3,14,45,20,14,12,3,6};
        System.out.println(Arrays.toString(A));
        qs.quickSort(A);
        System.out.println(Arrays.toString(A));
    }
}
