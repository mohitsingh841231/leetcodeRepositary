class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        Integer dp[][] = new Integer[n][m];
        return function(n-1,m-1,new StringBuilder(text1),new StringBuilder(text2),dp);
    }

    private int function(int i, int j, StringBuilder s1, StringBuilder s2, Integer dp[][]) {
        if(i<0 || j<0)return 0;
        if(dp[i][j] != null) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)){
            return 1 + function(i-1,j-1,s1,s2,dp);
        }
        return dp[i][j] = Math.max(function(i-1,j,s1,s2,dp),function(i,j-1,s1,s2,dp));
    }
}