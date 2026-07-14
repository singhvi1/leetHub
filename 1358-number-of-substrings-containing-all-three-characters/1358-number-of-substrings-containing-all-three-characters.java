class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;

        int[] freq = { -1, -1, -1 };

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a'] = i;
            int min = Arrays.stream(freq).min().getAsInt();
            if (min != -1) {
                count += 1+min;
            }
        }
        return count;
    }
}