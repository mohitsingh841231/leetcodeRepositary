
class Solution {
    public void FirstTree(TreeNode root1, TreeNode root2,ArrayList<Integer>arr){
        if(root1 == null)return;
        arr.add(root1.val);
        FirstTree(root1.left,root2 , arr);
        FirstTree(root1.right,root2 , arr);


    }
    public void SecondTree(TreeNode root1, TreeNode root2,ArrayList<Integer>arr){
        if(root2 == null)return;
        arr.add(root2.val);
        SecondTree(root1 , root2.left,arr);
        SecondTree(root1 , root2.right,arr);
    }


    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr = new ArrayList<>();
        FirstTree(root1,root2,arr);
        SecondTree(root1,root2,arr);
        Collections.sort(arr);
        return arr;
    }
}