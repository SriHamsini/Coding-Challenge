// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // Implement your solution here
        int N = A.length;
        
        // Check if the array is empty or if K is zero, return A as is
        if (N == 0 || K % N == 0) {
            return A;
        }

        int[] rotated = new int[N];
        for (int i = 0; i < N; i++) {
            int newPosition = (i + K) % N; // Calculate the new position after rotation
            rotated[newPosition] = A[i];   // Place the element at the new position
        }

        return rotated;
    }
}