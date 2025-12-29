class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            if(!map.containsKey(ele)){
                map.put(ele,1);
            }
            else {
                int freq = map.get(ele);
                map.put(ele,freq +1);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>(map.keySet());
        Collections.sort(arr, (a, b) -> map.get(b) - map.get(a));
        int result[] = new int[k];
        for(int i =0;i<k;i++){
            result[i] = arr.get(i);
        }
        
        return result;
    }
}