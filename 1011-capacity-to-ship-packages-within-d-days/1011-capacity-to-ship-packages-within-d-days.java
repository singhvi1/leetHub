class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int sum = Arrays.stream(weights).sum();
        int min = Arrays.stream(weights).max().getAsInt();
        if (days == 1)
            return sum;
        for (int i = min; i <= sum; i++) {
            if (isAllowed(weights, days, i)) {
                return i;
            }
        }

        return -1;
    }

    private boolean isAllowed(int[] weights, int maxDays, int maxWeight) {
        //{1,2,3,4,5,6,7,8,9,10}
        int count = 0;
        int day = 1;
        for (int w : weights) {
            if ((count + w) > maxWeight) {
                count = w;
                //                System.out.println(count);
                day++;

            } else {
                count += w;
                //                System.out.println("3 . " + count);
            }
        }
        
        return day <= maxDays;
    }
}