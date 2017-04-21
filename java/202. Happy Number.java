public class Solution {
    public boolean isHappy(int n) {
        if(n <= 0) return false;
        Set <Integer> sums = new HashSet<>();
        int sum = 0, tmp = n;
        while(n != 1){
            sum = 0;
            while(n > 0){
                tmp = n%10;
                sum+=tmp*tmp;
                n /= 10;
            }
            if(!sums.add(sum)) return false;
            n = sum;
        }
        return true;
    }
}