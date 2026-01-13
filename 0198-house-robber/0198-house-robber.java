class Solution {
   int MaxRob(int []nums, int i ,Integer[]dp){
        if(i >= nums.length)return 0;
        if(dp[i] != null)return dp[i];
        int pick = nums[i] +MaxRob(nums, i+2,dp);
      
       int skip  = MaxRob(nums,i+1,dp);
       return dp[i] = Math.max(pick, skip);
    }
    public int rob(int[] nums) {
        Integer dp[] = new Integer[nums.length];
        return MaxRob(nums,0,dp);
        
    }
}