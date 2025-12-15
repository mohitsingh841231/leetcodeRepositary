class Solution {
    public void AddNode(TreeNode root,int val, TreeNode node ){
        if(root.val < val){
            if(root.right == null){
                root.right = node;
                return;
            }
        AddNode(root.right,val,node);
        }
        else if(root.val > val){
            if(root.left == null){
                root.left = node;
                return;
            }
        AddNode(root.left,val,node);
        }

    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
       
        TreeNode node = new TreeNode(val);
         if(root == null)return node;
        AddNode(root,val,node);
        return root;

    }
}