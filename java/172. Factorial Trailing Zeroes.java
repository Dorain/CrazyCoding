public class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;;
        // while(n >= pow5){
        //     ans += n / pow5;
        //     pow5 *= 5;
        // } 
        // bad, big number divide
        while(n > 0){
            n /= 5;
            ans += n;
        }
        return ans;
    }
}