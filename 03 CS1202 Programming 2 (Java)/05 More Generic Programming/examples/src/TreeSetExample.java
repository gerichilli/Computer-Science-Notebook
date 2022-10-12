import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> words = new TreeSet<String>();
        ArrayList<String> wordsArrayList = new ArrayList<>();
        String[] wordsArray = {"abc", "def", "ghi", "klm", "dec", "abc", "klm", "end"};

        for(String w: wordsArray) {
            wordsArrayList.add(w);
            words.add(w);
        }

        for(String word: words) {
            // Sorts and eliminates duplicates
            System.out.print(word + " "); // abc dec def end ghi klm
        }

        // Using addAll: sort and eliminates duplicates from collection
        TreeSet<String> set = new TreeSet<String>();
        set.addAll(wordsArrayList);

        System.out.println();
        for(String word: set) {
            System.out.print(word + " "); // abc dec def end ghi klm
        }
    }
}
