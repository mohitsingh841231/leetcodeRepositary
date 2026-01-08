class Solution {
    void findSubset(int[] nums,ArrayList<Integer> ds, List<List<Integer>> ansList,int ind){
        ansList.add(new ArrayList<>(ds));
        for(int i = ind;i < nums.length;i++){
            if(i != ind && nums[i] == nums[i-1])continue;
            ds.add(nums[i]);
            findSubset(nums,ds,ansList,i+1);
            ds.remove(ds.size()-1);
        }

    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> ansList = new ArrayList<>();

       findSubset(nums,new ArrayList<>(), ansList,0);
       return ansList;

    }
}