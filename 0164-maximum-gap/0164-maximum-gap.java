class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if(n == 1)return 0;
        int count =0;
        Arrays.sort(nums);
        for(int i =0;i<n-1;i++){
            int x = nums[i+1] - nums[i];
           
            if(x > count)count = x;

        }
        return count;
    }
}