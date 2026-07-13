class Solution {
    public boolean rotateString(String s, String goal) {
        String x = goal + goal;

        return x.contains(s);
 
    }
}