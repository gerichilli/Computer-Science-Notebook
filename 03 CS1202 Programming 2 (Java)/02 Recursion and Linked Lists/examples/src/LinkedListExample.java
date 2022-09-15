public class LinkedListExample {
    static class Node {
        String item;
        Node next; // pointer to the next node in the list
    }

    public static void printNode(Node head) {
        Node runner; // A pointer that will be used to traverse the list.
        runner = head; // A pointer that will be used to traverse the list.
        while (runner != null) {
            System.out.println(runner.item);
            runner = runner.next;
        }
    }

    public static void printReversed(Node head) {
        if(head == null) {
            return;
        }
        else {
            printReversed(head.next);
            System.out.print(head.item);
        }
    }

    public static boolean find(Node head, String searchItem) {
        Node runner = head;

        while (runner != null) {
            if(runner.item.equals(searchItem)) {
                return true;
            }
            runner = runner.next;
        }

        return false;
    }

    public static void insert(Node head, String insertItem) {
        Node newNode = new Node();
        newNode.item = insertItem;

        // Linked list is empty
        if(head == null) {
            head = newNode;
        }
        // If the head >= the inserted item so the item must become the head
        else if (head.item.compareTo(insertItem) >= 0) {
            newNode.next = head; // head will be the next node of new node
            head = newNode; // new node now becomes the head
        }
        // The new node is somewhere after the head
        else {
            Node runner = head.next; // A node for traversing the list.
            Node previous = head; // Prev node of runner, first it is the head;

            // Looking for new node position (after the node that has item < new node item)
            while (runner != null && runner.item.compareTo(insertItem) < 0) {
                previous = runner;
                runner = runner.next;
            }

            // Get the position in that we can insert our new node
            newNode.next = runner; // Insert newNode after previous.
            previous.next = newNode;
        }

    }

    public static boolean delete(Node head, String deleteItem) {
        // Linked list is empty => Can't delete any item
        if(head == null) {
            return false;
        }
        // If delete item is the head
        else if(head.item.equals(deleteItem)) {
            head = head.next;
            return true;
        }
        else {
            // If the string occurs in linked list
            // and beyond head item
            Node runner = head.next;
            Node previous = head;

            // Looking for the delete item position
            while (runner != null && runner.item.compareTo(deleteItem) < 0) {
                previous = runner;
                runner = runner.next;
            }

            // Get to the position of the delete item
            if(runner != null && runner.item.equals(deleteItem)) {
                previous.next = runner.next;
                return true;
            }

            else {
                return false;
            }
        }
    }

    public static void main(String[] args) {

    }
}
