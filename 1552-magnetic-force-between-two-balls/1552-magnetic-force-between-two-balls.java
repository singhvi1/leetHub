class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int low = 0;
        int high = position[n - 1] - position[0];

        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (isPossible(position, m, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;

    }

    private boolean isPossible(int[] arr, int k, int minDis) {
        int cow = 1;
        int prev = 0;
        for (int i = 1; i < arr.length; i++) {
            if (cow >= k)
                return true;
            if (Math.abs(arr[i] - arr[prev]) >= minDis) {
                cow++;
                prev = i;
            }
        }
        return cow >= k;
    }
}