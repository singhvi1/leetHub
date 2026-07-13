class Solution {
    public String largestOddNumber(String num) {
        char[] ch = num.toCharArray();
        // System.out.println(ch[0]);
        // int ans = -1;
        for (int i = ch.length - 1; i >= 0; i--) {
            int temp = ch[i] -'0';
            if (temp % 2 != 0) {
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}