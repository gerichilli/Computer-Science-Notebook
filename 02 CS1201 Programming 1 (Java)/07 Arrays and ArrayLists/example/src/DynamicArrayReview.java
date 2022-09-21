import java.util.Arrays;

/**
 * Example of a dynamic array
 * some operations that can be used in array:
 * add an item to the end of the array
 * remove the item at a specified position in the array
 * get the value of one of the elements in the array
 * set the value of one of the elements in the array
 * get the number of items currently in the array
 */
public class DynamicArrayReview {
    private int[] items = new int[8];
    private int itemsCt = 0;

    /**
     * Print array
     */
    public void print() {
        System.out.println("Items " + Arrays.toString(items));
    }
    /**
     * Get the value of one of the elements in the array
     * @throws ArrayIndexOutOfBoundsException if the index is not valid.
     */
    public int get(int index) {
        if(index < 0 || index > itemsCt) {
            throw  new ArrayIndexOutOfBoundsException("Illegal index: " + index);
        }
        return items[index];
    }

    /**
     * Set the value of one of the elements in the array
     * @param index: index of element
     * @param value: value to set
     * @throws ArrayIndexOutOfBoundsException if the index is not valid.
     */
    public void set(int index, int value) {
        if(index < 0 || index > itemsCt) {
            throw  new ArrayIndexOutOfBoundsException("Illegal index: " + index);
        }
        items[index] = value;
    }

    /**
     * Get the number of items currently in the array
     */
    public int sizes() {
        return itemsCt;
    }

    /**
     * add an item to the end of the array
     * @param item
     */
    public void add(int item) {
        if(itemsCt == items.length) {
            items = Arrays.copyOf(items, items.length * 2);
        }

        items[itemsCt] = item;
        itemsCt++;
    }

    /**
     * remove the item at a specified position in the array
     * @throws ArrayIndexOutOfBoundsException if the index is not valid.
     */
    public void remove(int index) {
        if(index < 0 || index > itemsCt) {
            throw  new ArrayIndexOutOfBoundsException("Illegal index: " + index);
        }

        for(int k = index + 1; k <= itemsCt; k++) {
            items[k - 1] = items[k];
        }

        itemsCt--;
    }
}
