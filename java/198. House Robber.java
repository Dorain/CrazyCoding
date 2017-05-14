public class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        // dp. traverse from the fisrt house. dp[i] = max(dp[i-1], dp[i-2]+nums[i]);
        int[] maxSoFar = new int[nums.length+1];
        maxSoFar[1] = nums[0];
        for(int i = 2; i <= nums.length; i++){
            maxSoFar[i] = Math.max(maxSoFar[i-1], maxSoFar[i-2]+nums[i-1]);
        }
        return maxSoFar[nums.length];
    }
}