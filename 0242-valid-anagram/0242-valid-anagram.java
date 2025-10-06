class Solution {
    public boolean isAnagram(String s1, String s2) {
        // char[] a1 = s1.toCharArray();

        // char[] a2 = s2.toCharArray();
        // if(a1.length != a2.length)return false;
        // Arrays.sort(a1);
        // Arrays.sort(a2);
        // for(int i =0;i<a1.length;i++){
        //     if(a1[i] != a2[i])return false;
        // }
        // return true;



        HashMap<Character,Integer> mp  = new HashMap<>();
        if(s1.length()!=s2.length())return false;
        for(int i =0;i<s1.length();i++){
            char curr = s1.charAt(i);
            mp.put(curr,mp.getOrDefault(curr,0)+1);

            
        }
        for(int i =0;i<s2.length();i++){
            char curr = s2.charAt(i);
            if(!mp.containsKey(s2.charAt(i)))return false;
            else{
                int prevFreq = mp.get(curr);
                int newFreq = prevFreq-1;
                mp.put(curr,newFreq);
                if(newFreq == 0)mp.remove(curr);
            }
        }
        return true;

    }
}