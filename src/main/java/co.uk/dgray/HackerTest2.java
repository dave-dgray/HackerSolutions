package co.uk.dgray;

class HackerTest2 {

    int countingValleys(int n, String s) {

        final int SEA_LEVEL = 0;

        int newLevel = SEA_LEVEL;
        boolean wasInValley = false;
        int valleys = 0;

        for(int position = 0; position < n; position++) {
            newLevel = (s.charAt(position)=='U')? newLevel + 1 : newLevel;
            newLevel = (s.charAt(position)=='D')? newLevel - 1 : newLevel;
            if (newLevel >= SEA_LEVEL) {
                if (wasInValley) {
                    valleys++;
                }
                wasInValley = false;
            } else {
                wasInValley = true;
            }
        }
        return valleys;
    }

}
