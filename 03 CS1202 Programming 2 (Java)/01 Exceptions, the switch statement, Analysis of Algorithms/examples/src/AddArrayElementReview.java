import java.util.Arrays;

public class AddArrayElementReview {
    public static void main(String[] args) {
        char[] myLetter = {'a', 'b', 'f', 'd', 'e'};
        int letterCt = myLetter.length - 1;

        // Now I want to add more element to the end of the array
        // Make an array twice as big as the old array.
        char[] myDoubleSizeLetter = Arrays.copyOf(myLetter, myLetter.length * 2);
        letterCt++;

        // Add new element to the new array
        myDoubleSizeLetter[letterCt] = 'z';
        letterCt++;
        myDoubleSizeLetter[letterCt] = 'w';
        letterCt++;

        System.out.println("New Array: " + Arrays.toString(myDoubleSizeLetter));
        // [a, b, f, d, e, z, w,  ,  ,  ]
    }
}
