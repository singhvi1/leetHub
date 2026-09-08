class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty())
            return 0;
        int sign = s.charAt(0) == '-' ? -1 : +1;
        int i = 0, n = s.length();
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            i = 1;
        }
        long ans = 0;
        while (i < n) {
            if (Character.isDigit(s.charAt(i))) {
                ans = ans * 10 + (s.charAt(i) - '0');
            } else {
                break;
            }
            if (sign == 1 && ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -ans < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int) ans*sign;
    }
}