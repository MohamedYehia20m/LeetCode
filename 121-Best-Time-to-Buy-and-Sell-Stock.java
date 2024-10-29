class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int maxprofit = 0;
        int len = prices.length;
        for(int i = 1 ; i < len ; i++)
        {
            if(prices[i] < minprice)
            {
                minprice = prices[i];
            }
            else
            {
                if(maxprofit < (prices[i] - minprice) )
                maxprofit = prices[i] - minprice;
            }
        }
    return maxprofit;
    }
}