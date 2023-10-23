// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        int totalSum = 0;
        int leftSum = 0;
        int minimalDifference = Integer.MAX_VALUE;

        // Calculate the total sum of the array
        for (int num : A) {
            totalSum += num;
        }

        // Iterate through the array, calculating the left sum and the right sum
        // while updating the minimal difference
        for (int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            int rightSum = totalSum - leftSum;
            int currentDifference = Math.abs(leftSum - rightSum);
            minimalDifference = Math.min(minimalDifference, currentDifference);
        }

        return minimalDifference;
    }
}
