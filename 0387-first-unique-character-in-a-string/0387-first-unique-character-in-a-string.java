class Solution {
    public int firstUniqChar(String s) {
        // for(int i =0;i<s.length();i++){
        //     for(int j =i+1j <= s.length()j++){
        //         if(s.fb !=s.charA)
        //     }
        // }
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char curr = s.charAt(i);
            mp.put(curr,mp.getOrDefault(curr,0)+1);
        }
        for(int i =0;i<s.length();i++){
            char curr = s.charAt(i);
            if(mp.get(curr)==1)return i;
        }
        return -1;
    }
}