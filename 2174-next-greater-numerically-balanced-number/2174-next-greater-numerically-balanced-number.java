class Solution {
    /**
     * Checks if an integer is numerically balanced.
     * A number is numerically balanced if for every digit d in the number x, 
     * there are exactly d occurrences of that digit in x.
     * @param x The integer to check.
     * @return true if x is numerically balanced, false otherwise.
     */
    private boolean isNumericallyBalanced(int x) {
        // An array to store the frequency of digits 0 through 9.
        int[] counts = new int[10];
        
        // 1. Count digit frequencies
        int temp = x;
        while (temp > 0) {
            int digit = temp % 10;
            
            // Critical check: Digit 0 cannot be present. 
            // If it were present, its required count would be 0, which contradicts its presence.
            if (digit == 0) {
                return false;
            }
            
            // Check for digits greater than the max possible length (e.g., in a 7-digit number, 8 or 9)
            // While not strictly necessary due to the loop structure, this is good practice.
            if (digit > 7) { 
                return false; // A digit 8 or 9 would require at least 8 or 9 digits, exceeding the maximum search space for n <= 10^6.
            }

            counts[digit]++;
            temp /= 10;
        }
        
        // 2. Check the numerically balanced property
        for (int d = 1; d <= 9; d++) {
            int count = counts[d];
            
            // If the digit 'd' is present (count > 0), 
            // its count must be exactly equal to 'd'.
            if (count > 0) {
                if (count != d) {
                    return false;
                }
            }
            // If count == 0, the digit 'd' is not present, which is fine.
        }
        
        return true;
    }

    /**
     * Finds the smallest numerically balanced number strictly greater than n.
     * The search space is guaranteed to be small since n <= 10^6.
     * @param n The input integer.
     * @return The smallest numerically balanced number > n.
     */
    public int nextBeautifulNumber(int n) {
        // Start checking from the number immediately after n.
        int x = n + 1;
        
        // The search will terminate quickly because the numerically balanced numbers 
        // are sparse (the largest is around 1.3 million).
        while (true) {
            if (isNumericallyBalanced(x)) {
                return x;
            }
            x++;
        }
    }
}
