public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        for(int i = a.length()-1,  j = b.length()-1; i >= 0 || j >= 0; i--, j--){
            int tmp = 0;
            tmp += i >= 0 ? a.charAt(i) - '0': 0;
            tmp += j >= 0 ? b.charAt(j) - '0': 0;
            ans.append((tmp + carry) % 2);
            carry = (tmp + carry) / 2;
        }
        if(carry != 0) ans.append(carry);
        return ans.reverse().toString();
    }
}