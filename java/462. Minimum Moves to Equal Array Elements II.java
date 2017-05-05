public class Solution {
    public int minMoves2(int[] nums) {
        // to make the biggest and smallest number equal, we need biggest - smallest moves. 
        Arrays.sort(nums);
        int i = 0, j = nums.length-1, ans = 0;
        while(i < j){
            ans += nums[j--] - nums[i++]; 
        }
        return ans;
        // in this case, the equal number is the median. There is a solusion with O(n) based on this fact.
    }
}