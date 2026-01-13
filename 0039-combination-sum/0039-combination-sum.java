class Solution {
     void func(int[] candidates, int target,List<List<Integer>> arr,ArrayList<Integer> value,int i){
       if (target == 0) {
            arr.add(new ArrayList<>(value)); 
            return;
        }

        if (i == candidates.length || target < 0) return;
        value.add(candidates[i]);
        func(candidates, target - candidates[i], arr, value, i);
        value.remove(value.size() - 1); 
        func(candidates, target, arr, value, i + 1);
     }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> value  = new ArrayList<>();
        func(candidates,target,arr,value,0);
        return arr;
        
    }
}