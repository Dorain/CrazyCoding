public class Solution {
    public int maxProfit(int[] prices) {
        // 1. find profit every adjacent day; 2. sum up all positive ones;
	if(prices == null || prices.length == 0){
            return 0;
        }
        int sum = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] - prices[i-1]>0) sum+=prices[i] - prices[i-1];
        }
        return sum;
    }
}