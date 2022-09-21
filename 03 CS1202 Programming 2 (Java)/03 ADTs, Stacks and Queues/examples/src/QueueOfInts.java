public class QueueOfInts {
    private static class Node {
        int item;
        Node next;
    }

    private Node head = null;
    private Node tail = null;

    public void enqueue(int N) {
        Node newItem = new Node();
        newItem.item = N;

        // If the queue is empty
        // The new node is queue's head and tail
        if(head == null) {
            head = newItem;
            tail = newItem;
            newItem.next = null;
        }
        // The new item becomes the new tail
        else {
            tail.next = newItem;
            tail = newItem;
        }
    }

    public int dequeue() {
        if(head == null) {
            throw new IllegalStateException("Can not dequeue item in a empty queue");
        }

        int removeHead = head.item;
        head = head.next;

        // The case the queue has only one item that is head and tail
        // And the head is removed
        // So the queue is now empty
        if(head == null) {
            tail = null;
        }

        return removeHead;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
