class Solution {
    public int maxNumberOfBalloons(String text) {
        String given = "balloon";
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < given.length(); i++) {
            int freq = freq(text, given.charAt(i));
            if (given.charAt(i) == 'l' || given.charAt(i) == 'o') {
                freq /= 2;
            }
            if (freq >= 1) {
                map.put(given.charAt(i), freq);
                ans = Math.min(ans, freq);
            } else {
                return 0;
            }
        }
        return ans;
    }

    private int freq(String text, char c) {
        int count = (int) text.chars().filter(ch -> ch == c).count();
        return count;
    }
}