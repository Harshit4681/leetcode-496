import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Keep track of minimum buying price
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate maximum profit
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
