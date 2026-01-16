class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int oddMax = -1;
        int evenMax = -1;

        for (int freq : map.values()) {
            if (freq % 2 == 0) {
                evenMax = Math.max(evenMax, freq);
            } else {
                oddMax = Math.max(oddMax, freq);
            }
        }

        // If either odd or even frequency does not exist
        if (oddMax == -1 || evenMax == -1) {
            return -1;
        }

        // Editorial says negative values are allowed
        return oddMax - evenMax;
    }
}
