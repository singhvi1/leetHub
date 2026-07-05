class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        int ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;


            if (nums[mid] >= target) {
                high = mid - 1;
                ans = Math.min(ans, mid);
            } else {
                low = mid + 1;
            }

        }
        return ans;
    }
}