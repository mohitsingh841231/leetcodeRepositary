class Solution {
    private void recurPermit(int nums[],ArrayList<Integer>ds ,List<List<Integer>> ans, boolean[] freq){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i =0;i<nums.length;i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                recurPermit(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }

        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        recurPermit(nums,ds,ans,freq);
        return ans;
    }
}