class Solution {
    public int levels(TreeNode root){
        if(root == null)return 0;
        return 1+ Math.max(levels(root.left),levels(root.right));
    }
    public void dfs(TreeNode root,int level, int arr[]){
        if(root == null) return;
        arr[level] = root.val;
        dfs(root.left,level+1,arr);
        dfs(root.right,level+1,arr);
    }

    
    public List<Integer> rightSideView(TreeNode root) {
       int arr[] = new int[levels(root)];
       dfs(root,0,arr);
       ArrayList<Integer> newArr = new ArrayList<>();
       for(int value:arr){
        newArr.add(value);

       }
       return newArr;
        
    }
}