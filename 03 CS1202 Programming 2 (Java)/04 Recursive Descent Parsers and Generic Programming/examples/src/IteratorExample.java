import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> coll = new ArrayList<>(); // Collection of Type String
        Iterator<String> iter; // Declare the iterator variable
        iter = coll.iterator(); // Get an iterator for the collection
        /*
            iter.hasNext()
            Returns a boolean value, true there are more items to be processed
         */
        while (iter.hasNext()) {
            /*
                iter.next()
                Returns the next item, and advances the iterator
                If this method is called when no items remain,
                it will throw a `NoSuchElementException`.
             */
            String item = iter.next();
            System.out.println(item);
        }

        ArrayList<Color> colors = new ArrayList<>(); // Collection of Type Color
        Iterator<Color> iterColor = colors.iterator();
        while (iterColor.hasNext()) {
            Color colorItem = iterColor.next();

            // Remove null values
            if(colorItem == null) {
                /*
                    Remove the item that was just returned from iterColor.next()
                 */
                iterColor.remove();
            }
        }

        // Using For-each
        for(String item: coll) {
            System.out.println(item.toLowerCase());
        }
    }
}
