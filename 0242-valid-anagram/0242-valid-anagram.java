class Solution {
    public boolean isAnagram(String s, String t) {
        char[] t1 = t.toCharArray();
        char[] s1 = s.toCharArray();
        Arrays.sort(t1);
        Arrays.sort(s1);
        if (s.length() != t.length()) return false;
        for (int i = 0; i < t1.length; i++) {
            if (t1[i] != s1[i]) return false;
        }
        return true;
    }
}