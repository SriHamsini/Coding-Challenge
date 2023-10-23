// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        int N = A.length;
        long totalSum = (N + 1L) * (N + 2) / 2;  // Sum of 1 to (N+1) using the formula (n * (n + 1)) / 2

        long arraySum = 0L;
        for (int num : A) {
            arraySum += num;
        }

        return (int) (totalSum - arraySum);
    }
}
