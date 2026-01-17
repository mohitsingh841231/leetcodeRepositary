class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        Integer dp[][] = new Integer[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(text1.charAt(i) == text2.charAt(j)){
                dp[i][j] = 1 + ((i>0 && j>0) ?  dp[i-1][j-1]: 0);
                }
                else{
                    dp[i][j] = Math.max(
                   ((i>0) ? dp[i-1][j]:0) , (j > 0) ? dp[i][j-1] : 0);
                }
            }
        }
        return dp[n-1][m-1];
        
    }

    
}