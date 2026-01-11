class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                int freq = map.get(s.charAt(i));
                map.put(s.charAt(i),freq+1);
            }
        }
       List<Character> list = new ArrayList<>(map.keySet()); 
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));   
        StringBuilder sb = new StringBuilder();
        for (char ch : list) {
            int freq = map.get(ch);
            for (int i = 0; i < freq; i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
        
    }
}