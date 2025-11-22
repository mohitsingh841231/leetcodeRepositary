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
    public int sumNumbers(TreeNode root) {
        return sum(root,0);
    }
    static int sum(TreeNode root,int value ){
        if(root == null)return 0;
        value = value*10 + root.val;
        if (root.left == null && root.right == null)return value;
       int v1 =  sum(root.left, value);
       int v2 =  sum(root.right,value);
        return v1+v2;

       
    }
}