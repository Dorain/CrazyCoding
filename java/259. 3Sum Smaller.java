public class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        if(nums == null) return 0;
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i < nums.length-2; i++){
            int lo = i+1, hi = nums.length-1;
            while(lo < hi){
                if(nums[i] + nums[lo] + nums[hi] < target) {
                    count += hi - lo;
                    lo++;
                }
                else hi--; 
            }
    
        }
        return count;
    }
}
