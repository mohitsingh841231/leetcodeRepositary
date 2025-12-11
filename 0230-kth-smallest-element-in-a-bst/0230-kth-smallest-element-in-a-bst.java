
class Solution {
    public void search(TreeNode root, int k , ArrayList<Integer>arr){
        if(root == null)return;
        arr.add(root.val);
        search(root.left,k,arr);
        search(root.right,k,arr);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        search(root,k,arr);
        Collections.sort(arr);
        return arr.get(k-1);

    }
}