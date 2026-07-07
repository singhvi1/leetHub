class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (nums.length <= 1) return nums[0];

        if (nums[0] != nums[1]) {
            return nums[0];
        } else if (nums[n - 1] != nums[n - 2]) {
            return nums[n - 1];
        }

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {// odd
                return nums[mid];
            }

            // return odd ->
            if (mid % 2 != 0 && nums[mid] == nums[mid - 1]  || mid % 2 == 0 && nums[mid] == nums[mid +1]) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}