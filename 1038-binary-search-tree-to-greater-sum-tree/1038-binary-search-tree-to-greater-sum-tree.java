
class Solution {
    void store(TreeNode root, ArrayList<TreeNode> arr){
        if(root == null)return;
        store(root.left,arr);
        arr.add(root);
        store(root.right,arr);

    }
    public TreeNode bstToGst(TreeNode root) {
        // if(root == null)return null;
        ArrayList<TreeNode> arr  = new ArrayList<>();
        store(root,arr);
        int sum =0;
        for(int i = arr.size()-1;i >= 0;i--){
            sum +=arr.get(i).val;
            arr.get(i).val = sum;
        }
        return root;
    }
}