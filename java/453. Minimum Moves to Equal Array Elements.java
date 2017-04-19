public class Solution {
    public int minMoves(int[] nums) {
        // add n-1 is equal to substract 1
        if(nums == null || nums.length == 0) return 0;
        int min = nums[0];
        int sum = 0;
        for(int n: nums){
            min = n < min ? n : min;
            sum += n;
        }
        return sum - min * nums.length;
    }
}