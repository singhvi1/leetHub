class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char chOfs = s.charAt(i);
            char chOft = t.charAt(i);

            if (map.containsKey(chOfs) && map.get(chOfs) != chOft) {
                return false;
            } else if (!map.containsKey(chOfs) && map.containsValue(chOft)) {
                return false;
            }

            map.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }
}