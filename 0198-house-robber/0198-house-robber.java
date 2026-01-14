
// memoization


// class Solution {
//    int MaxRob(int []nums, int i ,Integer[]dp){
//         if(i >= nums.length)return 0;
//         if(dp[i] != null)return dp[i];
//         int pick = nums[i] +MaxRob(nums, i+2,dp);
      
//        int skip  = MaxRob(nums,i+1,dp);
//        return dp[i] = Math.max(pick, skip);
//     }
//     public int rob(int[] nums) {
//         Integer dp[] = new Integer[nums.length];
//         return MaxRob(nums,0,dp);
        
//     }
// }




class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        int n = dp.length;
        dp[0] = nums[0];
        for(int i =1;i<nums.length;i++){
            
           int pick;
            if (i > 1) {
                pick = nums[i] + dp[i - 2];
            } else {
                pick = nums[i]; 
            }

            int skip = dp[i - 1];
            dp[i] = Math.max(pick, skip);
        }
        return dp[n-1];
    }
}