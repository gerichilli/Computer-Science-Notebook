public class BinarySearchReview {
    public int binarySearch(int[] A, int N) {
        int lowestPossiblePosition = 0;
        int highestPossiblePosition = A.length - 1;

        while (highestPossiblePosition >= lowestPossiblePosition) {
            // Check if N is middle item
            int middle = (highestPossiblePosition + lowestPossiblePosition) / 2;
            if(N == A[middle]) {
                return middle;
            }
            // If N > middle item => N is in second half
            else if (N > A[middle]) {
                lowestPossiblePosition = middle + 1;
            }
            // If N < middle item => N is in first half
            else {
                highestPossiblePosition = middle - 1;
            }
        }

        return -1;
    }

    /*
    public static void main(String[] args) {
        int[] testA = new int[1000];

        for(int i = 0; i < 1000; i++) {
            testA[i] = i * 2;
        }

        System.out.println("Index of 888 in A " + binarySearch(testA, 888));
        System.out.println("Index of 887 in A " + binarySearch(testA, 887));
    }
    */
}
