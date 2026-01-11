class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int key: nums){
            if(!map.containsKey(key)){
            map.put(key,1);

            }
            else {
                int freq = map.get(key);
                map.put(key,freq+1);
            }
        }
        int maxFreq = 0;
        int ans = -1;

        for (int key : map.keySet()) {

            if (key % 2 == 0) {
                int freq = map.get(key);
                if (freq > maxFreq || (freq == maxFreq && key < ans)) {
                    maxFreq = freq;
                    ans = key;
                }
            }
        }

        return ans;
    }
}