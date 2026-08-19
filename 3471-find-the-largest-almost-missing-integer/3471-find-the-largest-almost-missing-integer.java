class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int r = k;
        while (r <= nums.length) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = l; i < r; i++) {
                set.add(nums[i]);
            }
            for (int num : set) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            r++;
            l++;
        }
        // System.out.println(map);
        int ans = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans = Math.max(ans, entry.getKey());
            }
        }

        // System.out.println(ans);
        return ans;
    }
}