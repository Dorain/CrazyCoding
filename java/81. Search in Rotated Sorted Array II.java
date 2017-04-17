

public class Solution {
    public boolean search(int[] nums, int target) {
        // seperate into two situation, do binary search for each case
        if(nums == null || nums.length == 0) return false;
        int lo = 0, hi = nums.length-1;
        int mid = -1;
        while(lo<hi){
            mid = lo + (hi-lo)/2;
            if(nums[mid] == target) return true;
            // consider duplicate elements
            else if(nums[mid] == nums[hi]) hi--;
            else if(nums[mid] > nums[hi]){
                if(target<nums[mid] && nums[lo] <= target) hi = mid;
                else lo = mid+1;
            }
            else{
                if(target>nums[mid] && nums[hi] >= target) lo = mid+1;
                else hi = mid;
            }
        }
        return nums[lo] == target?true:false;
    }
}