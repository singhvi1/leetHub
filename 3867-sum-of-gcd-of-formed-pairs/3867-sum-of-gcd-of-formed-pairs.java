class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            prefixGcd[i] = gcd(nums[i], max);
        }
        Arrays.sort(prefixGcd);
        // System.out.println(Arrays.toString(prefixGcd));
        long ans = 0;
        int low = 0;
        int high = n - 1;
        while (low < high) {
            ans += gcd(prefixGcd[low++], prefixGcd[high--]);
        }

        return ans;

    }

    int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
}