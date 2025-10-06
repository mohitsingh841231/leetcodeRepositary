class Solution {
    public boolean isAnagram(String s1, String s2) {
        char[] a1 = s1.toCharArray();

        char[] a2 = s2.toCharArray();
        if(a1.length != a2.length)return false;
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(int i =0;i<a1.length;i++){
            if(a1[i] != a2[i])return false;
        }
        return true;


        // HashMap<Character,Integer> mp  = new HashMap<>();
        // for(int i =0;i<s1.length();i++){
        //     mp.put(s1.charAt(i),mp.getOrDefault(s2.chartAt(i)-1));
            
        // }

    }
}