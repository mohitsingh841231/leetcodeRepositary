class Solution {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        visited[0] = true; 
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);

        while(!arr.isEmpty()){
            int curr = arr.remove(0);

            List<Integer> keys = rooms.get(curr);
            for(int j = 0; j < keys.size(); j++){
                int next = keys.get(j);

                if(!visited[next]){       
                    visited[next] = true;
                    arr.add(next);        
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(!visited[i]) return false;
        }

        return true;
    }
}
