import java.util.TreeMap;
import java.util.Map;

public class MapSubMap {
    public static void main(String[] args) {
        TreeMap<String, String> phoneBook = new TreeMap<>();
        Map<String, String> subMap = phoneBook.subMap("m", "n");

        if(subMap.isEmpty()) {
            System.out.println("No entries beginning with M.");
        } else {
            for (var entry: subMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
