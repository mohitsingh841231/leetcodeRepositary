
class Solution {
  public void search(TreeNode root, ArrayList<TreeNode> arr){
        if(root == null)return;
        search(root.left,arr);
        arr.add(root);
        search(root.right,arr);

    }
    public TreeNode convertBST(TreeNode root) {
        if(root == null)return null;
        ArrayList<TreeNode> arr = new ArrayList<>();
        search(root,arr);
        int sum =0;
//        int temp = arr.get(arr.size()-1).val;
        for(int i = arr.size() - 1; i >= 0; i--) {
            sum += arr.get(i).val;
            arr.get(i).val = sum;
        }
        return root;
    }
}