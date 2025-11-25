class Solution {
    public String removeStars(String s) {
        Stack<Character> start = new Stack<>();
        Stack<Character> last = new Stack<>();
        for(int i =0;i<s.length();i++){
            
                if(s.charAt(i) != '*')start.push(s.charAt(i));
                if(s.charAt(i) == '*'){
                    if(!start.isEmpty())start.pop();
                }

        }
        while(!start.isEmpty()){
            last.push(start.pop());
        }
        String newVal = "";
        while(!last.isEmpty()){
            newVal = newVal+last.pop();

        }
        return newVal;
    }
}