class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int l = 0; l <= nums.length - k; l++) {
            Set<Integer> uniqueInWindow = new HashSet<>();
            for (int i = l; i < l + k; i++) {
                uniqueInWindow.add(nums[i]);
            }
            // Count each unique number once per subarray
            for (int num : uniqueInWindow) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int ans = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans = Math.max(ans, entry.getKey());
            }
        }

        return ans;
    }
}