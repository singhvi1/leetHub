class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int ans = Integer.MIN_VALUE;
        int prevMax=nums[0];

        for(int i =k ;i<nums.length;i++){
            prevMax=Math.max(nums[i-k],prevMax);

            ans=Math.max(ans, prevMax+nums[i]);
        }
        return ans;
    }
}