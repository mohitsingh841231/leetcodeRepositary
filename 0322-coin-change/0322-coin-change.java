class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        long INF = (long) 1e9;

        long[][] dp = new long[n][amount + 1];

        // Initialize dp
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= amount; j++) {
                dp[i][j] = INF;
            }
        }

        // Base case: using only coin[0]
        for (int j = 0; j <= amount; j++) {
            if (j % coins[0] == 0)
                dp[0][j] = j / coins[0];
        }

        // Fill DP table
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= amount; j++) {

                // skip current coin
                long skip = dp[i - 1][j];

                
                long pick = INF;
                if (j >= coins[i]) {
                    pick = 1 + dp[i][j - coins[i]];
                }

                dp[i][j] = Math.min(pick, skip);
            }
        }

        long ans = dp[n - 1][amount];
        return ans >= INF ? -1 : (int) ans;
    }
}
