public class Solution {
    public int myAtoi(String str) {
        // empty case
        if(str == null || str.length() == 0) return 0;
        // remove space
        int index = 0, sign = 1;
        while(index < str.length() && (str.charAt(index) - ' ' == 0)) index++;
        // sign
        if(index < str.length() && (str.charAt(index) == '+' || str.charAt(index) == '-') ) 
            sign = str.charAt(index++) == '+' ? 1 : -1;
        //convert
        int num = 0;
        while(index < str.length()){
            int digit = str.charAt(index++) - '0';
            if(digit > 9 || digit < 0) break;
            if(Integer.MAX_VALUE/10 < num || Integer.MAX_VALUE/10 == num && Integer.MAX_VALUE %10 < digit) 
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE; 
            num = num*10 + digit;
            // index++;
        }
        return num * sign;
    }
}