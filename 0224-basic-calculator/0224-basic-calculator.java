class Solution {
    public int calculate(String s) {
      int n = s.length();
        Stack<Integer> st = new Stack<>();
        int number = 0;
        int result = 0;
        int sign = 1;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            } else if (ch == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (ch == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if (ch == '(') {
                st.push(result);
                st.push(sign);
                result = 0;
                sign = 1;
            } else if (ch == ')') {
                result += sign * number;
                number = 0;
                int stackSign = st.pop();
                int lastResult = st.pop();
                result = lastResult + stackSign * result;
            } else if (ch == ' ') {
                continue; // ignore spaces
            }
        }

        result += sign * number; // add last number
        return result;   
    }
}