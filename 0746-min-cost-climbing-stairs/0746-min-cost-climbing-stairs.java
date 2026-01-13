class Solution {
    int func(int[]cost ,int i,Integer dp[]){
        if(i>= cost.length)return 0;
        if(dp[i] != null)return dp[i];
        return dp[i] = cost[i] + Math.min(func(cost,i+1,dp),func(cost,i+2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        Integer dp[] =  new Integer[cost.length];
        return Math.min(func(cost,0,dp),func(cost,1,dp));
    }
}