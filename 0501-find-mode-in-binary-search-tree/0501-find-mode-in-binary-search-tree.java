/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashMap<Integer,Integer> arr = new HashMap<>();
    
    public void mode(TreeNode root){
        if(root == null)return;
      
            arr.put(root.val,arr.getOrDefault(root.val, 0) + 1);
        
        mode(root.left);
        mode(root.right);
    }
    public int[] findMode(TreeNode root) {
        mode(root);

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