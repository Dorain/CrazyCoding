public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x%10 == 0 && x!=0)) return false;
        int revx = 0;
        while(x > revx){
            // wont work if x%10 = 0
            revx = revx*10 + x%10;
            x /= 10;
        }
        return (revx == x || revx/10 ==x);
    }
}