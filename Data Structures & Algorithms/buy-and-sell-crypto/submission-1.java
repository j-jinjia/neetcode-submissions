class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;   // Buy pointer
        int right = 1;  // Sell pointer
        int maxProfit = 0;
        
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                // Valid transaction: we buy before we sell
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            } else {
                // Found a new minimum, move buy pointer
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}