class Solution {
   
    
    public void mode(TreeNode root, HashMap<Integer,Integer> arr){
        if(root == null)return;
      
            arr.put(root.val,arr.getOrDefault(root.val, 0) + 1);
        
        mode(root.left,arr);
        mode(root.right,arr);
    }
    public int[] findMode(TreeNode root) {
         HashMap<Integer,Integer> arr = new HashMap<>();
        mode(root,arr);

        int maxFreq = 0;
        for (int val : arr.values()) {
            maxFreq = Math.max(maxFreq, val);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int key : arr.keySet()) {
            if (arr.get(key) == maxFreq) {
                res.add(key);
            }
        }

        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}