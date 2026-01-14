class Solution {
  
    long minimumCoin(int[] coins,int idx ,int sum,long dp[][]){
       if(idx == coins.length){
            if (sum == 0) {
                return 0;
            }
            else {
                return Integer.MAX_VALUE;
            }
       }
       if(dp[idx][sum] != -1)return dp[idx][sum];
        long skip = minimumCoin(coins , idx+1 , sum , dp);
        if(sum - coins[idx] < 0)return skip;
        else{
            long pick = 1+ minimumCoin(coins , idx , sum - coins[idx], dp);
            return dp[idx][sum] = Math.min(pick , skip);
        }
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        long[][] dp = new long[n][amount + 1];
for (int i = 0; i < n; i++) {
    Arrays.fill(dp[i], -1);
}
        long ans = minimumCoin(coins,0,amount,dp);
        return (ans >= Integer.MAX_VALUE)? -1:(int)ans;
        
    }
}