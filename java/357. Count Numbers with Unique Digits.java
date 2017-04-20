public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n <= 0) return 1;
        int ans = 10, digit = 9;
        //  combination: take number of length k as putting 9 kinds of ball in k drawers
        for(int i = 2; i <= n; i++){
            digit *= Math.max((11-i), 0);
            ans += digit;
        }
        return ans;
    }
}