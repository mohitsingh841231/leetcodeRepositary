class Solution {
    
    int countValue(String text1 , String text2,int i , int j,int dp[][]){
        if(i == text1.length() || j == text2.length())return 0;
        if(dp[i][j] != -1)return dp[i][j];
        if(text1.charAt(i) == text2.charAt(j)){
            return dp[i][j] = 1+countValue(text1,text2,i+1,j+1 ,dp);
        }
        else {
           return dp[i][j] = Math.max(
                countValue(text1 , text2 , i+1 , j, dp),
                countValue(text1 , text2 , i , j+1, dp)
            );
            
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[text1.length()][text2.length()];
        for(int[] row:dp){
            Arrays.fill(row, -1);
        }
       return countValue(text1,text2,0,0,dp);

      
    }
}