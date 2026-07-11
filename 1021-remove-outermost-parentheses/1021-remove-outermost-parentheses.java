class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            // count -- -> ')'
            if (ch == ')') {
                count--;
            }
            // count 0 -> append ;
            if (count != 0) {
                sb.append(ch);
            }
            // count ++ -> '('
            
            if (ch == '(') {
                count++;
            }
        }

        return sb.toString();
    }
}