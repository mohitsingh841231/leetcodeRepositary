 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
class Solution {
    TreeNode search(int[]nums, int low,int high){
        if(low > high)return null;
        int mid = low + (high - low)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = search(nums,low,mid-1);
        root.right = search(nums , mid+1, high);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return search(nums, 0 , nums.length-1);

    }
}