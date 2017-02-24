public class Solution {
    public int lengthOfLIS(int[] nums) {
        // we only care about the end of each possible sequence
        // update the end value each time
        int size = 0;
        int[] trail = new int[nums.length];
        for(int s : nums){
            int lo = 0, hi = size;
            while(lo<hi){
                int mid = lo + (hi-lo)/2;
                if(trail[mid] < s){
                    lo = mid + 1;
                }else{
                    hi = mid;    
                }
            }
            trail[lo] = s;
            if(lo == size) size++;
        }
        return size;
    }
}