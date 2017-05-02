public class Solution {
    public int numSquares(int n) {
        // dynamic programming
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i = 1; i <= n; i++){
            int minNum = Integer.MAX_VALUE;
            int j = 1;
            while(j <= i/j){
                minNum = Math.min(1+dp[i - j*j], minNum);
                j++;
            }
            dp[i] = minNum;
        }
        return dp[n];
    }
}