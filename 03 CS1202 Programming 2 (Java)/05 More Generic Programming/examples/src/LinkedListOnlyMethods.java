import java.util.LinkedList;

public class LinkedListOnlyMethods {
    static class Node {
        int item;
        ListMethods.Node next;
    }

    public static void main(String[] args) {
        LinkedList<ListMethods.Node> myLinkedList = new LinkedList<>();
        ListMethods.Node someNode = new ListMethods.Node();
        someNode.item = 5;

        /*
            returns the object of type T that is the first item in the list
            If the list is empty when the method is called,
            an exception of type NoSuchElementException is thrown
         */
        myLinkedList.getFirst();

        /*
            returns the object of type T that is the last item in the list
         */
        myLinkedList.getLast();

        /*
            removes the first item from the list,
            returns that object of type T as its return value
         */
        myLinkedList.removeFirst();
        myLinkedList.remove(); // same meaning
        myLinkedList.pop(); // same meaning

        /*
            removes the last item from the list
            returns that object of type T as its return value
         */
        myLinkedList.removeLast();

        /*
            adds the obj, which must be of type T, to the beginning of the list
         */
        myLinkedList.addFirst(someNode);
        myLinkedList.push(someNode); // Same meaning

        /*
            adds the object obj, which must be of type T, to the end of the list
         */
        myLinkedList.addLast(someNode);
        myLinkedList.add(someNode); // same meaning
    }
}
