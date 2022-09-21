import java.util.Arrays;

public class InsertionSort {
    /**
     * Insert an item into a sorted array
     * @param A an array
     * @param itemsInArray number of items that are stored in A
     * @param newItem item to add into A
     */
    public static void insert(int[] A, int itemsInArray, int newItem) {
        int loc = itemsInArray - 1; // Start at the end of the array

        // Move items bigger than new item up one space;
        // Stop when smaller item is encountered
        // or when reach the beginning of the array

        while (loc >= 0 && A[loc] > newItem) {
            A[loc + 1] = A[loc]; // Move up one space
            loc--; // Go to the next location
        }

        A[loc + 1] = newItem; // Encountered the smaller item at index = loc
    }

    /**
     * Sort an array into increasing order
     * @param A an array to be sorted
     */
    public static void insertionSort(int[] A) {
        int itemsSorted; // Number of items that have been sorted so far

        for (itemsSorted = 1; itemsSorted < A.length; itemsSorted++) {
            // Assume that items A[0] -> A[itemsSorted - 1] have already be sorted
            // Insert A[itemsSorted] into the sorted part of the list
            int temp = A[itemsSorted]; // item to be inserted to the sorted part of array
            insert(A, itemsSorted, temp);
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1,2,5,8,7,6,2,4,2,5,8,0,6};
        insertionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
