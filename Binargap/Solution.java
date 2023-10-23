

 class Solution {
    public int solution(int N) {
        // Implement your solution here
         // Convert the integer to binary representation as a string
        String binaryString = Integer.toBinaryString(N);
        
        int maxGap = 0; // Initialize the maximum binary gap length
        int currentGap = 0; // Initialize the current binary gap length

        // Iterate through the binary string
        for (int i = 0; i < binaryString.length(); i++) {
            char c = binaryString.charAt(i);
            
            if (c == '1') {
                // If we encounter a '1', update the maximum gap if needed
                maxGap = Math.max(maxGap, currentGap);
                currentGap = 0; // Reset the current gap
            } else {
                // If we encounter a '0', increment the current gap
                currentGap++;
            }
        }
        
        return maxGap;
    }
}