// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        int N = A.length;
        boolean[] seen = new boolean[N];

        for (int num : A) {
            if (num > N || num < 1) {
                return 0; // If any element is out of the valid range, it's not a permutation
            }

            if (seen[num - 1]) {
                return 0; // If there are duplicate elements, it's not a permutation
            }

            seen[num - 1] = true;
        }

        for (boolean isSeen : seen) {
            if (!isSeen) {
                return 0; // If any number is missing, it's not a permutation
            }
        }

        return 1;
    }
}
