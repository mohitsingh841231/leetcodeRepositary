class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0; int left =0;
         Map<Character,Integer> map  = new HashMap();
         char[] arr = s.toCharArray();
         int i =0;
         for(;i<arr.length;i++){
            int idx =map.getOrDefault(arr[i],-1);
            if(idx != -1 && idx >= left){
                res = Math.max(res,i-1-left+1);
                left = idx + 1;
            }
            map.put(arr[i],i);
         }
         return Math.max(res,i-1-left+1);
    }
}