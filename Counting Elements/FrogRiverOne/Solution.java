// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        // Implement your solution here
        boolean[] flags = new boolean[X];
        int coveredPositions = 0;
        
        for (int time = 0; time < A.length; time++) {
            int position = A[time] - 1; // Adjust position to be 0-based index
            if (!flags[position]) {
                flags[position] = true;
                coveredPositions++;
            }
            
            if (coveredPositions == X) {
                return time;
            }
        }
        
        return -1; // If the frog cannot cross
    }
}
