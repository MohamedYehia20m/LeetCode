class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        maxprofit=0
        for i in range(1,len(prices)):
            if prices[i] > prices[i-1]:
                profit= prices[i] - prices[i-1]
                maxprofit= maxprofit + profit
            

        return maxprofit