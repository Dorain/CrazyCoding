public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        //kadanes's algorithm
        int maxEndHere = nums[0], maxSoFar = nums[0];
        for(int i = 1; i< nums.length; i++){
            maxEndHere = Math.max(nums[i], maxEndHere+nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndHere);
        }
        return maxSoFar;
    }
}