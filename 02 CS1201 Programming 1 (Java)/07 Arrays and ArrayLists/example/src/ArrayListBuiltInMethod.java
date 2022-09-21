import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListBuiltInMethod {
    public static void main(String[] args) {
        ArrayList<Integer> numsList = new ArrayList<Integer>();
        for (int i = 0; i <= 20 ; i++) {
            numsList.add(i); // autoboxing
        }

        System.out.println("Size " + numsList.size());
        System.out.println("Get number at index 5 " + numsList.get(5)); // Unboxing
        numsList.set(0, 20);
        System.out.println("After setting 0 element to 20 " + Arrays.toString(numsList.toArray()));
        System.out.println("Index of 15 " + numsList.indexOf(15));
        numsList.remove(12);
        System.out.println("After removing item at index 12 " + Arrays.toString(numsList.toArray()));
        numsList.clear();
        System.out.println("After clearing " + Arrays.toString(numsList.toArray()));
    }
}
