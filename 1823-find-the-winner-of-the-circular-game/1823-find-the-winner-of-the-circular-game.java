class Solution {
    public int findTheWinner(int n, int k) {
        // Queue<Integer> q = new LinkedList<>();
        // for(int i =1;i<=n;i++){
        //     q.add(i);
        // }
        // while(q.size()>1){
        //     for(int i =1;i<=k-1;i++){
        //         q.add(q.remove());
        //     }
        //     q.remove();
        // }
        // return q.peek();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =1;i<=n;i++){
            arr.add(i);

        }
        int idx =0;
        while(arr.size() != 1){
             idx = (idx+k-1) % arr.size();
            arr.remove(idx);
           

        }
        return arr.get(0);

    }
}