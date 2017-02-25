public class Solution {
    public int[] searchRange(int[] nums, int target) {
        // find start and end position seperately, bs for each case
        int[] result = {-1, -1};
        if(nums == null || nums.length == 0) return result;
        // for start position
        int lo = 0, hi = nums.length -1;
        while(lo < hi){
            int mid = lo + (hi - lo)/2;
            if(nums[mid] >= target) {
                hi = mid -1;
            }
            else{
                lo = mid+1;
            }
            //*********************************
            if(nums[mid] == target) result[0] = mid;
            //*********************************
        }
        if( nums[lo] == target) result[0] = lo;
        lo = 0;
        hi = nums.length - 1;
        while(lo < hi){
            int mid = lo + (hi - lo)/2;
            if(nums[mid] <= target) {
                lo = mid + 1;
            }
            else{
                hi = mid-1;
            }
             if(nums[mid] == target) result[1] = mid;
        }
        if( nums[lo] == target) result[1] = lo;
        return result;
    }
}