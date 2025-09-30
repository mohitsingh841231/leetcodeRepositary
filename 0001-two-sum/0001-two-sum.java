class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] n = new int[2];
        for(int i=0;i<nums.length;i++){
            boolean flag = false;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]== target){
                    n[0] = i;
                    n[1] = j;
                    flag = true;
                    break;
                }
            }
            if(flag == true)break;
        
        }
        return n;
    }
}