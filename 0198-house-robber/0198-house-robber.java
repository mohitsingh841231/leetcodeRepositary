class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        dp[0] = nums[0];
        // dp[1] = nums[1];
        for(int i =1;i<nums.length;i++){
           int pick =0;
           if(i>1){
            pick = nums[i] + dp[i-2];
           }
           else{
            pick = nums[i];
           }
           int skip = dp[i-1];
           dp[i] = Math.max(skip,pick);
        }
        return dp[n-1];
    }
}