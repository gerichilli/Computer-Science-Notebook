import java.util.Objects;

public class EqualsCorrect {
    public static class Card {
        private int suit; // Number from 0 to 3 that codes for the suit --
        // spades, diamonds, clubs or hearts.
        private int value; // Number from 1 to 13 that represents the value.

        @Override
        public boolean equals(Object obj) {
            try {
                Card other = (Card)obj; // Type-cast obj to a Card.
                if(this == other) return true;
                return suit == other.suit && value == other.value;
            } catch (Exception e) {
                // This will catch the NullPointerException that occurs if obj
                // is null and the ClassCastException that occurs if obj is
                // not of type Card.  In these cases, obj is not equal to
                // this Card, so return false.
                return false;
            }
        }

        @Override
        public int hashCode() {
            return Objects.hash(suit, value);
        }
    }

    public static void main(String[] args) {
        // Make 2 cards with same value
        EqualsCorrect.Card a = new EqualsCorrect.Card();
        a.suit = 0;
        a.value = 1;

        EqualsCorrect.Card b = new EqualsCorrect.Card();
        b.suit = 0;
        b.value = 1;

        boolean result = a.equals(b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(result); // True

    }
}
