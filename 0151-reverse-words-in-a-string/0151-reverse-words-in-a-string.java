class Solution {
    public String reverseWords(String s) {
        s.trim();
        ArrayList<String> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                System.out.println(sb.toString());
                if (sb.length() > 0) {
                    list.add(sb.toString().trim());
                }
                sb.setLength(0);
                // System.out.println(list);

            } else {
                sb.append(s.charAt(i));
            }
        }
        // System.out.println(list);
        if (sb.length() > 0) {
            list.add(sb.toString());
        }
        Collections.reverse(list);
        System.out.println(list);
        return String.join(" ", list).trim();
    }
}