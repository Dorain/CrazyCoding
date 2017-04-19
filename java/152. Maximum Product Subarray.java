public class Solution {
    public int maxProduct(int[] nums) {
        // kadane algorithm
        if(nums == null || nums.length == 0) return Integer.MIN_VALUE;
        int maxEndHere = nums[0], minEndHere = nums[0], maxSoFar = nums[0];
        
        for(int i = 1; i< nums.length; i++){
            int maxTmp = Math.max(Math.max(nums[i]*maxEndHere, nums[i]), nums[i]*minEndHere);
            int minTmp = Math.min(Math.min(nums[i]*maxEndHere, nums[i]), nums[i]*minEndHere);
            maxSoFar = Math.max(maxSoFar, maxTmp);
            maxEndHere = maxTmp;
            minEndHere = minTmp;
        }
        return maxSoFar;
    }
}