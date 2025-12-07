
class Solution {
    void AddVal(TreeNode root,ArrayList<Integer> arr){
        if(root == null)return;
        arr.add(root.val);
        AddVal(root.left,arr);
        AddVal(root.right,arr);

    }
    public void flatten(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        AddVal(root,arr);
        TreeNode curr = root;
        if(arr.size() == 0)return;
        curr.left = null;
        curr.val = arr.get(0);
        for(int i =1;i<arr.size();i++){
            curr.right  = new TreeNode(arr.get(i));
            curr = curr.right;
            curr.left = null;
        }
        
    }
}