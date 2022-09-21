public class StackOfInts {
    private static class Node {
        int item;
        Node next;
    }

    private Node top; // The top item of the stack

    /**
     * Add N to the top of the stack
     * @param N new node to be added to the top of the stack
     */
    public void push(int N) {
        Node newNode = new Node(); // The new node to store the item
        newNode.item = N; // Add item to Node
        newNode.next = top; // top become the next node of the new node
        top = newNode; // the new node now become top of the stack
    }

    /**
     * @throw an IllegalStateException if the stack is empty
     * @return the top item that is removed from the stack
     */
    public int pop() {
        if(top == null) {
            throw new IllegalStateException("Can not delete item from an empty Stack");
        }
        int topItem = top.item; // Save the item of top Node
        top = top.next; // The top is removed -> the next Node become the top of the stack
        return topItem;
    }

    /**
     * @return true if the stack is empty
     * @return false if there are >= 1 item on the stack
     */
    public boolean isEmpty() {
        return top == null;
    }
}
