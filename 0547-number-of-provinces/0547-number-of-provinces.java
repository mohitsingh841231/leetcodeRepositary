class Solution {
    public int findCircleNum(int[][] nums) {
        int n = nums.length;
        int count =0;
        boolean[] visited = new boolean[n];
        for(int i =0;i<n;i++){
            if(!visited[i]){
                bfs(i,visited,nums);
                count++;
            }
        }
        return count;
        
    }
    private void bfs(int i,boolean[] visited, int[][]nums){
        int n = nums.length;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i]  = true;
        while(q.size() > 0){
            int front = q.remove();
            for(int j = 0;j<n;j++){
                if(nums[front][j] == 1 && visited[j] == false){
                    q.add(j);
                    visited[j] = true;
                }
            }
        }
    }
}