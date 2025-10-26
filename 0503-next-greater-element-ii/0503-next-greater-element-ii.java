class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        
        Arrays.fill(res, -1);
        
        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
            
            while (!st.isEmpty() && nums[st.peek()] < num) {
                res[st.pop()] = num;
            }
            
            if (i < n) {
                st.push(i);
            }
        }
        return res;
    }
}
