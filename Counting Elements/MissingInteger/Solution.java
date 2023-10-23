// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        HashSet<Integer> set = new HashSet<>();
        
        // Populate the HashSet with positive integers from the array
        for (int num : A) {
            if (num > 0) {
                set.add(num);
            }
        }
        
        // Check for the smallest positive integer
        int smallestPositive = 1;
        while (set.contains(smallestPositive)) {
            smallestPositive++;
        }
        
        return smallestPositive;
    }
}
