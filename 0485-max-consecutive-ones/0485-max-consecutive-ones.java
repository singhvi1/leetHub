class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp = 0;
        int ans = 0;

        for (int ele : nums) {
            if (ele == 1) {
                temp++;
                ans = Math.max(ans, temp);
            } else {
                temp = 0;
            }
        }

        return ans;
    }
}