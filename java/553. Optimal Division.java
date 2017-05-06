public class Solution {
    public String optimalDivision(int[] nums) {
        String ans = new String();
        if(nums == null || nums.length == 0) return ans;
        ans += nums[0];
        if(nums.length == 1) return ans;
        if(nums.length == 2) return ans + "/" + nums[1];
        ans += "/(" + nums[1];
        for(int i = 2; i < nums.length; i++){
            ans += "/" + nums[i];
        }
        ans += ")";
        return ans;
    }
}