class Solution {
    public boolean check(int[] nums) {
        int n = 0;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                n = i+1;
                break;
            }

        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = n;i<nums.length;i++){
            result.add(nums[i]);
        }
        for(int i =0;i< n; i++){
            result.add(nums[i]);
        }

        for(int i =0;i<result.size()-1;i++){
            if(result.get(i) > result.get(i+1) )return false;
        }
        return true;

    }
}