class Solution {
    public int maxProfit(int[] prices) {
        dp = new Integer[prices.length];
        return solve(prices, 1, prices[0]);
    }
    Integer[] dp;
    private int solve(int arr[], int i, int buy) {
        if(i==arr.length) return 0;

        if(dp[i] != null) return dp[i];
        int res = 0;
        if(arr[i] > buy) {
            int sell = arr[i]-buy + solve(arr, i+1, arr[i]);
            int skip = solve(arr, i+1, buy);
            res =  Math.max(sell, skip);
        } else {
            res = solve(arr, i+1, arr[i]);
        }

         return dp[i] = res; 
    }
}