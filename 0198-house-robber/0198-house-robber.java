class Solution {
    public int rob(int[] nums) {
        int n =nums.length;
        int dp[] = new int [n];
        dp[0] = nums[0];
        if(n>1)dp[1] = Math.max(nums[0],nums[1]);
        if(n<=2)return dp[n-1];
        for(int i =2;i<n;i++){
            dp[2] = Math.max(nums[i]+dp[0],dp[1]);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[2];
    }
}