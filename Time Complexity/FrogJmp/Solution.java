// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
        // Implement your solution here
        int distanceToCover = Y - X;
        int minimalJumps = distanceToCover / D;
        if (distanceToCover % D != 0) {
            minimalJumps++; // Additional jump needed for the remainder
        }
        return minimalJumps;
    }
}