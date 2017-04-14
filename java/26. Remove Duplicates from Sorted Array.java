public class Solution {
    public int removeDuplicates(int[] nums) {
        // no java solution, since array length cant be change
        if(nums == null || nums.length == 0 ) return 0;
        int pre = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=nums[pre]) nums[++pre] = nums[i]; //consider the first element is always unique
        }
        return pre+1;
    }
}