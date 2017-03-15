public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int count = 0;
        int max = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0) count = 0;
            else count++;
            if(max<count) max = count;
        }
        return max;
    }
}
// amazing solustion
    // public int findMaxConsecutiveOnes(int[] nums) {
    //     int maxHere = 0, max = 0;
    //     for (int n : nums)
    //         max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
    //     return max; 
    // } 