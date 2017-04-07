public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0) return digits;
        int carry = 0;
        for(int i = digits.length -1; i >=0; i--){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i] = 0;
            } a
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
        
    }
}