public class Solution {
    public boolean isPowerOfTwo(int n) {
        // math: if n is power of 2 then, it should be factor of 1073741824(2^30, the biggest integer is 2147483647 (2^31-1)
        // bit: if n is power of 2 then, then it's binary form is 10000, and n-1 binary form is 111111
        
        // return n > 0 && 1073741824%n == 0;
        return n > 0 && ((n & (n-1)) == 0);
    }
}