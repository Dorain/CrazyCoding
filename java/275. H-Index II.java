public class Solution {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0) return 0;
        int n = citations.length;
        int lo = 0, hi = n-1;
        int hidx = 0;
        while(lo < hi){
            int mid = lo + (hi-lo)/2;
            if(citations[mid]>= n-mid){
                hi = mid - 1;
                hidx = n-mid;
            }
            else{
                lo = mid + 1;
            }
            
        }
        if(citations[lo]>= n-lo) hidx = n-lo;
        return hidx;
    }
}