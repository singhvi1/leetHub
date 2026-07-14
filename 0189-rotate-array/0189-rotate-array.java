class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length <= 1 || k == 0)
            return;

        k = k % nums.length;
        rotateArray(nums, 0, nums.length - 1);
        rotateArray(nums, 0, k - 1);
        rotateArray(nums, k, nums.length - 1);
    }

    int[] rotateArray(int[] nums, int start, int end) {
        while (start < end) {
            // swaping start and end ;
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;

        }
        return nums;
    }
}