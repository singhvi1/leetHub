class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        List<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                ans.add(nums1[i]);
                i++;
            } else {
                ans.add(nums2[j++]);
            }
            // System.out.println(ans);
        }
        for (int x = i; x < n; x++) {
            ans.add(nums1[x]);
        }
        for (int y = j; j < m; j++) {
            ans.add(nums2[j]);
            // System.out.println(ans);
        }

        // int mid = m + n;
        // if (mid % 2 != 0) {
        //     int inx = (int) Math.ceil((double) mid / 2);
        //     return (double) ans.get(inx);
        // } else {
        //     // even 
        //     return (double) ((ans.get(mid) + ans.get(mid + 1)) / 2);
        // }

        if (ans.size() % 2 != 0) {
            int inx = (int) Math.ceil((double) ans.size() / 2);
            // System.out.println(inx+ " "+ ans.get(inx));
            return ans.get(inx - 1);
        } else {
            // even 
            int mid = (ans.size() / 2);
            System.out.println(ans.get(mid - 1) + " " + ans.get(mid));
            return ((double)(ans.get(mid - 1) + ans.get(mid)) / 2);
        }
    }
}