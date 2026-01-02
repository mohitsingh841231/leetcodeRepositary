class Solution {
    public int repeatedNTimes(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int ele : nums){
        if(!map.containsKey(ele)){
            map.put(ele,1);

        }
        else {
            int freq = map.get(ele);
            map.put(ele,freq+1);
        }

       }
       for(int key : map.keySet()){
        int freq = map.get(key);
        if(freq > 1)return key;
       }
       return -1;
    }
}