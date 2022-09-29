import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> coll = new ArrayList<>(); // Collection of Type String
        Iterator<String> iter; // Declare the iterator variable
        iter = coll.iterator(); // Get an iterator for the collection
        while (iter.hasNext()) {
            String item = iter.next(); // Get the next item
            System.out.println(item);
        }

        ArrayList<Color> colors = new ArrayList<>(); // Collection of Type Color
        Iterator<Color> iterColor = colors.iterator();
        while (iterColor.hasNext()) {
            Color colorItem = iterColor.next();

            // Remove null values
            if(colorItem == null) {
                iterColor.remove(); // Remove the item that was just returned from iterColor.next()
            }
        }

        // Using For-each
        for(String item: coll) {
            System.out.println(item.toLowerCase());
        }
    }
}
