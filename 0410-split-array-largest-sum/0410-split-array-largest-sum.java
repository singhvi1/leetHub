class Solution {
    public int splitArray(int[] nums, int k) {
        if( k >nums.length) return -1;

        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cnt = findK(nums, mid);
            if (cnt > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;


    }

    private  int findK(int[] nums, int div) {
        int sum = 0;
        int cnt = 1;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] > div) {
                sum = nums[i];
                cnt++;
            } else {
                sum += nums[i];
            }
        }
        return cnt;
    }
}