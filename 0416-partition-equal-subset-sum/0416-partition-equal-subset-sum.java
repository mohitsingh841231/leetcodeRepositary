class Solution {
    boolean subSet(int[]nums,int idx ,int sum, Boolean dp[][]){
        if(idx == nums.length){
            if(sum == 0)return true;
            else return false;
        }
        if(dp[idx][sum] != null)return dp[idx][sum];
        boolean pick = false ;
        boolean skip  = false;
        if(sum - nums[idx] >= 0){
             pick = subSet(nums,idx+1,sum-nums[idx],dp);
        }
         skip = subSet(nums,idx+1,sum,dp);
        return  dp[idx][sum] = pick || skip; 
    }
    public boolean canPartition(int[] nums) {
        int sum =0;
        int n = nums.length ;
        
      
        for(int i =0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        int val = sum /2;
        Boolean dp[][] = new Boolean[n][val+1];
        if(sum % 2 != 0)return false;
        return subSet(nums,0,sum/2,dp);
    }

}