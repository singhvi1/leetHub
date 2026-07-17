class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int min = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            min = Math.min(min, nums[mid]);
            // left is sorted ;

            if (nums[mid] >= nums[low]) {// left side sorted;
                min = Math.min(min, nums[low]);
                low = mid + 1;
            } else {
                min = Math.min(min, nums[high]);
                high = mid - 1;
            }

        }

        return min;

    }
}