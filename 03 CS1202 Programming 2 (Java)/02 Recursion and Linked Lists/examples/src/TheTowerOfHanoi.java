public class TheTowerOfHanoi {
    /**
     * @param n: number of disks to be moved
     * @param fromRod: rod where disk present
     * @param toRod: rod where disk to be moved
     * @param auxRod: auxiliary rod
     */
    static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if(n == 1) {
            System.out.printf("\nMove the disk 1 from rod %c to rod %c", fromRod, toRod);
            return;
        } else {
            // Move all top disk (except the last disk) (N - 1 disks)
            // Solve the problem of N - 1 disk and so on
            // Step 1: move n - 1 disks from fromRod to auxRod
            towerOfHanoi(n - 1, fromRod, auxRod, toRod);
            // Step 2: move bottom disk from fromRod to toRod
            System.out.printf("\nMove the disk %d from rod %c to rod %c", n, fromRod, toRod);
            // Step 3: move n - 1 disks in step 1 from auxRod to toRod
            towerOfHanoi(n - 1, auxRod, toRod, fromRod);
        }
    }

    public static void main(String[] args) {
        towerOfHanoi(4, 'a', 'b', 'c');
    }
}
