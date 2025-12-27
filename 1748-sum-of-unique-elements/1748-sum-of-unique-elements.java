class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int ele : nums){
            if(!map.containsKey(ele)){
                map.put(ele,1);
                
            }
            else {
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
        }
        int max= 1,ans = 0;
        // ArrayList<Integer> arr =new ArrayList<>();
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq <= max){
                ans += key;
            }
        }
        return ans;
    }
}