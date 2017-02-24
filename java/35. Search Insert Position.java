public class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length-1;
        while(lo < hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target){
                lo = mid + 1;
            }
            else{
                hi = mid;
            }
        }
        if(nums[lo] >= target) return lo;
        else return lo +1;
    }
}