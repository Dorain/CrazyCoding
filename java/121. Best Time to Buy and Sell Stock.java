public class Solution {
    public int maxProfit(int[] prices) {
// kadane algorithm, cool!!!!!! calculate max end in every position i, the biggest one is the max subarray
        if(prices == null || prices.length == 0) return 0;
        int maxEndHere = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++){
            maxEndHere = Math.max(maxEndHere + prices[i]-prices[i-1], prices[i]-prices[i-1]);
            maxSoFar = Math.max(maxSoFar, maxEndHere);
        }
        return maxSoFar;
    }
}