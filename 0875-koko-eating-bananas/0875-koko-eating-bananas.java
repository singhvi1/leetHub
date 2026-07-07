class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 0;
        int high = Arrays.stream(piles).max().getAsInt();

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (calMinHour(piles, mid) <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private int calMinHour(int[] piles, int k) {
        int hour = 0;

        for (int pile : piles) {
            hour += Math.ceil((double) pile / k);
        }
        return hour;
    }
}