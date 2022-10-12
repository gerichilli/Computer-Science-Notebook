import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
        TreeMap<String, Number> myTreeMap = new TreeMap<String, Number>();
        TreeMap<String, Number> myTreeMap2 = new TreeMap<String, Number>();
        /*
             returns the object of type V that is associated by the map to the key
             If the map does not associate any value with key,
             then the return value is null
         */
        myTreeMap.get("a");

        /*
             Associates the specified value with the specified key
             key must be of type K and value must be of type V
             If the map already associated some other value with the key,
             then the new value replaces the old one
         */
        myTreeMap.put("c", 20);

        /*
            if myTreeMap2 is another map of type Map<String, Number>,
            this copies all the associations from myTreeMap2 into myTreeMap.
         */
        myTreeMap.putAll(myTreeMap2);

        /*
             if map associates a value to the specified key,
             that association is removed from the map.
         */
        myTreeMap.remove("b");

        /*
            returns a boolean value that is true
            if the map associates some value to the specified key
         */
        myTreeMap.containsKey("c"); // 20

        /*
            returns a boolean value that is true
            if the map associates the specified value to some key
         */
        myTreeMap.containsValue(20); // c

        /*
             returns an int that gives the number of key/value associations in the map
         */
        myTreeMap.size();

        /*
            returns a boolean value that is true if the map is empty
         */
        myTreeMap.isEmpty(); // false

        /*
            removes all associations from the map, leaving it empty
         */
        myTreeMap.clear();
    }
}
