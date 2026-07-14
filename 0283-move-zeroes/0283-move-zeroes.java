class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        if (k == 0) {
            return;
        }

        for (int j = k; j < n; j++) {
            nums[j] = 0;
        }
    }
}