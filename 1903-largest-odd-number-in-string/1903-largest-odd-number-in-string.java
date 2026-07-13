class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            
            int temp = Integer.valueOf(num.charAt(i) - '0');
            if (temp % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}