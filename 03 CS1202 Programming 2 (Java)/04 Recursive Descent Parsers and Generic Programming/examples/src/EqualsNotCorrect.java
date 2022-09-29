public class EqualBuildIn {
    public static class Card {
        private int suit; // Number from 0 to 3 that codes for the suit --
                            // spades, diamonds, clubs or hearts.
        private int value; // Number from 1 to 13 that represents the value.

    }
    public static void main(String[] args) {
        // Make 2 cards with same value
        Card a = new Card();
        a.suit = 0;
        a.value = 1;

        Card b = new Card();
        b.suit = 0;
        b.value = 1;

        boolean result = a.equals(b);
        System.out.println(result); // False
    }
}
