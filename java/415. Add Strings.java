public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        for(int i = num1.length()-1, j = num2.length()-1; i >= 0 || j >= 0; i--, j--){
            int n1 = i >= 0? num1.charAt(i) - '0': 0;
            int n2 = j >= 0? num2.charAt(j) - '0': 0;
            carry += n1 + n2;
            ans.append(carry%10);
            carry /= 10;
        }
        if(carry != 0) ans.append(carry);
        return ans.reverse().toString();
    }
}