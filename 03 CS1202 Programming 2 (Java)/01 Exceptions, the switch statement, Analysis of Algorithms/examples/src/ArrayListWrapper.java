import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWrapper {
    public static void main(String[] args) {
        // AUTOBOXING
        Integer myNumber = 2;
        // Same as
        Integer myNumberAutoBoxing = Integer.valueOf(2);
        System.out.println(myNumber);
        System.out.println(myNumberAutoBoxing);

        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        numbersList.add(20);
        // Same as
        numbersList.add(Integer.valueOf(20));
        System.out.println(Arrays.toString(numbersList.toArray()));

        // UNBOXING
        numbersList.get(0);
        // Same as
        numbersList.get(0).intValue();
    }
}
