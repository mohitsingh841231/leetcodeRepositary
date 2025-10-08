class Solution {
        public String minRemoveToMakeValid(String s) {
        int n = s.length();
        Stack<Integer> sc = new Stack<>();
        Set<Integer> st = new HashSet<>();
        for(int i =0;i<n;i++ ){
            if(s.charAt(i) == '('){
                sc.push(i);
            } else if (s.charAt(i) == ')') {
                if(sc.isEmpty()){
                    st.add(i);
                }
                else{
                    sc.pop();
                }
            }

        }
        while(!sc.isEmpty()){
            st.add(sc.peek());
            sc.pop();
        }
        String result = "";
        for(int i =0;i<n;i++){
            if (!st.contains(i)) {
                result += s.charAt(i);
            }
        }

//
        return result;
    }
}