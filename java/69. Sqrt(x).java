public class Solution {
    public int mySqrt(int x) {
        if(x == 0 ) return 0;
        int lo = 0, hi = Integer.MAX_VALUE;
        while(lo < hi){
            
            int mid = lo + (hi - lo)/2;
            if(mid== x/mid) return mid;
            if(mid> x/mid){
                hi = mid;
            }
            else{
                lo = mid +1;
            }
            
        }

        return lo-1;
    }
}