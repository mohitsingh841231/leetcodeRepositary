class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> mp =new HashMap<>();
        for(int i =0;i<s.length();i++){
            char curr = s.charAt(i);
            
            if(mp.containsKey(curr));
            mp.put(curr,mp.getOrDefault(curr,0)+1);
        }
        for(int i =0;i<t.length();i++){
            char  curr = t.charAt(i);
            if(!mp.containsKey(t.charAt(i)))return curr;
            else{
                int prevFreq = mp.get(curr);
                int newFreq = prevFreq-1;
                mp.put(curr,newFreq);
                if(newFreq == 0)mp.remove(curr);
            }
        }
        return'a';
    }
}