import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MapIterator {
    public static void main(String[] args) {
        TreeMap<String, Double> map = new TreeMap<>();

        Set<String> keys = map.keySet(); // The set of keys in the map.
        Iterator<String> keyIter = keys.iterator();

        while (keyIter.hasNext()) {
            String key = keyIter.next();
            Double value = map.get(key);

            System.out.println(key + ": " + value);
        }

        // Or we can use for each loop
        for(String key: keys) {
            Double value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
