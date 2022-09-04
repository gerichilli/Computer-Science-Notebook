import java.util.Arrays;

public class TestDynamicArray {
    public static void main(String[] args) {
        DynamicArrayReview myList = new DynamicArrayReview();
        myList.add(5);
        myList.add(6);
        myList.add(15);
        myList.add(2);
        myList.add(1);
        myList.add(1);
        myList.add(1);
        myList.add(1);
        myList.add(1);

        myList.print();

        System.out.println("Element of index 2: " + myList.get(2));
        System.out.println("Array sizes: " + myList.sizes());
        myList.set(2, 5);

        myList.print();
    }
}
