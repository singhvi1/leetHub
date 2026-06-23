class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isThresHold(nums, mid, threshold)) {
                ans = mid;
                high = mid - 1;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }


    private  boolean isThresHold(int[] nums, int key, int threshold) {
        int count = 0;
        for (int num : nums) {
            count += Math.ceil((double) num / key);
        }


        return count <= threshold;
    }
}