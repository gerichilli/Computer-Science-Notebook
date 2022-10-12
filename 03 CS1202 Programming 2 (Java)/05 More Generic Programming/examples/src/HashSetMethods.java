import java.util.HashSet;

public class HashSetMethods {
    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<>();
        HashSet<String> setB = new HashSet<>();
        String x = "abc";

        // adds the element x to the set A
        setA.add(x);

        // removes the element x from the set A
        setA.remove(x);

        // test if x is an element of the set A
        setA.contains(x);

        // computes the union of A and B
        // mutate A
        setA.addAll(setB);

        // computes the intersection of A and B
        // return a new set
        setA.retainAll(setB);

        // computes the set differences of A and B (A-B)
        setA.removeAll(setB);
    }
}
