class Solution {
    void Store(TreeNode root,ArrayList<Integer>arr){
        if(root == null)return;
        arr.add(root.val);
        Store(root.left , arr);
        Store(root.right , arr);

    }
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        Store(root,arr);
        Collections.sort(arr);
        TreeNode dummy = new TreeNode(0);
        TreeNode curr = dummy;
        
        for(int i =0;i<arr.size();i++){
            curr.left = null;
            curr.right = new TreeNode(arr.get(i));
            curr = curr.right;
        }
        return dummy.right;
    }
}