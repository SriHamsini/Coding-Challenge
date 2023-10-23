// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) {
        // Implement your solution here
        int[] counters = new int[N];
        int maxCounter = 0;
        int lastMaxCounter = 0;

        for (int operation : A) {
            if (operation >= 1 && operation <= N) {
                // Increase counter X
                int counterIndex = operation - 1;
                counters[counterIndex] = Math.max(counters[counterIndex], lastMaxCounter) + 1;
                maxCounter = Math.max(maxCounter, counters[counterIndex]);
            } else if (operation == N + 1) {
                // Set all counters to the maximum value found so far
                lastMaxCounter = maxCounter;
            }
        }

        for (int i = 0; i < N; i++) {
            counters[i] = Math.max(counters[i], lastMaxCounter);
        }

        return counters;
    }
}
