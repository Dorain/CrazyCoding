public class Solution {
    public boolean isPowerOfThree(int n) {
        // exactly like power of two, find max power of 3 in integer range
        return n > 0 && (1162261467 % n == 0);
    }
}