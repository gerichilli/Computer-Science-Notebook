import java.util.Arrays;

public class StackOfIntsUsingArray {
    private int[] items = new int[10];
    private int top = 0; // Number of items in the stack, <= items.length

    public void push(int N) {
        if(top >= items.length) {
            items = Arrays.copyOf(items, items.length * 2);
        }
        items[top] = N;
        top++;
    }

    public int pop() {
        if(top == 0) {
            throw new IllegalStateException("Can not pop item from an empty Stack");
        }
        int popItem = items[top - 1];
        top--; // Decrease number of items in the stack
        return popItem;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
