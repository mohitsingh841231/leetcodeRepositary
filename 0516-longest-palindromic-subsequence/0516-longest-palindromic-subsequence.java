class Solution {
     public static int longestPalindromeSubseq(String s) {
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        int n = s.length();
        int m = s1.length();
        Integer dp[][] = new Integer[n][m];
        return longPalidromicmSub(n-1,m-1,s1,s,dp);


    }
    
    private static int longPalidromicmSub(int i, int j, StringBuilder s1, String s,Integer dp[][]) {
        if(i < 0 || j < 0)return 0;
        if(dp[i][j] != null)return dp[i][j];
        if(s.charAt(i) == s1.charAt(j)){
            return dp[i][j] = 1 + longPalidromicmSub(i-1,j-1,s1,s,dp);
        }
        return dp[i][j] =  Math.max(longPalidromicmSub(i-1,j,s1,s,dp) , longPalidromicmSub(i,j-1,s1,s,dp));
    }


}