class Solution {
    public void search(TreeNode root, int k,ArrayList<Integer> arr){
        if(root == null)return;
        arr.add (root.val);
        search(root.left,k,arr);
        search(root.right,k,arr);
    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        search(root,k,arr);
        for(int i =0;i<arr.size()-1;i++){
            if(arr.get(i) == null)continue;
            for(int j =i+1;j<arr.size();j++){
                if(arr.get(j) == null)continue;
                if(arr.get(i) + arr.get(j) == k)return true ;
            }
        }
        return false;
        
    }
}