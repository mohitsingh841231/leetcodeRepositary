class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
       HashMap<Integer,Integer> mp = new HashMap<>();
      
       for(int i = 0;i<arr.length;i++) {
            int curr = arr[i];
            if(mp.containsKey(curr)){
                int pevIndex = mp.get(curr);
                if(Math.abs(i - pevIndex)<=k)return true;
                else mp.put(curr,i);
            }
            else mp.put(curr,i);

            
       }
       return false;
    }
}