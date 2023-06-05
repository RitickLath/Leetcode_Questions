class Solution {
    public boolean judgeCircle(String moves) {
        if (moves.length() % 2 != 0) {
            return false;
        }

        int horizontal = 0;
        int vertical = 0;

        // Used toCharArray(): Converted the moves string to a character array using toCharArray() outside the loop. This avoids calling moves.charAt(i) repeatedly, which improves performance.
        
        for (char move : moves.toCharArray()) {
            if (move == 'R') {
                horizontal++;
            } else if (move == 'L') {
                horizontal--;
            } else if (move == 'U') {
                vertical++;
            } else if (move == 'D') {
                vertical--;
            }
        }

        return horizontal == 0 && vertical == 0;
    }
}
