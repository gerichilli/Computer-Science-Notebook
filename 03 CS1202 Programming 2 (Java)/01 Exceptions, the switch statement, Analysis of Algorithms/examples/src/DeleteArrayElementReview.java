import java.util.*;

public class DeleteArrayElementReview {
    public static void main(String[] args) {
        int[] myArray = new int[10]; // Creating an array that upto 5 elements
        int arrayCt = 0; // Keep track of max element on the array, at begin it is 0

        // Fill first 5 elements of the array by 1,2,3,4,5
        for(int i = 1; i <= 5; i++) {
            myArray[arrayCt] = i;
            arrayCt++;
        }

        System.out.println("Array before deleting item :" + Arrays.toString(myArray));
        // [1, 2, 3, 4, 5, 0, 0, 0, 0, 0]

        // Delete the element with index 2
        for(int k = 2 + 1; k <= arrayCt; k++) {
            myArray[k - 1] = myArray[k];
        }

        arrayCt--; // Reduce 1 element

        System.out.println("Array after deleting item :" + Arrays.toString(myArray));
        // [1, 2, 4, 5, 0, 0, 0, 0, 0, 0]
    }
}
