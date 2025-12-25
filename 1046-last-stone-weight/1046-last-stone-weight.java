class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> arr =  new ArrayList<>();
        for(int ele : stones){
            arr.add(ele);
        
        }
        if(arr.size() == 0 || arr.size() < 0)return -1;
        int cost =0;
        
        while(arr.size()>1){
            Collections.sort(arr);
            int a = arr.remove(arr.size()-1);
            int b = arr.remove(arr.size()-1);
            cost = a - b ;
            arr.add(cost);
        }
        return arr.get(0);
    }
}