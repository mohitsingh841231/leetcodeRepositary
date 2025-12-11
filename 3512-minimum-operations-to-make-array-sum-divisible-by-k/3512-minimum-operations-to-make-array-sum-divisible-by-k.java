class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        int value =0;
        for(int i =0;i<n;i++){
            value += nums[i];

        }
        if(value < k)return value;
        else if(value == k)return 0;
        return value % k;

    }
}