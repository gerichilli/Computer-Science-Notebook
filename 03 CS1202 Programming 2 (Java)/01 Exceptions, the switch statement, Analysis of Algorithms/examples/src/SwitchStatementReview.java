public class SwitchStatementReview {
    /**
     * This is a function printing out the result if number is odd or even
     * @param num number that will be evaluated
     * @return void
     * */
    static enum Animal {DOG, CAT, PIG, RABBIT};

    static void checkAnimal(Animal a) {
        switch(a) {
            case DOG -> System.out.println("This is a dog");
            case CAT -> System.out.println("This is a cat");
            case PIG -> System.out.println("This is a pig");
            default -> System.out.println("This is a rabbit");
        }
    }

    public static void main(String[] args) {
        Animal myPig = Animal.PIG;
        checkAnimal(myPig);
    }
}
