import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorMethods {
    static void addNewItem(ArrayList<String> stringList, String newItem) {
        ListIterator<String> iter = stringList.listIterator();

        while (iter.hasNext()) {
            /*
                iter.next()
                moves the iterator one space to the right along the list
                and returns the item that the iterator passes as it moves
             */
            String item = iter.next();
            if(newItem.compareTo(item) <= 0) {
                /*
                    iter.previous()
                    moves the iterator one space to the left along the list
                    and returns the item that it passes
                */
                iter.previous();
                break;
            }
        }

        /*
            iter.add(obj)
            adds the specified object to the list
            at the current position of the iterator
        */
        iter.add(newItem);
    }

    static boolean removeItem(ArrayList<String> stringList, String rmItem) {
        ListIterator<String> iter = stringList.listIterator();

        while (iter.hasNext()) {
            String item = iter.next();

            if(rmItem.equals(item)) {
                /*
                    iter.remove()
                    removes an item from the list;
                    the item that is removed is the item that the iterator passed most recently
                    in a call to either iter.next() or iter.previous()
                */
                iter.remove();
                return true;
            }
        }

        return false;
    }
}
