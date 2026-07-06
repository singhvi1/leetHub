class Solution {
    public int search(int[] nums, int target) {
        // binary search   -> sorted check  - > change l/h;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == nums[mid])
                return mid;

            // left part is sorted 
            if (nums[mid] >= nums[low]) {
                // if target is on sorted part 
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {// right part is sorted
                // target is on sorted part 
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}