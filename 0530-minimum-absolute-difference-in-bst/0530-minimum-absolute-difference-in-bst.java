class Solution {
    void Store(TreeNode root ,ArrayList<Integer>arr){
        if(root == null)return;
        arr.add(root.val);
        Store(root.left,arr);
        Store(root.right,arr);
    }
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        Store(root,arr);
        int min = Integer.MAX_VALUE;
        int sum =0;
        for(int i =0;i<arr.size()-1;i++){
            for(int j =i+1;j<arr.size();j++){
                if(arr.get(i) > arr.get(j)){
                    sum = arr.get(i) - arr.get(j);
                    if(sum < min)min = sum;
                }
                else{
                    sum = arr.get(j) - arr.get(i);
                    if(sum < min)min = sum;
                }
            }
        }
        return min;
    }
}