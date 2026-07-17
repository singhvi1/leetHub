class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            //skip duplicates at start;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                //skip duplicates at start;
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int l = j + 1;
                int r = n - 1;
                while (l < r) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                    //skip duplicates at left and right;
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        ans.add(temp);

                        while (l < r && nums[l] == nums[l +1])
                            l++;
                        while (l < r && nums[r] == nums[r - 1])
                            r--;

                        r--;
                        l++;
                    } else if (sum > target) {
                        r--;
                    } else {
                        l++;
                    }

                }

            }
        }
        return ans;
    }
}