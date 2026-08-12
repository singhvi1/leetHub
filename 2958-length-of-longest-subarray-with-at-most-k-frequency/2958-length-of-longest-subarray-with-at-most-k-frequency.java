class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int maxLen = Integer.MIN_VALUE;
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < nums.length; right++) {
            int ele = nums[right];
            map.put(ele, map.getOrDefault(ele, 0) + 1);

            // shrink only if ele broke the rule ;

            while (map.get(ele) > k) {
                int temp = nums[left];
                map.put(temp, map.get(temp) - 1);
                if (map.get(temp) == 0) {
                    map.remove(temp);
                }

                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }


        return maxLen;
    }
}