public class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n < 0){
            x = 1/x;
            n = -n;
            if(n < 0){
                return x*myPow(1/x,n+1);
            }
        }
        return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    }
}