class Solution {
   boolean search(int nums[],int sum, int i,Boolean dp[][]){
    if(sum == 0)return true;
    if(i >= nums.length )return false;
    if(dp[i][sum] != null )return dp[i][sum];
    boolean take =false;
    if(nums[i] <= sum){
         take = search(nums,sum-nums[i],i+1,dp);
    }
    boolean Nottake =  search(nums,sum,i+1,dp);
    return dp[i][sum] = take|| Nottake;
   }
    public boolean canPartition(int[] nums) {
        int sum =0;
       for(int i =0;i<nums.length;i++){
        sum += nums[i];
       }
       if(sum % 2 != 0 )return false;
       int FirstVal = sum / 2;
       Boolean dp[][] = new Boolean[nums.length][FirstVal+1];
       
       return search(nums,FirstVal,0,dp);

    }
}