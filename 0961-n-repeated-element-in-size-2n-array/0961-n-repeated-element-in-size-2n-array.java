class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            if (set.contains(ele))return ele;
            else{
                set.add(ele);
            }
        }
        return -1;
    }
}