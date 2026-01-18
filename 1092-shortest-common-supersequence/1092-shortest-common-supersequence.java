class Solution {

    String function(String s1, String s2, int i, int j,String dp[][]) {
        if (i < 0 || j < 0) return "";
        if(dp[i][j] != null) return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = function(s1, s2, i - 1, j - 1,dp) + s1.charAt(i);
        }

        String scs1 = function(s1, s2, i - 1, j,dp);
        String scs2 = function(s1, s2, i, j - 1,dp);

        return dp[i][j] = (scs1.length() > scs2.length()) ? scs1 : scs2;
    }

    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        String dp[][] = new String[m][n];
        String s = function(str1, str2, m - 1, n - 1,dp);
        StringBuilder sc = new StringBuilder("");

        int i = 0, j = 0;

        for (int k = 0; k < s.length(); k++) {
            char ch = s.charAt(k);

            while (i < m && str1.charAt(i) != ch) {
                sc.append(str1.charAt(i));
                i++;
            }

            while (j < n && str2.charAt(j) != ch) {
                sc.append(str2.charAt(j));
                j++;
            }
            sc.append(ch);
            i++;
            j++;
        }

        while (i < m) {
            sc.append(str1.charAt(i++));
        }

        while (j < n) {
            sc.append(str2.charAt(j++));
        }

        return sc.toString();
    }
}
