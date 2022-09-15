public class BinarySearch {
    static int binarySearch(int[] A, int lowestPossiblePos, int highestPossiblePos, int value) {
        // Base case
        if(lowestPossiblePos > highestPossiblePos) {
            return - 1;
        }
        else {
            int middle = (lowestPossiblePos + highestPossiblePos) / 2;
            if(middle == value) {
                return middle;
            } else if (middle > value) {
                return binarySearch(A, lowestPossiblePos, middle - 1, value); // First half of the array
            } else {
                return binarySearch(A, middle + 1, highestPossiblePos, value); // Second half of the array
            }
        }
    }

    public static void main(String[] args) {
        int[] testA = new int[1000];

        for(int i = 0; i < 1000; i++) {
            testA[i] = i * 2;
        }

        System.out.println("Index of 888 in A " + binarySearch(testA,0, testA.length - 1, 888));
        System.out.println("Index of 887 in A " + binarySearch(testA, 0, testA.length - 1,887));
    }
}
