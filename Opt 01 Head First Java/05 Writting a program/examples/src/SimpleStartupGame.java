public class SimpleStartupGame {
    static void test() {
        SimpleStartup testGame = new SimpleStartup();
        int[] locations = { 2, 3, 4 };
        testGame.setLocations(locations);
        String result = testGame.checkYourSelf(1);

        String testResult = "failed";
        if (result.equals("miss")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }

    public static void main(String[] args) {
        int numberOfGuesses = 0;
        SimpleStartup startup = new SimpleStartup();

        // Generate locations
        int rand = (int) (Math.random() * 5);
        int[] locations = { rand, rand + 1, rand + 2 };
        startup.setLocations(locations);

        boolean isGameStopped = false;

        while (!isGameStopped) {
            int guess = GameHelper.getUserInput("Enter a number");
            numberOfGuesses++;
            String result = startup.checkYourSelf(guess);
            System.out.println(result);

            if (result.equals("kill")) {
                isGameStopped = true;
                System.out.println("You took " + numberOfGuesses + " guesses");
            }
        }
    }
}
