class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count =0;

        HashSet<Character> mp = new HashSet<>();
        for(int i =0;i<jewels.length();i++){
           mp.add(jewels.charAt(i));
        }
        for(int j =0;j<stones.length();j++){
            if(mp.contains(stones.charAt(j)))count++;


        }
        return count;
        
    }
}