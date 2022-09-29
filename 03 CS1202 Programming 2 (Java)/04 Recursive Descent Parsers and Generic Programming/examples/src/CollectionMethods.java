import java.util.ArrayList;

public class CollectionMethods {
    public static void main(String[] args) {
        ArrayList<Integer> coll = new ArrayList<>();
        ArrayList<Integer> coll2 = new ArrayList<>();
        Integer[] tarray = new Integer[0];
        int tobject = 5;
        int object = 10;

        coll.size();
        coll.isEmpty();
        coll.clear();
        /*
            return a boolean value which tell you whether
            the operation actually modified the collection
         */
        coll.add(tobject);
        /*
            return a boolean value, true if object is in the collection
            object is not required to be of type T
            For testing equality, null is considered to be equal to itself
         */
        coll.contains(object);
        /*
            removes object from the collection, if it occurs in the collection
            returns a boolean value, true if object is in the collection
            object is not required to be of type T
            The test for equality is the same test that is used by contains()
         */
        coll.remove(object);
        /*
            returns a boolean value that is true if every object in coll2 is also in coll
            The parameter can be any collection.
         */
        coll.containsAll(coll2);
        /*
            removes every object from coll that also occurs in the collection coll2
            The parameter can be any collection.
         */
        coll.removeAll(coll2);
        /*
            removes every object from coll that does not occur in the collection coll2
            "retains" only the objects that do occur in coll2
         */
        coll.retainAll(coll2);
        /*
            returns an array of type Object[], not T[]
         */
        coll.toArray();
         /*
            returns an array of type T[]
         */
        coll.toArray(tarray);
    }

    public static class FullName {
    }
}
