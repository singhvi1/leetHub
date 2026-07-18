class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int pairCount = 0;   // local/ state var at method level ;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] + k)) {
                pairCount += map.get(nums[i] + k);
            }
        }
        return pairCount;
    }
}