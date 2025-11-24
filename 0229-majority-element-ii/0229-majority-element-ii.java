class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        HashMap<Integer,Integer> hp  = new HashMap<>();
        for(int i:nums) {
            if(!hp.containsKey(i)){
                hp.put(i,1);
            }
            else{
                int fre = hp.get(i);
                hp.put(i,fre+1);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
            
        for(int key:hp.keySet()){
            if(hp.get(key)>n/3){
                arr.add(key);

            }
        
        }
        return arr;
    }
}