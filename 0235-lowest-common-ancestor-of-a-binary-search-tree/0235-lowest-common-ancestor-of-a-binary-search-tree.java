class Solution {

    TreeNode ans = null;

    void test(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return;

        if (root.val < p.val)
            test(root.right, p, q);
        else if (root.val > q.val)
            test(root.left, p, q);
        else {
            ans = root;   
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val > q.val){
            TreeNode temp = p;
            p = q;
            q = temp;
        }
        test(root, p, q);

        return ans;
    }
}
