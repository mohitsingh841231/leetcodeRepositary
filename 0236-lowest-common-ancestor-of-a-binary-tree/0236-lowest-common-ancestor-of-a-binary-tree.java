/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    boolean contains(TreeNode root,TreeNode node){
        if(root == null)return false;
        if(root.val == node.val)return true;
        return contains(root.left,node) || contains(root.right,node);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val == p.val || root.val == q.val )return root;
        boolean f1 = contains(root.left,p);
        boolean f2 = contains(root.right,q);
        if(f1 && !f2)return lowestCommonAncestor(root.left,p,q);
        if(!f1 && f2)return lowestCommonAncestor(root.right,p,q);
        return root;

        
    }
}