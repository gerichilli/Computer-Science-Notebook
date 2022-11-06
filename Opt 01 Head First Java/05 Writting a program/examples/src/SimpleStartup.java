public class SimpleStartup {
    int[] locations; // hold location cells
    int numOfHits; // hold number of hits

    /**
     * Takes an int of the users's guess
     * Check it and return a string: "hit", "miss", "kill"
     */
    String checkYourSelf(int guess) {
        // Compare the user's guess to the location cells
        // Loop through the location cells
        // If match:
        // increase number of hits
        // If it was the last cell: return "kill" otherwise return "hit"
        // If no match: return "miss"

        for (int i = 0; i < locations.length; i++) {
            if (guess == locations[i] && locations[i] != -1) {
                numOfHits++;

                if (numOfHits == locations.length) {
                    return "kill";
                } else {
                    // Remove the guessed location
                    // so that it won't be counted again
                    locations[i] = -1;
                    return "hit";
                }
            }
        }

        return "miss";
    }

    /**
     * Set the location cells
     */
    void setLocations(int[] locs) {
        locations = locs;
    }
}