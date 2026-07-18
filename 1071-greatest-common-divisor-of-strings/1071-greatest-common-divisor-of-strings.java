class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        // System.out.println(gcd(n, m));
        return ((str1 + str2).equals(str2 + str1)) ? str1.substring(0, gcd(str1.length(), str2.length())) : "";
    }

    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}