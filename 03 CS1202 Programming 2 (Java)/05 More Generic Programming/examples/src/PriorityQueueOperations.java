import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueueOperations {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        ArrayList<String> wordsArrayList = new ArrayList<>();
        String[] wordsArray = {"abc", "def", "ghi", "klm", "dec", "abc", "klm", "end"};

        for(String w: wordsArray) {
            wordsArrayList.add(w);
        }

        // adds obj to the priority queue
        pq.add("abc");

        // removes and returns an item of minimal priority
        // Throws an exception if the queue is empty.
        pq.remove();

        pq.addAll(wordsArrayList);

        // If pq is not empty
        while (!pq.isEmpty()) {
            System.out.print(pq.remove() + " "); // abc abc dec def end ghi klm klm
        }
    }
}
