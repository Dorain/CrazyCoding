public class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == 1) return dividend;
        if(divisor == -1){
            if(dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
            else return -dividend;
        }
        int r = Math.abs(dividend);
        int di = Math.abs(divisor);
        int re = 0;
        
        if(dividend == Integer.MIN_VALUE){
            if(divisor == Integer.MIN_VALUE) {
                return 1;
            }
            r = Math.abs(dividend + di);
            re ++;
        }
        if(divisor == Integer.MIN_VALUE) return 0;
        
        System.out.println(r);
        System.out.println(di);
        System.out.println();
        while(r >= di){
            r -= di;
            re ++;

            if(re == Integer.MAX_VALUE) return Integer.MAX_VALUE;
            int count = 1;
            int di2  =di+di;
            if(di2 < 0) break;
            while(r >= di2){
                if(re == Integer.MAX_VALUE) return Integer.MAX_VALUE;
                r -= di2;
                count += count;
                re += count;
                di2 = di2+di2;
                if(di2 < 0) break;
            }
            
        }
        
        if( (dividend >= 0 && divisor < 0) || (dividend < 0&& divisor > 0)) re = -re;
        return re;
    }
}