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
    //  int countVal =0;
    public int countNodes(TreeNode root) {
         return count(root,0);
         
        
    }
     static int  count(TreeNode root,int countVal){
        if(root == null)return 0;
        
        int left = count(root.left,countVal+1);
        int right = count(root.right, countVal+1);
        return 1+left + right;
        
     }
}