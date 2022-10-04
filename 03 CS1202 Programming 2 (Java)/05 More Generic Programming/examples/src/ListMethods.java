import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMethods {
    static class Node {
        int item;
        Node next;
    }
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        LinkedList<Node> myLinkedList = new LinkedList<>();

        Node someNode = new Node();
        someNode.item = 5;

        /*
            returns the object of type T that is at position index in the list
            index is an integer, index range: 0 -> list.size() - 1
            throw IndexOutOfBoundsException if parameter is out of range
            only efficient for ArrayList
         */
        myArrayList.get(1);
        myLinkedList.get(1);

        /*
            stores the object at position number index in the list,
            replacing the object that was there previously
            only efficient for ArrayList
         */
        myArrayList.set(5, 5);
        myLinkedList.set(5, someNode);

        /*
            inserts an object into the list at position number index
            number of items in the list increases by one
            items that come after position index move down one position
         */
        myArrayList.add(5, 5);
        myLinkedList.add(5, someNode);

        /*
            removes the object at position number index
            returns that object as the return value of the method
         */
        myArrayList.remove(1);
        myLinkedList.remove(1);

        /*
            returns an int that gives the position of obj in the list, if it occurs
            If it does not occur, the return value is -1
         */
        myArrayList.indexOf(5);
        myLinkedList.indexOf(someNode);
    }
}
