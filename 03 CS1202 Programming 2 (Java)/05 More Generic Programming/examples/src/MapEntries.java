import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapEntries {
    public static void main(String[] args) {
        TreeMap<String, Double> map = new TreeMap<>();
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        Iterator<Map.Entry<String, Double>> entryIter = entries.iterator();

        while (entryIter.hasNext()) {
            Map.Entry<String, Double> entry = entryIter.next();
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Using for
        for(Map.Entry<String, Double> entry: entries) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
