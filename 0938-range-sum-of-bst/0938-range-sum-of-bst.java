class Solution {
    int result =0;
    public void search(TreeNode root, int low, int high){
        if(root == null)return;
        if(low < root.val && root.val < high){
            result +=root.val;
        }
        search(root.left,low,high);
        search(root.right,low,high);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        search(root,low,high);
        return result + low + high;
    }
}