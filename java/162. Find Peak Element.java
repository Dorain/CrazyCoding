public class Solution {
    public int findPeakElement(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        if(nums.length == 1) return 0;
        
        int lo = 0, hi = nums.length -1;
        while(lo < hi){
            int mid = lo + (hi-lo)/2;
            int left = Integer.MIN_VALUE, right = Integer.MIN_VALUE;
            if(mid > 0) left = nums[mid -1];
            if(mid < nums.length - 1) right = nums[mid + 1];
            if(nums[mid] >left && nums[mid] > right) return mid;
            
            if(nums[mid] < left && nums[mid] > right) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }
}