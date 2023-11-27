package SlidingWindow;

public class BuyAndSellStock {

    public int profit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < min) min = prices[i];
            else if(maxProfit < prices[i] - min) maxProfit = prices[i] - min;
        }
        return maxProfit;
    }
}
