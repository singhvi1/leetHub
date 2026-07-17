class Solution {
    public int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE;
        int minPrice = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] - minPrice > profit) {
                profit = Math.max(profit, prices[i] - minPrice);
            }

            if (minPrice > prices[i]) {
                minPrice = prices[i];

            }
        }

        return profit;
    }
}