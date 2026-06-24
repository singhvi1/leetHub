class Solution {
    public int shipWithinDays(int[] weights, int days) {

       int high = Arrays.stream(weights).sum();
        int low = Arrays.stream(weights).max().getAsInt();
        if (days == 1) return high;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isAllowed(weights, days, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }


        return ans;
    }

    private boolean isAllowed(int[] weights, int maxDays, int maxWeight) {
        //{1,2,3,4,5,6,7,8,9,10}
        int count = 0;
        int day = 1;
        for (int w : weights) {
            if ((count + w) > maxWeight) {
                count = w;
                day++;

            } else {
                count += w;
            }
        }
        
        return day <= maxDays;
    }
}