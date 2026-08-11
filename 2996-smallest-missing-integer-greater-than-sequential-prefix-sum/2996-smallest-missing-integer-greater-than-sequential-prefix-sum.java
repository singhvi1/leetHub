class Solution {
    public int missingInteger(int[] nums) {
        int i = 1;
        int sum = nums[i - 1];
        while (i<nums.length&& nums[i] == nums[i - 1] + 1) {
            sum += nums[i];
            i++;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int k = 0; k < nums.length; k++) {
            map.put(nums[k], k);
        }

        while(map.containsKey(sum)){
            sum++;
        }
        return sum ;
    }
}