class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > (long) bloomDay.length) {
            return -1;
        }
        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();
        int ans = -1;
        // for (int day = min; day <= max; day++) {
        //     int mid=min + (max)
        //     if (isPossible(bloomDay, day, m, k)) {
        //         return day;
        //     }
        // }
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(bloomDay, mid, m, k)) {
                ans =mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;

    }

    private boolean isPossible(int[] bloomDay, int day, int m, int k) {
        int count = 0;
        int ans = 0;
        for (int bloom : bloomDay) {
            if (bloom <= day) {
                count++;

            } else {
                ans += count / k;
                count = 0;
            }
        }
        ans += count / k;

        return ans >= m;
    }
}