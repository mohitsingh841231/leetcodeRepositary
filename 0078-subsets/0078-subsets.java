class Solution {
    private void backTrack(List<List<Integer>> resultSet,List<Integer> temp,int nums[],int start){
        resultSet.add(new ArrayList<>(temp));
        for(int i =start;i<nums.length;i++){
            temp.add(nums[i]);

            backTrack(resultSet,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result , new ArrayList<>() , nums, 0);
        return result;
    }

}