public class EqualsNotCorrect {
    public static class Card {
        private int suit; // Number from 0 to 3 that codes for the suit --
                            // spades, diamonds, clubs or hearts.
        private int value; // Number from 1 to 13 that represents the value.

    }

    public static class MyItem {
        private int num;
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

        // Make 2 items with same value
        MyItem x = new MyItem();
        x.num = 5;
        MyItem y = new MyItem();
        y.num = 5;

        System.out.println(x.equals(y)); // False

        String first = "Nhi";
        String second = "Nhi";
        System.out.println(first == second); // True
        System.out.println(first.hashCode()); // Same hashCode
        System.out.println(second.hashCode()); // Same hashCode
    }
}
