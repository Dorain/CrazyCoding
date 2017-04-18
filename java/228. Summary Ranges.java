public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<String>();
        if(nums == null || nums.length == 0) return ans;
        // tmp += nums[0];
        int begin = nums[0], end = nums[0];
        for(int i = 0; i < nums.length; i++){
            int tmp = nums[i];
            while(i+1 < nums.length && (nums[i+1] - nums[i]) == 1) i++;
            ans.add(""+ tmp + (tmp == nums[i] ? "":"->"+nums[i]));
        }
        return ans;
    }
}