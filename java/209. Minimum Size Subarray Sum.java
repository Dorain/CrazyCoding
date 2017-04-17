public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        // since all numbers are positive, to find the continuous subarray, we can start from idx 0 to idx i and then increase start idx;
        int begin = 0, end = 0, min = Integer.MAX_VALUE;
        int sum = 0;
        while(end < nums.length){
            sum += nums[end++];
            while(sum>= s){
                min = Math.min(min, end-begin);
                sum -= nums[begin++];
            }
        }
        return min<Integer.MAX_VALUE ? min:0;
    }
}