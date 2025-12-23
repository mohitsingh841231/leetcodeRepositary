class Solution {
    int max =0;
    int count(int[] nums1, int[] nums2,int i,int j ,int dp[][]){
        if(i == nums1.length || j == nums2.length)return 0;
        if(dp[i][j] != -1)return dp[i][j]; 

        int ans =0;

        if(nums1[i] == nums2[j]){
           ans = 1 + count(nums1, nums2, i + 1, j + 1, dp);
            max = Math.max(max, ans);
        }
        else {
            ans =0;
        }
        dp[i][j] = ans;
        return ans;
        
    }
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int dp[][] = new int[n][m];
        for(int[] row :dp){
            Arrays.fill(row, -1);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                count(nums1, nums2, i, j, dp);
            }
        }

        return max;
    }
}